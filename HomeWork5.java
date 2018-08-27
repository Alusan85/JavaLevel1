/*
 * Java. Level 1. Lesson 5
 *
 * @author Kirill Kovalev
 * @version dated Aug 27, 2018
 *
 */

public class HomeWork5 {
    public static void main(String[] args) {
//* Создать массив из 5 сотрудников
        Person[] persArray = new Person[5]; // Вначале объявляем массив объектов
        persArray[0] = new Person("Ivanov", "Ivan", "Ivanovich",
                "Engineer", "ivivan@mailbox.com", "262626", 60000, 60);
        persArray[1] = new Person("Ivanov", "Ivan", "Neivanovich",
                "Driver","mega-hmega@mail.ru", "+7(999)262625", 25000, 25);
        persArray[2] = new Person("Semenov", "Semen", "Ivanovich",
                "Manager", "12345@mail.ru", "+7(444)262418", 40000, 40);
        persArray[3] = new Person("Pereiro", "Sebastian", "",
                "Ebony dealer", "sebas@gmail.com", "8(888)151515",41000, 41);
        persArray[4] = new Person("Pushkin", "Alex", "Sergeevich",
                "Manager", "sunof@aida.me", "+4(444)202020",70000, 70);
//* С помощью цикла вывести информацию только о сотрудниках старше 40 лет;
        for (Person pers : persArray) if (pers.getAge() > 40) {pers.getInfo();}
    }
}

//* Создать класс "Сотрудник" с полями: ФИО, должность, email, телефон, зарплата, возраст;
class Person {
    String firstname, name, middlename, post, email, telephone;
    private int salary, age;

//* Конструктор класса должен заполнять эти поля при создании объекта;
    Person(String firstname, String name, String middlename, String position, String email,
           String telephone, int salary, int age) {
        this.firstname = firstname;
        this.name = name;
        this.middlename = middlename;
        this.post = position;
        this.email = email;
        this.telephone = telephone;
        this.salary = salary;
        this.age = age;
    }

//* Внутри класса «Сотрудник» написать метод, который выводит информацию об объекте в консоль;
    void getInfo() {
        System.out.println("Firstname: " + firstname + " , name: " + name + " , middlename: " + middlename);
        System.out.println ("Position: " + post + " , email: " + email + " , t.number: "
                + telephone + " , salary: " + salary + " , age: " + age);
        System.out.println("- - - - - - - - - - - - - - - - - - - - - - - - - - - -  ");
    }

//Внутри класса «Сотрудник» написать метод, для возвращения возвраста сотрудника;
    int getAge() {
        return age;
    }
}