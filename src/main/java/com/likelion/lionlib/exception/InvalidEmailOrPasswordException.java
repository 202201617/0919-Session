package com.likelion.lionlib.exception;

public class InvalidEmailOrPasswordException extends RuntimeException {
    public InvalidEmailOrPasswordException() {
        super("email이나 password가 유효하지 않습니다.");
    }

    public InvalidEmailOrPasswordException(String email) {
        super("email이나 password가 유효하지 않습니다.");
    }
}
