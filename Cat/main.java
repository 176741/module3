import com.skillbox.airport.Airport;

public class main
{
    public static void main(String[] args)
    {
        Airport airport=Airport.getInstance();
        System.out.println(airport.getAllAircrafts());
        System.out.println(airport.getAllAircrafts().size());
        System.out.println(airport.getTerminals());
    }

}
