package tech.chnjing.factory.simple;

import tech.chnjing.factory.RuleConfig;
import tech.chnjing.factory.RuleConfigParser;

public class RuleConfigSource {
    /**
     * 在下面这段代码中，我们根据配置文件的后缀（json、xml、yaml、properties），
     * 选择不同的解析器（JsonRuleConfigParser、XmlRuleConfigParser……），
     * 将存储在文件中的配置解析成内存对象 RuleConfig。
     *
     * 简单工厂实现
     */
    public RuleConfig load(String ruleConfigFilePath) {
        String ruleConfigFileExtension = getFileExtension(ruleConfigFilePath);
        RuleConfigParser parser = RuleConfigParserFactory.createParser(ruleConfigFileExtension);

        if (parser == null) {
            throw new RuntimeException(
                    "Rule config file format is not supported: " + ruleConfigFilePath);
        }

        String configText = "";
        //从ruleConfigFilePath文件中读取配置文本到configText中
        RuleConfig ruleConfig = parser.parse(configText);
        return ruleConfig;
    }

    private String getFileExtension(String filePath) {
        //...解析文件名获取扩展名，比如rule.json，返回json
        return "yaml";
    }

    public static void main(String[] args) {
        RuleConfigSource source = new RuleConfigSource();

        System.out.println("Using simple factory config source: " + source.load("").getSource());
    }
}