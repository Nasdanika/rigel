package org.nasdanika.rigel.html;

import org.nasdanika.html.app.impl.BootstrapContainerRouterApplication;
import org.nasdanika.html.bootstrap.BootstrapFactory;
import org.nasdanika.html.bootstrap.Theme;

/**
 * Bootstrap container single page application with Backbone router for loading content.
 * @author Pavel
 *
 */
public class RigelDocumentationApplication extends BootstrapContainerRouterApplication {
	
	/**
	 * Creates bootstrap content routing CDN application
	 */
	public RigelDocumentationApplication() {
		this(BootstrapFactory.INSTANCE, false);
	}

	/**
	 * Creates bootstrap content routing CDN application
	 */
	public RigelDocumentationApplication(boolean fluid) {
		this(BootstrapFactory.INSTANCE, fluid);
	}
	
	/**
	 * Creates bootstrap content routing CDN application
	 */
	public RigelDocumentationApplication(BootstrapFactory factory, boolean fluid) {
		this(factory, Theme.Default, fluid);
	}
	
	/**
	 * Creates bootstrap content routing CDN application
	 */
	public RigelDocumentationApplication(Theme theme, boolean fluid) {
		this(BootstrapFactory.INSTANCE, theme, fluid);
	}
	
	/**
	 * Creates bootstrap content routing CDN application with an optional initial route.
	 */
	public RigelDocumentationApplication(BootstrapFactory factory, Theme theme, boolean fluid) {
		super(factory, theme, fluid);
	}	
	
	/**
	 * @param factory
	 * @return
	 */
	protected Object getContentRouterCode(BootstrapFactory factory) {
		return factory.getHTMLFactory().interpolate(RigelDocumentationApplication.class.getResource("content-router.js"), "initial-route", "doc-summary");
	}

}
