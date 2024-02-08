public enum CardRanks {
    ACE(10),
    TWO(20),
    THREE(30),
    FOUR(40),
    FIVE(50),
    SIX(60),
    SEVEN(70),
    EIGHT(80),
    NINE(90),
    TEN(100),
    JACK(110),
    QUEEN(120),
    KING(130);
  
    final int CardRanksNumbers;
  
    CardRanks(int cardRanksNumbers){
        this.CardRanksNumbers = cardRanksNumbers;
    }
    public int getCardRanksNumbers() {
        return CardRanksNumbers;
    }
}
