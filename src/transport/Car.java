package transport;

import java.time.LocalDate;

public class Car {
    private String brand;
    private String model;
    private String color;
    double engineVolume;
    private int year;
    private String country;
    private String transmission;
    private String type;
    private String number;
    private int seats;
    private String tires;


    Car(String brand, String model, int year, String country, String color, double engineVolume, String transmission, String type, String number, int seats, String tires) {
        this.brand = brand;
        this.model = model;
        this.color = color;
        this.engineVolume = engineVolume;
        this.year = year;
        this.country = country;
        this.transmission = transmission;
        this.type = type;
        this.number = number;
        this.seats = seats;
        this.tires = tires;
    }

    public String getBrand() {
        if (brand.isEmpty() || brand == null || brand.isBlank()) {
            this.brand = "default";
        } else {
            this.brand = brand;
        }
        return brand;
    }

    public String getModel() {
        if (model.isEmpty() || model == null || model.isBlank()) {
            this.model = "default";
        } else {
            this.model = model;
        }
        return model;
    }

    public String getColor() {
        if (color.isEmpty() || color == null || color.isBlank()) {
            this.color = "белый";
        } else {
            this.color = color;
        }
        return color;
    }

    public void setColor(String color) {
        if (color.isEmpty() || color == null || color.isBlank()) {
            this.color = "белый";
        } else {
            this.color = color;
        }
    }

    public double getEngineVolume() {
        if (engineVolume <= 0) {
            this.engineVolume = 1.5;
        } else {
            this.engineVolume = engineVolume;
        }
        return engineVolume;
    }

    public void setEngineVolume(double engineVolume) {
        if (engineVolume <= 0) {
            this.engineVolume = 1.5;
        } else {
            this.engineVolume = engineVolume;
        }
    }

    public int getYear() {
        if (year <= 0) {
            this.year = 2000;
        } else {
            this.year = year;
        }
        return year;
    }

    public String getCountry() {
        if (country.isEmpty() || country == null || country.isBlank()) {
            this.country = "default";
        } else {
            this.country = country;
        }
        return country;
    }

    public String getTransmission() {
        if (transmission.isEmpty() || transmission == null || transmission.isBlank()) {
            this.transmission = "default";
        } else {
            this.transmission = transmission;
        }
        return transmission;
    }

    public void setType(String type) {
        if (type.isEmpty() || type == null || type.isBlank()) {
            this.type = "default";
        } else {
            this.type = type;
        }
    }

    public String getType() {
        if (type.isEmpty() || type == null || type.isBlank()) {
            this.type = "default";
        } else {
            this.type = type;
        }
        return type;
    }

    public String getNumber() {
        if (number.isEmpty() || number == null || number.isBlank()) {
            this.number = "default";
        } else {
            this.number = number;
        }
        return number;
    }

    public void setNumber(String number) {
        if (number.isEmpty() || number == null || number.isBlank()) {
            this.number = "default";
        } else {
            this.number = number;
        }
    }

    public int getSeats() {
        if (year <= 0) {
            this.seats = 5;
        } else {
            this.seats = seats;
        }
        return seats;
    }

    public String getTires() {
        if (tires.isEmpty() || tires == null || tires.isBlank()) {
            this.tires = "default";
        } else {
            this.tires = tires;
        }
        return tires;
    }

    public void setTires(String tires) {
        if (tires.isEmpty() || tires == null || tires.isBlank()) {
            this.tires = "default";
        } else {
            this.tires = tires;
        }
    }

    @Override
    public String toString() {
        return brand + " " + model + ", " + year + " года выпуска, сборка в: " + country + ", " + color + " цвет кузова, объём: - " + engineVolume + " л."
                + ", Коробка передач: " + transmission + ", Тип кузова: " + type + ", Регистрационный номер: " + number + ", Количество мест: " + seats + ", Тип резины: " + tires;
    }

    public void seasonTires() {
        int month = LocalDate.now().getMonthValue();
        if (month <= 4 || month >= 10 && this.tires != "Зимние") {
            System.out.println("Необходимо сменить шины на Зимние");
        } else {
            System.out.println("Сезонные шины установлены");
        }
    }
}