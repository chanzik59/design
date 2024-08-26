package com.example.design;

/**
 * @author czq
 * @date 2024/8/15 14:47
 * @Description:
 */
public class Order {
    private State state;


    public void add() {
        state.add();
    }


    public void update() {
        state.update();
    }

    public void delete() {
        state.delete();
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }

    public static void main(String[] args) {

        Order order = new Order();
        order.setState(new InvalidState());

        order.update();

    }

}
