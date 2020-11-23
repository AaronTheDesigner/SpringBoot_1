package com.newsletter.aaron.character;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class CharacterController {

    @Autowired
    private CharacterRepository characterRepository;

    @GetMapping(value="/")
    public String index(Character character) {
        return "character/index";
    }
    
    @GetMapping(value="/characters")
    public String list() {
        return "character/characters";
    }


    @GetMapping(value="/result")
    public String result() {
        return "character/result";
    }


    private Character character;
    @PostMapping
    public String addNewCharacter(Character character, Model model) {
        characterRepository.save(new Character(
            character.getFirstName(),
            character.getLastName(),
            character.getClassType(),
            character.getUserName(),
            character.getCreated()
        ));
        model.addAttribute("firstName", character.getFirstName());
        model.addAttribute("lastName", character.getLastName());
        model.addAttribute("classType", character.getClassType());
        model.addAttribute("userName", character.getUserName());
        return "character/result";
    }
    
}
