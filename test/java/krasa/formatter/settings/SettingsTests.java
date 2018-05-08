package krasa.formatter.settings;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 * @author Christopher Straight
 */

@RunWith(Suite.class)
@Suite.SuiteClasses({
        DisabledFileTypeSettingsTest.class,
        krasa.formatter.settings.provider.ProviderTests.class
})

public class SettingsTests {
}
