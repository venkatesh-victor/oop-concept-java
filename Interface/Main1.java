package Interface;

public class Main1 {
    public static void main(String[] args) {
        Interface1 int1 = new Pen();
        int1.open();
        int1.write();
        int1.close();

        System.out.println("\n________________________________________\n");

        Interface2 int2 = new Box();
        int2.getDimensions();

        System.out.println("\n________________________________________\n");

        Interface3 int3 = new Bag();
        int3.getColor();

    }
}
