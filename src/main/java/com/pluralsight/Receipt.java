package com.pluralsight;

public class Receipt {
    public static void main(String[] args) {
        //Step 3
        String food = "Bowl of Pho";
        double foodPrice = 15.99;
        int foodQuantity = 5;
        System.out.println("You bought " + foodQuantity + " " + food + " for $" +foodPrice*foodQuantity);

        System.out.printf("You bought %d %s for $%.2f",
                foodQuantity, food, foodPrice * foodQuantity);


    }
}
