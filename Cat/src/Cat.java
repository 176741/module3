
public class Cat
{
    private double originWeight;
    private double weight;
    private double eaten;
    private static int count;
    private boolean isAlive;
    public static final int MIN_WEIGHT = 1000;
    public static final int MAX_WEIGHT = 9000;
    public static final int EYES_COUNT = 2;
    private String color;

    public Cat()
    {
        weight = 1500.0 + 3000.0 * Math.random();
        originWeight = weight;
        count = count + 1;
        isAlive = true;

    }

    public void meow()
    {
        if(isAlive == false) {
            System.out.println("довели бедняжку...");
        } else {
            weight = weight - 100;
            System.out.println("Meow");
        }
    }

    public void feed(Double amount)
    {
        if(isAlive == false)
        {
            System.out.println("довели бедняжку...");
        } else {
            eaten = +amount;
            weight = weight + amount;
        }
    }

    public Double eaten () { return eaten; }

    public void drink(Double amount)
    {
        if(isAlive == false)
        {
            System.out.println("довели бедняжку...");
        } else {
            weight = weight + amount;
        }
    }

    public void pee ()
    {
        if(isAlive == false)
        {
            System.out.println("довели бедняжку...");
        } else {
            weight = weight - eaten();
            System.out.println("ohh,no...");

        }
    }

    public Double getWeight()
    {
        return weight;
    }

    public static int getCount () { return count; }

    public boolean getIsAlive () { return isAlive; }

    public void setColor (String color) { this.color = color;}

    public Cat(Double weight)
    {
        this();
        this.weight = weight;
    }

    public String getStatus()
    {
        if(weight < MIN_WEIGHT) {
            count = count - 1;
            isAlive = false;
            return "Dead";
        }
        else if(weight > MAX_WEIGHT) {
            count = count - 1;
            isAlive = false;
            return "Exploded";
        }
        else if(weight > originWeight) {
            return "Sleeping";
        }
        else {
            return "Playing";
        }
    }
}