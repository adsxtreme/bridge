package bridge.core.deck;

import bridge.core.Card;

public class King {
	   public static Card of(Suit denomination) {
		   return new Card("K", denomination);
	   }

	public static boolean isValueOf(Card card) {
		return card.getValue() == Card.strToIntValue("K");
	}
}
