package core;

public class Car
{
    public String number;
    public int height;
    public double weight;
    public boolean hasVehicle;
    public boolean isSpecial;

    public String toString()
    {
        String special = isSpecial ? "СПЕЦТРАНСПОРТ " : "";
        return "\n=========================================\n" +
            special + "Автомобиль с номером " + number +
            ":\n\tВысота: " + height + " мм\n\tМасса: " + weight + " кг";
    }
}
//Геттеры и сеттеры вышеуказанных переменных
    public void setNumber(String number)
    {
        this.number = number;
    }
    public String getNumber(String number)
    {
        return String number;
    }

    public void setHeight(int height) { this.height = height; }
    public int getHeight()
    {
        return height;
    }

    public void setWeight()
    {
        this.weight = weight;
    }
    public Double getWeight()
    {
        return weight;
    }

    public void setHasVehicle(boolean hasVehicle)
    {
        this.hasVehicle = hasVehicle;
    }
    public Boolean getHasVehicle()
    {
        return hasVehicle;
    }

    public void setIsSpecial(boolean isSpecial)
    {
        this.isSpecial = isSpecial;
    }
    public Boolean getIsSpecial()
    {
        return isSpecial;
    }