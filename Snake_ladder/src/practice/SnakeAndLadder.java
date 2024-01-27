package practice;
import java.util.Random;

public class SnakeAndLadder {
	 public static void main(String[] args) {
	        int playerPosition = 1;
	        int die;
	        Random random = new Random();

	        while (playerPosition < 100) {
	            // Roll the die
	            die = random.nextInt(6) + 1;

	            // Check for options: Snake, Ladder, or No Play
	            int option = random.nextInt(3);
	            switch (option) {
	                case 0:
	                    // Snake
	                    System.out.println("Snake! You go back by " + die + " positions.");
	                    playerPosition = Math.max(1, playerPosition - die);
	                    break;
	                case 1:
	                    // Ladder
	                    System.out.println("Ladder! You go forward by " + die + " positions.");
	                    playerPosition += die;
	                    break;
	                default:
	                    // No Play
	                    System.out.println("No Play! You stay at the current position.");
	            }

	            System.out.println("Current position: " + playerPosition);
	        }

	        System.out.println("Congratulations! You reached the 100th position.");
	    }

}
