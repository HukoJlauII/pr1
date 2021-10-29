package ru.mirea.lab1;

public class Dog {
    private int age;
    private String name;
    public Dog (String n,int a)
    {
        age=a;
        name=n;
    }
    public Dog (String n)
    {
        age=0;
        name=n;
    }
    public Dog()
    {
       name="Puppy";
       age=0;
    }
    public void setName(String name)
    {
        this.name=name;
    }
    public void setAge(int age)
    {
        this.age=age;
    }
    public int getAge()
    {
        return age;
    }
    public String getName()
    {
        return name;
    }
    public String toString()
    {
        return this.name+", his/her age is "+this.age;
    }
    public void toHumanAge()
    {
        System.out.println(this.name+"'s age in human years is "+this.age*7+" years");
    }
}
