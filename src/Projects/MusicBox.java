package Projects;

import java.util.Scanner;

public class MusicBox {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Please Enter the Music type");
             String musicType1=input.nextLine();



             if(musicType1.equalsIgnoreCase("Classical")) {
                 int classicalPrice = 4;
                 System.out.println("FourSeasons,FurElise,Finlandia,Vocalise,ThePlanets" +
                         ("Please enter which on you choose"));
                 String classicalSong = input.nextLine();

                 if (classicalSong.equalsIgnoreCase("four seasons")) {
                     System.out.println(classicalSong + (" Song Playing ") + ("please insert the money " + ("$") + classicalPrice));
                     System.out.println(classicalSong + ("Song PLaying"));
                     System.out.println("please insert money");
                     int money1 = input.nextInt();

                     if (money1 >= classicalPrice) {
                         System.out.println("your song is playing");
                     } else {
                         System.out.println("price inserted is wrong, please try again later");
                     }
                 } else if (classicalSong.equalsIgnoreCase("Fur Elise")) {
                     System.out.println(classicalSong + ("Song PLaying" + ("please insert the money " + ("$") + classicalPrice)));
                     System.out.println(classicalSong + ("Song PLaying"));
                     System.out.println("please insert money");
                     int money1 = input.nextInt();

                     if (money1 >= classicalPrice) {
                         System.out.println("your song is playing");
                     } else {
                         System.out.println("price inserted is wrong, please try again later");
                     }
                 } else if (classicalSong.equalsIgnoreCase("finlandia")) {
                     System.out.println(classicalSong + ("Song PLaying" + ("please insert the money " + ("$") + classicalPrice)));
                     System.out.println(classicalSong + ("Song PLaying"));
                     System.out.println("please insert money");
                     int money1 = input.nextInt();

                     if (money1 >= classicalPrice) {
                         System.out.println("your song is playing");
                     } else {
                         System.out.println("price inserted is wrong, please try again later");
                     }
                 } else if (classicalSong.equalsIgnoreCase("Vocalise")) {
                     System.out.println(classicalSong + ("Song PLaying" + ("please insert the money " + ("$") + classicalPrice)));
                     System.out.println(classicalSong + ("Song PLaying"));
                     System.out.println("please insert money");
                     int money1 = input.nextInt();

                     if (money1 >= classicalPrice) {
                         System.out.println("your song is playing");
                     } else {
                         System.out.println("price inserted is wrong, please try again later");
                     }

                 }


             }

                    if(musicType1.equalsIgnoreCase("Pop")) {
                        int popPrice = 4;
                        System.out.println("Badguy,Talk,PleaseMe,7Ring,WithoutMe" +
                                ("Please enter which on you choose"));
                        String popSong = input.nextLine();

                        if (popSong.equalsIgnoreCase("Badguy")) {
                            System.out.println(popSong + (" Song Playing ") + ("please insert the money " + ("$") + popPrice));
                            System.out.println(popSong + ("Song PLaying"));
                            System.out.println("please insert money");
                            int money2 = input.nextInt();

                            if (money2 >= popPrice) {
                                System.out.println("your song is playing");
                            } else {
                                System.out.println("price inserted is wrong, please try again later");
                            }
                        } else if (popSong.equalsIgnoreCase("Talk")) {
                            System.out.println(popSong + ("Song PLaying" + ("please insert the money " + ("$") + popPrice)));
                            System.out.println(popSong + ("Song PLaying"));
                            System.out.println("please insert money");
                            int money2 = input.nextInt();

                            if (money2 >= popPrice) {
                                System.out.println("your song is playing");
                            } else {
                                System.out.println("price inserted is wrong, please try again later");
                            }
                        } else if (popSong.equalsIgnoreCase("PleaseMe")) {
                            System.out.println(popSong + ("Song PLaying" + ("please insert the money " + ("$") + popPrice)));
                            System.out.println(popSong + ("Song PLaying"));
                            System.out.println("please insert money");
                            int money2 = input.nextInt();

                            if (money2 >= popPrice) {
                                System.out.println("your song is playing");
                            } else {
                                System.out.println("price inserted is wrong, please try again later");
                            }
                        } else if (popSong.equalsIgnoreCase("7Ring")) {
                            System.out.println(popSong + ("Song PLaying" + ("please insert the money " + ("$") + popPrice)));
                            System.out.println(popSong + ("Song PLaying"));
                            System.out.println("please insert money");
                            int money2 = input.nextInt();

                            if (money2 >= popPrice) {
                                System.out.println("your song is playing");
                            } else {
                                System.out.println("price inserted is wrong, please try again later");
                            }

                        } else if (popSong.equalsIgnoreCase("WithoutMe")) {
                            System.out.println(popSong + ("Song PLaying" + ("please insert the money " + ("$") + popPrice)));
                            System.out.println(popSong + ("Song PLaying"));
                            System.out.println("please insert money");
                            int money2 = input.nextInt();

                            if (money2 >= popPrice) {
                                System.out.println("your song is playing");
                            } else {
                                System.out.println("price inserted is wrong, please try again later");
                            }

                        }
                    }

                            if(musicType1.equalsIgnoreCase("Country")) {
                                int countryPrice=4;
                                System.out.println("MeantToBe,Heaven,Simple,OneNumberAway,GetAlong" +
                                        ("Please enter which on you choose"));
                                String countrySong=input.nextLine();

                                if(countrySong.equalsIgnoreCase("MeantToBe")) {
                                    System.out.println(countrySong + (" Song Playing ") + ("please insert the money " + ("$") + countryPrice));
                                    System.out.println(countrySong + ("Song PLaying"));
                                    System.out.println("please insert money");
                                    int money3=input.nextInt();

                                    if(money3>=countryPrice){
                                        System.out.println("your song is playing");
                                    }else{
                                        System.out.println("price inserted is wrong, please try again later");
                                    }
                                }else if(countrySong.equalsIgnoreCase("Heaven")) {
                                    System.out.println(countrySong+ ("Song PLaying" + ("please insert the money " + ("$") + countryPrice)));
                                    System.out.println(countrySong + ("Song PLaying"));
                                    System.out.println("please insert money");
                                    int money3=input.nextInt();

                                    if(money3>=countryPrice){
                                        System.out.println("your song is playing");
                                    }else{
                                        System.out.println("price inserted is wrong, please try again later");
                                    }
                                }else if (countrySong.equalsIgnoreCase("Simple")) {
                                    System.out.println(countrySong + ("Song PLaying" + ("please insert the money " + ("$") + countryPrice)));
                                    System.out.println(countrySong+ ("Song PLaying"));
                                    System.out.println("please insert money");
                                    int money3=input.nextInt();

                                    if(money3>=countryPrice){
                                        System.out.println("your song is playing");
                                    }else{
                                        System.out.println("price inserted is wrong, please try again later");
                                    }
                                }else if (countrySong.equalsIgnoreCase("OneNumberAway")) {
                                    System.out.println(countrySong + ("Song PLaying" + ("please insert the money " + ("$") + countryPrice)));
                                    System.out.println(countrySong+ ("Song PLaying"));
                                    System.out.println("please insert money");
                                    int money3=input.nextInt();

                                    if(money3>=countryPrice){
                                        System.out.println("your song is playing");
                                    }else{
                                        System.out.println("price inserted is wrong, please try again later");
                                    }

                                }else if (countrySong.equalsIgnoreCase("GetAlong")) {
                                    System.out.println(countrySong + ("Song PLaying" + ("please insert the money " + ("$") + countryPrice)));
                                    System.out.println(countrySong+ ("Song PLaying"));
                                    System.out.println("please insert money");
                                    int money3=input.nextInt();

                                    if(money3>=countryPrice){
                                        System.out.println("your song is playing");
                                    }else{
                                        System.out.println("price inserted is wrong, please try again later");
                                    }


                                }}



                                }
                            }

