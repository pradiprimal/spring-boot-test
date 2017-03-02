package spring.boot.exception;

import java.io.Serializable;
import lombok.Getter;
import lombok.Setter;

/**
 *
 * @author Pradip
 */
@Getter
@Setter
public class ErrorResponseMessage implements Serializable {

    private String message;

    private int errorCode;

    public ErrorResponseMessage(String message, int errorCode) {
        this.message = message;
        this.errorCode = errorCode;
    }

 

}
