public class Main {
    public static void main(String[] args) {

        CardRanks[] values = CardRanks.values();
        System.out.println("Card Ranks:");

        for (CardRanks value : values) {
            System.out.printf("Ordinal value: %d; Name value: %s%n", value.getCardRanksNumbers(), value);
        }
    }
}
