package tn.esprit.spring.RestControllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import tn.esprit.spring.Services.IServices;

@RestController
public class RestControllers {
    @Autowired
    IServices is;
}
