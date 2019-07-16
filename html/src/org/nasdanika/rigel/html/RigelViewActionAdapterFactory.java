package org.nasdanika.rigel.html;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.ecore.resource.Resource;
import org.nasdanika.emf.ComposedAdapterFactory;
import org.nasdanika.emf.FunctionAdapterFactory;
import org.nasdanika.html.emf.ViewAction;

/**
 * Provides adapters for the Codegen types - {@link Generator}, {@link StaticText}, ...
 * @author Pavel
 *
 */
public class RigelViewActionAdapterFactory extends ComposedAdapterFactory {
	
	private ViewAction principalAction;

	public RigelViewActionAdapterFactory(ViewAction principalAction) {
		this.principalAction = principalAction;
		
//		// Registering adapter factories.
//		registerAdapterFactory(
//			new FunctionAdapterFactory<ViewAction, StaticText>(
//				CodegenPackage.Literals.STATIC_TEXT, 
//				ViewAction.class, 
//				this.getClass().getClassLoader(), 
//				StaticTextViewAction::new));		
//		
//		registerAdapterFactory(
//				new FunctionAdapterFactory<ViewAction, TextFile>(
//					CodegenPackage.Literals.TEXT_FILE, 
//					ViewAction.class, 
//					this.getClass().getClassLoader(), 
//					TextFileViewAction::new));		
	}
	
	@Override
	public Adapter adaptNew(Notifier target, Object type) {
		if (target instanceof Resource && type == ViewAction.class) {
			return (Adapter) principalAction;
		}
		return super.adaptNew(target, type);		
	}

}
