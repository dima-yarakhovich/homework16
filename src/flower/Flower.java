package flower;

public class Flower {
    String name;
    private String flowerColor;
    private String country;
    private double cost;
    int lifeSpan;


    @Override
    public String toString() {
        return "Название цветка: " + name + ", Цвет: " + getFlowerColor() + ", Страна происхождения: " + getCountry() + ", Стоимость: " + getCost() + ", Срок стояния равен: " + lifeSpan + " дней(я)";
    }

    Flower(String name, String flowerColor, String country, double cost, int lifeSpan) {
        this.flowerColor = flowerColor;
        this.country = country;
        this.cost = cost;
        this.name=name;

        if (lifeSpan <= 0 || lifeSpan % 1 != 0) {
            this.lifeSpan = 3;
        } else {
            this.lifeSpan = lifeSpan;
        }
    }

    public String getCountry() {
        if (country == null || country.isBlank() || country.isEmpty()) {
            this.country = "Россия";
        } else {
            this.country = country;
        }
        return country;
    }

    public void setCountry(String country) {
        if (country == null || country.isBlank() || country.isEmpty()) {
            this.country = "Россия";
        } else {
            this.country = country;
        }

    }

    public double getCost() {
        if (cost <= 0) {
            this.cost = 1;
        } else {
            String.format("%.2f", cost);
            this.cost = cost;
        }
        return cost;
    }

    public void setCost(double cost) {
        if (cost <= 0) {
            this.cost = 1;
        } else {
            String.format("%.2f", cost);
            this.cost = cost;
        }

    }

    public String getFlowerColor() {
        if (flowerColor == null || flowerColor.isEmpty() || flowerColor.isBlank()) {
            this.flowerColor = "Белый";
        } else {
            this.flowerColor = flowerColor;
        }
        return flowerColor;
    }

    public void setFlowerColor(String flowerColor) {
        if (flowerColor == null || flowerColor.isEmpty() || flowerColor.isBlank()) {
            this.flowerColor = "Белый";
        } else {
            this.flowerColor = flowerColor;
        }
    }

}
