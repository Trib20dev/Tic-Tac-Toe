# 🧩 Sudoku Solver (Java)

This project implements a solution for a standard 9x9 Sudoku puzzle using a recursive **backtracking algorithm**. The solver finds a valid solution for the initialized board, if one exists, and displays the process in the console.

## 🚀 How to Run

### Prerequisites

You need to have the Java Development Kit (JDK) installed on your system.

### Running from the Console

1.  **Clone the Repository:**
    ```bash
    git clone YOUR_REPO_URL
    ```
    *(Replace YOUR_REPO_URL with the actual address of your repository)*

2.  **Compile the Files:** Navigate to the project directory and compile both Java source files.
    ```bash
    # Assuming your source files are in a 'myPackage' directory
    javac myPackage/Principal.java myPackage/Sudoku.java
    ```

3.  **Execute the Main Class:**
    ```bash
    java myPackage.Principal
    ```
    The application will output the initial unsolved board and the final solved board.

## 💻 Code Structure

The project separates the execution logic from the solver algorithm for clarity.

| File | Purpose | Key Methods |
| :--- | :--- | :--- |
| **`Principal.java`** | **Main Execution** | Contains the `main()` method, the initial 9x9 board data, and handles the flow of calling the solver and displaying the final results. |
| **`Sudoku.java`** | **Solver Logic** | Contains the core methods for managing the board, checking legality, and implementing the recursive backtracking algorithm. |

## 🧠 Core Algorithm: Backtracking

The solver uses the **Backtracking** technique, a standard method for solving constraint satisfaction problems like Sudoku. 

1.  **Find Empty Cell:** The algorithm searches for the first empty cell (value `0`).
2.  **Try Numbers:** It iterates through possible numbers (1 through 9) for that cell.
3.  **Check Constraints:** For each number, it checks if placing that number is valid (no conflict in the current row, column, or 3x3 box).
4.  **Recurse:** If the number is valid, it places the number and **recursively** calls the solver for the next empty cell.
5.  **Backtrack:** If the recursive call returns `false` (meaning the path leads to a dead end), the current cell is reset to `0`, and the algorithm tries the next possible number.

## ⚙️ Board Initialization

The puzzle to be solved is defined as a static 2D integer array in the `Principal.java` file. You can easily change this array to solve any standard 9x9 puzzle.

The example initialization looks like this:

```java
int[][] puzzle = {
    {6, 7, 0, 0, 4, 8, 0, 0, 0},
    {0, 0, 0, 0, 0, 0, 0, 9, 7},
    {0, 0, 4, 3, 0, 0, 0, 0, 0},
    {0, 0, 8, 0, 0, 0, 0, 0, 4},
    {0, 0, 6, 7, 0, 9, 1, 0, 0},
    {4, 0, 0, 0, 0, 0, 7, 0, 0},
    {0, 0, 0, 0, 0, 7, 9, 0, 0},
    {8, 9, 0, 0, 0, 0, 0, 0, 0},
    {0, 0, 0, 2, 8, 0, 0, 1, 6}
};
