import java.util.*;
public class deck {

	public static void main(String[] args) {
		


		
		Cards[] deck = new Cards[52];
		String[] Names = { "Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King" };
		String[] Suits = { "Spades", "Clubs", "Hearts", "Diamonds" };

		for (int x = 0; x < 4; x++) {
			String Colour;
			if (x < 2)
				Colour = "Black";
			else
				Colour = "Red";
			for (int y = 0; y < 13; y++) {
				deck[x * 13 + y] = new Cards(y + 1, Suits[x], Names[y], Colour);

			}
		}
			Shuffle(deck);
			for (Cards i : deck) {

				System.out.println(i.printValue());

			}
//public static void Shuffle (Cards[] deck) {}
	}

	private static void Shuffle(Cards[] deck) {
		
		for (int i =0; i< deck.length; i++) {
		
		int Index = (int) (Math.random()*deck.length);
		Cards temp = deck[i];
		deck[i] = deck[Index];
		deck[Index] = temp;
		}
		
	
	
	}

}
