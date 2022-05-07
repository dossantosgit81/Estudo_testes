package br.com.mendes.estudo.services.exceptions;

public class ObjectNotFoundException extends RuntimeException{

    public ObjectNotFoundException(String message){
        super(message);
    }
}
