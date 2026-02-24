// GameClient

import java.io.*;
import java.net.*;

public class GameClient {
  public static void main(String[] args) {
    try {
      Socket socket = new Socket("localhost", 5000);
    } catch (IOException e) {
      System.out.println("Failed to connect: " + e.getMessage());
    }
  }
}
