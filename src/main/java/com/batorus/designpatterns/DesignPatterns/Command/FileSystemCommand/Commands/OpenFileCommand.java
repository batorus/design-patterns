package com.batorus.designpatterns.DesignPatterns.Command.FileSystemCommand.Commands;


import DesignPatterns.Command.FileSystemCommand.FileSystemReceiver;

public class OpenFileCommand implements Command {

    private FileSystemReceiver fileSystem;

    public OpenFileCommand(FileSystemReceiver fs) {
        this.fileSystem = fs;
    }

    @Override
    public void execute() {
        //open command is forwarding request to openFile method
        this.fileSystem.openFile();
    }

    @Override
    public void undo() {
        System.out.println("Undo open file action");
    }

    @Override
    public String toString() {
        return "OpenFileCommand{" +
                "fileSystem=" + fileSystem +
                '}';
    }
}
