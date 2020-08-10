package tech.chnjing.factory.abstractfactory;

import tech.chnjing.factory.JsonRuleConfigParser;
import tech.chnjing.factory.JsonSystemConfigParser;
import tech.chnjing.factory.RuleConfigParser;
import tech.chnjing.factory.SystemConfigParser;

public class JsonConfigParserFactory implements ConfigParserFactory {

    @Override
    public RuleConfigParser createRuleParser() {
        return new JsonRuleConfigParser();
    }

    @Override
    public SystemConfigParser createSystemParser() {
        return new JsonSystemConfigParser();
    }
}
