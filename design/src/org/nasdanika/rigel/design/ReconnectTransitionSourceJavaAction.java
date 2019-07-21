package org.nasdanika.rigel.design;

import java.util.Collection;
import java.util.Map;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.sirius.tools.api.ui.IExternalJavaAction;
import org.nasdanika.rigel.Activity;
import org.nasdanika.rigel.Transition;

/**
 * This class is not used, it is a demonstration of how things can be done.
 * @author Pavel
 *
 */
public class ReconnectTransitionSourceJavaAction implements IExternalJavaAction {


	@Override
	public boolean canExecute(Collection<? extends EObject> selection) {
		return selection.size() == 1 && selection.iterator().next() instanceof Transition;
	}

	@Override
	public void execute(Collection<? extends EObject> selection, Map<String, Object> context) {
		Transition transition = (Transition) selection.iterator().next();
		Activity newSource = ((Activity) context.get("target"));
		System.out.println("New Source: "+newSource.getName());
    	if (!newSource.getOutboundTransitions().contains(transition)) {
    		newSource.getOutboundTransitions().add(transition);
    	}
	}

}
