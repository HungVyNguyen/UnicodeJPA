package com.example.unicodejpa.config;

import com.example.unicodejpa.model.Unicode;
import com.example.unicodejpa.unicodeRepository.UnicodeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.Set;

@RestController
public class Unicodetest {

    @Autowired
    UnicodeRepository unicodeRepository;


    @GetMapping("/char")
    public void characterlist() {
        Set<Character> unicodechars = Set.of('a', 'b', 'c', 'd');
        for (char c : unicodechars) {
            Unicode unicode1 = new Unicode();
            unicode1.setBogstav(c);
            unicode1.setUnicode((int) c);


            System.out.println("Tegn: " + unicode1.getBogstav() + ", Unicode: " + unicode1.getUnicode());

            unicodeRepository.save(unicode1);
            System.out.println(unicode1);


        }


    }
    @GetMapping("/unicode/start/{charStart}/{count}")
    public String getCharacters(@PathVariable char charStart, @PathVariable int count) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < count; i++) {
            char c = (char) (charStart + i);
            result.append("char=").append(c).append(" unicode=").append((int) c).append("\n");
        }
        return result.toString();
    }

}
