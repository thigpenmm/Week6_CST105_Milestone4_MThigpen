/**Program: defensivePlayer Program
 *File: defensivePlayer.java
 *Summary: Identifies new defensive player info based on abstract NFLPlayerMgr class 
 * and defensivePlayer subclass.
 *Author: Mercedes Thigpen
 *Date: March 30, 2018
 **/
package nfl;

public class defensivePlayer extends NFLPlayerMgr {//extending the abstract class
    int tackles;//identifying the new variables of the defensivePlayer subclass
    int sacks;
    int interceptions;
    
    
    public defensivePlayer(String name, String position, String type, int tackles, int sacks, int interceptions) {
        super(name, position, type);//inherited variables from the abstract NFLPlayerMgr class
        this.tackles = tackles;//new variables of the defensivePlayer class
        this.sacks = sacks;
        this.interceptions = interceptions;
        
    }

    @Override
    public void performance() {//abstract method for performance differences of defensive players
          System.out.println("This plaver has " + tackles + " tackles, " + sacks + " sacks and " + interceptions + " interceptions." + "\n");
    }

    
}
