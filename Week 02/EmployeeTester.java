/*
Author: Mike OMalley
Source: EmployeeTester.java
Desc:   Tester class for Employee and Employee subclasses.
*/
import java.util.ArrayList;

public class EmployeeTester
{
   public static void main (String[] args)
   {
      Manager boss1 = new Manager ("Frankie", 4000, 2020, 07, 01);
      Manager boss2 = new Manager ("Bella",   5000, 2020, 07, 01, 1000);
      Manager boss3 = new Manager ("Sam",     2020, 07, 14);
      Manager boss4 = new Manager ();

      System.out.println (boss1);
      System.out.println (boss2);
      System.out.println (boss3);
      System.out.println (boss4);

      Employee emp1 = new Employee ("Teenie Weenie", 3500, 2020, 07, 01);
      System.out.println (emp1);

      ArrayList<Employee> employeesArrayList = new ArrayList<Employee> ();

      employeesArrayList.add (emp1);
      employeesArrayList.add (new Employee ("Hankel", 3500, 2020, 07, 02) );
      employeesArrayList.add (boss1);
      employeesArrayList.add (new Manager ("Boogle", 2020, 07, 15) );


      System.out.println ("\n\nArrayList part:");
      for (int k = 0; k < employeesArrayList.size(); k++)
      {
         System.out.println (employeesArrayList.get(k) );
      }

   }

} // public class EmployeeTester