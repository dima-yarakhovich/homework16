package transport;

public class Main {
    public static void main(String[] args) {
        Car lada = new Car("", "Granta", 2015, "Росcии", "", 1.7,"АКПП","Универсал","а158ап777",5,"Зимние");
        Car audi = new Car("Audi", "A8 50L TDI", 2020, "Германии", "черный", 3.0,"МКПП","","а158ап777",4,"Летние");
        Car bmw = new Car("BMW", "Z8", 2021, "", "черный", 3.0,"","Кабриолет","а158ап777",2,"Зимние");
        Car kia = new Car("Kia", "Sportage", 2018, "Южной Корее", "красный", 2.4,"АКПП","","",5,"");
        Car hyundai = new Car("Hyundai", "Avante", 0, "Южной Корее", "оранжевый", -1,"АКПП","Универсал","а158ап777",7,"Зимние");
        System.out.println(lada);
        System.out.println(audi);
        System.out.println(bmw);
        System.out.println(kia);
        System.out.println(hyundai);
        hyundai.seasonTires();
        audi.seasonTires();
    }
}


