package tech.chnjing.template;

public class GoogleVisionOCREngine extends OCREngine {
    @Override
    void detectTextRegion() {
        System.out.println("Do detectTextRegion by GoogleVision");
    }

    @Override
    void transcribeTextRegion() {
        System.out.println("Do transcribeTextRegion by GoogleVision");
    }

    @Override
    void extractForm() {
        System.out.println("Do extractForm by GoogleVision");
    }

    @Override
    void extractTable() {
        System.out.println("Do extractTable by GoogleVision");
    }

    @Override
    void generateOutput() {
        System.out.println("Do generateOutput by GoogleVision");
    }
}
