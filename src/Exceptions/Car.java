package Exceptions;

public class Car extends Transport implements Competing {

    private BodyOfType bodyOfType;

    public Car(String brand,
               String model,
               double engineVolume,
               BodyOfType bodyOfType) {
        super(brand, model, engineVolume);
        this.bodyOfType = bodyOfType;
    }

    public BodyOfType getBodyOfType() {
        return bodyOfType;
    }

    public void setBodyOfType(BodyOfType bodyOfType) {
        this.bodyOfType = bodyOfType;
    }

    @Override
    public void gas() {
        System.out.println(getBrand() + " " + getModel() + " начать движение");
    }

    @Override
    public void brake() {
        System.out.println(getBrand() + " " + getModel() + " закончить движение");
    }


    @Override
    public void pitStop() {
        System.out.println(getBrand() + " " + getModel() + " - Пит-стоп делают только гоночные автомобили");
    }

    @Override
    public void bestLapTime() {
        System.out.println(getBrand() + " " + getModel() + " - лучшее время круга");
    }


    public void maxSpeed() {
        System.out.println(getBrand() + " " + getModel() + " - максимальная скорость");
    }

    @Override
    public void printType() {
        if (bodyOfType == null) {
            System.out.println("Данных по транспортному средству недостаточно");
        } else {
            System.out.println("Тип транспортного средства " + getBrand() + " " + getModel() + " : " +  bodyOfType);
        }
    }

    @Override
    public boolean service() {
        return Math.random() > 0.7;
    }
}

