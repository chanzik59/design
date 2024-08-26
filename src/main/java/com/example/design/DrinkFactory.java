package com.example.design;

import java.util.HashMap;
import java.util.Map;

/**
 * @author czq
 * @date 2024/8/15 11:48
 * @Description:
 */
public class DrinkFactory {

    private Map<String, Drink> cache = new HashMap<>();


    {
        cache.put("coffee", new Coffee());
        cache.put("iceTea", new IceTea());
    }


    public Drink getDrink(String name) {
        Drink drink = cache.get(name);
        return null;
    }


}
