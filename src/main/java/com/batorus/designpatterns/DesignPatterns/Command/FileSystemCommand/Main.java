package com.batorus.designpatterns.DesignPatterns.Command.FileSystemCommand;


import DesignPatterns.Command.FileSystemCommand.Commands.CloseFileCommand;
import DesignPatterns.Command.FileSystemCommand.Commands.CommandHistory;
import DesignPatterns.Command.FileSystemCommand.Commands.OpenFileCommand;
import DesignPatterns.Command.FileSystemCommand.Commands.WriteFileCommand;

public class Main {


    public static void main(String[] args) {
        //Creating the receiver object
        FileSystemReceiver fs = FileSystemReceiverUtil.getUnderlyingFileSystem();

        //creating command and associating with receiver
        OpenFileCommand openFileCommand = new OpenFileCommand(fs);

        //Creating invoker and associating with Command
        FileInvoker file = new FileInvoker(openFileCommand);
        //perform action on invoker object
        file.execute();

        WriteFileCommand writeFileCommand = new WriteFileCommand(fs);
        file = new FileInvoker(writeFileCommand);
        file.execute();

        CloseFileCommand closeFileCommand = new CloseFileCommand(fs);
        file = new FileInvoker(closeFileCommand);
        file.execute();

//        while(!FileInvoker.getCommandHistory().isEmpty()){
//            System.out.println(FileInvoker.getCommandHistory().);
//        }

        CommandHistory.viewCommands();
    }
}
