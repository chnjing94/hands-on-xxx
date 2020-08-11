package tech.chnjing.factory.factorymethod;

import tech.chnjing.factory.*;

public class RuleConfigSource {
    /**
     * 工厂方法演示
     */
    public RuleConfig load(String ruleConfigFilePath) {
        String ruleConfigFileExtension = getFileExtension(ruleConfigFilePath);
        RuleConfigParserFactory factory = RuleConfigParserFactoryMap.getParserFactory(ruleConfigFileExtension);

        if (factory == null) {
            throw new RuntimeException(
                    "Rule config file format is not supported: " + ruleConfigFilePath);
        }

        String configText = "";
        //从ruleConfigFilePath文件中读取配置文本到configText中
        RuleConfig ruleConfig = factory.createParser().parse(configText);
        return ruleConfig;
    }

    private String getFileExtension(String filePath) {
        //...解析文件名获取扩展名，比如rule.json，返回json
        return "yaml";
    }

    public static void main(String[] args) {
        RuleConfigSource source = new RuleConfigSource();

        System.out.println("Using factory method config source: " + source.load("").getSource());
    }
}