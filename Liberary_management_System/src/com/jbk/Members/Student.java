package com.jbk.Members;

public class Student extends Member {

    public Student(int memberId, String name) {
        super(memberId, name);
    }

    @Override
    public int getLimit() {
        return 2;
    }
}