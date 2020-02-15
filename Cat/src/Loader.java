
public class Loader
{
    public static void main(String[] args)
    {
        Cat vasya = new Cat();
        System.out.println("вес кота Васи = " + vasya.getWeight());
        vasya.setColorCat(colorsCat.BLACK);
        Cat musya = new Cat();
        System.out.println("вес кошки Муси = " + musya.getWeight());
        musya.setColorCat(colorsCat.TRICOLOR);
        Cat murka = new Cat();
        System.out.println("вес кошки Мурки = " + murka.getWeight());
        murka.setColorCat(colorsCat.TRICOLOR);
        Cat ryzhyk = new Cat();
        ryzhyk.setColorCat(colorsCat.ORANGE);
        System.out.println("вес кота Рыжика = " + ryzhyk.getWeight());
        ryzhyk.feed(ryzhyk.getWeight()*0.05);
        System.out.println("вес кота Рыжика после покормки = " + ryzhyk.getWeight());
        Cat boris = new Cat();
        boris.setColorCat(colorsCat.WHITE);
        System.out.println("вес кота Бориса = " + boris.getWeight());
        boris.feed(boris.getWeight()*0 + 150.00);
        System.out.println("вес кота Бориса после покормки = " + boris.getWeight());
        boris.pee();
        boris.pee();
        boris.pee();
        boris.pee();
        System.out.println("Борис съел " + boris.eaten() + " гр. еды");
        Cat kitten = new Cat(1100.0);
        System.out.println("Вес котенка = " + kitten.getWeight());
        System.out.println("кошек задано = " + Cat.getCount());
        for (;musya.getWeight() >= Cat.MIN_WEIGHT;) {
            musya.meow();
            if(musya.getWeight() <= Cat.MIN_WEIGHT) {
                System.out.println(musya.getStatus());
            }
        }

        for(;vasya.getWeight() <= Cat.MAX_WEIGHT;) {
            vasya.feed(vasya.getWeight()*0.05);
            if(vasya.getWeight() >= Cat.MAX_WEIGHT) {
                System.out.println(vasya.getStatus());
            }
        }
        System.out.println("кошек осталось = " + Cat.getCount());
        System.out.println(boris.getItAlive());//испытание проверки на живость кошки
        System.out.println(vasya.getItAlive());
        boris.pee();
        vasya.pee();

        
    }
}