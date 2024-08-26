package com.example.design;

/**
 * @author czq
 * @date 2024/8/14 17:06
 * @Description:
 */
public class RiceTakeAway extends TakeAway {

    @Override
    public void order() {
        System.out.println("干净又卫生的米饭套餐");
        new Rice().getFood();
        getDrink().getDrink();
    }
}
