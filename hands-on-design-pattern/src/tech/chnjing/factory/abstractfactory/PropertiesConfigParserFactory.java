package tech.chnjing.factory.abstractfactory;

import tech.chnjing.factory.PropertiesRuleConfigParser;
import tech.chnjing.factory.PropertiesSystemConfigParser;
import tech.chnjing.factory.RuleConfigParser;
import tech.chnjing.factory.SystemConfigParser;

public class PropertiesConfigParserFactory implements ConfigParserFactory {

    @Override
    public RuleConfigParser createRuleParser() {
        return new PropertiesRuleConfigParser();
    }

    @Override
    public SystemConfigParser createSystemParser() {
        return new PropertiesSystemConfigParser();
    }
}
