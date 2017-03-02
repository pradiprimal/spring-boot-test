package spring.boot.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
 *
 * @author Pradip
 */
@RestControllerAdvice(annotations = RestController.class)
public class GlobalExceptionHandler {

    @ExceptionHandler(value=Exception.class)
    public ResponseEntity<ErrorResponseMessage> globalException(Exception exception) {
        System.out.println("Called");
        exception.printStackTrace();
    ErrorResponseMessage responseMessage=new ErrorResponseMessage("test", HttpStatus.EXPECTATION_FAILED.value());
    return new ResponseEntity<>(responseMessage,HttpStatus.OK);
    }
}
