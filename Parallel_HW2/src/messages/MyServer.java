package messages;
import java.util.Scanner;

public class MyServer {

	public static void main(String[] args) {
		System.out.printf("%-30.30s %-30.30s%n", "[Client]", "[Server]");
		MyServer server = new MyServer();
		MyClient client = new MyClient();

		while(true) {
			String serverMsg = server.getMessage();
			if (serverMsg.equals("bye") || serverMsg.equals("Bye")) {
				System.out.println("Server quit the program");
				break;
			}
			server.confirmMessage(serverMsg);
			client.receiveMessage(serverMsg);
			
			String clientMsg = client.getMessage();

			if (clientMsg.equals("bye") || clientMsg.equals("Bye")) {
				
				System.out.println("Client quit the program");
				break;
			}
			client.confirmMessage(clientMsg);
			server.receiveMessage(clientMsg);
			}
		
	}
	
	private void confirmMessage(String msg) {
		// confirms the message on the server side
		System.out.printf("%-30.30s %-30.30s%n", "", msg);

	}
	
	private void postMessage(String msg) {
		System.out.printf("%-30.30s %-30.30s", "", msg);

	}
	
	private void receiveMessage(String msg) {
		String output = "Client says '"+msg+"'";
		System.out.printf("%-30.30s %-30.30s%n", "", output);

	}
	
	private String getMessage() {
		String message;
		String prompt = "Enter a message, or bye to quit";
		System.out.printf("%-30.30s %-30.30s", "", prompt);
		Scanner keyboard = new Scanner(System.in);
		message = keyboard.nextLine();

		return message;
	}
	
}
