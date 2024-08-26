package com.example.design;

/**
 * @author czq
 * @date 2024/8/14 17:04
 * @Description:
 */
public abstract class TakeAway {

    private Drink drink;


    public abstract void order();

    public Drink getDrink() {
        return drink;
    }

    public void setDrink(Drink drink) {
        this.drink = drink;
    }
}
