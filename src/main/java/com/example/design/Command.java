package com.example.design;

/**
 * @author czq
 * @date 2024/8/15 14:25
 * @Description:
 */
public abstract class Command {

    public Receiver getReceiver() {
        return receiver;
    }

    public void setReceiver(Receiver receiver) {
        this.receiver = receiver;
    }

    private Receiver receiver;


   abstract void execute();


}
