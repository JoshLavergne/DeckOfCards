
public class deck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Cards[] deck = new Cards[52];
		String[] names = { "ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "jack", "queen", "king" };
		String[] suits = { "Spades", "clubs", "Hearts", "diamond" };

		for (int x = 0; x < 4; x++) {
			String colour;
			if (x < 2)
				colour = "black";
			else
				colour = "red";
			for (int y = 0; y < 13; y++) {
				deck[x * 13 + y] = new Cards(y + 1, suits[x], names[y], colour);

			}
		}
			Shuffle(deck);
			for (Cards i : deck) {

				System.out.println(i.printValue());

			}
//public static void Shuffle (Cards[] deck) {}
	}

	private static void Shuffle(Cards[] deck) {
		// TODO Auto-generated method stub
		
	}

}
