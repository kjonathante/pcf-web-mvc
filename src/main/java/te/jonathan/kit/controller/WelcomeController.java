package te.jonathan.kit.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class WelcomeController {

    private static final Logger logger = LoggerFactory.getLogger(WelcomeController.class);

    @GetMapping(value = "/")
    public String welcome(Model model) {
        model.addAttribute("message", "Welcome");

        logger.info("Rendering home page.");

        return "index";
    }
}
