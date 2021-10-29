package ru.mirea.lab1;

public class TestBook {
    public static void main(String[] args)
    {
        Book b1=new Book();
        Book b2=new Book("L.Karrol","Alice in Wonderland",1988);
        System.out.println(b1);
        System.out.println(b2);
    }
}
