package com.jbk.Library;

import com.jbk.Members.Member;
import com.jbk.books.Book;

public class Library {

    private Book[] books = new Book[100];
    private Member[] members = new Member[100];

    private int bookCount = 0;
    private int memberCount = 0;

    public void addBook(Book book) {

        books[bookCount] = book;
        bookCount++;
    }

    public void addMember(Member member) {

        members[memberCount] = member;
        memberCount++;
    }

    public void displayBooks() {

        for(int i=0;i<bookCount;i++) {
            books[i].displayBook();
        }
    }

    public void displayMembers() {

        for(int i=0;i<memberCount;i++) {
            members[i].displayMember();
        }
    }

    public Book findBook(int id) {

        for(int i=0;i<bookCount;i++) {

            if(books[i].getBookId()==id) {
                return books[i];
            }
        }

        return null;
    }

    public Member findMember(int id) {

        for(int i=0;i<memberCount;i++) {

            if(members[i].getMemberId()==id) {
                return members[i];
            }
        }

        return null;
    }

    public void issueBook(int bookId,int memberId) {

        Book book = findBook(bookId);
        Member member = findMember(memberId);

        if(book == null || member == null) {

            System.out.println("Book or Member not found");
            return;
        }

        if(!book.isAvailable()) {

            System.out.println("Book already issued");
            return;
        }

        if(member.getIssuedBooks() >= member.getLimit()) {

            System.out.println("Limit exceeded");
            return;
        }

        book.issueBook();

        book.setIssuedToMemberId(memberId);

        member.setIssuedBooks(
                member.getIssuedBooks()+1);

        System.out.println("Book Issued");
    }

    public void returnBook(int bookId,int memberId) {

        Book book = findBook(bookId);
        Member member = findMember(memberId);

        if(book == null || member == null) {

            System.out.println("Book or Member not found");
            return;
        }

        if(book.getIssuedToMemberId()!=memberId) {

            System.out.println("This member did not issue the book");
            return;
        }

        book.returnBook();

        book.setIssuedToMemberId(-1);

        member.setIssuedBooks(
                member.getIssuedBooks()-1);

        System.out.println("Book Returned");
    }

    public void searchBook(int id) {

        Book book = findBook(id);

        if(book!=null) {
            book.displayBook();
        }
        else {
            System.out.println("Book not found");
        }
    }
}