package com.example.demo.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(StockRecordAlreadyExistsException.class)
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    public Map<String, String> handleStockExists(
            StockRecordAlreadyExistsException ex) {

        return Map.of("message", ex.getMessage());
    }

    @ExceptionHandler(InvalidConsumptionDateException.class)
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    public Map<String, String> handleInvalidDate(
            InvalidConsumptionDateException ex) {

        return Map.of("message", ex.getMessage());
    }

    // fallback (safe)
    @ExceptionHandler(RuntimeException.class)
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    public Map<String, String> handleRuntime(
            RuntimeException ex) {

        return Map.of("message", ex.getMessage());
    }
}
