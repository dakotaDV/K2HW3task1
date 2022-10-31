package Flower;

public class Main {
    public static void main(String[] args) {
        Flower roza = new Flower("Роза обыкновеная", "null", " Голландия", 35.59, 0);
        Flower chrizantema = new Flower("Хризантема", "null", "null", 15, 5);
        Flower pion = new Flower("Пион", "null", "Англия", 69.9, 1);
        Flower gipsofila = new Flower("Гипсофила", "null", "Турция", 19.5, 10);

        Flower[] flower = new Flower[4];
        flower[0] = roza;
        flower[1] = chrizantema;
        flower[2] = pion;
        flower[3] = gipsofila;

        calculate(flower);
    }

    private static void calculate(Flower[] flowers) {
        int lifeSpane = Integer.MAX_VALUE;
        double sum = 0;
        String text = "В букете есть ";
        for (int i = 0; i < flowers.length; i++) {
            if (flowers[i] != null) {
                text += "" + flowers[i].getName() + "" + "из " + flowers[i].getCountry() + " \n";
            }
            if (flowers[i].getLifeSpan() < lifeSpane) {
                lifeSpane = flowers[i].getLifeSpan();
            }
            sum += flowers[i].getCost();
        }
        sum = sum * 1.18;
        text += "\n";
        text += "Сумма букета" + String.format(" %.2f", sum);
        text += "\n";
        text += "Срок годности " + lifeSpane;
        System.out.println(text);
    }

}

    public static void main(String[] args) {
        Flower roza = new Flower("Роза обыкновеная", "null", " Голландия", 35.59, 0);
        Flower chrizantema = new Flower("Хризантема", "null", "null", 15, 5);
        Flower pion = new Flower("Пион", "null", "Англия", 69.9, 1);
        Flower gipsofila = new Flower("Гипсофила", "null", "Турция", 19.5, 10);

        Flower[] flowers = new Flower[4];
        flowers[0] = roza;
        flowers[1] = chrizantema;
        flowers[2] = pion;
        flowers[3] = gipsofila;

        calculate(flowers);
    }

    private static void calculate(Flower[] flowers) {
        int lifeSpane = Integer.MAX_VALUE;
        double sum = 0;
        String text = "В букете есть ";
        for (int i = 0; i < flowers.length; i++) {
            if (flowers[i] != null) {
                text += "" + flowers[i].getName() + "" + "из " + flowers[i].getCountry() + " \n";
            }
            if (flowers[i].getLifeSpan() < lifeSpane) {
                lifeSpane = flowers[i].getLifeSpan();
            }
            sum += flowers[i].getCost();
        }
        sum = sum * 1.18;
        text += "\n";
        text += "Сумма букета" + String.format(" %.2f", sum);
        text += "\n";
        text += "Срок годности " + lifeSpane;
        System.out.println(text);
    }

}



