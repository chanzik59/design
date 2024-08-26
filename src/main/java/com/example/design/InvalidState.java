package com.example.design;

/**
 * @author czq
 * @date 2024/8/15 14:46
 * @Description:
 */
public class InvalidState extends State{
    @Override
    void add() {
        System.out.println("可以新增");
    }

    @Override
    void update() {
        System.out.println("不可以修改");
    }

    @Override
    void delete() {
        System.out.println("能删除");
    }
}
