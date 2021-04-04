package assignment2;

import java.util.Scanner;

public class Assignment2 {
    
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        
        String nameToSearch = null;
        
        int totalEmployees = 5;
        System.out.println("Enter the number of total employees: " + totalEmployees);
        
        String[] employeeIds = new String[totalEmployees];
        String[] employeeNames = new String[totalEmployees];
        long[] employeeSalary = new long[totalEmployees];
        
        id(employeeIds);
        name(employeeNames);
        salary(employeeSalary);
        
        display(employeeIds, employeeNames, employeeSalary);
        display(employeeIds, employeeNames);        
        display(nameToSearch, employeeIds, employeeNames, employeeSalary);
    }

public static void id(String[] employeeIds) {
    
    for (int index=0; index<employeeIds.length; index++){
        
        System.out.println("Enter employee Ids");
        employeeIds[index] = in.next();
    }
}


public static void name(String[] employeeNames) {
    
    for (int index=0; index<employeeNames.length; index++){
        
        System.out.println("Enter employee Names");
        employeeNames[index] = in.next();
    }
}

public static void salary (long[] employeeSalary) {
    
    for (int index=0; index<employeeSalary.length; index++){
        
        System.out.println("Enter employee Salary");
        employeeSalary[index] = in.nextLong();
    }
}

    public static void display(String[] employeeIds, String[] employeeNames, long[] employeeSalary) {
        
        System.out.println("---------------------------------------------");
        System.out.println("Id\t\t Name\t\t Salary");
        System.out.println("---------------------------------------------");
       
        for (int index = 0; index<5; index++){
        System.out.println(employeeIds[index] + "\t\t " +employeeNames[index] + "\t\t " + employeeSalary[index]);
        System.out.println("---------------------------------------------");
        }
    }
    
    public static void display(String[] employeeIds, String[] employeeNames){
        System.out.println("---------------------------------------------");
        System.out.println("For second query");
        System.out.println("Id\t\t Name");
        System.out.println("----------------------");
        
        for (int index = 0; index<5; index++){
        System.out.println(employeeIds[index] + "\t\t " +employeeNames[index]);
        System.out.println("----------------------");
        }
    }
    
    public static void display(String nameToSearch, String[] employeeIds, String[] employeeNames, long[] employeeSalary) {
        
        System.out.println("For third query");
        System.out.println("Enter Student's name: ");
        nameToSearch = in.next();
        
        System.out.println("---------------------------------------------");
        System.out.println("Id\t\t Name\t\t Salary");
        System.out.println("---------------------------------------------");
       
        for (int index = 0; index<5; index++){
            
            if (nameToSearch.equals(employeeNames[index])){
                
            System.out.println(employeeIds[index] + "\t\t " +employeeNames[index] + "\t\t " + employeeSalary[index]);
            System.out.println("---------------------------------------------");
            }
        }
    }
}
