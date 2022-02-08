package course.lesson3;

public class MainApp {
    public static void main(String[] args) {
        Employee[] empArray = new Employee[5];
        empArray[0] = new Employee("Ivanov Petr", "HR manager", "ivano@gmail.com", "9362856294", 60000, 39);
        empArray[1] = new Employee("Petrov Ivan", "Engineer", "petrov@gmail.com", "6238591437", 70000, 41);
        empArray[2] = new Employee("Zaharova Dariia", "Accounter", "zaharova@mail.com", "7458762839", 34000, 40);
        empArray[3] = new Employee("Dubskih Elena", "Secretary", "dubskih@mail.com", "1378859342", 30000, 26);
        empArray[4] = new Employee("Sokolov Nikita", "Manager", "sokolov@mail.com", "4592349114", 80000, 53);

        for (Employee employee : empArray) {
            if (employee.getAge() > 40) {
                employee.printInfo();
            }
        }


    }
}
