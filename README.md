# Cricket Tournament Manager (Java Console App)

This Java console-based application allows users to manage a mini cricket tournament efficiently. Built with object-oriented design principles, it supports team creation, automatic match scheduling, dynamic leaderboard updates, and a final match between the top two teams.

## Table of Contents
- [Project Overview](#project-overview)
- [Features](#features)
- [Project Structure](#project-structure)
- [Installation](#installation)
- [Usage](#usage)
- [Technologies Used](#technologies-used)
- [Example Use-Case](#example-use-case)
- [Author](#author)

## Project Overview

The **Cricket Tournament Manager** is a console-based Java application designed to simulate a round-robin cricket tournament. Users can interactively input teams and players, automatically generate fixtures, input match results, and track team standings via a dynamic leaderboard. At the end of group matches, the top two teams face off in a final to decide the champion.

## Features

- Add multiple teams with 11 players via interactive console input  
- Auto-schedule round-robin group stage matches  
- Record match results and update points accordingly  
- Automatically determine top 2 teams for the final  
- Display a real-time leaderboard sorted by points  
- Declare a final winner based on the championship match  

## Project Structure
## Project Structure

```
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
```

## Installation

To compile and run the project:

1. Compile the source code:
   ```bash
   javac -d out src/model/*.java src/service/*.java src/Main.java
   ```

2. Run the application:
   ```bash
   java -cp out Main
   ```

Make sure Java 17 or above is installed on your machine.

## Usage

1. **Add Teams:**  
   Enter team names and then input names of 11 players for each team.

2. **Schedule Matches:**  
   Matches are auto-generated in a round-robin format between all teams.

3. **Record Results:**  
   For each match, the user inputs the winning team.

4. **Final Match:**  
   After all group matches, the top two teams (based on points) play a final.

5. **Leaderboard:**  
   The leaderboard updates in real-time based on match outcomes and is displayed after each match.

## Technologies Used

- Java 17+  
- Console-based UI  
- Object-Oriented Programming (OOP)  
- Java Collections Framework (ArrayList, HashMap, etc.)

## Example Use-Case

1. Start the application  
2. Enter the number of teams  
3. For each team, enter the team name and 11 player names  
4. Let the system auto-schedule the group stage matches  
5. Input the winner of each match as prompted  
6. System auto-selects the top 2 teams and schedules the final  
7. Final winner is declared as tournament champion

## Author

**Aslam Mohammed**  
GitHub: [@maslam2151](https://github.com/maslam2151)

