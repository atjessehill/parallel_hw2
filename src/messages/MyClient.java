package messages;

import java.util.Scanner;

public class MyClient {
	public String getMessage() {
		String message;
		String prompt = "Enter a message, or bye to quit";
		System.out.printf("%-30.30s %-30.30s", prompt, "");
		Scanner keyboard = new Scanner(System.in);
		message = keyboard.nextLine();
		
		return message;
	}
	
	public void confirmMessage(String msg) {
		System.out.printf("%-30.30s %-30.30s%n", msg, "");

	}
	
	public void receiveMessage(String msg) {
		String output = "Server says '"+msg+"'";
		System.out.printf("%-30.30s %-30.30s%n", output, "");

	}
	
}
