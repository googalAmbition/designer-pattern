package com.ctc.chain;

public class Commander extends RequestHandler {
    public Commander(RequestHandler next) {
        super(next);
    }

    @Override
    public void handlerRequest(Request request) {
        if (request.getType().equals(RequestType.DEFEND_CASTLE)) {
            printHandling(request);
            request.markHandled();
        } else {
            System.out.println("Commander can't handle");
            super.handlerRequest(request);
        }
    }

    @Override
    public String toString() {
        return null;
    }
}

