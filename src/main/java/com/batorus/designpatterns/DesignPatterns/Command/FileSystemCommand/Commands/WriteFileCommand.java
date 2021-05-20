package com.batorus.designpatterns.DesignPatterns.Command.FileSystemCommand.Commands;

import DesignPatterns.Command.FileSystemCommand.FileSystemReceiver;

public class WriteFileCommand implements Command {

    private FileSystemReceiver fileSystem;

    public WriteFileCommand(FileSystemReceiver fs) {
        this.fileSystem = fs;
    }

    @Override
    public void execute() {
        this.fileSystem.writeFile();
    }

    @Override
    public void undo() {
        System.out.println("Undo write file action");
    }

    @Override
    public String toString() {
        return "WriteFileCommand";
    }
}