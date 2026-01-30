# cosc-3011 Word Game
This is a repo for the wordgame assignment for COSC 3011

# How to Compile and Run

### Step 1: Navigate to project folder. For example:

```bash
cd ~/repos/cosc-3011_word_game
```

### Step 2: Compile Code

```bash
javac -d bin src/wordgame/*.java
```
#### Explanation:
- `javac`: Java compiler
- `-d bin`: put compiled .class files into bin folder
- `src/wordgame/*.java`: compile all source files in wordgame package

### Step 3: Run the Game
```bash
java -cp bin wordgame.Game
```

#### Explanation:
- `java`: runs Java programs
- `-cp bin`: tells Java to look for compiled classes in bin folder
- `wordgame.Game`: main class with main() method
