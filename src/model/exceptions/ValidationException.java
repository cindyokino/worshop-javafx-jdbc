package model.exceptions;

import java.util.HashMap;
import java.util.Map;

public class ValidationException extends RuntimeException {
	
	private static final long serialVersionUID = 1L;
	
	private Map<String, String> errors = new HashMap<>(); //o Map é uma colecao de pares CHAVE e VALOR
	
	public ValidationException(String msg) {// forcar a instanciacao da excecao com String
		super(msg);
	}
	
	public Map<String, String> getErrors() {
		return errors;
	}
	
	public void addError(String fieldName, String errorMessage) {
		errors.put(fieldName, errorMessage);
	}
}
