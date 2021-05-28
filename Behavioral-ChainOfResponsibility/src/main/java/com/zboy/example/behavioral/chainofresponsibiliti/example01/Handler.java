package com.zboy.example.behavioral.chainofresponsibiliti.example01;

public abstract class Handler {
    private Handler next;

    public Handler getNext() {
        return next;
    }

    public void setNext(Handler next) {
        this.next = next;
    }

    //处理请求的方法
    public abstract void handleRequest(String request);
}
