
public class Loader
{
    public static void main(String[] args)
    {
        Cat vasya = new Cat();
        System.out.println("вес кота Васи = " + vasya.getWeight());

        Cat musya = new Cat();
        System.out.println("вес кошки Муси = " + musya.getWeight());

        Cat murka = new Cat();
        System.out.println("вес кошки Мурки = " + murka.getWeight());

        Cat ryzhyk = new Cat();
        System.out.println("вес кота Рыжика = " + ryzhyk.getWeight());
        ryzhyk.feed(ryzhyk.getWeight()*0.05);
        System.out.println("вес кота Рыжика после покормки = " + ryzhyk.getWeight());

        Cat boris = new Cat();
        System.out.println("вес кота Бориса = " + boris.getWeight());
        boris.feed(boris.getWeight()*0.05);
        System.out.println("вес кота Бориса после покормки = " + boris.getWeight());

        for (;musya.getWeight() >= 1000;) {
            musya.meow();
            if(musya.getWeight() <= 1000) {
                System.out.println(musya.getStatus());
            }
        }

        for(;vasya.getWeight() <= 9000;) {
            vasya.feed(vasya.getWeight()*0.05);
            if(vasya.getWeight() >= 9000) {
                System.out.println(vasya.getStatus());
            }
        }
        
    }
}