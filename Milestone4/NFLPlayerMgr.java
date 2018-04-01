package nfl;

/**Program: NFLPlayerManager Program
 *File: NFLPlayerManager.java
 *Summary: Prints listing of NFL Players and positions
 *Author: Mercedes Thigpen
 *Date: March 24, 2018
 **/


      // begin NFLPlayerMgr program class  
public abstract class NFLPlayerMgr {
  String name; //adding variables of the NFLPlayerMgr class
  String position;
  String type;
  
  public NFLPlayerMgr(String name, String position, String type){
      this.name = name; //naming the variables for the NFLPlayerMgr class
      this.position = position;
      this.type = type;
  }

 abstract public void performance();// declaring performance as an abstract method. 
 //performance is measured for each NFL player, but differs based on their role.
 public void stats(){
     System.out.print(name + " is the team's " + position + ", playing on the " + type + " line." + "\n");
 }


}
 
   
