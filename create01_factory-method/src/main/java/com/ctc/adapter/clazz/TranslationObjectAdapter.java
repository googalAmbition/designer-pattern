package com.ctc.adapter.clazz;

public class TranslationObjectAdapter implements SpeakEnglish {
    private SpeakChinese speakChinese;

    public TranslationObjectAdapter(SpeakChinese speakChinese) {
        this.speakChinese = speakChinese;
    }

    @Override
    public void speakEnglish() {
        speakChinese.speakChinese();
        System.out.println("===translation===");
        System.out.println("Speak English...");
    }
}

