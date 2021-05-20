package com.batorus.designpatterns.DesignPatterns.Command.FileSystemCommand;

import DesignPatterns.Command.FileSystemCommand.Commands.Command;
import DesignPatterns.Command.FileSystemCommand.Commands.CommandHistory;

public class FileInvoker {

    public Command command;
    private static CommandHistory history = new CommandHistory();

    public FileInvoker(Command c) {
        this.command = c;
    }

    public void execute() {
        this.command.execute();
        history.push(command);
    }

    private void undo() {
        if (history.isEmpty()) return;

        Command command = history.pop();

        if (command != null) {
            command.undo();
        }
    }

//    public static CommandHistory getCommandHistory(){
//        return history;
//    }
}
