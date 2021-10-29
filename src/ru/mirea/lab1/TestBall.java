package ru.mirea.lab1;

public class TestBall {
    public static void main(String[] args)
    {
        Ball b1=new Ball(10,5,"Leather");
        Ball b2=new Ball();
        b2.setRadius(3);
        b2.setWeight(2);
        b2.setMaterial("Stone");
        System.out.println(b1);
        System.out.println(b2);
        System.out.println("The volume of "+ b1+" is "+b1.getVolume()+"m^3");
    }
}
