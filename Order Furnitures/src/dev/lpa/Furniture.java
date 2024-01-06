//153,154)
package dev.lpa;

public class Furniture extends ProductForSale {

    public Furniture(String type, double price, String description) {
       super(type,price,description);
    }

    @Override
    public void showDetails() {
        System.out.println("This " + type + " was manufactured in California");
        System.out.printf("The price of the piece is $%6.2f %n", price);
        System.out.println(description);
    }




}
