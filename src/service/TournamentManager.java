package service;

import model.Match;
import model.Team;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TournamentManager {
    private List<Team> teams;
    private List<Match> matches;
    private boolean finalMatchScheduled = false;

    public TournamentManager() {
        teams = new ArrayList<>();
        matches = new ArrayList<>();
    }

    public void addTeam(Team team) {
        if (getTeamByName(team.getName()) != null) {
            System.out.println("Team with this name already exists.");
            return;
        }
        teams.add(team);
        System.out.println("✅ Team added: " + team.getName() + " with " + team.getPlayers().size() + " players");
    }

    public Team getTeamByName(String name) {
        for (Team t : teams) {
            if (t.getName().equalsIgnoreCase(name)) {
                return t;
            }
        }
        return null;
    }

    public void scheduleMatch(String team1Name, String team2Name) {
        Team team1 = getTeamByName(team1Name);
        Team team2 = getTeamByName(team2Name);

        if (team1 == null || team2 == null) {
            System.out.println("One or both teams not found.");
            return;
        }

        Match match = new Match(team1, team2);
        matches.add(match);
        System.out.println("📅 Match scheduled: " + match);
    }

    public void recordMatchResult(String team1Name, String team2Name, String winnerName) {
        for (Match match : matches) {
            if (match.getTeam1().getName().equalsIgnoreCase(team1Name) &&
                    match.getTeam2().getName().equalsIgnoreCase(team2Name) &&
                    match.getWinner() == null) {

                Team winner = getTeamByName(winnerName);
                if (winner == null || (!winner.equals(match.getTeam1()) && !winner.equals(match.getTeam2()))) {
                    System.out.println("Invalid winner.");
                    return;
                }

                match.setWinner(winner);
                System.out.println("✅ Result recorded: " + match);

                if (allMatchesFinished() && !finalMatchScheduled) {
                    scheduleFinalMatch();
                }

                return;
            }
        }

        System.out.println("Match not found or result already recorded.");
    }

    private boolean allMatchesFinished() {
        for (Match m : matches) {
            if (m.getWinner() == null) {
                return false;
            }
        }
        return true;
    }

    private void scheduleFinalMatch() {
        if (teams.size() < 2) {
            System.out.println("Not enough teams to schedule final.");
            return;
        }
        teams.sort((t1, t2) -> t2.getPoints() - t1.getPoints());
        Team first = teams.get(0);
        Team second = teams.get(1);

        Match finalMatch = new Match(first, second);
        matches.add(finalMatch);
        finalMatchScheduled = true;
        System.out.println("\n🎉 Final match scheduled between " + first.getName() + " and " + second.getName());
    }

    public void showAllMatches() {
        if (matches.isEmpty()) {
            System.out.println("No matches scheduled yet.");
        } else {
            for (Match match : matches) {
                System.out.println(match);
            }
        }
    }

    public void showLeaderboard() {
        System.out.println("\n🏆 Leaderboard:");
        Collections.sort(teams, (t1, t2) -> t2.getPoints() - t1.getPoints());
        for (Team t : teams) {
            System.out.println(t);
        }
    }

    public List<Team> getTeams() {
        return teams;
    }

    public List<Match> getMatches() {
        return matches;
    }
}
