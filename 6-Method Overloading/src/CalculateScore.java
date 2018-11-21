
public class CalculateScore {

	public static void main(String[] args) {
		
		int newScore = calculateScore("mike", 500);
		System.out.println("New Score is " + newScore);
		
		newScore = calculateScore("smith", 900);
		System.out.println("New Score is " + newScore);
		
		calculateScore(75);
		calculateScore();

	}
	
	public static int calculateScore(String playerName, int score) {
		System.out.println("Player " + playerName + " scored " + score+ " points");
		return score * 100;
	}
	
	public static int calculateScore(int score) {
		System.out.println("Unnamed player scored " + score + " points");
		return score * 100;
	}
	
	public static void calculateScore() {
		System.out.println("No Player name, No Player score");
	}

}
