package com.example.design;

/**
 * @author czq
 * @date 2024/8/15 15:00
 * @Description:
 */
public class Person {

    private String name;

    private Intermediary intermediary;


    public Person(String name, Intermediary intermediary) {
        this.name = name;
        this.intermediary = intermediary;

    }

    public void contract(String msg) {
        intermediary.contract(this, msg);
    }

    public void getMsg(String msg) {
        System.out.println(name + "收到消息:" + msg);
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Intermediary getIntermediary() {
        return intermediary;
    }

    public void setIntermediary(Intermediary intermediary) {
        this.intermediary = intermediary;
    }

    public static void main(String[] args) {

    }
}
