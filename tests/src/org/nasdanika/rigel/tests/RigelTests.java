package org.nasdanika.rigel.tests;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({
	GenerateModelDocumentation.class,
	ActivityTests.class
})
public class RigelTests {
	
}
