package com.example.design;

/**
 * @author czq
 * @date 2024/8/14 16:11
 * @Description:
 */
public class FoodStore {

    private AbstractFactory factory;


    public Food getFood(){
       return factory.getFood();
    }


    public static void main(String[] args) {
        FoodStore store = new FoodStore(new FishFactory());
        store.getFood().getFood();
    }

    public FoodStore(AbstractFactory factory) {
        this.factory = factory;
    }
}
