package com.example.design;

import java.util.LinkedList;
import java.util.List;

/**
 * @author czq
 * @date 2024/8/15 14:32
 * @Description:
 */
public class CommandSender {

    private List<Command> commands = new LinkedList<>();

    {
        Command buyCommand = new BuyCommand();
        buyCommand.setReceiver(new Receiver());
        Command cookCommand = new CookCommand();
        cookCommand.setReceiver(new Receiver());
        commands.add(buyCommand);
        commands.add(cookCommand);

    }


    public static void main(String[] args) {
        CommandSender commandSender = new CommandSender();
        commandSender.commands.forEach(Command::execute);
    }

}
