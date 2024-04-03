package lv.home.restSpringBoot;

import lv.home.restSpringBoot.exception.DemoException;
import lv.home.restSpringBoot.exception.DemoException2;
import lv.home.restSpringBoot.exception.DemoException3;
import lv.home.restSpringBoot.model.Car;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.lang.reflect.Field;

@RestController
public class DemoController {

    private final Car car;

    @Autowired
    public DemoController(Car car) {
        this.car = car;
    }

    @RequestMapping("/test")
    public String hello(){
        return "Hello from demo rest controller! Your car: "+car.getName()+" with engine:"+
                car.getEngine().getName();
    }

    @RequestMapping("/demo")
    public String demoHello(){
        return "Hello from demo rest controller! Your car: "+car.getName()+" with engine:"+
                car.getEngine().getName();
    }

    @RequestMapping("/requests")
    public String demors(){
        return "Hello from demo rest controller! ";
    }

    @RequestMapping("/demoex")
    public String demoEx(){
        throw new DemoException("#DemoError");
    }

    @RequestMapping("/demoex2")
    public String demoEx2(){
        throw new DemoException2("#DemoError2");
    }

    @RequestMapping("/demoex3")
    public String demoEx3(){
        throw new DemoException3("#DemoError2");
    }


}
