import java.util.Scanner;
public class SimpleChatBot{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		String userMessage;
		System.out.println("Hello! I'm a basic chatbot. You can chat with me or type eixt to quit");
		do {
			System.out.print("You: ");
			userMessage = scanner.nextLine();
			String botResponse = getBotResponse(userMessage);
			System.out.println("Bot: "+ botResponse);
		} while (!userMessage.equalsIgnoreCase("exit"));
		
		System.out.println("Goodbye! Have a nice day.");
		scanner.close();
	}
	// Simple rule-based responses
	public static String getBotResponse(String userMessage) {
		userMessage = userMessage.toLowerCase();
		if (userMessage.contains("hello") || userMessage.contains("hi")) {
			return "Hello! how can I assist you?";
		} else if (userMessage.contains("how are you")) {
			return "I'm just a computer program, but I'm here to help!";
		} else if (userMessage.contains("name")) {
			return "I'm a simple chatbot. You can call me ChatGPT.";
		} else if (userMessage.contains("bye")) {
			return "GoodBye!";
		} else {
			return "I don't understand. Please ask another question or type 'exit' to quit.";
		}
	}
};