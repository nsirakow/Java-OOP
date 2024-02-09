public enum SuitPowers {
  
    CLUBS (0),
    DIAMONDS (13),
    HEARTS (26),
    SPADES (39);
    final int suitPowerNumbers;
  
    SuitPowers(int suitPowerNumbers){
        this.suitPowerNumbers = suitPowerNumbers;
    }
    public int getSuitPowerNumbers() {
        return suitPowerNumbers;
    }
}
