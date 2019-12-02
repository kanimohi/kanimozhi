package com.aequalis.student;
import java.util.Scanner;
import java.util.ArrayList;

public class BookList {

public static void main (String[] args){

System.out.println(" =======================================");
    System.out.println("|       1. Add a book                   |");
    System.out.println("|       2. Edit a book                  |");
    System.out.println("|       3. Delete a book                |");
    System.out.println("|       4. Display all books            |");
    System.out.println("|       5. Exit the program             |");
    System.out.println("|  *Type a number to make a selection*  |");
    System.out.println(" =======================================");
    System.out.println("");
    System.out.print("Selection: ");

    public static void Book()

    {
    int title;
    }
    Book a = new Book();

    a.setTitle("Stranger");


    Book b = new Book();

    b.setTitle("SQL");


    Book c = new Book();

    c.setTitle("HTML");


    ArrayList<Book> BookList = new ArrayList<Book>();
    BookList.add(a);
    BookList.add(b);
    BookList.add(c);





Scanner SC = new Scanner(System.in);

int Choice1;

   Choice1 = SC.nextInt();

   SC.close();


    switch (Choice1) {

    case 1:

        Scanner JK = new Scanner(System.in);

      System.out.println("'Add a book' selected");
      System.out.println(" ");


      break;

    case 2:
        System.out.println("'Edit a book's details' selected");
        System.out.println("Which Book would you like to edit?");
        System.out.println("");
        break;

    case 3:
        System.out.println("'Delete a book' selected");
        break;

    case 4:
          System.out.println("Display all books");
          break;



    case 5:
          System.out.println("Goodbye!");
          System.exit(0);

          break;


    default:
      System.out.println("Invalid selection. Try again");


    }
  }

