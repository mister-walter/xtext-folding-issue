/*
 * generated by Xtext 2.30.0
 */
package org.misterwalter.lisp;


/**
 * Initialization support for running Xtext languages without Equinox extension registry.
 */
public class LispStandaloneSetup extends LispStandaloneSetupGenerated {

	public static void doSetup() {
		new LispStandaloneSetup().createInjectorAndDoEMFRegistration();
	}
}