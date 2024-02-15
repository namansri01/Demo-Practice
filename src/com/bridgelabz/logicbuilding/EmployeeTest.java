package com.bridgelabz.logicbuilding;
public class EmployeeTest {
    public static void main(String[] args) {

        Employee empOne = new Employee("Naman");
        Employee empTwo = new Employee("Aakash");

        empOne.empAge(25);
        empOne.empDesignation("Senior Developer");
        empOne.empSalary(100000);
        empOne.printEmployee();

        empTwo.empAge(23);
        empTwo.empDesignation("Developer");
        empTwo.empSalary(50000);
        empTwo.printEmployee();
    }
}
