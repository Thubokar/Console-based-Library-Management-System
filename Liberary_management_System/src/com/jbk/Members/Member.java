package com.jbk.Members;

public class Member {

    protected int memberId;
    protected String name;
    protected int issuedBooks;

    public Member(int memberId, String name) {

        this.memberId = memberId;
        this.name = name;
        this.issuedBooks = 0;
    }

    public void displayMember() {

        System.out.println(
                memberId + " " +
                name + " " +
                issuedBooks);
    }

    public int getMemberId() {
        return memberId;
    }

    public int getIssuedBooks() {
        return issuedBooks;
    }

    public void setIssuedBooks(int issuedBooks) {
        this.issuedBooks = issuedBooks;
    }

    public int getLimit() {
        return 0;
    }
}