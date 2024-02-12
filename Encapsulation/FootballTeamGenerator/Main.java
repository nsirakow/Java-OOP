import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        Team team = null;

        while (!input.equals("END")) {
            String[] tokens = input.split(";");
            String command = tokens[0];
            String teamName = tokens[1];

            switch (command) {
                case ("Team") -> team = new Team(teamName);
                case ("Add") -> {
                    if (team == null) {
                        System.out.println("Team " + teamName + (" does not exist"));
                    } else {
                        String playerName = tokens[2];
                        int endurance = Integer.parseInt(tokens[3]);
                        int sprint = Integer.parseInt(tokens[4]);
                        int dribble = Integer.parseInt(tokens[5]);
                        int passing = Integer.parseInt(tokens[6]);
                        int shooting = Integer.parseInt(tokens[7]);

                        Player currentPlayer = new Player(playerName, endurance, sprint, dribble, passing, shooting);
                        team.addPlayer(currentPlayer);
                    }
                }
                case ("Remove") -> {
                    String playerName = tokens[2];
                    if (playerExists(team, playerName)) {
                        team.removePlayer(playerName);
                    } else {
                        System.out.println("Player " + playerName + " is not in " + team.getName() + " team");
                    }
                }
                case ("Rating") -> {
                    if (team == null) {
                        System.out.println("Team " + teamName + (" does not exist"));
                    } else {
                        System.out.printf("%s - %d%n", team.getName(), Math.round(team.getRating()));
                    }
                }
            }
            input = scanner.nextLine();
        }
    }

    private static boolean playerExists(Team team, String playerName) {
        for (Player player : team.getPlayers()) {
            if (player.getName().equals(playerName)) {
                return true;
            }
        }
        return false;
    }
}
