// GameServer

package wordgame;

import java.net.*;
import java.io.*;

public class GameServer {

  private Word secret;
  private WordList wordList;


  private void serverStart() {
    // Change to src/words.txt for full game. There are a few wordlist options currently
    wordList = new WordList("src/test.txt");

    secret = wordList.getRandom();

    try {
      ServerSocket server = new ServerSocket(5000);
      System.out.println("Server started!");

      // Socket connection
      Socket client = server.accept();
      System.out.println("Client connected!");

    } catch (IOException e) {
      System.err.println("Failed to start server: " + e.getMessage());
    }
    
}

  private Feedback makeGuess(Word guess) {
    return secret.compareTo(guess);
  }

  public static void main(String[] args) {
      new GameServer().serverStart();
  }
}
