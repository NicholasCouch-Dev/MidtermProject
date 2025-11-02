# 🎲 A Game of Craps (Java Console Version)
**Author:** Nicholas Couch  
**Date:** 10/05/2025  
**IDE:** IntelliJ IDEA 2025.2  
**Language:** Java 24 (JDK 24.0.2)  

---

## 📘 Overview
This project is a console-based Java implementation of the classic **casino dice game, Craps**.  
It was created as a **Midterm Project** for CSC 1060 and demonstrates key programming concepts like:
- Loops and conditionals
- Methods and functions
- Random number generation
- User input handling
- Object-oriented design principles

---

## 🧠 How to Run in IntelliJ IDEA

1. **Open IntelliJ IDEA.**
2. Go to **File → Open...** and select your project folder (`MidtermProject_Professional` or `MidtermProject`).
3. Wait for IntelliJ to index the project.
4. In the **Project view**, expand the `src` folder and locate `Main.java`.
5. Right-click `Main.java` → **Run 'Main.main()'**.
6. Follow the prompts in the console to play.

---

## 🎮 Gameplay Instructions
- The game simulates rolling two dice.
- If the sum is 7 or 11 → you win!
- If the sum is 2, 3, or 12 → you lose (Craps).
- Any other number becomes the “point.” You must roll that same number again before rolling a 7 to win.
- Rolling doubles matching the point grants a **Double Win** bonus.
- After each round, you can choose to play again or exit.

---

## 📊 Statistics
At the end of each session, the game displays:
- Total Wins  
- Double Wins  
- Losses  
- Win Rate %  

Example Output:
```
===== GAME STATS =====
Player: Nicholas
Wins: 4
Double Wins: 1
Losses: 3
Win Rate: 57.14%
======================
```

---

## 🧩 File Structure
```
MidtermProject/
 ├── src/
 │    ├── Main.java
 │    ├── CrapsGame.java
 │    ├── Player.java
 │    └── Dice.java
 ├── README.md
 └── .gitignore
```

---

## 🚀 Future Enhancements
- Add a betting system with virtual credits.
- Save player stats between sessions using file I/O.
- Develop a GUI version using JavaFX.
- Write JUnit tests for game logic verification.

---

## 🏁 Credits
Created by **Nicholas Couch**  
CSC 1060 – Instructor: Jim Eberle  
Midterm Project, 2025  
