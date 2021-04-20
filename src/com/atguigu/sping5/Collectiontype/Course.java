package com.atguigu.sping5.Collectiontype;

public class Course {


    private String cname;

    public void setCname(String cname) {
        this.cname = cname;
    }
    @Override
    public String toString() {
        return "Course{" +
                "cname='" + cname + '\'' +
                '}';
    }
    public void show()
    {
        System.out.println(cname);
    }
}
