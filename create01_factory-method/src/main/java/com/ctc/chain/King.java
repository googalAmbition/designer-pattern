package com.ctc.chain;

public class King {

    RequestHandler chain;

    public King() {
        chain = buildChain();
    }

    private RequestHandler buildChain() {
        return new Commander(new Officer(new Soldier(null)));
    }

    public void markRequest(Request request) {
        chain.handlerRequest(request);
    }
}

