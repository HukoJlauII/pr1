package ru.mirea.lab1;
public class TestDog
{
    public static void main(String[] args)
    {
        Dog d1=new Dog("Bobeek",4);
        Dog d2=new Dog("Newdog");
        Dog d3=new Dog();
        d2.setAge(1);
        d3.setName("Mikey");
        d3.setAge(3);
        System.out.println(d1);
        d1.toHumanAge();
        d2.toHumanAge();
        d3.toHumanAge();
    }
}
