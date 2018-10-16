package com.ctc.adapter.clazz;

public class SpeakSpanishAndEnglish extends SpeakWrapper {

    public SpeakSpanishAndEnglish(SpeakChinese speakChinese) {
        super(speakChinese);
    }

    @Override
    public void speakEnglish() {
        super.speakEnglish();
        System.out.println("speak English");
    }

    @Override
    public void speakFrances() {
        super.speakFrances();
        System.out.println("speak France");
    }
}

