package com.company;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
//class Car {
  //  private String model;
    //private String brand;
    //private int year;
    //private int price;
    //private String color;
    //private int quantity;

    //public Car(String model, String brand, int year, int price, String color, int quantity) {
      //  this.model=model;
        //this.brand=brand;
        //this.year=year;
        //this.price=price;
        //this.color=color;
        //this.quantity=quantity;
    //}

    //public String getModel() {
      //  return model;
    //}

    //public void setModel(String model) {
      //  this.model = model;
    //}

    //public String getBrand() {
       // return brand;
   // }

   // public void setBrand(String brand) {
       // this.brand = brand;
   // }

   // public int getYear() {
     //   return year;
   // }

    //public void setYear(int year) {
      //  this.year = year;
 //   }

   // public int getPrice() {
       // return price;
   // }

   // public void setPrice(int price) {
      //  this.price = price;
   // }

   // public String getColor() {
       // return color;
   // }

   // public void setColor(String color) {
      //  this.color = color;
   // }

   // public int getQuantity() {
      //  return quantity;
  //  }

   // public void setQuantity(int quantity) {
      //  this.quantity = quantity;
  //  }
    //@Override
   // public String toString() {
     //   return "Car{" +
            //    "model='" + model + '\''+
             //   ", brand='" + brand + '\''+
             //   ", year=" + year +
             //   ", price=" + price +
               // ", color'" + color + '\''+
             //   ",quantity=" + quantity +
             //   '}';
  //  }
//}
public class Main {

    public static void main(String[] args) {
	//double a, b, area;

        // void getData() throws IOException{
            // BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            // System.out.println("With this program you will calculate the area of a rectangle");
            // System.out.println("Enter the length of the side a: ");
            // a=Double.parseDouble(br.readLine());
           // System.out.println("Enter the length of the side b: ");
           // b=Double.parseDouble(br.readLine());
       // }
       // void computeField() {area = a*b;}

       // void fieldDisplay(){
            // System.out.print("The are of the ractangle with the side a = ");
           //  System.out.printf("%2.2f", a);
           //  System.out.print("and side b = ");
            // System.out.printf("%2.2f",b);
            // System.out.print(" is = ");
            // System.out.printf("%2.2f.\n", area);
       // }


        //TASK 2 RETURNING INFORMATION ABOUT OBJECT---------------------------------------------------

        //Car car1= new Car("GLE", "Mercedes", 2020, 350000,"white",5);
       // System.out.println(car1.toString());
        //System.out.println(car1.getColor());
        //car1.sell(1);
        //car1.delivery(2);
        //int year =car1.getYear();
       // car1.setColor("black");
       // System.out.println(car1.toString());

       //TASK 3-NUMBER SYSTEM CONVERTER---------------------------------------------------------------------

        int baseSystem, targetSystem, numFromDecimalSystem;
        String nunmToDecimalSystem, number1, number2, choose;

        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        do {
            System.out.println(" ");
            System.out.println("Choose what operation you want to perform:");
            System.out.println(" ");
            System.out.println(" A. Convert from any system to the decimal system");
            System.out.println("B. Convert from decimal system to another system");
            System.out.println("C. Summing up numbers from different systems");
            System.out.println("D. Subtracting numbers from different systems");
            System.out.println("E. Multiplying numbers from different systems");
            System.out.println("F. Dividing numbers from different systems");
            System.out.println(" ");
            System.out.println("W. Exit the program");

            choose = br.readLine();
            if (choose.equals("A")) {
                System.out.println("Enter the value you want to convert to the decimal system: ");
                numToDecimalSystem = br.readLine();

                System.out.println("What system is the number from? ");
                baseSystem = Integer.parseInt(br.readLine());

                System.out.println(nunmToDecimalSystem, (baseSystem));
            }else if (choose.equals("B")) {
                System.out.println("Enter a decimal value ");
                numFromDecimalSystem = Integer.parseInt(br.readLine());

                System.out.println("To which system do you want to convert: ");
                targetSystem = Integer.parseInt(br.readLine());
            }
            }
    }
    //public class Rectangle{
      //  public static void main(String[] args) throws IOException{
         //   RectangleArea obj = new RectangleArea();
          //  obj.getData();
          //  obj.computeField();
          //  obj.fieldDisplay();
       // }
    }
}
