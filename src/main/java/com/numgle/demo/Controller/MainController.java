package com.numgle.demo.Controller;

import com.numgle.demo.lib.Numgle;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
//@Controller
public class MainController {
    /*@RequestMapping(value="/")
    @ResponseStatus(value = HttpStatus.OK)
    public String main() {
        return "index.html";
    }*/

    @RequestMapping(value="/{id}")
    public String NumgleStart(@PathVariable String id) {
        return new Numgle().convertStringToNumgle(id);
    }
}
