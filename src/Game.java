
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Game {

	public static void main(String[] args) throws NumberFormatException, IOException {

		Game game = new Game();

		game.gameLogic();
	}

	void check(int n) {
		
		if (n < 0 || n > 2) {
			System.out.println("Please provide any number between 0-2");

		}

	}

	int getRandomNumberInRange(int min, int max) {

		if (min >= max) {
			throw new IllegalArgumentException("max must be greater than min");
		}

		return (int) (Math.random() * ((max - min) + 1)) + min;
	}

	void gameLogic() throws NumberFormatException, IOException {

		int defeat = 0;
		int win = 0;

		int lady = 0, hunter = 1, tiger = 2;
		while (defeat < 3 && win < 3) {
			InputStreamReader r = new InputStreamReader(System.in);
			BufferedReader br = new BufferedReader(r);
			System.out.println("Enter a number:");
			int no = Integer.parseInt(br.readLine());
			check(no);
			int random = getRandomNumberInRange(0, 2);
			if (random == 0 && no == 0) {
				System.out.println("It's a Draw");
			} else if (random == 0 && no == 1) {
				System.out.println("You have won!!");
				win++;
			} else if (random == 0 && no == 2) {
				System.out.println("Sorry!!System has won!!");
				defeat++;
			} else if (random == 1 && no == 0) {
				System.out.println("You have won!!");
				win++;
			} else if (random == 1 && no == 1) {
				System.out.println("It's a Draw");
			} else if (random == 1 && no == 2) {
				System.out.println("Sorry!!System has won!!");
				defeat++;
			} else if (random == 2 && no == 0) {
				System.out.println("Sorry!!System has won!!");
				defeat++;
			} else if (random == 2 && no == 1) {
				System.out.println("You have won!!");
				win++;
			} else if (random == 2 && no == 2) {
				System.out.println("It's a Draw");
			}
		}
		if (win == 3) {
			System.out.println("You have won the game!!");
		}
		if (defeat == 3) {
			System.out.println("Sorry!!System has won the game!!");
		}
		System.out.println(win);
		System.out.println(defeat);
	}

}