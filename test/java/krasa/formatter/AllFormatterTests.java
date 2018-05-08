package krasa.formatter;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 * @author Christopher Straight
 */

@RunWith(Suite.class)
@Suite.SuiteClasses({
        krasa.formatter.eclipse.EclipseTests.class,
        krasa.formatter.plugin.PluginTests.class,
        krasa.formatter.settings.SettingsTests.class,
        krasa.formatter.utils.UtilsTests.class
})

public class AllFormatterTests {
}
