package org.nasdanika.rigel.design;

import org.eclipse.emf.ecore.EObject;
import org.nasdanika.sirius.CommonServices;

/**
 * The services class used by VSM.
 */
public class Services extends CommonServices {
        
	public boolean isRigelResource(EObject self) {
		return isResourceExtension(self, "rigel");
	}	
    
}
