
public class Cat
{
    private double originWeight;
    private double weight;
    private double eaten;
    private static int count;
    private boolean itAlive;

    private double minWeight;
    private double maxWeight;

    public Cat()
    {
        weight = 1500.0 + 3000.0 * Math.random();
        originWeight = weight;
        minWeight = 1000.0;
        maxWeight = 9000.0;
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

    public String getStatus()
    {
        if(weight < minWeight) {
            count = count - 1;
            itAlive = false;
            return "Dead";
        }
        else if(weight > maxWeight) {
            count = count - 1;
            itAlive = false;
            return "Exploded";
        }
        else if(weight > originWeight) {
            count = count - 1;
            itAlive = false;
            return "Sleeping";
        }
        else {
            return "Playing";
        }
    }
}