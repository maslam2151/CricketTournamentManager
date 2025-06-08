package model;

public class Match {
    private Team team1;
    private Team team2;
    private Team winner;

    public Match(Team team1, Team team2) {
        this.team1 = team1;
        this.team2 = team2;
        this.winner = null;
    }

    public Team getTeam1() {
        return team1;
    }

    public Team getTeam2() {
        return team2;
    }

    public Team getWinner() {
        return winner;
    }

    public void setWinner(Team winner) {
        if (winner.equals(team1) || winner.equals(team2)) {
            this.winner = winner;
            winner.addPoints(2); // 2 points for a win
        } else {
            System.out.println("Invalid winner team.");
        }
    }

    @Override
    public String toString() {
        String result = team1.getName() + " vs " + team2.getName();
        if (winner != null) {
            result += " | Winner: " + winner.getName();
        } else {
            result += " | Result: Pending";
        }
        return result;
    }
}
