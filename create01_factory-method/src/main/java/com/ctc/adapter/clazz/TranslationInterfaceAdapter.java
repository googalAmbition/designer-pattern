package com.ctc.adapter.clazz;

public class TranslationInterfaceAdapter implements SpeakMany {

    protected SpeakChinese speakChinese;

    public TranslationInterfaceAdapter(SpeakChinese speakChinese) {
        this.speakChinese = speakChinese;
    }

    @Override
    public void speakJpanese() {
        speakChinese.speakChinese();
    }

    @Override
    public void speakSpanish() {
        speakChinese.speakChinese();
    }

    @Override
    public void speakEnglish() {
        speakChinese.speakChinese();
    }

    @Override
    public void speakFrances() {
        speakChinese.speakChinese();
    }
}

