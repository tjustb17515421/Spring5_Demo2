package com.atguigu.sping5.Collectiontype;

import java.util.List;

public class Book {


    private List<String> book;
    public void setBook(List<String> book) {
        this.book = book;
    }
    public void show()
    {
        System.out.println(book);
    }
}
