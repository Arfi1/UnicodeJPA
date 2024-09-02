package com.example.unicodejpa.controllers;

import com.example.unicodejpa.model.Unicode;
import com.example.unicodejpa.repository.UnicodeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.List;

@org.springframework.web.bind.annotation.RestController
public class RestController {

    @Autowired
    private UnicodeRepository unicodeRepository;

    @GetMapping("/unicode/{i}")
    public String unicodeToChar(@PathVariable int i) {
        char c = (char) i;
        return "unicode=" + i + " char=" + c;
    }


    // her benytter du denne URL == http://localhost:8080/unicode/a/97
    // for at tilgå nedenstående endpoint
    @GetMapping("/unicode/{bogstav}/{antal}")
    public List<String> getCharacters(
            @PathVariable String bogstav,
            // antal er hvor meget der printes ud
            // når du skriver URL'en: http://localhost:8080/unicode/a/97
            // så er det sidste antallet som printes ud, så der printes 97 resultater ud
            @PathVariable int antal) {

        // her laver du en tom liste af String,
        // for at gemme resultaterne af bogstaverne og deres Unicode-værdi
        char startChar = bogstav.charAt(0);
        List<String> result = new ArrayList<>();

        if (antal <=0) {
            throw  new IllegalArgumentException("antal skal være størrer end 0");
        }

        for (int i = 0; i < antal; i++) {
            char currentChar = (char) (startChar + i);
            Unicode unicode = new Unicode();
            unicode.setUnicode((int) currentChar);
            unicode.setBogstav(currentChar);
            unicode.setName("Character " + currentChar);
            unicode.setDescription("Description for " + currentChar);

            unicodeRepository.save(unicode);

            result.add("char= " + currentChar + " unicode=" + (int) currentChar);
        }

        return  result;
    }



}
