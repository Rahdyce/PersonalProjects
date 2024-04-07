using System;

public class Fan
{
    // Implement fan class
    private int speed;
    private double radius;
    private string color;

    // Default constructor
    public Fan()
    {
        Speed = 1;
        Radius = 1.53;
        Color = "green";
    }

    // constructor for specified radius
    public Fan(double newRadius)
    {
        Radius = newRadius;
    }

    // Method to return a string description of the fan
    public override string ToString()
    {
        return string.Format("A {0:0.00} inch {1} fan at a speed of {2}", Radius, Color, Speed);
    }

    // Properties
    public int Speed
    {
        get { return speed; }
        set { speed = value; }
    }

    public double Radius
    {
        get { return radius; }
        set { radius = value; }
    }

    public string Color
    {
        get { return color; }
        set { color = value; }
    }
}

class Program
{
    static void Main(string[] args)
    {
        Fan fan1 = new Fan();
        fan1.Speed = 3;
        fan1.Radius = 10.26;
        fan1.Color = "yellow";
        Console.WriteLine(fan1.ToString());

        Fan fan2 = new Fan(5.79);
        fan2.Speed = 2;
        fan2.Color = "blue";
        Console.WriteLine(fan2.ToString());

        Fan fan3 = new Fan();
        Console.WriteLine(fan3.ToString());
    }
}
