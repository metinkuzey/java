package com.metinkuzey.main;

//PascalCase is using for Class or Objects
public class Main {
    public static void main(String[] args) {
        //camelCase for variables
        String creditName1 = "Fast Credit";
        String creditName2 = "Car Credit";
        String creditName3 = "House Credit";
        String creditName4 = "Holiday Credit";
        String creditName5 = "Trade Company Credit";
        System.out.println("PRINT EACH ITEM MANUALLY");
        System.out.println(creditName1);
        System.out.println(creditName2);
        System.out.println(creditName3);
        System.out.println(creditName4);
        System.out.println(creditName5);

        String [] credits = {
                "Fast Credit", "Car Credit", "House Credit",
                "Holiday Credit", "Trade Company Credit"
        };
        System.out.println("********************************************");
        System.out.println("PRINT EACH ITEM USING WITH FOREACH LOOP");
        //foreach loop example
        for (String credit:credits
        ) {
            System.out.println(credit);
        }
        System.out.println("********************************************");
        System.out.println("PRINT EACH ITEM USING WITH FOR LOOP");
        // for loop
        for (String credit : credits) {
            System.out.println(credit);
        }
        System.out.println("********************************************");
        System.out.println("Primitive Variables");
        int number1 = 10;
        int number2 = 20;
        number1 = number2;
        number2 = 100;
        System.out.println(number1);
        System.out.println("Because primitive variables hold the value of object, " +
                "so number1 value is equal 20");

        System.out.println("********************************************");
        System.out.println("Reference Variables");
        int[] numbersArray1 = {1,2,3,4,5};
        int[] numbersArray2 = {10,20,30,40,50};
        numbersArray1 = numbersArray2;
        numbersArray2[0] = 199;
        System.out.println(numbersArray1[0]);
        System.out.println("Because reference variables hold the address of object, " +
                "so numbersArray1 value is equal 199");
        System.out.println("Primitive Types hold in Stack memory, Reference type hold in Stack and Heap memory");
        System.out.println("         Stack Memory                              Heap Memory");
        System.out.println("        numbersArrays1  ----------------> addr:101 1,2,3,4,5 ");
        System.out.println("        numbersArrays2  ----------------> addr:102 10,20,30,40,50 ");
        System.out.println("numbersArray1 = numbersArray2 is mean that numbersArrays heap address updated to addr:102" +
                " so numbersArray has values in addr:102");
        System.out.println("         Stack Memory                              Heap Memory");
        System.out.println("        numbersArrays1  ----------------> addr:102 10,20,30,40,50 ");
        System.out.println("        numbersArrays2  ----------------> addr:102 10,20,30,40,50 ");
        System.out.println("numbersArray2[0] = 199; after this process ");
        System.out.println("         Stack Memory                              Heap Memory");
        System.out.println("        numbersArrays1  ----------------> addr:102 199,20,30,40,50 ");
        System.out.println("        numbersArrays2  ----------------> addr:102 199,20,30,40,50 ");
        System.out.println("********************************************");
        System.out.println("Trick point of String Variables");
        String city1 = "London";
        String city2 = "Liverpool";
        city1 = city2;
        city2 = "Rome";
        System.out.println(city1);
        System.out.println("Special case for String equalization");
        System.out.println("Because of in Java and C#, using String, the value stores in char arrays so it is primitive type" +
                " and city1 = city2 result is Liverpool, because of primitive types hold own values and equalization of to string " +
                "means that first string get the new value which is second's value ");
    }
}
