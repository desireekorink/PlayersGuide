package PlayersGuidePackage.Files.CardGame;

public class Card {
    private final CardColor color;
    private final CardRank rank;

    public Card(CardColor color, CardRank rank) {
        this.color = color;
        this.rank = rank;
    }

    public boolean isNumberCard() {
        return rank.ordinal() < 10;
    }

    public boolean isSymbolCard() {
        return !isNumberCard();
    }

    public String toString() {
        String cardString = "The " + color.name() + " " + rank.name();
        if (isSymbolCard()) {
            cardString += " (Symbol card)";
        }
        return cardString;
    }


    public static void main(String[] args) {
        Card[] deck = new Card[52];
        int i = 0;
        for (CardColor color : CardColor.values()) {
            for (CardRank rank : CardRank.values()) {
                deck[i] = new Card(color, rank);
                System.out.println(deck[i]);
                i++;
            }
        }
    }
}
/*
Why do you think we used a color enumeration here but made a color class in the previous challenge?
Because we combine the other enum with the color enum.
 */