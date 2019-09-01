package org.nasdanika.rigel.tests;

import java.io.File;

import org.eclipse.emf.ecore.EModelElement;
import org.eclipse.emf.ecore.EcorePackage;
import org.junit.Test;
import org.nasdanika.common.PrintStreamProgressMonitor;
import org.nasdanika.common.ProgressEntry;
import org.nasdanika.common.ProgressMonitor;
import org.nasdanika.common.ResourceLocator;
import org.nasdanika.common.resources.BinaryEntityContainer;
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
	public void testEcoreDocumentation() throws Exception {		
		EcoreDocumentationGenerator generator = new EcoreDocumentationGenerator("Nasdanika Rigel Model", null, null, false);
		generator.loadGenModel(MODEL_URI);
		BinaryEntityContainer fsc = new FileSystemContainer(new File("target/model-doc"));
		try (ProgressMonitor progressMonitor = new PrintStreamProgressMonitor()) {
			ProgressEntry pe = new ProgressEntry("Generating Rigel Model Documentation", 0);
			Container<Object> container = fsc.stateAdapter().adapt(null, encoder);
			generator.generate(container, progressMonitor.compose(pe));
			container.put("progress-report.json", pe.toString(), progressMonitor.split("Writing progress-report.json", 1));
			
			// HTML report
			ProgressReportGenerator prg = new ProgressReportGenerator("Documentation generation", pe);
			Container<Object> progressReportContainer = container.getContainer("progress-report", progressMonitor.split("Getting progress report container", 1));
			prg.generate(progressReportContainer, progressMonitor.split("Writing progress report", 1));
		}
	}

	/**
	 * Generates Ecore model documentation for ``ru`` locale by utilizing {@link EModelElementAnnotationResourceLocator}.
	 * @throws Exception
	 */
	@Test
	public void testRussianEcoreDocumentation() throws Exception {		
		EcoreDocumentationGenerator generator = new EcoreDocumentationGenerator(
				"Модель Ригеля", 
				"",
				UI.RU, 
				false) {
						
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
		BinaryEntityContainer fsc = new FileSystemContainer(new File("target/ru/model-doc"));
		ProgressMonitor progressMonitor = new PrintStreamProgressMonitor();
		generator.generate(fsc.stateAdapter().adapt(null, encoder), progressMonitor);		
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
