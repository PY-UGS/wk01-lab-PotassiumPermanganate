package com.T1;

public class Example3 {
    public static void main(String arg[])
    {
        String currency = "CS1009";
        switch(currency)
        {
            case "CS1009":
                System.out.println("Object-oriented programming");
                break;
            case "CS1010":
                System.out.println("Network");
                break;
            case "CS1006":
                System.out.println("Math2");
                break;
            case "CS1008":
                System.out.println("Data Structure");
                break;
            default:
                System.out.println("Unknown mod");
                break;
        }
        System.out.println("After switch");
    }
}