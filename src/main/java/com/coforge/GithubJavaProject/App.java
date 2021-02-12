package com.coforge.GithubJavaProject;

import java.util.Scanner;

import com.coforge.GithubJavaProject.Service.EmployeeServiceImpl;

public class App 
{
    public static void main( String[] args )
    {
      EmployeeServiceImpl e =new EmployeeServiceImpl();
      Scanner sc = new Scanner(System.in);
      System.out.println("enter 1 for add and 2 for display");
      switch(sc.nextInt()) {
      
      case 1: e.AddEmp();
              e.Display();
      	break;
      	
      case 2: e.Display();
      	break;
      	
      default: System.out.println("enter only 1 and 2: ");
      	break;
      
      }
    }
}
