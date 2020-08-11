package tech.chnjing.template;

public class TesseractOCREngine extends OCREngine {
    @Override
    void detectTextRegion() {
        System.out.println("Do detectTextRegion by Tesseract");
    }

    @Override
    void transcribeTextRegion() {
        System.out.println("Do transcribeTextRegion by Tesseract");
    }

    @Override
    void extractForm() {
        System.out.println("Do extractForm by Tesseract");
    }

    @Override
    void extractTable() {
        System.out.println("Do extractTable by Tesseract");
    }

    @Override
    void generateOutput() {
        System.out.println("Do generateOutput by Tesseract");
    }
}
