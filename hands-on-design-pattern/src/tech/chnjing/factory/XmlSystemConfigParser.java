package tech.chnjing.factory;

public class XmlSystemConfigParser implements SystemConfigParser {
    @Override
    public SystemConfig parse(String filePath) {
        return new SystemConfig("Xml");
    }
}
