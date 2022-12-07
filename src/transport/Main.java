package transport;


public class Main {
    public static void main(String[] args) {
        Car lada = new Car("", "Granta", 2015, "Росcии", "", 1.7, "АКПП", "Универсал", "а158ап777", 5, "Зимние");
        Car audi = new Car("Audi", "A8 50L TDI", 2020, "Германии", "черный", 3.0, "МКПП", "", "а158ап777", 4, "Летние");
        Car bmw = new Car("BMW", "Z8", 2021, "", "черный", 3.0, "", "Кабриолет", "а158ап777", 2, "Зимние");
        Car kia = new Car("Kia", "Sportage", 2018, "Южной Корее", "красный", 2.4, "АКПП", "", "", 5, "");
        Car hyundai = new Car("Hyundai", "Avante", 0, "Южной Корее", "оранжевый", -1, "АКПП", "Универсал", "а158ап777", 7, "Зимние");
//        System.out.println(lada);
//        System.out.println(audi);
//        System.out.println(bmw);
//        System.out.println(kia);
//        System.out.println(hyundai);
//        hyundai.seasonTires();
//        audi.seasonTires();

        //Вложенный класс static(сразу создаем объект вл класса)
        Car.Key key = new Car.Key("12", "13");// или можно сделать импорт:import transport.Car.Key
        audi.setKey(key);
        bmw.setKey(key);
        System.out.println(key.toString());


        //Вложенный класс без static(создаем объект непосредственно объекта)
        Car.Insurance insurance = lada.new Insurance(3, 3.2, "1234567");
        lada.setInsurance(insurance);
        System.out.println(lada.getInsurance());


    }
}


