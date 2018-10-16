package com.ctc.adapter.clazz;

public class SpeakSpanishAdapter extends TranslationInterfaceAdapter {

    public SpeakSpanishAdapter(SpeakChinese speakChinese) {
        super(speakChinese);
    }

    @Override
    public void speakSpanish() {
        super.speakSpanish();
        System.out.println("说西班牙语");
        System.out.println("我说的是西班牙语");
    }
}

