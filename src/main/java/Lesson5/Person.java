package Lesson5;

public class Person {

    public static void main(String[] args) {
        Employee[] persArray = new Employee[5];
        persArray[0] = new Employee("Ivan", "Engineer", "Iva991@mail.ru", "89288842511", 90000, 33);
        persArray[1] = new Employee("Sergey", "SysAdmin", "serz-33@mail.ru", "89286634521", 50000, 45);
        persArray[2] = new Employee("Stas", "Java Developer", "stanislav89@gmail.ru", "89289921177", 140000, 32);
        persArray[3] = new Employee("Bogdan", "DevOps Developer", "Bodya@mail.ru", "89996523488", 120000, 26);
        persArray[4] = new Employee("John", "OwnerCompany", "JohnArm@gmail.ru", "89281113352", 400000, 51);
        for (int i = 0; i < persArray.length; i++) {
            if (persArray[i].age > 40) {
                System.out.println(persArray[i].printInfoEmployee());
            }
        }
    }
}
