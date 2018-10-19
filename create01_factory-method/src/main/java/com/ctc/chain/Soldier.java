package com.ctc.chain;

public class Soldier extends RequestHandler {


    public Soldier(RequestHandler handler) {
        super(handler);
    }

    @Override
    public void handlerRequest(Request request) {
        if (request.getType().equals(RequestType.COLLECT_TAX)){
            printHandling(request);
            request.markHandled();
        }else {
            System.out.println("Soldier can't handle");
            super.handlerRequest(request);
        }
    }

    @Override
    public String toString() {
        return "Soldier";
    }
}

