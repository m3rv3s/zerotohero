package ScannerPackage;


public class ProjectThree {
    public static void main(String[] args) {

        int a=30;
        int b=25;

        int total=a++ + ++a + --b+ ++b +b++ +a++ +b- --b +a;

        System.out.println(a);
        System.out.println(b);
        System.out.println(total);

    }
}
