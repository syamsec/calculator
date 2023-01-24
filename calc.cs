using System;
using System.Collections.Generic;
using System.Linq;
using System.Text.RegularExpressions;
 

 namespace Dcoder
 {
   public class calc
   {
     public static void Main(string[] args)
     {
       
       Double condition1;
       Double condition2;
       String operation;
       Double result;
       
       
       Console.WriteLine("digite operation");
       Console.WriteLine("+");
       Console.WriteLine("-");
       Console.WriteLine("*");
       Console.WriteLine("/");
       Console.WriteLine("Select Your option");
       
       operation = Console.ReadLine();
       
       Console.WriteLine("Enter Digite 1");
       condition1 = Convert.ToDouble(Console.ReadLine());
       Console.WriteLine("Enter Digite 2");
       condition2 = Convert.ToDouble(Console.ReadLine());
       
       
         if(operation == "+")
         {
           result = condition1 + condition2;
           Console.WriteLine("Your result is ::"+result);
           
             
           
           Console.ReadLine();
         }
               if(operation == "-")
         {
           result = condition1 - condition2;
           Console.WriteLine("Your result is :: " + result);
           
             
           
           Console.ReadLine();
         }
    
               if(operation == "*")
         {
           result = condition1 * condition2;
           Console.WriteLine("Your result is :: "+ result);
           
             
           
           Console.ReadLine();
         }
  
             if(operation == "/")
         {
           result = condition1 / condition2;
           Console.WriteLine("Your result is :: "+ result);
           
             
           
           Console.WriteLine(result);
         }
  
     }
   }
 }