package Registar;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
import Library.*;

public class FileForReg {
    RunAllMethods run = new RunAllMethods();
  public void userInfo() throws IOException {
       PrintWriter wr = new PrintWriter(new FileWriter("userData.txt"));
        Scanner scanner = new Scanner(System.in);
        String info = "";
        
         
            System.out.println("Enter first name:");
            info = scanner.next();
            wr.write(info + "\n");
            System.out.println("Enter last name:");
            info = scanner.next();
            wr.write(info + "\n");
            System.out.println("Enter Id:");
            info = scanner.next();
           
            wr.write(info);
            wr.println();
            
            wr.close();
            System.out.println("Completed");
  } 
  public void readUseInfo(){
        String s[] = new String[3];
        int i = 0;
    
 
    Scanner input = new Scanner(System.in);
      try {
        
      File fi = new File("userData.txt");
      
        try (Scanner Read = new Scanner(fi)) {
            while (Read.hasNextLine()) {
                String data = Read.nextLine();
                s[i++] = data;
               
            } }
      
    } catch (FileNotFoundException error) {
      System.out.println("An error occurred.");
    }
    
    
      System.out.println("Data read from file\n");
        for(int j = 0 ; j < s.length ; j++)
        {
            System.out.println(" "+s[j]);
        }
        
        String name;
        System.out.println("Enter your first name for login ");
        name = input.nextLine();
        
        if(name.equals(s[0])){
            System.out.println("Succesfully");
            run.runMethods();
        }
        else{
            System.out.println("Wrong name!");
            readUseInfo();
            
        }
            
        
  }
    public static void main(String[] args) throws IOException {
        FileForReg f = new FileForReg();
        System.out.println("1. Registration\n 2. Logging");
        Scanner scanner = new Scanner(System.in);
        int a;
        a = scanner.nextInt();
        if(a==1){
           f.userInfo();
           f.readUseInfo();
        }
        else if(a==2){
           f.readUseInfo();
        }
    }
}
