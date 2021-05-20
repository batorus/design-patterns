package com.batorus.designpatterns.DesignPatterns.Mediator.Chat;

public interface ChatMediator {

	public void sendMessage(String msg, User user);

	void addUser(User user);
}