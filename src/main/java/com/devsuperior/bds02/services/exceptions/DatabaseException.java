package com.devsuperior.bds02.services.exceptions;

public class DatabaseException extends RuntimeException {
	private static final long serialVersionUID = -5875601131836093723L;

	public DatabaseException(String message) {
		super(message);
	}
}
