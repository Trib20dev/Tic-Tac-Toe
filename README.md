# ❌🅾️ Tic-Tac-Toe Console Game (Tres en Raya)

This project implements the classic Tic-Tac-Toe game ("Tres en Raya") playable directly within the Java console. It features a robust, clean structure and logic to handle wins, losses, and draws using the `SegundoIntento.java` class.

## 🌟 Project Status: `SegundoIntento.java`

The current implementation uses a straightforward 3x3 integer array to represent the board, making the game logic highly readable and efficient.

| Feature | Status |
| :--- | :--- |
| **Win Condition Check** | ✅ Fully implemented (`gano()` method) |
| **Draw/Stalemate Check** | ✅ Fully implemented (`completado()` method) |
| **Input Validation** | ✅ Validated against defined coordinate inputs |

## 🚀 How to Run the Game

### Prerequisites

You need to have the Java Development Kit (JDK) installed on your system.

### Running from the Console

1.  **Clone the Repository:**
    ```bash
    git clone https://github.com/Trib20dev/Tic-Tac-Toe/
    ```
2.  **Compile the Code:** Navigate to the source directory.
    ```bash
    javac paquete/SegundoIntento.java
    ```

3.  **Run the Game:** Execute the compiled class file.
    ```bash
    java paquete.SegundoIntento
    ```

## 🎮 How to Play

The game prompts players for their move using 2-digit coordinates.

### Coordinate Input Guide

Enter a two-digit number where the first digit represents the **Row** and the second digit represents the **Column** (1, 2, or 3).

| Input Example | Position on Board |
| :--- | :--- |
| **11** | Top-Left |
| **23** | Middle-Right |
| **32** | Bottom-Center |

### Console Output Example

The board is displayed with a simple grid structure:

+---+---+---+ 
| X |   | O | 
+---+---+---+ 
|   | X |   | 
+---+---+---+ 
|   |   | O | 
+---+---+---+ 
Va el jugador X 
Donde vas a jugar: 12

## 📐 Code Structure

The game logic is organized using clear static methods within `SegundoIntento.java`:

| Method | Role | Details |
| :--- | :--- | :--- |
| `main` | **Game Driver** | Manages the primary game loop, handles player input/output, and switches turns. |
| `imprimirTablero` | **Renderer** | Takes the internal 3x3 array and prints the formatted `X`, `O`, and border characters to the console. |
| `gano` | **Win Checker** | Contains the core logic for checking three-in-a-row horizontally, vertically, and diagonally. |
| `completado` | **Draw Checker** | Iterates through the board to ensure no empty
