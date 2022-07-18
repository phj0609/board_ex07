package me.hyun.common;

import org.springframework.beans.TypeMismatchException;
import org.springframework.http.HttpStatus;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.client.HttpClientErrorException.BadRequest;
import org.springframework.web.servlet.NoHandlerFoundException;

@ControllerAdvice
public class CommonExceptionHandler {

	@ExceptionHandler(NoHandlerFoundException.class)
	@ResponseStatus(HttpStatus.NOT_FOUND)
	public String notFoundPage(NoHandlerFoundException exception, Model model) {
		System.out.println(exception.getRequestURL());
		model.addAttribute("url", exception.getRequestURL());
		return "errorPage/_404";
	}
	
	@ExceptionHandler(TypeMismatchException.class)
	@ResponseStatus(HttpStatus.BAD_REQUEST)
	public String badRequestHandler() {
		return "errorPage/_400";
	}
}
