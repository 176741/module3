
public class Cat
{
    private double originWeight;
    private double weight;
    private double eaten;
    private static int count;
    private boolean itAlive;
    public static final int MIN_WEIGHT = 1000;
    public static final int MAX_WEIGHT = 9000;
    public static final int EYES_COUNT = 2;

    public Cat()
    {
        weight = 1500.0 + 3000.0 * Math.random();
        originWeight = weight;
        count = count + 1;
        itAlive = true;

    }

    public void meow()
    {
        if(itAlive == false) {
            System.out.println("довели бедняжку...");
        } else {
            weight = weight - 100;
            System.out.println("Meow");
        }
    }

    public void feed(Double amount)
    {
        if(itAlive == false)
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
        if(itAlive == false)
        {
            System.out.println("довели бедняжку...");
        } else {
            weight = weight + amount;
        }
    }

    public void pee ()
    {
        if(itAlive == false)
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

    public boolean getItAlive () { return itAlive; }

    public void setColorCat (colorsCat type)
    {

    }

    public String getStatus()
    {
        if(weight < MIN_WEIGHT) {
            count = count - 1;
            itAlive = false;
            return "Dead";
        }
        else if(weight > MAX_WEIGHT) {
            count = count - 1;
            itAlive = false;
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