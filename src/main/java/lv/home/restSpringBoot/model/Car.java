package lv.home.restSpringBoot.model;

public class Car {
    private String name;
    private Engine Engine;
    public Car() {
    }


    public Car(String name, lv.home.restSpringBoot.model.Engine engine) {
        this.name = name;
        Engine = engine;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public lv.home.restSpringBoot.model.Engine getEngine() {
        return Engine;
    }

    public void setEngine(lv.home.restSpringBoot.model.Engine engine) {
        Engine = engine;
    }
}
