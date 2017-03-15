package com.tasks5.command;

public class Application {

	public static void main(String[] args) {

		Command command = null;

		if (args != null && args.length == 1 && args[0].equals("help")) {

			command = new Help();
		} else if (args != null && args.length == 2 && args[0].equals("echo")) {

			command = new Echo(args[1]);
		} else if (args != null && args.length == 2 && args[0].equals("date") & args[1].equals("now")) {

			command = new Date();
		} else if (args != null && args.length == 1 && args[0].equals("exit")) {

			command = new GoodBuy();
		} else {

			command = new Echo("Error");
		}

		command.execute();
	}
}