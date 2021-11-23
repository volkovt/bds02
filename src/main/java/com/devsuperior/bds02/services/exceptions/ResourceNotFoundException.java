package com.devsuperior.bds02.services.exceptions;

public class ResourceNotFoundException extends RuntimeException {
	private static final long serialVersionUID = -452644164573589678L;

	public ResourceNotFoundException(String message) {
		super(message);
	}
}
