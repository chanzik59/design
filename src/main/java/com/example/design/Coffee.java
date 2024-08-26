package com.example.design;

/**
 * @author czq
 * @date 2024/8/14 17:03
 * @Description:
 */
public class Coffee implements Drink{
    @Override
    public void getDrink() {
        System.out.println("没钱了，喝瑞幸吧");
    }
}
