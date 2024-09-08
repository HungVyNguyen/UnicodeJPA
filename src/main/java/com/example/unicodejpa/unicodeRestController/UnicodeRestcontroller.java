package com.example.unicodejpa.unicodeRestController;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UnicodeRestcontroller {





    @GetMapping("/unicode/{i}")
    public String unicodeToChar(@PathVariable int i){
        char c = (char) i;
        return "unicode=" + i +"char=" + c;
    }
    @GetMapping("/unicode1/{c}")
    public String unicodeToChar(@PathVariable char c){
        //char c = (char) i;
        int i = c;
        return "unicode=" + i +"char=" + c;
    }
}
