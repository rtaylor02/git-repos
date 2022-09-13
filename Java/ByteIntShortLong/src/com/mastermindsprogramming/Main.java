package com.mastermindsprogramming;

import com.javonet.Javonet;
import com.javonet.JavonetException;
import com.javonet.JavonetFramework;
import com.javonet.api.NObject;
import com.javonet.api.keywords.NRef;

import java.io.IOException;
import java.util.Scanner;
import java.util.concurrent.atomic.AtomicReference;

public class Main {



    private static final String INVALID_INPUT = "Incorrect input";

    public static void main(String[] args) {
        Printer printer = new Printer(25,true);
        printer.fillUpToner(20);
        printer.printPage(25);
//        BankAccount myAccount = new BankAccount("112233", 100_000.00d, "Rod Taylor", "tt@tt","123-444-333" );
//        myAccount.deposit(100_000.00d);

//        VipCustomer me = new VipCustomer();
//        VipCustomer me2 = new VipCustomer("Rod Taylor", 100_000_000.00);
//        VipCustomer me3 = new VipCustomer("Rod Taylor", 100_000_000.00,"rt@com.com");
//        CarChild c = new CarChild(2);
//        CarChild d = new CarChild(2,2);
//        System.out.println("c privatemember = " + c.getPrivateMember());
//        Javonet.activate("taylor.rod.j@gmail.com","c3E7-Ac3p-Ym25-a5A3-Ra7q", JavonetFramework.v45);
//        Javonet.addReference("C:\\Program Files\\TrioMotion\\TrioPCMotion\\TrioPC_NET.dll");
        //Javonet.addReference("C:\\Users\\RodT\\source\\repos\\Rod_workshop_console\\MyDLL\\bin\\Debug\\MyDLL.dll");
//        NObject calculator = Javonet.New("Calculation");
//        int result = calculator.invoke("Add",2,3);
//        System.out.println("Result: " + result);


//        NObject trioController = Javonet.New("TrioPC");
//        trioController.set("HostAddress","127.0.0.2");
//        boolean resultOpen = trioController.invoke("Open",(short)2,(short)3240);
//        boolean resultSetVR = trioController.invoke("SetVr",(short)0,(double)3.33);
//        AtomicReference<Double> temp = new AtomicReference<Double>(0.0);
//        boolean resultGetVR = trioController.invoke("GetVr",(short)0,new NRef(temp));
//        System.out.println("temp: " + temp);
//        boolean resultClose = trioController.invoke("Close");
//        System.out.println("Finished!");

        // write your code here
//        double weight_in_pound = 200d;
//        double converter_pound_to_kilo = 0.45359237d;
//        double weight_in_kg = weight_in_pound * converter_pound_to_kilo;
//        System.out.println((weight_in_kg));
//
//        char myChar = 'E';
//        char myUnicodeChar = '\u0045';
//        System.out.println("myChar = " + myChar);
//        System.out.println("myUnicodeChar = " + myUnicodeChar);
//
//        boolean isBiggerThan = false;
//        System.out.println("7 > 14 : " + isBiggerThan);
//
//        String myFirstName = "Johny"; // String literal: "Johny"
//        String mySurname = "Wick";
//        String myFullName = myFirstName + " " + mySurname; // String concatination
//        System.out.println("My name is : " + myFullName + " \u263A"); // Add a smiley face at the end
//
//        int myInt = 3;
//        int myOtherInt = 5;
//        int total = myInt + myOtherInt;

//        System.out.print("Enter score: ");
//        int score = new Scanner(System.in).nextInt();
//        if (score == 100) {
//            System.out.println("Top score!");
//        }
//        else if ((score < 100) && (score >= 50)) {
//            System.out.println("Middle score");
//        } else if (score < 50) {
//            System.out.println("Low score");
//        } else {
//            System.out.println("Invalid score");
//        }
//
//        System.out.print("Enter another score: ");
//        int anotherScore = new Scanner(System.in).nextInt();
//        if (anotherScore == 100) {
//            System.out.println("Top score!");
//        }
//        else if ((anotherScore < 100) && (anotherScore >= 50)) {
//            System.out.println("Middle score");
//        } else if (anotherScore < 50) {
//            System.out.println("Low score");
//        } else {
//            System.out.println("Invalid score");
//        }

//        printScore();
//
//        printScore();

//        printMe("Rod", (short) 27);
//        printMe((short) 27, "Rod");

        //System.out.println(printMe("Rod", (short) 27, "Java software developer"));
//        System.out.println(getDurationString(65,45));
//        System.out.println(getDurationString(3945));

//        testSwitch('E');
//
//        String number = "Three";
//        switch (number.toLowerCase()) {
//            case "one":
//                System.out.println("It is: 1");
//                break;
//            case "two":
//                System.out.println("It is: 2");
//                break;
//            case "three":
//                System.out.println("It is: 3");
//                break;
//            default:
//                System.out.println("Nothing..");
//        }

//        // Get user input
//        System.out.println("Enter a number between 1 - 10: ");
//        int yourNumber = new Scanner(System.in).nextInt();
//
//        // Print number from 0 to yourNumber
//        for(int i = 0; i < 10; i++) {
//            System.out.println("Current number is: " + i);
//
//            if(i == yourNumber) {
//                break;
//            }
//        }

//        for(int index = 0; index < 3; index += 2) {
//            for(int inner_index = 3; inner_index > 0; inner_index--) {
//                System.out.println("index: " + index + ", inner_index: " + inner_index);
//            }
//        }

//        int sum = 0;
//        int totalFound = 0;
//        for (int i = 0; i <= 1000; i++) {
//            if (((i % 3) == 0) && ((i % 5) == 0) && (i != 0)) {
//                totalFound++;
//                System.out.println(i + "is dividable by 3 & 5");
//                sum += i;
//            }
//
//            if (totalFound == 5) {
//                break;
//            }
//        }
//
//        System.out.println("Sum: " + sum);

        // Take user's input
//        System.out.print("Enter starting number between 0 and 100: ");
//        int starting = new Scanner(System.in).nextInt();
//        System.out.print("Enter finish number between " + starting +  " and 100: ");
//        int finish = new Scanner(System.in).nextInt();
//
//        int totalEven = 0;
//        while(starting <= finish) {
//            starting++;
//            if(!isEvenNumber(starting)) {
//                continue;
//            }
//
//            System.out.println("Even number found: " + starting);
//            totalEven++;
//            if(totalEven == 6) {
//                break;
//            }
//        }
//        System.out.println("Total even numbers: " + totalEven);

//        System.out.println(sumDigits((1225)));
//        System.out.println(sumDigits((-123)));
//        System.out.println(sumDigits((5)));
//        System.out.println(sumDigits((111225)));


//        Scanner scanner = new Scanner(System.in);
//
//        System.out.println("Enter your YOB: ");
//        //int age = new Scanner(System.in).nextInt();
//        int age = scanner.nextInt();
//        age = 2022 - age;
//        scanner.nextLine(); // Handle next line character
//
//        System.out.println("Enter your name: ");
//        //String name = new Scanner(System.in).nextLine();
//        String name = scanner.nextLine();
//
//        System.out.println("You are " + name + " and you're " + age + " years old.");

//        Scanner scanner = new Scanner(System.in);
//        int sum = 0;
//        int counter = 0;
//        while(counter < 3) {
//            System.out.println("Enter number #" + (counter + 1));
//
//            if(scanner.hasNextInt()) {
//                int number = scanner.nextInt();
//                counter++;
//                sum += number;
//            } else {
//                System.out.println("Invalid number");
//            }
//            scanner.nextLine(); // Handles eol character
//        }
//        System.out.println("Total sum: " + sum);

//        Scanner scanner = new Scanner(System.in);
//        int sum = 0, max = Integer.MIN_VALUE, min = Integer.MAX_VALUE;
//        while(true) {
//            System.out.println("Enter number: ");
//            if(scanner.hasNextInt()) {
//                int number = scanner.nextInt();
//                scanner.nextLine(); // Handles end of line character
//
//                // Assess max
//                if(max < number) {
//                    max = number;
//                }
//
//                // Assess min
//                if(min > number) {
//                    min = number;
//                }
//            } else {
//                break;
//            }
//        }
//        System.out.println("Max: " + max);
//        System.out.println("Min: " + min);
//
//
//
//        scanner.close();
    }


    private static int sumDigits(int input) {
        // Check input conditions
        if(input >= 10) {
            int div_result = input;
            int sum = 0;
            while(div_result > 0) {
                div_result = input % 10;
                sum += div_result;
                input /= 10;
            }
            return sum;
        }

        return -1;
    }

    public static boolean isEvenNumber(int input) {
        if((input % 2) == 0) {
            return true;
        }

        return false;
    }

    public static void printScore() {
        System.out.print("Enter score: ");
        int score = new Scanner(System.in).nextInt();

        if (score == 100) {
            System.out.println("Top score!");
        } else if ((score < 100) && (score >= 50)) {
            System.out.println("Middle score");
        } else if (score < 50) {
            System.out.println("Low score");
        } else {
            System.out.println("Invalid score");
        }
    }

    public static void printMe(String name, short age) {
        System.out.println("I am " + name + " and I am " + age + " years old");
    }

    public static void printMe(short age, String name) {
        System.out.println("I am " + name + " and I am " + age + " years old");
        //return "I am " + name + ". I am " + age + " years old and a/an ";
    }

    public static String getDurationString(int minutes, int seconds) {
        if ((minutes < 0) || (seconds > 59) || (seconds < 0)) {
            return "Invalid value";
        }

        int hours = minutes / 60;
        int remainingMinutes = minutes % 60;

        String hourString = hours + "h";
        if (hours < 10) {
            hourString = "0" + hourString;
        }

        String remainingMinutesString = remainingMinutes + "m";
        if (remainingMinutes < 10) {
            remainingMinutesString = "0" + remainingMinutesString;
        }

        String secondString = seconds + "s";
        if (seconds < 10) {
            secondString = "0" + secondString;
        }

        return hourString + " " + remainingMinutesString + " " + secondString;
    }

    public static String getDurationString(int seconds) {
        if (seconds < 0) {
            return "Invalid value";
        }

        return getDurationString((seconds / 60), (seconds % 60));
    }

    public static void testSwitch(char input) {
        switch (input) {
            case 'A':
            case 'B':
            case 'C':
                System.out.println("Character input is either A, B, or C");
                break;
            case 'D':
                System.out.println("D is received");
                break;
            default:
                System.out.println("Invalid character");
                break; // Optional
        }
    }

    public static void printDayOfTheWeek(int day) {
        switch (day) {
            case 0:
                System.out.println("Sunday");
                break;
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            default:
                System.out.println("Invalid day");
        }
    }

    public static void printDayOfTheWeek2(int day) {
        if (day == 0) {
            System.out.println("Sunday");
        } else if (day == 1) {
            System.out.println("Monday");
        } else if (day == 2) {
            System.out.println("Tuesday");
        } else if (day == 3) {
            System.out.println("Wednesday");
        } else if (day == 4) {
            System.out.println("Thursday");
        } else if (day == 5) {
            System.out.println("Friday");
        } else if (day == 6) {
            System.out.println("Saturday");
        } else {
            System.out.println("Invalid day");
        }
    }

}