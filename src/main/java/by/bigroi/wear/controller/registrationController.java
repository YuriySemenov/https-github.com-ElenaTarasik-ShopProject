package by.bigroi.wear.controller;

import by.bigroi.wear.model.cust.Customer;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import javax.validation.Valid;
import java.util.Locale;

@Controller
public class registrationController {

    @GetMapping("/")
    public String welcome() {
        return "welcomePage";
    }
}

