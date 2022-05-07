package br.com.mendes.estudo.services.exceptions;


public class DataIntegrityViolationException extends RuntimeException{

    public DataIntegrityViolationException(String message){
        super(message);
    }

}
