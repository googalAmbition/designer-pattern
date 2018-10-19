package com.ctc.chain;

import java.util.Objects;

public class Request {

    private final RequestType type;

    private final String requestDescription;

    private boolean handled;

    public Request(final RequestType type, final String requestDescription) {
        this.type = Objects.requireNonNull(type);
        this.requestDescription = Objects.requireNonNull(requestDescription);
    }

    public RequestType getType() {
        return type;
    }

    public String getRequestDescription() {
        return requestDescription;
    }

    public void markHandled(){
        this.handled = true;
    }

    public boolean isHandled() {
        return handled;
    }

    @Override
    public String toString(){
        return getRequestDescription();
    }
}

