package lv.home.restSpringBoot.config;

import lv.home.restSpringBoot.model.Car;
import lv.home.restSpringBoot.model.Engine;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Configuration
public class CarConfiguration {

    @Bean
    public Engine createEngine(){
        Engine engine = new Engine();
        engine.setName("Turbo_V8");
        return engine;
    }

    @Bean
    public Car createCar(Engine engine){
        Car car = new Car();
        car.setName("BMW");
        car.setEngine(engine);
        return car;
    }
}
