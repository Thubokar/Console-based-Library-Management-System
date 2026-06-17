package com.jbk.Members;

public class Teacher_mem extends Member {

    public Teacher_mem(int memberId, String name) {
        super(memberId, name);
    }

    @Override
    public int getLimit() {
        return 5;
    }
}