package tn.esprit.springproject.restController;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.springproject.entities.SKieur;
import tn.esprit.springproject.service.ISkieur;

import java.util.List;

//bech nassnaa hajet l service
@AllArgsConstructor
@RestController

public class SkieurRestController {

    private ISkieur iSkieur;


@PostMapping("/addSk")
    public SKieur addSk(@RequestBody SKieur sk){

        return iSkieur.addSkieur(sk);

    }

@PutMapping("/updateSk")
    public SKieur updateSk(@RequestBody SKieur sk){

        return iSkieur.updateSkieur(sk);

    }

@GetMapping("/getAllSk")

    public List<SKieur> getAllSkieur(){
    return iSkieur.getAllSkieur();
    }


    @GetMapping("/getSkById/{numSk}")

    public SKieur getSkById(@PathVariable Long numSk){
        return iSkieur.getSkById(numSk);
    }


@DeleteMapping("/deleteSk/{numSk}")
    public void deleteSk(@PathVariable Long numSk){
       iSkieur.deleteSkieur(numSk);
    }
@GetMapping("/getskBynom/{nom}")
    public SKieur getskBynom(@PathVariable String nom)
    {
        return iSkieur.getskBynom(nom);
    }
}

