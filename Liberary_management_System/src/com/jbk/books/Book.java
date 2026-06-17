package com.jbk.books;

public class Book {

    private int bookId;
    private String title;
    private String author;
    private boolean available;
    private int issuedToMemberId;

    public Book(int bookId, String title, String author) {

        this.bookId = bookId;
        this.title = title;
        this.author = author;
        this.available = true;
        this.issuedToMemberId = -1;
    }

    public void displayBook() {

        System.out.println(
                bookId + " " +
                title + " " +
                author + " " +
                available + " " +
                issuedToMemberId);
    }

    public int getBookId() {
        return bookId;
    }

    public boolean isAvailable() {
        return available;
    }

    public void issueBook() {
        available = false;
    }

    public void returnBook() {
        available = true;
    }

    public int getIssuedToMemberId() {
        return issuedToMemberId;
    }

    public void setIssuedToMemberId(int issuedToMemberId) {
        this.issuedToMemberId = issuedToMemberId;
    }
}