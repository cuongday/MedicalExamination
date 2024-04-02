package com.MedicalExamination.Nhom3;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController 
public class LoginController {

    @GetMapping("/")
    public String homePage(){
        return "hello con con của bố";
    }

}
