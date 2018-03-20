package com.satjd.demo.exception;

import com.satjd.demo.dto.ErrorInfo;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

@ControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(value = Exception.class)
    @ResponseBody
    public ErrorInfo<String> errorHandler(HttpServletRequest req, Exception e) {
        e.printStackTrace();
        return new ErrorInfo<>(777,e.toString());
    }
}
