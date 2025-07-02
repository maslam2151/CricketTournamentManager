Cricket Tournament Manager (Java Console App)
This Java console-based application allows users to manage a mini cricket tournament efficiently. Built with object-oriented design principles, it supports team creation, automatic match scheduling, dynamic leaderboard updates, and a final match between the top two teams.

📑 Table of Contents
Project Overview

Features

Project Structure

Installation

Usage

Technologies Used

Example Use-Case

Author

📌 Project Overview
The Cricket Tournament Manager is a console-based Java application designed to simulate a round-robin cricket tournament. Users can interactively input teams and players, automatically generate fixtures, input match results, and track team standings via a dynamic leaderboard. At the end of group matches, the top two teams face off in a final to decide the champion.

✅ Features
Add multiple teams with 11 players via interactive console input

Auto-schedule round-robin group stage matches

Record match results and update points accordingly

Automatically determine top 2 teams for the final

Display a real-time leaderboard sorted by points

Declare a final winner based on the championship match

📁 Project Structure
css
Copy
Edit
CricketTournamentManager
│
├── src
│   ├── model
│   │   ├── Player.java
│   │   ├── Team.java
│   │   └── Match.java
│   │
│   ├── service
│   │   └── TournamentManager.java
│   │
│   └── Main.java
│
├── README.md
└── .gitignore
⚙️ Installation
To compile and run the project:

Compile the source code:

bash
Copy
Edit
javac -d out src/model/*.java src/service/*.java src/Main.java
Run the application:

bash
Copy
Edit
java -cp out Main
Make sure Java 17 or above is installed on your machine.

🚀 Usage
Add Teams:
Enter team names and then input names of 11 players for each team.

Schedule Matches:
Matches are auto-generated in a round-robin format between all teams.

Record Results:
For each match, the user inputs the winning team.

Final Match:
After all group matches, the top two teams (based on points) play a final.

Leaderboard:
The leaderboard updates in real-time based on match outcomes and is displayed after each match.

🧰 Technologies Used
Java 17+

Console-based UI

Object-Oriented Programming (OOP)

Java Collections Framework (ArrayList, HashMap, etc.)

🎮 Example Use-Case
Start the application

Enter the number of teams

For each team, enter the team name and 11 player names

Let the system auto-schedule the group stage matches

Input the winner of each match as prompted

System auto-selects the top 2 teams and schedules the final

Final winner is declared as tournament champion

👨‍💻 Author
Aslam Mohammed
GitHub: @maslam2151
