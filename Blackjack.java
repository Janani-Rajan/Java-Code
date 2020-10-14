import java.util.Scanner;
import java.util.Random;

public class Blackjack {
	public static void main(String[] args) {
		// 1 = A, 11 = J, 12 = Q, 13 = K

		Card[] deck = new Card[52];
		Scanner input = new Scanner(System.in);
		boolean bContinue = true;
		while (bContinue == true) {

			int idx = 0;
			String[] suits = { "Spades", "Hearts", "Diamonds", "Clubs" };
			
			//set values for each element of the deck array
			
			for (int suitCount = 0; suitCount < 4; suitCount++) {
				for (int cardCount = 1; cardCount <= 13; cardCount++) {
					deck[idx] = new Card();
					deck[idx].setSuit(suits[suitCount]);
					deck[idx].setPointValue(pointValue(cardCount));
					deck[idx].setFaceValue(faceValue(cardCount));
					idx++;
				}
			}

			// ***DEAL FIRST TWO CARDS TO THE PLAYER***

			Card playerCard1 = getRandomCard(deck);
			Card playerCard2 = getRandomCard(deck);

			System.out.println(playerCard1.getFaceValue() + " of " + playerCard1.getSuit() + ": "
					+ playerCard1.getPointValue() + " points");

			System.out.println(playerCard2.getFaceValue() + " of " + playerCard2.getSuit() + ": "
					+ playerCard2.getPointValue() + " points");
			
			//prompt the user for an ace value choice of 1 or 11

			if (playerCard1.getFaceValue().equals("Ace") || playerCard2.getFaceValue().equals("Ace")) {
				System.out.println("You have an Ace. Would you like it to be worth 1 or 11 points? ");
				String aceChoice = input.nextLine();
				playerCard1.setPointValue(Integer.parseInt(aceChoice));
			}

			int totalpoints = playerCard1.getPointValue() + playerCard2.getPointValue();

			if (totalpoints == 21) {
				System.out.println("Congratulations! Your cards added up to 21! You win!");
			} else {
				System.out.println("Sorry! Your cards do not add up to 21 yet!");
				
				//The dealer gets two cards

				Card card3 = getRandomCard(deck);

				System.out.println();
				System.out.println("Dealer face up card:" + card3.getFaceValue() + " of " + card3.getSuit() + ": "
						+ card3.getPointValue() + " points");

				Card card4 = getRandomCard(deck);
				System.out.println("Dealer face down card: ************* ");

				while (totalpoints < 21) {
					
					//Repeatedly prompt the user whether to hit or stay until user says stay

					System.out.println("Type 'hit' to hit and 'stay' to stay.");
					String choice = input.nextLine();

					if ("hit".equals(choice)) {
						Card crd = getRandomCard(deck);
						System.out.println();
						System.out.println("New card: " + crd.getFaceValue() + " of " + crd.getSuit() + ": "
								+ crd.getPointValue() + " points");

						if (crd.getFaceValue().equals("Ace")) {
							System.out.println("You have an Ace. Would you like it to be worth 1 or 11 points? ");
							choice = input.nextLine();
							crd.setPointValue(Integer.parseInt(choice));
						}

						totalpoints += crd.getPointValue();

						System.out.println("Points:" + totalpoints);

					} else if ("stay".equals(choice)) {
						System.out.println("Total points: " + totalpoints);
						break;
					}

				}
				if (totalpoints > 21) {
					System.out.println();
					System.out.println("Sorry, you have exceeded the 21 points.");
					System.out.println("The dealer wins automatically.");
					System.out.println();
				} else {
					//The dealer plays. The card that is face-down is also displayed now.
					int dealerpoints = card3.getPointValue() + card4.getPointValue();
					System.out.println("Dealer cards:");
					System.out.println(
							card3.getFaceValue() + " of " + card3.getSuit() + ": " + card3.getPointValue() + " points");
					System.out.println(
							card4.getFaceValue() + " of " + card4.getSuit() + ": " + card4.getPointValue() + " points");
					if (dealerpoints == 21) {
						System.out.println("Sorry, the dealer's points added to 21. The dealer wins the game.");
					} else {
						while (dealerpoints < 17) {
							Card crd = getRandomCard(deck);
							dealerpoints += crd.getPointValue();
							System.out.println("New card:" + crd.getFaceValue() + " of " + crd.getSuit() + ": "
									+ crd.getPointValue() + " points");
							if (dealerpoints > 21) {
								System.out.println(
										"The dealer has gone over 21 while taking hits. Congratulations player, you won!");
								break;
							}
						}
						//Possible outcomes:
						if (dealerpoints == 21) {
							System.out.println("Sorry, the dealer's points added to 21. The dealer wins the game.");
						} else if (totalpoints == dealerpoints) {
							System.out.println("The dealer and the player have tied.");
						} else if (totalpoints > dealerpoints) {
							System.out.println("Congratulations player, you have won the game!");
						} else if (totalpoints < dealerpoints && dealerpoints < 21) {
							System.out.println("Sorry, the dealer got more points than you. The dealer wins the game.");
						}
					}
				}
			}

			// Do you want to continue
			System.out.println("Type 'yes' to play another round of Blackjack and 'no' to quit. ");
			String yes_or_no = input.nextLine();
			if (yes_or_no.equals("no")) {
				break;
			} else if (yes_or_no.equals("yes")) {
				bContinue = true;
			} else {
				System.out.println("Invalid input " + yes_or_no);
			}

		} // end of bContinue == true
		input.close();
	}

	// get face value
	public static String faceValue(int idx) {
		String fv = "";
		if (idx >= 2 & idx <= 10) {
			fv = Integer.toString(idx);
		} else if (idx == 1) {
			fv = "Ace";
		} else if (idx == 11) {
			fv = "Jack";
		} else if (idx == 12) {
			fv = "Queen";
		} else if (idx == 13) {
			fv = "King";
		}
		return fv;
	}

	// get point value
	public static int pointValue(int pv) {
		if (pv > 10) {
			pv = 10;
		}
		return pv;
	}

	public static Card getRandomCard(Card[] deck) {
		Card crd = null;
		while (crd == null) {
			int cardPos = (new Random()).nextInt(deck.length);
			crd = deck[cardPos];
			if (crd != null) {
				deck[cardPos] = null;
			}
		}

		return crd;
	}
}
