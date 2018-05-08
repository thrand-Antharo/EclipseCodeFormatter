package krasa.formatter.eclipse;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 * @author Christopher Straight
 */

@RunWith(Suite.class)
@Suite.SuiteClasses({
        JavaCodeFormatterFacadeTest.class,
        JSCodeFormatterFacadeTest.class
})

public class EclipseTests {
}
