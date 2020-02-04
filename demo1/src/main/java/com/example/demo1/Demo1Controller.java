package com.example.demo1;

import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.client.RestOperations;

@Controller
@AllArgsConstructor
public class Demo1Controller {

    @Autowired
    @Qualifier("demo2RestOptions")
    private final RestOperations demo2RestOptions;

    @GetMapping("/index")
    public String index() {
        return "index";
    }

    @GetMapping("/demo2list")
    public String demo2list(Model model) {
        var uri = "/items/list";
        model.addAttribute("demo2list", demo2RestOptions.getForObject(uri, String.class));
        return "demo2list";
    }
}
