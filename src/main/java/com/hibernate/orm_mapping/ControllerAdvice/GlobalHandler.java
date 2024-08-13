package com.hibernate.orm_mapping.ControllerAdvice;

import com.hibernate.orm_mapping.Exception.UserNotFoundExcepiton;
import com.hibernate.orm_mapping.Models.OneToOne.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class GlobalHandler {
    @ExceptionHandler(UserNotFoundExcepiton.class)
    public ResponseEntity<User> UserByIdnotexception(UserNotFoundExcepiton userNotFoundExcepiton){



       return null;

    }

}
