public class Card {
  
    private RankPowers rankPower;
    private SuitPowers suitPower;
  
    public void setRankPower(RankPowers rankPower) {
        this.rankPower = rankPower;
    }
    public void setSuitPower(SuitPowers suitPower) {
        this.suitPower = suitPower;
    }
    public RankPowers getRankPower() {
        return rankPower;
    }
    public SuitPowers getSuitPower() {
        return suitPower;
    }
}
