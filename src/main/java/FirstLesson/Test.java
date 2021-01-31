package FirstLesson;

/**
 * @author Dmitry Kubyshkin
 * @dateOfCreation 31.01.2021
 */

interface Moveable {
    void move();
}

interface Stopable {
    void stop();
}

class Engine {
}

abstract class Car {
    public Engine engine;
    private String color;
    private String name;


    protected void start() {
        System.out.println("First.Car starting");
    }

    abstract void open();

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

class LightWeightCar extends Car implements Moveable {

    @Override
    void open() {
        System.out.println("First.Car is open");
    }

    @Override
    public void move() {
        System.out.println("First.Car is moving");
    }

}

class Lorry extends Car implements Moveable, Stopable {

    public void move() {
        System.out.println("First.Car is moving");
    }

    public void stop() {
        System.out.println("First.Car is stop");
    }

    @Override
    void open() {

    }
}

