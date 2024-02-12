import java.util.ArrayList;
import java.util.List;

public class Team {
  
    private String name;
    private List<Player> players;
  
    public Team(String name) {
        setName(name);
        players = new ArrayList<>();
    }
    private void setName(String name) {
        if (!name.isEmpty()) {
            this.name = name;
        } else {
            System.out.println("A name should not be empty.");
        }
    }
    public String getName() {
        return name;
    }
    public void addPlayer(Player player) {
        if (player.getName() == null || player.getEndurance() == 0 || player.getSprint() == 0 ||
                player.getDribble() == 0 || player.getPassing() == 0 || player.getShooting() == 0) {
            return;
        }
        players.add(player);
    }
    public void removePlayer(String name) {
        players.removeIf(p -> p.getName().equals(name));
    }
    public double getRating() {
        double wholeTeamRatingScore = 0;
        for (Player player : players) {
            wholeTeamRatingScore += player.overallSkillLevel();
        }
        return (wholeTeamRatingScore / (players.size()));
    }
    public List<Player> getPlayers() {
        return players;
    }
}
