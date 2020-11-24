package com.accenture.bootcamp.jdbc.exercises;

public class EmployeesMain {

    public static void main(String[] args) {
        EmployeeRepository repository = new EmployeeRepository();

        System.out.println("findById(1):\n " + repository.findById(1));
        System.out.println();

        int id = 1001;
        Employee employee = new Employee(id, "Lauma", "Saulkalne", 4);
        System.out.println("insert Lauma: " + repository.insert(employee));
        System.out.println(repository.findById(id));
        employee.setLastName("Logina");
        System.out.println("update lastName: " + repository.update(employee));
        System.out.println("find Lauma: \n" + repository.findById(id));
        System.out.println("delete Lauma: " + repository.delete(id));

        System.out.println(repository.find(2));
        System.out.println(repository.find(50));

        System.out.println("\n** HR department **");
        System.out.println(repository.findByDepartment("HR"));
        System.out.println("** IT department **");
        System.out.println(repository.findByDepartment("IT"));
        System.out.println("** Marketing department **");
        System.out.println(repository.findByDepartment("Marketing"));
        System.out.println("** Admins department **");
        System.out.println(repository.findByDepartment("Admins"));

        repository.closeConnection();
    }
}
