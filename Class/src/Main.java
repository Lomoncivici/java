//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
interface Animal {
    void eat();
    void sound();
}

interface Pet extends Animal {
    void play();
}

class Dog implements Pet {
    @Override
    public void eat() {
        System.out.println("Собака ест косточку");
    }

    @Override
    public void sound() {
        System.out.println("Гав");
    }

    @Override
    public void play() {
        System.out.println("Собака играет с мячом");
    }
}

class Cat implements Pet {
    @Override
    public void eat() {
        System.out.println("Кошка ест рыбу");
    }

    @Override
    public void sound() {
        System.out.println("Мяу");
    }

    @Override
    public void play() {
        System.out.println("Кошка играет с мячиком");
    }
}

public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Cat cat = new Cat();

        // Действия с собакой
        System.out.println("Собака:");
        dog.eat();
        dog.sound();
        dog.play();

        System.out.println();

        // Действия с кошкой
        System.out.println("Кошка:");
        cat.eat();
        cat.sound();
        cat.play();
    }
}