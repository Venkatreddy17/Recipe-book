package exceptionHandler;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class GlobalExceptionHandler {
	
	@ExceptionHandler({
        CategoryNotFoundException.class,
        CuisineNotFoundException.class,
        IngredientNotFoundException.class,
        RecipeNotFoundException.class,
        ReviewNotFoundException.class,
        UserNotFoundException.class
    })
	
	public ResponseEntity<ErrorResponse> handleEntityAlreadyExistsException(RuntimeException ex) {
        ErrorResponse errorResponse = new ErrorResponse();
        return new ResponseEntity<>(errorResponse, HttpStatus.CONFLICT);
    }

    // Add more exception handlers as needed
}


	
	
		
	

	

	

