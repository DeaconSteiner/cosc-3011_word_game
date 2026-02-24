// GameServer

import java.net.*;
import java.io.*;

public class GameServer {

  public static void main(String[] args) {
    try {
      ServerSocket server = new ServerSocket(5000);
      System.out.println("Server started!");

      // Socket connection
      Socket client = server.accept();
      System.out.println("Client connected!");

      

      client.close();
      server.close();
    } catch (IOException e) {
      System.out.println("Failed to start server: " + e.getMessage());
    }
  }
}
