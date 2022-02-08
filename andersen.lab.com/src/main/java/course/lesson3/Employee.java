package course.lesson3;

public class Employee {
    private String name;
    private String position;
    private String email;
    private String phoneNumber;
    private int salary;
    private int age;

    public Employee(String name, String position, String email, String phoneNumber, int salary, int age) {
        this.name = name;
        this.position = position;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.salary = salary;
        this.age = age;
    }

    public void printInfo() {
        System.out.println("FIO: " + name + "\t" +
                "position: " + position + "\t" +
                "email: " + email + "\t" +
                "phone_number: " + phoneNumber + "\t" +
                "salary: " + salary + "\t" +
                "age: " + age);
    }

    public int getAge() {
        return age;
    }
}