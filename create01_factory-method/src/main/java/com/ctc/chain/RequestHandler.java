package com.ctc.chain;

import java.text.MessageFormat;

public abstract class RequestHandler {
    private RequestHandler next;

    public RequestHandler(RequestHandler next) {
        this.next = next;
    }

    public void handlerRequest(Request request) {
        if (request != null) {
            next.handlerRequest(request);
        }
    }

    protected void printHandling(Request request) {
        System.out.println(MessageFormat.format("{0} handling \"{1}\"", this, request));
    }

    @Override
    public abstract String toString();
}

