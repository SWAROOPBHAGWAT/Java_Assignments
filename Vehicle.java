public interface Vehicle {
    void printNumberOfTyre();
}

class Bicycle implements Vehicle {
    public void printNumberOfTyre() {
        System.out.println("Number of Tyres : " + 2);
    }
}

class Car implements Vehicle {
    public void printNumberOfTyre() {
        System.out.println("Number of Tyres : " + 4);
    }
}

class Bike implements Vehicle {
    public void printNumberOfTyre() {
        System.out.println("Number of Tyres : " + 2);
    }
}
class implement{
    public static void main(String[] args) {
        Vehicle obj1 = new Bicycle();
        obj1.printNumberOfTyre();

        Vehicle obj2 = new Car();
        obj2.printNumberOfTyre();

        Vehicle obj3 = new Bike();
        obj3.printNumberOfTyre();

    }
}
