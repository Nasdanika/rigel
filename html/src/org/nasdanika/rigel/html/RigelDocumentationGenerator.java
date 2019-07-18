package org.nasdanika.rigel.html;

/*
 * Diagram generation part is inspired by https://github.com/gemoc/org.eclipse.sirius/blob/master/plugins/org.eclipse.sirius.diagram.ui/src-diag/org/eclipse/sirius/diagram/ui/business/internal/dialect/DiagramDialectUIServices.java
 */

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.gmf.runtime.diagram.core.preferences.PreferencesHint;
import org.eclipse.gmf.runtime.diagram.ui.image.PartPositionInfo;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.sirius.business.api.session.CustomDataConstants;
import org.eclipse.sirius.business.api.session.Session;
import org.eclipse.sirius.business.api.session.factory.SessionFactory;
import org.eclipse.sirius.diagram.business.api.refresh.CanonicalSynchronizer;
import org.eclipse.sirius.diagram.business.api.refresh.CanonicalSynchronizerFactory;
import org.eclipse.sirius.diagram.ui.tools.api.part.DiagramEditPartService;
import org.eclipse.sirius.viewpoint.DRepresentation;
import org.json.JSONObject;
import org.nasdanika.common.Context;
import org.nasdanika.common.MutableContext;
import org.nasdanika.common.ProgressMonitor;
import org.nasdanika.common.SimpleMutableContext;
import org.nasdanika.html.app.Action;
import org.nasdanika.html.app.Action.Role;
import org.nasdanika.html.app.Application;
import org.nasdanika.html.app.ApplicationBuilder;
import org.nasdanika.html.app.NavigationActionActivator;
import org.nasdanika.html.app.ViewGenerator;
import org.nasdanika.html.app.ViewPart;
import org.nasdanika.html.app.impl.ActionApplicationBuilder;
import org.nasdanika.html.app.impl.ActionImpl;
import org.nasdanika.html.app.impl.Util;
import org.nasdanika.html.app.impl.ViewGeneratorImpl;
import org.nasdanika.html.app.viewparts.ContentPanelViewPart;
import org.nasdanika.html.app.viewparts.JsTreeNavigationPanelViewPart;
import org.nasdanika.html.bootstrap.BootstrapFactory;
import org.nasdanika.html.bootstrap.Container;
import org.nasdanika.html.bootstrap.Table;
import org.nasdanika.html.bootstrap.Table.TableBody;
//import org.nasdanika.html.bootstrap.Table.TableHeader;
import org.nasdanika.html.bootstrap.Text.Alignment;
import org.nasdanika.html.bootstrap.Theme;
import org.nasdanika.html.emf.EObjectAdaptable;
import org.nasdanika.html.emf.ViewAction;
import org.nasdanika.html.fontawesome.FontAwesomeFactory;
import org.nasdanika.html.jstree.JsTreeFactory;
import org.nasdanika.rigel.RigelPackage;

//import java.util.Collection;
//import java.util.Collections;
//import java.util.List;
//
//import org.eclipse.core.runtime.IPath;
//import org.eclipse.core.runtime.IProgressMonitor;
//import org.eclipse.core.runtime.NullProgressMonitor;
//import org.eclipse.core.runtime.Path;
//import org.eclipse.emf.common.util.URI;
//import org.eclipse.emf.ecore.EObject;
//import org.eclipse.equinox.app.IApplication;
//import org.eclipse.equinox.app.IApplicationContext;
//import org.eclipse.gmf.runtime.diagram.core.preferences.PreferencesHint;
//import org.eclipse.gmf.runtime.diagram.ui.image.PartPositionInfo;
//import org.eclipse.gmf.runtime.notation.Diagram;
//import org.eclipse.sirius.business.api.query.DViewQuery;
//import org.eclipse.sirius.business.api.session.CustomDataConstants;
//import org.eclipse.sirius.business.api.session.Session;
//import org.eclipse.sirius.business.api.session.factory.SessionFactory;
//import org.eclipse.sirius.diagram.DNode;
//import org.eclipse.sirius.diagram.business.api.refresh.CanonicalSynchronizer;
//import org.eclipse.sirius.diagram.business.api.refresh.CanonicalSynchronizerFactory;
//import org.eclipse.sirius.diagram.ui.tools.api.part.DiagramEditPartService;
//import org.eclipse.sirius.viewpoint.DRepresentation;

public class RigelDocumentationGenerator {

	class ViewActionImpl extends ActionImpl implements ViewAction, Adapter {

		@Override
		public void notifyChanged(Notification notification) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public Notifier getTarget() {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public void setTarget(Notifier newTarget) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public boolean isAdapterForType(Object type) {
			return type == ViewAction.class;
		}
		
	}
	
	private ViewActionImpl principalAction;
	private ResourceSet resourceSet;
	private ActionImpl rootAction;
	
	/**
	 * Generates documentation
	 * @param title
	 * @param description
	 * @param resourceLocator Locator of localized resources for "Package" and "Summary" strings.
	 */
	public RigelDocumentationGenerator(String title, String description) {
		rootAction = new ActionImpl();
		rootAction.setText(title);
		rootAction.setDescription(description);
		rootAction.setActivator(new NavigationActionActivator() {
			
			@Override
			public String getUrl() {
				return "#content/doc-summary";
			}
			
		});
		
		principalAction = new ViewActionImpl();
		principalAction.setParent(rootAction);
		rootAction.getChildren().add(principalAction);
		
		resourceSet = new ResourceSetImpl();		
		resourceSet.getAdapterFactories().add(new RigelViewActionAdapterFactory(principalAction));
		resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put(Resource.Factory.Registry.DEFAULT_EXTENSION, new XMIResourceFactoryImpl());
		
		resourceSet.getPackageRegistry().put(RigelPackage.eNS_URI, RigelPackage.eINSTANCE);
	}
		
	/**
	 * Generates documentation.
	 * @param resourceConsumer Consumes generated documentation.
	 * @param progressMonitor Progress monitor.
	 * @param representationURIs URI's of representation files ``.aird`` to generate diagrams.
	 */
	public void generate(org.nasdanika.common.resources.Container<Object> resourceConsumer, ProgressMonitor progressMonitor, URI... representationURIs) throws Exception {	
		List<Session> sessions = new ArrayList<>();
		for (URI rUri: representationURIs) {			
			Session session;
			try (ProgressMonitor createMonitor = progressMonitor.split("Creating session for "+rUri, 100, rUri)) {
				session = SessionFactory.INSTANCE.createSession(rUri, wrap(createMonitor));
			}
			try (ProgressMonitor openMonitor = progressMonitor.split("Opening session for "+rUri, 100, rUri)) {
				session.open(wrap(openMonitor));
			}			
			sessions.add(session);
		}

		try {
			Application app = new RigelDocumentationApplication(Theme.Litera, true);
	
			JsTreeFactory.INSTANCE.cdn(app.getHTMLPage());
			FontAwesomeFactory.INSTANCE.cdn(app.getHTMLPage());
			
			MutableContext context = new SimpleMutableContext();
			context.register(org.nasdanika.common.resources.Container.class, resourceConsumer);
			
			MutableContext docContext = new SimpleMutableContext();
			docContext.register(org.nasdanika.common.resources.Container.class, resourceConsumer.getContainer("doc"));
			docContext.put("image-path", "doc/");
			
			ApplicationBuilder  applicationBuilder = new ActionApplicationBuilder(principalAction.getChildren().get(0)) {
				
				@Override
				protected ViewPart getNavigationPanelViewPart() {
					return new JsTreeNavigationPanelViewPart(getNavigationPanelActions(), getActiveAction()) {
						@Override
						protected void configureJsTree(JSONObject jsTree) {
							// TODO State and search plug-ins.
							super.configureJsTree(jsTree);
						}
					};
				}
				
			}; 
			
			applicationBuilder.build(app, progressMonitor);
			
			try (ProgressMonitor im = progressMonitor.split("Generating index.html", 100)) {
				resourceConsumer.getFile("index.html").setContents(app, im);			
			}
			try (ProgressMonitor sm = progressMonitor.split("Generating summary", 100)) {
				resourceConsumer.getFile("doc/doc-summary").setContents(summary(docContext), sm);			
			}
			for (Action action: principalAction.getChildren()) {
				generateActionContent(action, docContext, progressMonitor);
			}
		} finally {
			for (Session session: sessions) {
				try (ProgressMonitor closeMonitor = progressMonitor.split("Closing session "+session.getID(), 100, session)) {
					session.close(wrap(closeMonitor));
				}
			}
		}
	}
	
	private IProgressMonitor wrap(ProgressMonitor progressMonitor) {
		// TODO 
		return new NullProgressMonitor() {
			
		};
		
	}
	
	/**
	 * Loads a model to generate documentation from.
	 * @param platformPluginUri
	 */
	public void loadModel(String platformPluginUri) {
		loadModel(URI.createPlatformPluginURI(platformPluginUri, false));		
	}
	
//	public void load
	
	/**
	 * Loads a model to generate documentation from.
	 * @param uri
	 */
	public void loadModel(URI uri) {
		Resource resource = resourceSet.getResource(uri, true);
		for (EObject contents: resource.getContents()) {
			ViewAction viewAction = EObjectAdaptable.adaptTo(contents, ViewAction.class);
			if (viewAction != null) {
				principalAction.getChildren().add(viewAction);
			}
		}
	}
	
	protected Object summary(Context context) {
		StringBuilder contentBuilder = new StringBuilder();
		ViewGenerator viewGenerator = new ViewGeneratorImpl(context, contentBuilder::append, contentBuilder::append);
		
		BootstrapFactory bootstrapFactory = viewGenerator.get(BootstrapFactory.class);		
		Container contentContainer = bootstrapFactory.fluidContainer();
		contentContainer.text().alignment(Alignment.LEFT);
		contentContainer.row().col("<H2>"+rootAction.getText()+"</H2>");
		String description = rootAction.getDescription();
		if (!Util.isBlank(description)) {
			contentContainer.row().col(description);
		}
				
		Table table = bootstrapFactory.table().bordered();
//		TableHeader header = table.header();
//		// TODO - localization.
//		String pkg = "Package";
//		String summary = "Summary";
//		header.headerRow(
//				resourceLocator == null ? pkg : resourceLocator.getString(PropertyKeys.UI_PACKAGE, pkg), 
//				resourceLocator == null ? summary : resourceLocator.getString(PropertyKeys.UI_SUMMARY, summary));
		TableBody body = table.body();
		principalAction.getChildren().forEach(child -> body.row(viewGenerator.link(child), child.getTooltip()));
		contentContainer.row().col(table);				
		
		contentBuilder.append(contentContainer.produce(4));
		return contentBuilder;
	}
	
	protected void generateActionContent(Action action, Context context, ProgressMonitor progressMonitor) {
		try (ProgressMonitor am = progressMonitor.split("Generating action content for "+action.getText(), 100)) {
			StringBuilder contentBuilder = new StringBuilder();
			ViewPart contentPanelViewPart = new ContentPanelViewPart(action, false); // Use adapter?
			ViewGenerator viewGenerator = new ViewGeneratorImpl(context, contentBuilder::append, contentBuilder::append);
			contentBuilder.append(contentPanelViewPart.generate(viewGenerator, progressMonitor));
			@SuppressWarnings("unchecked")
			org.nasdanika.common.resources.Container<Object> container = context.get(org.nasdanika.common.resources.Container.class);
			container.getFile(action.getId()+".html").setContents(contentBuilder, am);
			for (Action child: action.getChildren()) {
				if (child.isInRole(Role.NAVIGATION)) {
					generateActionContent(child, context, am);
				}
			}
		}
	}
	
//	{
//		DViewQuery query = new DViewQuery(session.getOwnedViews().iterator().next());
//		DRepresentation representation = query.getLoadedRepresentations().get(0); // Iterate over all.
//		List<PartPositionInfo> ppil = exportDiagram(representation, session, new Path("...diagram-5.svg"), new NullProgressMonitor());
//		      
//		for (PartPositionInfo ppi : ppil) {
//			EObject semanticElement = ppi.getSemanticElement();
//			System.out.println("---");
//			if (semanticElement instanceof DNode) {
//				DNode dNode = (DNode) semanticElement;
//				System.out.println(semanticElement.getClass());
//				EObject target = dNode.getTarget();
//				System.out.println(target);
//				if (target instanceof Activity) {
//					String name = ((Activity) target).getName();
//					System.out.println(name);
//					int x = ppi.getPartX();
//					int y = ppi.getPartY();
//					int width = ppi.getPartWidth();
//					int height = ppi.getPartHeight();
//					System.out.println("<area shape=\"rect\" coords=\"" + x + "," + y + "," + (x + width) + ","
//							+ (y + height) + "\" href=\"sun.htm\" alt=\"" + name + "\">");
//				}
//			}
//		}
//	}
	
	private List<PartPositionInfo> exportDiagram(DRepresentation representation, Session session, IPath path, IProgressMonitor monitor) throws Exception {
        final Collection<EObject> data = session.getServices().getCustomData(CustomDataConstants.GMF_DIAGRAMS, representation);
        for (final EObject dataElement : data) {
            if (dataElement instanceof Diagram) {
                final Diagram diagram = (Diagram) dataElement;
                
                CanonicalSynchronizer canonicalSynchronizer = CanonicalSynchronizerFactory.INSTANCE.createCanonicalSynchronizer(diagram);
                canonicalSynchronizer.storeViewsToArrange(false);
                canonicalSynchronizer.synchronize();	
                
                return new DiagramEditPartService().copyToImage(diagram, path, org.eclipse.gmf.runtime.diagram.ui.image.ImageFileFormat.SVG, monitor, PreferencesHint.USE_DEFAULTS); // Iterate over all
            }
        }	
	    return Collections.emptyList();
	}	
		
}

