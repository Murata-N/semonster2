/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package se22;

public class App {
  public String getGreeting() {
    return "Hello World!";
  }

  public static void main(String[] args) {
    System.out.println(new App().getGreeting());

    /* モンスターの名前を表示する */
    new MonsterShow().showMonsterName();
    new Player().showDeck();
  }
}