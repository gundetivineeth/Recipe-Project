package com.example.recipe.recipepreparation.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {

    @RequestMapping({"","/","index"})
    public String IndexPage()
    {
        return "index";
    }
}
