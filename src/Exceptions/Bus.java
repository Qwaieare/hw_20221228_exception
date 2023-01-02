package Exceptions;

public class Bus extends Transport implements Competing {

    private Capacity capacity;

    public Bus(String brand,
               String model,
               double engineVolume,
               Capacity capacity) {
        super(brand, model, engineVolume);
        this.capacity = capacity;
    }

    public Capacity getCapacity() {
        return capacity;
    }

    public void setCapacity(Capacity capacity) {
        this.capacity = capacity;
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

    @Override
    public void maxSpeed() {
        System.out.println(getBrand() + " " + getModel() + " - максимальная скорость");
    }

    @Override
    public void printType() {
        if (capacity == null) {
            System.out.println("Данных по транспортному средству недостаточно");
        } else {
            System.out.println("Вместимость транспортного средства " + getBrand() + " " + getModel() +
                    " от " + capacity.getFrom() + " до " + capacity.getTo() + " чел.");
        }
    }

    @Override
    public boolean service() {
        System.out.println("Автобусу " + getBrand() + " " + getModel() + " диагностика не требуется");
        return true;
    }
}

