package Flower;

public class Flower {
    private String name;
    private String flowerColor;
    private String country;
    private double cost;
    public int lifeSpan;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFlowerColor() {
        return flowerColor;
    }

    public void setFlowerColor(String flowerColor) {
        this.flowerColor = flowerColor;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public int getLifeSpan() {
        return lifeSpan;
    }

    public void setLifeSpan(int lifeSpan) {
        this.lifeSpan = lifeSpan;
    }

    public Flower(String name, String flowerColor, String country, double cost, int lifeSpan) {
        this.name = name;
        if (flowerColor == null || flowerColor.isEmpty()) {
            this.flowerColor = "белый";
        }
        this.flowerColor = flowerColor;
        if (country == null || flowerColor.isEmpty()) {
            this.country = "Россия";
        }
        this.country = country;
        if (cost <= 0 || flowerColor.isEmpty()) {
            this.cost = 1;
        }
        this.cost = cost;
        if(lifeSpan <= 0 || flowerColor.isEmpty()){
            this.lifeSpan = 3;
        }
        this.lifeSpan = lifeSpan;
    }

}
