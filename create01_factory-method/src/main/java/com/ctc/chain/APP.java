package com.ctc.chain;

import org.junit.Test;

public class APP {

    @Test
    public void chainTest(){
        King king = new King();
        Request request = new Request(RequestType.COLLECT_TAX,"soldier handle");
        king.markRequest(request);
        System.out.println(request.isHandled());
    }
}

