package HomeWork;

public class EmployeeSalary {

String name,Location;
int employmentYear,age,workHour;



    public EmployeeSalary(){

    }

    public EmployeeSalary(String name,String Location) {

       this.name = name;
       this. Location = Location;


    }
    public EmployeeSalary(int employmentYear,int age,int workHour) {
        this.employmentYear = employmentYear;
        this.age = age;
        this.workHour = workHour;

    }
    public int workDays(int employmentYear){

        int workingDays=employmentYear/12;
        return workingDays;

    }
    public double yearlySalary(int workHour , int workDays){
       int workingDays=1;
    double yearlySalary=workHour*workingDays*55;
    return yearlySalary;

    }
public  int totalEmploymentYear(){

        return employmentYear;
}

public double bonusAmount(int employmentYear,int workingDays){
        double bonusAmount=1;
        if (employmentYear>5 && workingDays>240 ){
            return bonusAmount*(yearlySalary(employmentYear, workingDays)*15/100);
        }else if (employmentYear<5 && workingDays<240){
        }

    return bonusAmount*(yearlySalary(employmentYear, workingDays)*10/100);

    }

public String getName(){
        return getName();
}

public String setName(){
        return setName();
}

}
