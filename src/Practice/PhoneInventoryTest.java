package Practice;

import java.util.ArrayList;

public class PhoneInventoryTest {



        private String seller;

    public PhoneInventoryTest(String seller) {
        this.seller = seller;
    }
public void getPhoneBrand(ArrayList<Phone> phoneList ){
        for (Phone p: phoneList){
            System.out.println(p.getBrand());
        }}

    public void getPhoneModel(ArrayList<Phone> phoneList){
            for (Phone p: phoneList){
                System.out.println(p.getModel());

    }
}
    public  void getPhoneYear(ArrayList<Phone> phoneList){
        for (Phone p: phoneList){
            System.out.println(p.getYear());
        }
    }
    public  void getPhonePrice(ArrayList<Phone> phoneList){
        for (Phone p: phoneList){
            System.out.println(p.getPrice());

        }
    }

    public void  changeModel(ArrayList<Phone> phoneList,String Model,int year){


        for (int i=0;i<phoneList.size();i++){

            if (phoneList.get(i).getModel().equalsIgnoreCase(Model));{
                phoneList.get(i).setModel(Model);
            }
        }


    }

        public static void main(String[] args) {
            Phone phone = new Phone("Iphone", "XMax", 2019, 1500);
            Phone phone1=new Phone("Samsung","S10",2018,1200);
            Phone phone2=new Phone("Google","Nexus",2017,700);



            PhoneInventoryTest seller=new PhoneInventoryTest("ATT");

            ArrayList<Phone> phoneList=new ArrayList<Phone>();

            phoneList.add(phone);
            phoneList.add(phone1);
            phoneList.add(phone2);


            seller.getPhoneBrand(phoneList);
            seller.getPhoneModel(phoneList);
            seller.getPhoneYear(phoneList);
            seller.getPhonePrice(phoneList);

            System.out.println("New phone model:");
            seller.changeModel(phoneList,"XS",2018);
            seller.getPhoneModel(phoneList);
            seller.changeModel(phoneList,"S9",2016);
            seller.getPhoneModel(phoneList);
            seller.changeModel(phoneList,"Nexus",2010);
            seller.getPhoneModel(phoneList);
    }

    }


