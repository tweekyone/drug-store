package ru.tweekyone.drugstore.controller.advice;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;
import ru.tweekyone.drugstore.controller.dto.response.ErrorResponse;
import ru.tweekyone.drugstore.exception.DrugNotFoundException;

public class ErrorAdviceHandler extends ResponseEntityExceptionHandler {

    @ExceptionHandler(DrugNotFoundException.class)
    @ResponseStatus(HttpStatus.NOT_FOUND)
    @ResponseBody
    public ErrorResponse notFoundExceptionHandling(Exception ex) {
        return new ErrorResponse(HttpStatus.NOT_FOUND.value(), ex.getMessage());
    }
}
