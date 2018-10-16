package com.ctc.adapter.clazz;

public class TranslationClazzAdapter extends SpeakChinese implements SpeakEnglish {
    @Override
    public void speakEnglish() {
        speakChinese();
        System.out.println("===translation===");
        System.out.println("Speak English...");
    }
}

