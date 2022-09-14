package ex05;

public class ChattingExample {

	public static void main(String[] args) {
		
		//객체 생성
		Chatting chat1 = new Chatting();
		
		Chatting.Chat chat2 = chat1.new Chat();
		
		
		chat1.startChat("id");
		chat2.start();
	}

}
