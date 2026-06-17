package com.jbk.run;

import java.util.Scanner;

import com.jbk.Library.Library;
import com.jbk.Members.Student;
import com.jbk.Members.Teacher_mem;
import com.jbk.books.Book;

public class Test {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Library library = new Library();

        while(true) {

            System.out.println("\n===== MENU =====");
            System.out.println("1 Add Book");
            System.out.println("2 View Books");
            System.out.println("3 Add Member");
            System.out.println("4 Issue Book");
            System.out.println("5 Return Book");
            System.out.println("6 Search Book");
            System.out.println("7 View Members");
            System.out.println("8 Exit");

            int choice = sc.nextInt();

            switch(choice) {

            case 1:

                System.out.print("Book ID : ");
                int bid = sc.nextInt();
                sc.nextLine();

                System.out.print("Title : ");
                String title = sc.nextLine();

                System.out.print("Author : ");
                String author = sc.nextLine();

                library.addBook(
                        new Book(bid,title,author));

                break;

            case 2:

                library.displayBooks();
                break;

            case 3:

                System.out.println("1 Student");
                System.out.println("2 Teacher");

                int type = sc.nextInt();

                System.out.print("Member ID : ");
                int mid = sc.nextInt();
                sc.nextLine();

                System.out.print("Name : ");
                String name = sc.nextLine();

                if(type==1) {

                    library.addMember(
                            new Student(mid,name));
                }
                else {

                    library.addMember(
                            new Teacher_mem(mid,name));
                }

                break;

            case 4:

                System.out.print("Book ID : ");
                int issueBookId = sc.nextInt();

                System.out.print("Member ID : ");
                int issueMemberId = sc.nextInt();

                library.issueBook(
                        issueBookId,
                        issueMemberId);

                break;

            case 5:

                System.out.print("Book ID : ");
                int returnBookId = sc.nextInt();

                System.out.print("Member ID : ");
                int returnMemberId = sc.nextInt();

                library.returnBook(
                        returnBookId,
                        returnMemberId);

                break;

            case 6:

                System.out.print("Book ID : ");
                int searchId = sc.nextInt();

                library.searchBook(searchId);

                break;

            case 7:

                library.displayMembers();
                break;

            case 8:

                System.out.println("Program Ended");
                sc.close();
                return;
            }
        }
    }
}