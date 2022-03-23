package com.netcracker.employee;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Employee employee = new Employee(2, "firstName", "Lastname", 1200);


        System.out.print("Please, enter the percent:");
        int percent = scanner.nextInt();

        employee.raiseSalary(percent);
        System.out.println(employee);


    }

}
