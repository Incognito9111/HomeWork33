package Lesson5;


public class Employee {


    public String name;
    public String post;
    public String email;
    public String numberPhone;
    public int salary;
    public int age;

    public Employee(String name, String post, String email, String numberPhone, int salary, int age) {
        this.name = name;
        this.post = post;
        this.email = email;
        this.numberPhone = numberPhone;
        this.salary = salary;
        this.age = age;
    }

    public String getName() {
        return name;
    }
    public void setName(String post) {
        this.name = name;
    }


    public String getPost() {
        return post;
    }
    public void setPost(String post) {
        this.name = post;
    }


    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }


    public String getNumberPhone() {
        return numberPhone;
    }
    public void setNumberPhone(String numberPhone) {
        this.numberPhone = numberPhone;
    }


    public int getSalary() {
        return salary;
    }
    public void setSalary(int salary) {
        this.salary = salary;
    }


    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }



    public String printInfoEmployee() {
        return "Employee " + '\n' +
                " name: " + name + '\n' +
                " post: " + post + '\n' +
                " email: " + email + '\n' +
                " numberPhone: " + numberPhone + '\n' +
                " salary: " + salary + '\n' +
                " age: " + age ;
    }
}
