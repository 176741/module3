
public class Cat
{
    private double originWeight;
    private double weight;
    private double eaten;

    private double minWeight;
    private double maxWeight;

    public Cat()
    {
        weight = 1500.0 + 3000.0 * Math.random();
        originWeight = weight;
        minWeight = 1000.0;
        maxWeight = 9000.0;

    }

    public void meow()
    {
        weight = weight - 1;
        System.out.println("Meow");
    }

    public void feed(Double amount)
    {
        eaten = + amount;
        weight = weight + amount;
    }

    public Double eaten () { return eaten; }

    public void drink(Double amount)
    {
        weight = weight + amount;
    }

    public void pee ()
    {
        weight = weight - eaten();
        System.out.println("ohh,no...");
    }

    public Double getWeight()
    {
        return weight;
    }

    public String getStatus()
    {
        if(weight < minWeight) {
            return "Dead";
        }
        else if(weight > maxWeight) {
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