/* 3. Create a class monkey with jump ( ) and bite ( ) methods Create a class human whichinherits this monkey class and implements basicanimal interface with eat ( ) and sleep methods. */


// BasicAnimal Interface
interface BasicAnimal {
    void eat();
    void sleep();
}

// Monkey Class
class Monkey {
    public void jump() {
        System.out.println("Monkey is jumping");
    }

    public void bite() {
        System.out.println("Monkey is biting");
    }
}

// Human Class
class Human extends Monkey implements BasicAnimal {
    @Override
    public void eat() {
        System.out.println("Human is eating");
    }

    @Override
    public void sleep() {
        System.out.println("Human is sleeping");
    }
}

// Main Class
public class AnimalDetails {
    public static void main(String[] args) {
        Human human = new Human();

        // Calling methods from Monkey class
        human.jump();
        human.bite();

        // Calling methods from BasicAnimal interface
        human.eat();
        human.sleep();
    }
}

/*
Output
Monkey is jumping
Monkey is biting
Human is eating
Human is sleeping

*/