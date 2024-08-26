package com.example.design;

/**
 * @author czq
 * @date 2024/8/14 16:10
 * @Description:
 */
public class RiceFactory extends AbstractFactory {
    @Override
    public Food getFood() {
        return new Rice();
    }
}
