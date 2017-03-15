package com.tasks5.command;

public class Echo implements Command {

	private String text;

	public Echo(String text) {
		this.text = text;
	}

	@Override
	public void execute() {

		System.out.println(text);
	}
}
