package com.likelion.lionlib.exception;

public class AlreadyExistEmailException extends RuntimeException {
    public AlreadyExistEmailException() {
        super("이미 존재하는 이메일입니다.");
    }

    public AlreadyExistEmailException(String email) {
        super("Email:" + email + "이미 존재하는 이메일입니다.");
    }
}
