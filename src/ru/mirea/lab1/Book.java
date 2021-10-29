package ru.mirea.lab1;

public class Book {
    private String Author;
    private String Name;
    private int year;
    public Book()
    {
        Author="Unknown";
        Name="Unnamed";
        year=2021;
    }
    public Book(String Author,String Name,int year)
    {
        this.Author=Author;
        this.Name=Name;
        this.year=year;
    }

    public void setAuthor(String author) {
        Author = author;
    }

    public void setName(String name) {
        Name = name;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getAuthor() {
        return Author;
    }

    public String getName() {
        return Name;
    }

    public int getYear() {
        return year;
    }

    @Override
    public String toString() {
        return "Book{" +
                "Author='" + Author + '\'' +
                ", Name='" + Name + '\'' +
                ", year=" + year +
                '}';
    }
}
