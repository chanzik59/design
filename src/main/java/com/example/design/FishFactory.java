package com.example.design;

/**
 * @author czq
 * @date 2024/8/14 16:10
 * @Description:
 */
public class FishFactory extends AbstractFactory{
    @Override
    public Food getFood() {
        return new Fish();
    }
}
