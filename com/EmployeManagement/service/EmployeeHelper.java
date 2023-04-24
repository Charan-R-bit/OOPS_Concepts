package com.EmployeManagement.service;

import java.util.Scanner;

public class EmployeeHelper {

    EmployeeService service=new EmployeeService();
    Scanner sc=new Scanner(System.in);
    static boolean ordering=true;
    public  void menu() {
        System.out.println("********welcome to employee Management*********"
                + "\n1. Add Employee"
                + "\n2. View Employee"
                + "\n3. Update Employee"
                + "\n4. Delete Employee"
                + "\n5. View All Employee"
                + "\n6. Exit");
        System.out.println("Enter your choice: ");
        helper();
       
    }



    public void  helper(){
        do {
        	
            int choice=sc.nextInt();
            switch(choice) {
                case 1:
                    System.out.println("Add Employee");
                    service.addEmp();
                    break;
                case 2:
                    System.out.println("View Employee");
                    service.viewEmp();
                    break;
                case 3:
                    System.out.println("Update Employee");
                    service.updateEmployee();
                    break;
                case 4:
                    System.out.println("Delete Employee");
                    service.deleteEmp();
                    break;
                case 5:
                    System.out.println("View All Employee");
                    service.viewAllEmps();
                    break;
                case 6:
                    System.out.println("Thank You");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Please enter valid choice");
                    break;
            }

        }while(ordering);
    }
}
