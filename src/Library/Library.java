package Library;
import java.util.Calendar;
import java.util.Scanner;

public class Library implements LibraryMethods{


    String  department_of_cse[] = new String[100]; 
    String  new_book[] = new String[100];
    String  return_book[] = new String[100];
    int book1=0,book2=0;
    String author_of_the_book;

    Library()
    {
    department_of_cse[0] = "Algorithm" ;
    department_of_cse[1] = "Mathmatics in computing";
    department_of_cse[2] = "Discreate Mathmatics";
    department_of_cse[3] = "Basic Electronics";
    department_of_cse[4] = "Java For Beginner";
   }
    
    @Override
    public void availableBooks()
    {
        System.out.println("The list of available books are: ");
        for (String item : this.department_of_cse){

            if (item == null){
                continue;
            }

            System.out.println("* " + item);
            System.out.println();
    }
        System.out.println("New Book List\n--------------------------------");
        for (String item : this.new_book) {
            if(this.new_book[0]==null)
                System.out.println("New Book list is empty!!");
            if (item == null)
                break;
            System.out.println("* " + item);
            System.out.println();
    }
        System.out.println("\nReturn Book List\n--------------------------------");
        for (String item : this.return_book) {
            if(this.return_book[0]==null)
                System.out.println("Return Book list is empty!!");
            if (item == null) {
                break;
            }
            System.out.println("* " + item);
            System.out.println();
    }
    }

    @Override
    public void authorOfBook()
    {
       Scanner sc = new Scanner(System.in);
        System.out.print("\nPlease enter author of book: ");
        this.author_of_the_book = sc.nextLine();
    }

    @Override
    public void issueBook() 
    {
        Calendar t = Calendar.getInstance();
        Scanner sc = new Scanner(System.in);
        availableBooks();
        System.out.print("\nEnter the name of book you want to issue: ");
        String user1 = sc.nextLine();
        for (int i = 0; i < this.department_of_cse.length; i++) {

            if (user1.equalsIgnoreCase(this.department_of_cse[i]))
            {
                System.out.println("Congratulation!You issued this book.Issued date is " + t.getTime());
            
                this.department_of_cse[i] = null; 
                return;
        }
    }
        for (int i = 0; i < this.new_book.length; i++) {

            if (user1.equalsIgnoreCase(this.new_book[i]))
            {
                System.out.println("Congratulation!You issued this book.Issued date is " + t.getTime());
            
                this.new_book[i] = " "; 
                return;
        }
    }
        for (int i = 0; i < this.return_book.length; i++) {

            if (user1.equalsIgnoreCase(this.new_book[i]))
            {
                System.out.println("Congratulation!You issued this book.Issued date is " + t.getTime());
            
                this.return_book[i] = " "; 
                return;
        }
    }
        System.out.println("Sorry!This Book is not available.This book already issued");
     
    }

    @Override
    public void addBook()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("\nEnter this name of book you want to add: ");
        String user2 = sc.next();
        authorOfBook();
        this.new_book[book1] = user2;
        book1++;
        System.out.println("\nThis book is Successfully added to the library");
    }

    @Override
    public void returnIssuedBook()
    {
       Scanner sc = new Scanner(System.in);
        System.out.print("\nEnter the name of book you want to return: ");
        String user3 = sc.next();
        this.return_book[book2] = user3;
        book2++;
        System.out.println("\nThis book is Successfully return");
    }


}



  
  
    
    

