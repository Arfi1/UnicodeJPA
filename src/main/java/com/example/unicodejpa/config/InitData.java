package com.example.unicodejpa.config;

import com.example.unicodejpa.model.Unicode;
import com.example.unicodejpa.repository.UnicodeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.HashSet;
import java.util.Set;

@Component
public class InitData implements CommandLineRunner {

    @Autowired
    UnicodeRepository unicodeRepository;


    @Override
    public void run(String... args) throws Exception {

        Set<Character> characters = new HashSet<>();

        characters.add('a');
        characters.add('b');
        characters.add('c');
        characters.add('d');
        characters.add('t');

        for(Character c : characters) {
            Unicode unicode = new Unicode();
            unicode.setUnicode((int) c);
            unicode.setBogstav(c);
            unicode.setName("Character " + c);
            unicode.setDescription("Description for " + c);

            unicodeRepository.save(unicode);
        }

    }
}
