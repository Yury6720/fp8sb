package org.kuzminski.fp8sb.controllers;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.kuzminski.fp8sb.DAO.UserDAO;
import org.kuzminski.fp8sb.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@AllArgsConstructor
@NoArgsConstructor
@RequestMapping("/users")
public class SController {
    @Autowired
    @Qualifier ("userDAO")
    private UserDAO userDAO;

    @GetMapping("/all")
    @ResponseStatus(HttpStatus.OK)
    public ResponseEntity<List<User>> getUserList() {
        return new ResponseEntity(userDAO.findAll(), HttpStatus.OK);
    }

}