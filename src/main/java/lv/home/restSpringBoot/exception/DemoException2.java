package lv.home.restSpringBoot.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

// Если выбросить это исключение, то клиент получит HTTP-код 502 BAD_GATEWAY
@ResponseStatus(HttpStatus.BAD_GATEWAY)
public class DemoException2 extends RuntimeException  {
    public DemoException2() {
    }

    public DemoException2(String message) {
        super(message);
    }

    public DemoException2(String message, Throwable cause) {
        super(message, cause);
    }

    public DemoException2(Throwable cause) {
        super(cause);
    }

    public DemoException2(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
