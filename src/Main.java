import model.Player;
import model.Team;
import service.TournamentManager;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        TournamentManager manager = new TournamentManager();
        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        while (running) {
            System.out.println("\n🏏 Cricket Tournament Manager");
            System.out.println("1. Add Team and Players");
            System.out.println("2. Schedule Match");
            System.out.println("3. Record Match Result");
            System.out.println("4. Show All Matches");
            System.out.println("5. Show Leaderboard");
            System.out.println("6. Exit");
            System.out.print("Choose an option: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // consume newline

            switch (choice) {
                case 1 -> {
                    System.out.print("Enter team name: ");
                    String teamName = scanner.nextLine();
                    Team team = new Team(teamName);

                    System.out.println("Now, enter names of 11 players:");
                    for (int i = 1; i <= 11; i++) {
                        System.out.print("Enter Player " + i + " name: ");
                        String playerName = scanner.nextLine();
                        team.addPlayer(new Player(playerName));
                    }

                    manager.addTeam(team);
                }
                case 2 -> {
                    System.out.print("Enter Team 1 name: ");
                    String team1 = scanner.nextLine();
                    System.out.print("Enter Team 2 name: ");
                    String team2 = scanner.nextLine();
                    manager.scheduleMatch(team1, team2);
                }
                case 3 -> {
                    System.out.print("Enter Team 1 name: ");
                    String team1 = scanner.nextLine();
                    System.out.print("Enter Team 2 name: ");
                    String team2 = scanner.nextLine();
                    System.out.print("Enter Winner name: ");
                    String winner = scanner.nextLine();
                    manager.recordMatchResult(team1, team2, winner);
                }
                case 4 -> manager.showAllMatches();
                case 5 -> manager.showLeaderboard();
                case 6 -> {
                    running = false;
                    System.out.println("👋 Exiting... Thank you!");
                }
                default -> System.out.println("❌ Invalid choice.");
            }
        }

        scanner.close();
    }
}
