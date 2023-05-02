import apple.laf.JRSUIConstants.Size;

public class Hello {


    public static void main(String[] args) {
        //Creating a HumanBeing object
        HumanBeing human1 = new HumanBeing("Timothy", "Odiete", 40, "BIG");
        System.out.println("First name: " + human1.firstName);
        System.out.println(":ast name: " + human1.lastName);
        System.out.println("Age: " + human1.age);
        System.out.println("Head size: " + human1.headSize);


        //Creating a Television object
        Television Tv1 =new Television("LG", "smart", "UHD", 55);

        System.out.println(Tv1.grade);
        System.out.println(Tv1.size);
        System.out.println(Tv1.brand + " " + Tv1.grade);


        //creating a mobile phone object
        phone mobile1 =new phone(make: "iphone", type: "14promax" Size: 256gb);


        System.out.println(mobile1.type);
    }   