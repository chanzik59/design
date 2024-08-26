package com.example.design;

/**
 * @author czq
 * @date 2024/8/14 16:03
 * @Description:
 */
public class SimpleFoodFactory {


    public static void main(String[] args) {

        Food rice = getFood("rice");
        rice.getFood();

    }

    public static Food getFood(String name) {
        if ("rice".equals(name)) {
            return new Rice();
        }
        if ("fish".equals(name)) {
            return new Fish();
        }
        return null;
    }
}
