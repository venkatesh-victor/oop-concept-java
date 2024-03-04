package Interface;

public class Main {
    public static void main(String[] args) {
        Pen p = new Pen();
        p.open();
        p.write();
        p.close();
        p.getDetail();

        System.out.println("\n________________________________________\n");
/* 
        Interface1 int1 = new Pen();
        int1.open();
        int1.write();
        int1.close();
*/

        Pen p1 = new Box();
        p1.open();
        p1.close();
        p1.write();
        // p1.getDimension(); Cannot call interface method implemented by the box class.
        // p1.store(); Cannot invoke child specific method.

        ((Box)p1).store();

        System.out.println("\n________________________________________\n");


        Bag bag1 = new Bag();
        bag1.open();
        bag1.store();
        bag1.close();
        bag1.clean();
        bag1.getColor();
        bag1.write();
        bag1.getDimensions();
        bag1.getDetail();

        System.out.println("\n________________________________________\n");

        Box b1 = new Bag();
        b1.open();
        b1.close();
        b1.store();
        b1.write();
        b1.getDetail();
        b1.getDimensions();
        // b1.getColor(); cannot call Bag interface specific method.
        // b1.clean(); cannot call Bag specific method;

        ((Bag)(b1)).clean();

    }
}
