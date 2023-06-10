package cat.itacademy.barcelonactiva.MohamedAli.Bilal.s04.t01.n01.S04T01N01MohamedAliBilal.controllers;

import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
public class HelloWorldController {

    @GetMapping("/saluda")
    public String saluda(@RequestParam(value = "nom", defaultValue = "UNKNOWN") String nom){
        return String.format("Hola" + nom + " Estàs executant un projecte Maven");
    }

    @GetMapping(value = {"/saluda2", "/saluda2/{nom}"})
    @ResponseBody
    public String saluda2(@PathVariable Optional<String> nom){
        if (nom.isPresent()){
            return String.format("Hola" + nom.get() + " Estàs executant un projecte Maven");
        }else {
            return "Complete el campo nom";
        }
    }
}
