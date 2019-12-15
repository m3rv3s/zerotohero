package HomeWork;
import java.lang.reflect.Array;
import java.util.ArrayList;
public class CarInventory {


        private String dealerName;

        public CarInventory(String dealerName) {
            this.dealerName = dealerName;
        }

        public void getCarName(ArrayList<Car> carList) {
            for (Car c : carList) {
                System.out.println(c.getName());
            }
        }

        public void getVinNumber(ArrayList<Car> carList) {
            for (Car c : carList) {
                System.out.println(c.getVinNumber());
            }
        }

        public void getPrice(ArrayList<Car> carList) {
            for (Car c : carList) {
                System.out.println(c.getPrice());
            }
        }

        public void getModelYear(ArrayList<Car> carList) {
            for (Car c : carList) {
                System.out.println(c.getYear());
            }

        }

        public void setModelPrice(ArrayList<Car> carList, String vinNumber, int price) {
            for (int i = 0; i < carList.size(); i++) {

                if (carList.get(i).getVinNumber().equalsIgnoreCase(vinNumber)) {
                    carList.get(i).setPrice(price);
                }
            }
        }

        //  10P84A  , 2010
        public void setModelYear(ArrayList<Car> carsList, String vinNumber, int year) {
            for (int i = 0; i < carsList.size(); i++) {
                if (carsList.get(i).getVinNumber().equalsIgnoreCase(vinNumber)) {
                    carsList.get(i).setYear(year);
                }
            }
        }

        public void addNewCar(ArrayList<Car> carList,Car newCar){
            boolean hasCar=false;
            for (Car c: carList){
              if  (c.getVinNumber().equalsIgnoreCase(newCar.getVinNumber())){

                  System.out.println("the car is already in the inventory");
                  hasCar=true;

              } }
        if (!hasCar){
            carList.add(newCar);
            System.out.println("the new car is added to your inventory");
        }
        }
public  void removeCar(ArrayList<Car> carList,String vinNumber){

          //  boolean hasCar=false;
            for (Car c: carList){
                if (c.getVinNumber().equalsIgnoreCase(vinNumber)){
                    carList.remove(c);
                }

            }




}

        public static void main(String[] args) {
            Car car1=new Car("Volvo","Cx40",2018,60000,"12vinNumber1234");
            Car car2=new Car("Volvo","Cx60",2018,70000,"13vinNumber1234");
            Car car3=new Car("Volvo","Cx90",2019,80000,"14vinNumber1234");
            Car car4=new Car("Jaguar","FPace",2019,45000,"17vinNumber1234");
            Car car5=new Car("Acura","MDX",2017,50000,"15vinNumber1234");
            Car car6=new Car("Acura","RDX",2018,40000,"16vinNumber1234");
            Car car7=new Car("Acura","RDX",2018,40000,"16vinNumber1234");

            //Create inventory dealer and give the name



            CarInventory dealer=new CarInventory("AutoNation");
            ArrayList <Car> carList=new ArrayList<Car>();
            carList.add(car5);
            carList.add(car3);
            carList.add(car2);




            dealer.getCarName(carList);
            dealer.getVinNumber(carList);
            dealer.getModelYear(carList);
            dealer.setModelYear(carList,"13vinNumber1234", 2018);
            dealer.getModelYear(carList);
            dealer.getPrice(carList);
            dealer.setModelPrice(carList,"15vinNumber1234",30000);
            dealer.getPrice(carList);
            dealer.addNewCar(carList,car1);
            dealer.addNewCar(carList,car1);
            dealer.addNewCar(carList,car6);
            dealer.addNewCar(carList,car3);
            dealer.getCarName(carList);
            dealer.removeCar(carList,"12vinNumber1234");
            System.out.println("this list is after the removed car");
            dealer.getCarName(carList);


        }
    }







