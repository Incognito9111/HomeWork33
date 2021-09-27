package Lesson5;


public class Employee {

    private String name;
    private String post;
    private String email;
    private String numberPhone;
    private int salary;
    private int age;

    public Employee(String name, String post, String email, String numberPhone, int salary, int age) {
        this.name = name;
        this.post = post;
        this.email = email;
        this.numberPhone = numberPhone;
        this.salary = salary;
        this.age = age;

    }

    public static void main(String[] args) {
        Person[] persArray = new Person[5];
        persArray[0] = new Person("Ivan", "Engineer", "Iva991@mail.ru", "89288842511", 90000, 33);
        persArray[1] = new Person("Sergey", "SysAdmin", "serz-33@mail.ru", "89286634521", 50000, 45);
        persArray[2] = new Person("Stas", "Java Developer", "stanislav89@gmail.ru", "89289921177", 140000, 32);
        persArray[3] = new Person("Bogdan", "DevOps Developer", "Bodya@mail.ru", "89996523488", 120000, 26);
        persArray[4] = new Person("John", "OwnerCompany", "JohnArm@gmail.ru", "89281113352", 250000, 51);
        for (int i = 0; i < persArray.length; i++) {
            System.out.println(persArray[i]);
        }
    }



}
