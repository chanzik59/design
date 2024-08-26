package com.example.design;

/**
 * @author czq
 * @date 2024/8/14 16:03
 * @Description:
 */
public class Fish implements Food {
    @Override
    public void getFood() {
        System.out.println("鱼香肉丝来了");
    }
}
