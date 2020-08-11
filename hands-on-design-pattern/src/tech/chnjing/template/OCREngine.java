package tech.chnjing.template;

/**
 * 模板模式示例，这里定义了一个抽象OCR类，所有的子类需要实现所有的抽象方法，
 * 在execute方法里会依次调用这些方法的具体实现，execute定义为final为了防止子类重写。
 */
public abstract class OCREngine {
    abstract void detectTextRegion();
    abstract void transcribeTextRegion();
    abstract void extractForm();
    abstract void extractTable();
    abstract void generateOutput();

    public final void execute(String imagePath) {
        // 文字区域检测
        detectTextRegion();

        // 文字信息提取
        transcribeTextRegion();

        // 表单信息提取
        extractForm();

        // 表格信息提取
        extractTable();

        // 生成输出结果
        generateOutput();
    }
}
