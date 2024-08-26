package com.example.design;

import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author czq
 * @date 2024/8/14 16:03
 * @Description:
 */
//@Builder
//@Data
//@NoArgsConstructor
public class Rice implements Food,Cloneable{

    private String name;

    private Integer num;

    @Override
    public void getFood() {
        System.out.println("获得一碗米饭");
    }


    @Override
    protected Rice clone() throws CloneNotSupportedException {
        return (Rice)super.clone();
    }


    public static void main(String[] args) throws CloneNotSupportedException {
//        Rice rice = new Rice();
//        Object clone = rice.clone();
//        System.out.println(rice==clone);
//        Rice.builder().num()
    }
}
