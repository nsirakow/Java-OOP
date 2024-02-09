import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String rankOfCard = scanner.nextLine();
        String suitOfCard = scanner.nextLine();
        Card card = new Card();
      
        switch (rankOfCard) {
            case ("ACE") -> {card.setRankPower(RankPowers.valueOf("ACE"));}
            case ("TWO") -> {card.setRankPower(RankPowers.valueOf("TWO"));}
            case ("THREE") -> {card.setRankPower(RankPowers.valueOf("THREE"));}
            case ("FOUR") -> {card.setRankPower(RankPowers.valueOf("FOUR"));}
            case ("FIVE") -> {card.setRankPower(RankPowers.valueOf("FIVE"));}
            case ("SIX") -> {card.setRankPower(RankPowers.valueOf("SIX"));}
            case ("SEVEN") -> {card.setRankPower(RankPowers.valueOf("SEVEN"));}
            case ("EIGHT") -> {card.setRankPower(RankPowers.valueOf("EIGHT"));}
            case ("NINE") -> {card.setRankPower(RankPowers.valueOf("NINE"));}
            case ("TEN") -> {card.setRankPower(RankPowers.valueOf("TEN"));}
            case ("JACK") -> {card.setRankPower(RankPowers.valueOf("JACK"));}
            case ("QUEEN") -> {card.setRankPower(RankPowers.valueOf("QUEEN"));}
            case ("KING") -> {card.setRankPower(RankPowers.valueOf("KING"));}
        }
        switch (suitOfCard) {
            case ("CLUBS") -> card.setSuitPower(SuitPowers.valueOf("CLUBS"));
            case ("DIAMONDS") -> card.setSuitPower(SuitPowers.valueOf("DIAMONDS"));
            case ("HEARTS") -> card.setSuitPower(SuitPowers.valueOf("HEARTS"));
            case ("SPADES") -> card.setSuitPower(SuitPowers.valueOf("SPADES"));
        }
        int cardPower = card.getRankPower().getRankPowerNumbers() + card.getSuitPower().getSuitPowerNumbers();
        System.out.printf("Card name: %s of %s; Card power: %d", rankOfCard, suitOfCard, cardPower);
    }
}
