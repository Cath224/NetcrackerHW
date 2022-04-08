package com.netcracker.employee;

import java.util.Arrays;
import java.util.Objects;

public class Employee {
    private int id;
    private String firstName;
    private String lastName;
    private int salary;



    public Employee(int id, String firstName, String lastName, int salary) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public int getSalary() {
        return salary;
    }
    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getLastName() {
        return lastName;
    }

    public String getFirstName() {
        return firstName;
    }


    public String getName(){
       String fullName = firstName +" "+ lastName ;
       return fullName;
    }

    public int getAnnualSalary(){
        return salary * 12;
    }
    public int raiseSalary( int percent ){
        int newSalary = getAnnualSalary() + (getAnnualSalary()*(percent)/100);
        salary = newSalary;
        return salary;
    }



    @Override
    public String toString() {
        return "Employee[" + "id=" + id + ",name= "+ getName() + ",salary= " +salary + "]"  ;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Employee)) return false;
        Employee employee = (Employee) obj;
        return id == employee.id &&
                salary == employee.salary &&
                Objects.equals(firstName, employee.firstName) &&
                Objects.equals(lastName, employee.lastName);
    }

    @Override
    public int hashCode() {
        int result = 17;
        result = 31 * result + salary;
        result = 31 * result + id;
        result = 31 * result + firstName.hashCode();
        result = 31 * result + lastName.hashCode();
        return result;
    }

}
