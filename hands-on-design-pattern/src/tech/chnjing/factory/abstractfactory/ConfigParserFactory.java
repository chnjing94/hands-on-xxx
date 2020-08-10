package tech.chnjing.factory.abstractfactory;

import tech.chnjing.factory.RuleConfigParser;
import tech.chnjing.factory.SystemConfigParser;

public interface ConfigParserFactory {
    RuleConfigParser createRuleParser();
    SystemConfigParser createSystemParser();
}

