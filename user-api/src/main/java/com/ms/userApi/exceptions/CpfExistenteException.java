package com.ms.userApi.exceptions;

public class CpfExistenteException extends RuntimeException{

    public CpfExistenteException() {
        super("O CPF informado já existe na base de usuários cadastrados.");
    }
}
