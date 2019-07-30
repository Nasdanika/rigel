package org.nasdanika.rigel.tests;

import java.io.File;
import java.io.InputStream;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.runtime.Path;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EModelElement;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.sirius.business.api.query.DViewQuery;
import org.eclipse.sirius.business.api.session.Session;
import org.eclipse.sirius.business.api.session.factory.SessionFactory;
import org.eclipse.sirius.common.tools.api.resource.ImageFileFormat;
import org.eclipse.sirius.ui.business.api.dialect.DialectUIManager;
import org.eclipse.sirius.ui.business.api.dialect.ExportFormat;
import org.eclipse.sirius.ui.business.api.dialect.ExportFormat.ExportDocumentFormat;
import org.eclipse.sirius.viewpoint.DRepresentation;
import org.junit.Test;
import org.nasdanika.common.PrintStreamProgressMonitor;
import org.nasdanika.common.ProgressEntry;
import org.nasdanika.common.ProgressMonitor;
import org.nasdanika.common.ResourceLocator;
import org.nasdanika.common.resources.Container;
import org.nasdanika.common.resources.FileSystemContainer;
import org.nasdanika.emf.EModelElementAnnotationResourceLocator;
import org.nasdanika.emf.FunctionAdapterFactory;
import org.nasdanika.emf.localization.RussianResourceLocator;
import org.nasdanika.emf.localization.UI;
import org.nasdanika.html.app.impl.ProgressReportGenerator;
import org.nasdanika.html.ecore.EcoreDocumentationGenerator;
import org.nasdanika.html.ecore.EcoreViewActionAdapterFactory;

public class GenerateModelDocumentation extends TestsBase {

	private static final String MODEL_URI = "urn:org.nasdanika.rigel";
	
	/**
	 * Generates Ecore model documentation.
	 * @throws Exception
	 */
	@Test
	public void testEcoreDocumentation() {		
		EcoreDocumentationGenerator generator = new EcoreDocumentationGenerator("Nasdanika Rigel Model", null, null);
		generator.loadGenModel(MODEL_URI);
		Container<InputStream> fsc = new FileSystemContainer(new File("target/model-doc"));
		ProgressMonitor progressMonitor = new PrintStreamProgressMonitor();
		ProgressEntry pe = new ProgressEntry("Generating Rigel Model Documentation", 0);
		Container<Object> container = fsc.adapt(null, encoder, null);
		generator.generate(container, progressMonitor.compose(pe));
		org.nasdanika.common.resources.File<Object> progressFile = container.getFile("progress-report.json");
		if (progressFile == null) {
			System.out.println(pe);
		} else {
			progressFile.setContents(pe.toString(), progressMonitor);
		}
		
		// HTML report
		ProgressReportGenerator prg = new ProgressReportGenerator("Documentation generation", pe);
		prg.generate(container.getContainer("progress-report"), progressMonitor);		
	}

	/**
	 * Generates Ecore model documentation for ``ru`` locale by utilizing {@link EModelElementAnnotationResourceLocator}.
	 * @throws Exception
	 */
	@Test
	public void testRussianEcoreDocumentation() {		
		EcoreDocumentationGenerator generator = new EcoreDocumentationGenerator(
				"Модель Ригеля", 
				"",
				UI.RU) {
						
			@Override
			protected EcoreViewActionAdapterFactory createAdapterFactory() {
				EcoreViewActionAdapterFactory adapterFactory = super.createAdapterFactory();
				
				adapterFactory.registerAdapterFactory(
						new FunctionAdapterFactory<ResourceLocator, EModelElement>(
								EcorePackage.Literals.EMODEL_ELEMENT, 
								ResourceLocator.class, 
								this.getClass().getClassLoader(), 
								RussianResourceLocator::new));
				
				return adapterFactory;
			}
			
		};
		generator.loadGenModel(MODEL_URI);
		Container<InputStream> fsc = new FileSystemContainer(new File("target/ru/model-doc"));
		ProgressMonitor progressMonitor = new PrintStreamProgressMonitor();
		generator.generate(fsc.adapt(null, encoder, null), progressMonitor);		
	}	
	
	@Test
	public void testHeadlessDiagramGeneration() throws Exception {
//		// Get session from an absolute path (not in a workspace)
//        URI sessionResourceURI = URI.createFileURI("C:\\Users\\Pavel\\git\\rigel\\demo\\representations.aird");
//        Session session = SessionFactory.INSTANCE.createSession(sessionResourceURI, new NullProgressMonitor());
//        session.open(new NullProgressMonitor());
//        // Get the expected representation (here the first of the first DView)
//        DViewQuery query = new DViewQuery(session.getOwnedViews().iterator().next());
//        DRepresentation representation = query.getLoadedRepresentations().get(0);
//        // Export it as SVG image
//        ExportFormat exportFormat = new ExportFormat(ExportDocumentFormat.NONE, ImageFileFormat.PNG);
//        DialectUIManager.INSTANCE.export(representation, session, new Path("C:\\_tmp\\diagram.png"), exportFormat, new NullProgressMonitor());		
	}
	
}
