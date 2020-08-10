package tech.chnjing.factory.abstractfactory;

import tech.chnjing.factory.RuleConfigParser;
import tech.chnjing.factory.SystemConfigParser;
import tech.chnjing.factory.YamlRuleConfigParser;
import tech.chnjing.factory.YamlSystemConfigParser;

public class YamlConfigParserFactory implements ConfigParserFactory {

    @Override
    public RuleConfigParser createRuleParser() {
        return new YamlRuleConfigParser();
    }

    @Override
    public SystemConfigParser createSystemParser() {
        return new YamlSystemConfigParser();
    }
}
