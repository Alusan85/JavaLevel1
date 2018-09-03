/**
 * Java. Level 1. Lesson 6
 *
 * @author Kirill Kovalev
 * @version dated Sep 03, 2018
 * @link https://github.com/Alusan85 || null
 */

/* 1. Создать классы Собака и Кот с наследованием от класса Животное.
*
* 2. Животные могут выполнять действия: бежать, плыть, перепрыгивать препятствие.
*    В качестве параметра каждому методу передается величина, означающая или
*    длину препятствия (для бега и плавания), или высоту (для прыжков).
*
* 3. У каждого животного есть ограничения на действия (бег: кот 200 м.,
*    собака 500 м.; прыжок: кот 2 м., собака 0.5 м.;
*    плавание: кот не умеет плавать, собака 10 м.).
*
* 4. При попытке животного выполнить одно из этих действий, оно должно
* сообщить результат в консоль. (Например, dog1.run(150); -> результат: run: true)
*/
abstract class Animal {

    private int max_run = 0;
    private int max_swim = 0;
    private double max_jump = 0;

    abstract void run(int length);
    abstract void swim(int length2);
    abstract void jump(double height);
    abstract void sayName(String name);
    }

class Cat extends Animal {
    private int max_run = 200;
    private double max_jump = 2;
    private double max_swim = -1;

    @Override
    void sayName(String name) {
        System.out.println(name);
    }

    @Override
    void run(int length) {
        if (length <= max_run)
        System.out.println("run cat: true");
        else System.out.println("run cat: false");
    }

    @Override
    void swim(int length2) {
        if (length2 <= max_swim)
        System.out.println("swim cat: true");
        else System.out.println("swim cat: fase");
    }

    @Override
    void jump(double height) {
        if (height <= max_jump)
        System.out.println("jump cat: true");
        else System.out.println("jump cat: fase");
    }
}

class Dog extends Animal {
    private final int max_run = 500;
    private final int max_swim = 10;
    private final double max_jump = 0.5;

    @Override
    void sayName(String name) {
        System.out.println(name);

    }
    @Override
    void run(int length) {
        if (length <= max_run)
        {System.out.println("run dog: true");}
        else System.out.println("run dog: false");
    }

    @Override
    void swim(int length2) {
        if (length2 <= max_swim)
        System.out.println("swim dog: true");
        else System.out.println("swim dog: false");
    }

    @Override
    void jump(double height) {
        if (height <= max_jump)
        System.out.println("jump dog: true");
        else System.out.println("jump dog: false");
    }
}

public class HomeWork6 {
    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.sayName("Barsik");
        cat.run(199);
        cat.swim(1);
        cat.jump(2);

        Cat cat2 = new Cat();
        cat.sayName("Murzik");
        cat2.run(201);
        cat2.swim(0);
        cat2.jump(2.2);

        Dog dog = new Dog();
        dog.sayName("Tuzek");
        dog.run(499);
        dog.swim(10);
        dog.jump(0.4);

        Dog dog2 = new Dog();
        dog2.sayName("Butch");
        dog2.run(501);
        dog2.swim(11);
        dog2.jump(1);
    }
}