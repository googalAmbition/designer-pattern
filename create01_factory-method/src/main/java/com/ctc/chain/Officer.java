package com.ctc.chain;

public class Officer extends RequestHandler {
    public Officer(RequestHandler next) {
        super(next);
    }

    @Override
    public void handlerRequest(Request request) {
        if (request.getType().equals(RequestType.TORTURE_PRISONER)){
            printHandling(request);
            request.markHandled();
        }else {
            System.out.println("Officer can't handle");
            super.handlerRequest(request);
        }
    }

    @Override
    public String toString() {
        return "Officer";
    }
}

