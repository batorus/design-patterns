package com.batorus.designpatterns.DesignPatterns.Command.Editor;

import java.util.Deque;
import java.util.LinkedList;

public class CommandHistory {
    private Deque<Command> history = new LinkedList<>();

    public void push(Command c) {
        history.push(c);
    }

    public Command pop() {
        return history.pop();
    }

    public boolean isEmpty() { return history.isEmpty(); }
}