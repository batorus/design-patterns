package com.batorus.designpatterns.DesignPatterns.Command.FileSystemCommand.Commands;


import java.util.Deque;
import java.util.Iterator;
import java.util.LinkedList;

public class CommandHistory {
    private static Deque<Command> history = new LinkedList<>();

    public void push(Command c) {
        history.push(c);
    }

    public Command pop() {
        return history.pop();
    }


    public boolean isEmpty() {
        return history.isEmpty();
    }

    public static Deque<Command> getHistory() {
        return history;
    }

    public static void viewCommands(){
        //while(!history.isEmpty()){
            Iterator it = history.iterator();

            while(it.hasNext())
                System.out.println(it.next());
        //}
    }
}
