package com.netcracker.employee;

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

}
