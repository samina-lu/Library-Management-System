
package Library;

import java.util.Scanner;


public class RunAllMethods extends Book{
      void runMethods()
    {
       Scanner sc= new Scanner(System.in);
       while (true){
               System.out.println("\nWhat you want from these options!\n" +
                       "Press 1 for Issue Books\n" +
                       "Press 2 for Return Books\n" +
                       "Press 3 for Add new Books\n" +
                       "Press 4 for List of available Books");
               System.out.print("\nType here: ");
               int user = sc.nextInt();

           switch (user) {
               case 1:
                   issueBook();
                   break; 
               case 2:
                   returnIssuedBook();
                   break;
               case 3:
                   addBook();
                   break;
               case 4:
                   availableBooks();
                   break;
               default:
                   System.out.println("Something Wrong!Please enter again");
                   break;
           }
       }
    }        


    public static void main(String[] args) {
       RunAllMethods run = new RunAllMethods();
       run.runMethods();
    }
}

