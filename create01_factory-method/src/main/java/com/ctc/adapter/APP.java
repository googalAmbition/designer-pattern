package com.ctc.adapter;


import com.ctc.adapter.clazz.*;
import org.junit.Test;

public class APP {
    @Test
    public void clazz(){
        SpeakEnglish speakEnglish = new TranslationClazzAdapter();
        speakEnglish.speakEnglish();
    }

    @Test
    public void objectTest(){
        SpeakEnglish speakEnglish = new TranslationObjectAdapter(new SpeakChinese());
        speakEnglish.speakEnglish();
    }

    @Test
    public void interfaceTest(){
        SpeakSpanishAdapter spanishAdapter = new SpeakSpanishAdapter(new SpeakChinese());
        spanishAdapter.speakSpanish();

        TranslationInterfaceAdapter translation = new TranslationInterfaceAdapter(new SpeakChinese(){
            @Override
            public void speakChinese() {
                super.speakChinese();
                System.out.println("===================================");
            }
        });
        translation.speakSpanish();
    }

    @Test
    public void wrapperTest(){
        SpeakMany speakMany = new SpeakSpanishAndEnglish(new SpeakChinese());
        speakMany.speakEnglish();
        speakMany.speakFrances();
    }

    @Test
    public void wrapperTest2(){
    }
}

