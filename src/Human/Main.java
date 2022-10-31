package Human;

    public class Main {
        public static void main(String[] args) {
            People maksim = new People(-1988, "Максим", "", "бренд-менеджера");
            People ann = new People(1993, "Аня", "Москва", "методист образовательных программ");
            People katya = new People(1992, "", "Калиннинград", "продакт-менеджер");
            People artem = new People(1995, "Артем", "Москва", "директор по развитию");
            People volodia = new People(2001, "Владимир", "Казань", "");
         //   volodia.setTown(null);
            System.out.println(maksim);
            System.out.println(ann);
            System.out.println(katya);
            System.out.println(artem);
            System.out.println(volodia);
        }

    }
