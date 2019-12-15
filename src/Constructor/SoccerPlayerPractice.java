package Constructor;

public class SoccerPlayerPractice {

    public static void main(String[] args) {

        SoccerPlayer player=new SoccerPlayer(); // used default constructor

        player.name="ronaldo";
        player.age=34;
        player.nationality="portugal";
        player.teamName="Juventus";
        player.height=6.1;
        player.weight=93.1;

        player.run();
        player.run(player.name);
        player.shoot(60,28);

        // using constructor with arguements

        SoccerPlayer player1=new SoccerPlayer("Messi" , 32,"Argentina","barcelona",5.7,75.4);
        System.out.println(player1.name);
        System.out.println(player1.teamName);



        SoccerPlayer player2=new SoccerPlayer("Eden Hazar",29,"Belgium","Real Madrid",5.10,83);
        System.out.println(player2.name);
        System.out.println(player2.teamName);

        SoccerPlayer player3=new SoccerPlayer(); // it will not compile if i dont have constructor with no arguement.
    }

}
