Cricket Tournament Manager (Java Console App)

A Java console-based application to manage a mini cricket tournament. Built in Java using object-oriented principles, the app allows team creation, match scheduling, leaderboard tracking, and an automatic final between the top two teams.


Features

 Add teams with 11 players via interactive input  
 Automatically schedule group matches  
 Record match winners and award points  
 Auto-schedule final match between top 2 teams  
 Display leaderboard sorted by points



 Project Structure

CricketTournamentManager/
├── src/
│ ├── model/
│ │ ├── Player.java
│ │ ├── Team.java
│ │ └── Match.java
│ ├── service/
│ │ └── TournamentManager.java
│ └── Main.java
├── README.md
└── .gitignore


---

## 🛠️ How to Compile & Run

### 1. Compile the code

```bash
javac -d out src/model/*.java src/service/*.java src/Main.java


2. Run the program
bash
java -cp out Main

Technologies Used
Java 17+
Console-based UI
Object-Oriented Programming
Collections Framework

Example Use-Case
Enter teams → add 11 players per team
Matches are auto-scheduled between all teams
User enters the match winner for each match
Once group matches are over, top 2 teams play a final
Final winner is declared champion

Author
Aslam Mohammed
GitHub: @maslam2151



