package com.zboy.example.behavioral.state.example02;

public class Context {
    private State state;

    //定义环境类的初始状态
    public Context() {
        this.state = new ConcreteStateA();
    }

    //读取状态
    public State getState() {
        return (state);
    }

    //设置新状态
    public void setState(State state) {
        this.state = state;
    }

    //对请求做处理
    public void Handle() {
        state.Handle(this);
    }
}
