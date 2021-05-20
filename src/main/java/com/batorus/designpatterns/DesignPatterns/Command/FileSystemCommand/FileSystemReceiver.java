package com.batorus.designpatterns.DesignPatterns.Command.FileSystemCommand;

public interface FileSystemReceiver {

    void openFile();

    void writeFile();

    void closeFile();
}