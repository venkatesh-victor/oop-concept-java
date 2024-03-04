package Interface;

class Pen implements Interface1 {
    String color = "Black";
    String inkColor = "Blue";
    String length = "6cm";

    public void open() {
        System.out.println("The pen has been opened");
    }

    public void close() {
        System.out.println("The pen has been closed");
    }

    public void write() {
        System.out.println("The pen is writing");
    }

    //This is Pen specific method;
    public void getDetail() {
        System.out.println("This pen's color is " + color);
        System.out.println("This pen writes in " + inkColor + " color");
        System.out.println("This pen is " + length + " long"); 
    }
}

class Box extends Pen implements Interface2 {
    String color = "Red color Box";
    String length = "10cm";
    String height = "5cm";

    //Pen overridden method.
    public void close() {
        System.out.println("Box closed");
    }

    //Box specific method.
    public void store() {
        System.out.println("Box is storing");
    }
    
    //Pen overriden method.
    public void open() {
        System.out.println("Box is now open");
    }

    //Interface inherited method.
    public void getDimensions() {
        System.out.println("The length of this box is: " + length);
        System.out.println("The height of this box is: " + height);
    }
}

class Bag extends Box implements Interface3 {
    String color = "Grey color bag";
    String capacity = "Large capacity";

    public void open() {
        System.out.println("The bag is now open");
    }

    public void close() {
        System.out.println("Bag is closed");
    }

    public void store() {
        System.out.println("The bag is storing books");
    }

    //Bag specific method.
    public void clean() {
        System.out.println("The bag has been cleaned now.");
    }

    //interface inherited method.
    public void getColor() {
        System.out.println("The color of the bag is " + color);
    }
}
