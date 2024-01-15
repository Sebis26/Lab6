class Animal {
    void eat() {
        System.out.println("Generic animal eats something");
    }

    void sound() {
        System.out.println("Generic animal makes a sound");
    }
}

class Lion extends Animal {
    @Override
    void eat() {
        System.out.println("Lion eats meat");
    }

    @Override
    void sound() {
        System.out.println("Lion roars");
    }
}

class Tiger extends Animal {
    @Override
    void eat() {
        System.out.println("Tiger eats meat and occasionally grass");
    }

    @Override
    void sound() {
        System.out.println("Tiger roars");
    }
}

class Panther extends Animal {
    @Override
    void eat() {
        System.out.println("Panther eats meat");
    }

    @Override
    void sound() {
        System.out.println("Panther growls");
    }
}

public class Main {
    public static void main(String[] args) {
        Lion lion = new Lion();
        Tiger tiger = new Tiger();
        Panther panther = new Panther();

        System.out.println("Lion:");
        lion.eat();
        lion.sound();

        System.out.println("\nTiger:");
        tiger.eat();
        tiger.sound();

        System.out.println("\nPanther:");
        panther.eat();
        panther.sound();
    }
}