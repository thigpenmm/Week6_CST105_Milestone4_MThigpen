/**Program: NFLPlayerManagerTest Program
 *File: NFLPlayerManagerTest.java
 *Summary: Prints new player info to the console based on abstract NFLPlayerMgr class 
 * and defensivePlayer and offensivePlayer subclasses.
 *Author: Mercedes Thigpen
 *Date: March 30, 2018
 **/
package nfl;

public class NFLPlayerManagerTest {//tests criteria from NFLPlayerMgr class 
 // and defensivePlayer and offensivePlayer subclasses. Strings in data from both subclasses and inherited values from 
 //NFLPlayerMgr class.
    public static void main(String [] args) {
    defensivePlayer defensivePlayer1 = new defensivePlayer ("Maliek Collins", "Defensive Tackle", "defensive", 22, 3, 0);
    System.out.println();//prints player's information to the console
    
    defensivePlayer defensivePlayer2 = new defensivePlayer ("Damien Wilson", "Strongside Linebacker", "defensive", 35, 1, 0);
    System.out.println();//prints player's information to the console
    
    defensivePlayer defensivePlayer3 = new defensivePlayer ("Jeff Heath", "Safety", "defensive", 71, 0, 3);
    System.out.println();//prints player's information to the console
    
    offensivePlayer offensivePlayer1 = new offensivePlayer("Ezekiel Elliot", "Running Back", "offensive", 983, 242, 7);
    System.out.println();//prints player's information to the console
    
    offensivePlayer offensivePlayer2 = new offensivePlayer("Cole Beasley", "Wide Receiver", "offensive", 36, 314, 4);
    System.out.println();//prints player's information to the console
  
    offensivePlayer offensivePlayer3 = new offensivePlayer("Jason Witten", "Tight End", "offensive", 63, 560, 5);
    System.out.println();//prints player's information to the console
    
    //determines the order the player's information will be printed.
    defensivePlayer1.stats();// strings data from the inherited class
    defensivePlayer1.performance();//strings data from the abstract performance class
    
    offensivePlayer1.stats();// strings data from the inherited class
    offensivePlayer1.performance();//strings data from the abstract performance class
    
    defensivePlayer2.stats();// strings data from the inherited class
    defensivePlayer2.performance();//strings data from the abstract performance class
    
    offensivePlayer2.stats();// strings data from the inherited class
    offensivePlayer2.performance();//strings data from the abstract performance class
    
    defensivePlayer3.stats();// strings data from the inherited class
    defensivePlayer3.performance();//strings data from the abstract performance class
    
    offensivePlayer3.stats();// strings data from the inherited class
    offensivePlayer3.performance();//strings data from the abstract performance class
}
}//End of test, end of program