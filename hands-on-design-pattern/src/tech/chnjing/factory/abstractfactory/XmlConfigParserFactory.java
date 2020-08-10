package tech.chnjing.factory.abstractfactory;

import tech.chnjing.factory.RuleConfigParser;
import tech.chnjing.factory.SystemConfigParser;
import tech.chnjing.factory.XmlRuleConfigParser;
import tech.chnjing.factory.XmlSystemConfigParser;

public class XmlConfigParserFactory implements ConfigParserFactory {

    @Override
    public RuleConfigParser createRuleParser() {
        return new XmlRuleConfigParser();
    }

    @Override
    public SystemConfigParser createSystemParser() {
        return new XmlSystemConfigParser();
    }
}
