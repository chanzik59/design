package com.example.design;

/**
 * @author czq
 * @date 2024/8/14 17:06
 * @Description:
 */
public class FishTakeAway extends TakeAway {




    @Override
    public void order() {
        System.out.println("花地河特产罗非");
        new Fish().getFood();
        getDrink().getDrink();
    }


    public static void main(String[] args) {

        FishTakeAway fishTakeAway = new FishTakeAway();
        fishTakeAway.setDrink(new Coffee());
        fishTakeAway.order();

    }
}
