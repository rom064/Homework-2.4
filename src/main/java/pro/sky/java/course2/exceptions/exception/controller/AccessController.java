package pro.sky.java.course2.exceptions.exception.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import pro.sky.java.course2.exceptions.exception.service.AccessService;

@RestController
public class AccessController {

    @GetMapping
    public static String access() {
        return "Введите логин и пароль";
    }

    @GetMapping("/access")
    public String showAccess() {
        return " Логин и пароль";
    }
}
