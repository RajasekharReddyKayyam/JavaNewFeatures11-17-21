package Java17Features;

// Can work for interfaces as well
sealed class Vehicle permits CarMax {  // Class name should be capitalized
    void drive() {
        System.out.println("Vehicle drive");
    }
}

final class CarMax extends Vehicle {  // Class name should be capitalized
    // This class inherits from Vehicle
}

public class sealedclassesexample {  // Class name should be capitalized
    public static void main(String[] args) {
        /*
         * We use sealed classes technique for inheriting to specific classes, not all classes.
         * i.e., only specific classes can extend the sealed class, not all classes.
         */
    }
}
