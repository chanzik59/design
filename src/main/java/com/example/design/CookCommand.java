package com.example.design;

/**
 * @author czq
 * @date 2024/8/15 14:29
 * @Description:
 */
public class CookCommand extends Command{


    @Override
    void execute() {

        getReceiver().cook();

    }


}
