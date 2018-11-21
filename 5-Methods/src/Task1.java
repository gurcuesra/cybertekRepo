
public class Task1 {

	public static void main(String[] args) {
		displayHighScorePosition("A", calculateHighScorePosition(1500));
		System.out.println("---------------------------");
		displayHighScorePosition("B", calculateHighScorePosition(900));
		System.out.println("---------------------------");
		displayHighScorePosition("C", calculateHighScorePosition(400));
		System.out.println("---------------------------");
		displayHighScorePosition("A", calculateHighScorePosition(50));

	}
	
	public static void displayHighScorePosition(String playerName, int highScore) {
		System.out.println(playerName + " managed to get into position "+highScore + " on the high score table");
	}
	
	public static int calculateHighScorePosition(int playerScore) {
		if(playerScore>=1000) {
			return 1;
		}else if(playerScore>=500 && playerScore<100) {
			return 2;
		}else if(playerScore>=100 && playerScore<500) {
			return 3;
		}else {
			return 4;
		}
	}

}
