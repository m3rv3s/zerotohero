package Variables;

public class NewClass {

    public static void main(String[] args){

        int scoreShould=79;
        int myScore=65;

        boolean goToUni=scoreShould<=myScore;
        boolean goToESL=scoreShould>=myScore;

        System.out.println("will go to Uni "+ goToUni);
        System.out.println("will go to ESL "+ goToESL);
    }
}
