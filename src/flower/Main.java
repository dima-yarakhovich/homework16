package flower;



public class Main {
    public static void main(String[] args) {
        Flower roze = new Flower( "Роза","", "Голандия", 35.590,0);
        Flower chrysanthemum = new Flower("Хризантема","", "", 15, 5);
        Flower peony = new Flower("Пион","", "Англия", 69.9, 1);
        Flower gypsophila = new Flower("Гипсофила","", "Турция", 19.5, 10);
        System.out.println(roze.toString());
        System.out.println(chrysanthemum.toString());
        System.out.println(peony.toString());
        System.out.println(gypsophila.toString());

    }
}