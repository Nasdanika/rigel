package org.nasdanika.rigel.html;

import org.nasdanika.html.emf.EObjectViewAction;
import org.nasdanika.rigel.ModelElement;

public abstract class ModelElementViewAction<T extends ModelElement> extends EObjectViewAction<T> {

	public ModelElementViewAction(T value) {
		super(value);
	}
		
}
