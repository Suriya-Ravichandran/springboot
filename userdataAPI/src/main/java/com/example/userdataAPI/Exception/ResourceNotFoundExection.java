package com.example.userdataAPI.Exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value=HttpStatus.NOT_FOUND)
public class ResourceNotFoundExection extends RuntimeException{
		public ResourceNotFoundExection(String message) {
			super(message);
		}
}
