package chapter12.nestedclass.anonymousclass;

/*
Main points:
1) 'In and Out': Anonymous Classes are used mainly for extending an existing class
 or implementing an existing interface quickly
2) It can be applied in a method's argument
 */

public class Main {
    private int fireEngineToyPrice = 35;

    public static void main(String[] args) {
        Main m = new Main();
        m.printPriceToPay(); // #1
        m.printDiscount(); // #2
    }

    private void changePrice() {
        fireEngineToyPrice++; // Unlike local classes (#2 local classes)
    }

    abstract class SaleOnlyToday {
        abstract int calculateDiscount();
    }

    private void printPriceToPay() {
        SaleOnlyToday discount = new SaleOnlyToday() {
            int calculateDiscount() { return 5;}
        }; // #1
        System.out.println("You only need to pay: " + (fireEngineToyPrice - discount.calculateDiscount()));
    }

    private void printDiscount() {
        System.out.println("Total discount: " + getDiscount(new SaleOnlyToday() { // #2
            int calculateDiscount() { return 5;}
        }));
    }

    private int getDiscount(SaleOnlyToday s) {
        return s.calculateDiscount();
    }

}
