/*Program: offensivePlayer Program
 *File: offensivePlayer.java
 *Summary: Identifies new offensive player info based on abstract NFLPlayerMgr class 
 * and offensivePlayer subclass.
 *Author: Mercedes Thigpen
 *Date: March 30, 2018
 **/
package nfl;
public class offensivePlayer extends NFLPlayerMgr {//extending the abstract class
   int yards;//identifying the new variables of the defensivePlayer subclass
   int receptions;
   int touchdowns;
   

    public offensivePlayer(String name, String position, String type, int yards, int receptions, int touchdowns) {
        super(name, position, type);//inherited variables from the abstract NFLPlayerMgr class
        this.yards = yards;//new variables of the offensivePlayer class
        this.receptions = receptions;
        this.touchdowns = touchdowns;
                
    }

    @Override
    public void performance() {//abstract method for performance differences of offensive players
        System.out.println("This plaver has " + receptions + " receptions, " + yards + " yards and " + touchdowns + " touchdowns." + "\n");  
    }
   
        
    }

   
    

   

