package Exceptions;

public abstract class Transport {

    private String brand; // марка автомобиля
    private String model; // модель автомобиля

    private double engineVolume; // объем двигателя в литрах

    // конструктор
    public Transport(String brand,
                     String model,
                     double engineVolume) {

        if (brand == null || brand.isEmpty() || brand.isBlank()) {
            this.brand = "default";
        } else {
            this.brand = brand;
        }
        if (model == null || model.isEmpty() || model.isBlank()) {
            this.model = "default";
        } else {
            this.model = model;
        }
        this.engineVolume = engineVolume;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getEngineVolume() {
        return engineVolume;
    }

    public void setEngineVolume(double engineVolume) {
        if (engineVolume <= 0) {
            this.engineVolume = 1.6;
        } else {
            this.engineVolume = engineVolume;
        }
    }

    // методы
    public abstract void gas();  // начать движение

    public abstract void brake();  // закончить движение

    public abstract void printType(); // выводит в консоль значение типа транспортного средства
    public abstract boolean service(); // метод "Пройти диагностику"

}


