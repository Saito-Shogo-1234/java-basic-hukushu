package org.example;

public class FightersPlayer {
  String name;
  String position;
  int number;

  public void throwBall(){
    System.out.println(name + " is throwing the ball!!");
  }

  public static void main(String args[]){

    FightersPlayer Seigi = new FightersPlayer();
    Seigi.name = "田中　正義";
    Seigi.position = "Pitcher";
    Seigi.number = 26;

    Seigi.throwBall();
  }
}
