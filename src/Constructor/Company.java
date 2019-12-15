package Constructor;

public class Company {

    String name;
    String location;
    String area;
    int employeeNum;
    int budget;

    // create a constructor with no arguement
    public Company() {

    }
    //create 3 argument constructor initialize the value for
    //name , location , area


    public  Company(String name, String location, String area) {
        this.name = name;
        this.location = location;
        this.area = area;


    }
//create constructor to initialize all the instance variables

    public  Company(String name, String location, String area, int employeeNum,int budget){

        this.name=name;
        this.location=location;
        this.area=area;
        this.employeeNum=employeeNum;
        this.budget=budget;
    }
public void displayCompany(){
    System.out.println("company name "+name);
    System.out.println("company location " + location);
    System.out.println("company area" + area);
    System.out.println("employee number" + employeeNum);
    System.out.println("budget is " +budget);

    Company company2=new Company("chase","Chicago","Finance",400,200000);

    }
        //you cannot create same constructor.
    public static void main(String[] args){

            Company company=new Company(); // default constructor

        Company company1=new Company("Zara","Schaumburg","Reatail");
        System.out.println(company1.name);
        System.out.println(company1.employeeNum);
        company1.employeeNum=50;
        System.out.println(company1.employeeNum);


    }




    }


