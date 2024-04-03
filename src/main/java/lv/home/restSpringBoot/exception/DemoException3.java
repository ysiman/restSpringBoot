package lv.home.restSpringBoot.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

public class DemoException3 extends RuntimeException  {
    public DemoException3() {
    }

    public DemoException3(String message) {
        super(message);
    }

    public DemoException3(String message, Throwable cause) {
        super(message, cause);
    }

    public DemoException3(Throwable cause) {
        super(cause);
    }

    public DemoException3(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
