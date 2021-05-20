package com.batorus.designpatterns.DesignPatterns.Command.FileSystemCommand.Commands;

import DesignPatterns.Command.FileSystemCommand.FileSystemReceiver;

public class CloseFileCommand implements Command {

    private FileSystemReceiver fileSystem;

    public CloseFileCommand(FileSystemReceiver fs) {
        this.fileSystem = fs;
    }

    @Override
    public void execute() {
        this.fileSystem.closeFile();
    }

    @Override
    public void undo() {
        System.out.println("Undo close file action");
    }

    @Override
    public String toString() {
        return "CloseFileCommand{ fileSystem=" + fileSystem +'}';
    }
}
