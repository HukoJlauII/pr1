package ru.mirea.lab1;

public class Ball {
    private int radius;
    private int weight;
    private String material;

    public Ball() {
        radius=0;
        weight=0;
        material="Default";
    }

    public Ball(int r,int w,String m) {
       this.radius=r;
       this.weight=w;
       this.material=m;
    }

    public void setRadius(int radius)
    {
        this.radius=radius;
    }

    public void setWeight(int weight)
    {
        this.weight=weight;
    }

    public void setMaterial(String material)
    {
        this.material=material;
    }

    public String toString()
    {
        return("ball is made of "+this.material +" and weights "+this.weight+" kg");
    }

    public int getRadius()
    {
        return this.radius;
    }

    public int getWeight()
    {
        return this.weight;
    }

    public String getMaterial() {
        return this.material;
    }
    public double getVolume()
    {
        return Math.ceil(((4*Math.pow(this.radius,3)*Math.PI)/3));
    }
}
