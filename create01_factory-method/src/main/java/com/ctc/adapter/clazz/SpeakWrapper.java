package com.ctc.adapter.clazz;

public abstract class SpeakWrapper implements SpeakMany{

    protected SpeakChinese speakChinese;

    public SpeakWrapper(SpeakChinese speakChinese) {
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

