package Constructor;

public class SoccerPlayer {


    /* instance variables: name, age, nationality, teamname , height , weight
    create the method to run the soccer player
    it will take no parameter and print soccer player
    is running

    create one method to run the soccer player to take one parameter , parameter
    as a name of soccer player and  will print  "nameOfSoccerPlayer is running "

     create one method to shoot the soccerplayer. it will take no paramter and it will print
     soccer player is kicking the ball

     create on method to  shoot the soccerplayer it will take one parameter as a speed of the shoot
     it will print "the speed of the shoot is " +speednumber

    create one method to shoot the player it will take two parameter. as a speed of the shoot and distance
    from the goalKeeper.
    if speed is > 50 and distance from the goal keeper is <25 m print it is Goal
    else { print it is not goal
     */

    String name,nationality,teamName;
    int age;
    double height,weight;

    public SoccerPlayer(){

    }
    public SoccerPlayer(String sname, int sage , String snational,String steamName,double sheight,double sweight){
      name=sname;
      age=sage;
      height=sheight;
      weight=sweight;
      teamName=steamName;
      nationality=snational;

    }
    public  void run(){
        System.out.println("Soccer player is running");
    }
public void run(String name){
    System.out.println(name + " is running ");

}
public void shoot(){
    System.out.println("soccer player is kicking the ball " );
}
public void shoot(int speed){
        shoot();
    System.out.println("the speed of the shoot is " + speed);

}
public void shoot (int speed, int distance){
        shoot(speed);
        if (speed>50 && distance<25){
            System.out.println("it is goal");
        }else{
            System.out.println("it is not a goal");
        }
}}





/* create new object for Eden Hazar
29,gelgium,real madrid ,5.10,83
 */
