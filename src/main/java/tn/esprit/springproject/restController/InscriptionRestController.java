package tn.esprit.springproject.restController;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.springproject.entities.Inscription;
import tn.esprit.springproject.service.IInscription;

import java.util.List;

@AllArgsConstructor
@RestController
public class InscriptionRestController {


    private IInscription iInscription;


    @PostMapping("/addInscri")
    public Inscription addInscri(@RequestBody Inscription inscri){

        return iInscription.addInscription(inscri);

    }

    @PutMapping("/updateInscri")
    public Inscription updateInscri(@RequestBody Inscription inscri){

        return iInscription.updateInscription(inscri);

    }

    @GetMapping("/getAllInscri")

    public List<Inscription> getAllInscription(){
        return iInscription.getAllInscription();
    }


    @GetMapping("/getInscriById/{numInscri}")

    public Inscription getInscriById(@PathVariable Long numInscri){
        return iInscription.getInscriptionById(numInscri);
    }


    @DeleteMapping("/deleteInscri/{numInscri}")
    public void deleteInscri(@PathVariable Long numInscri){
        iInscription.deleteInscription(numInscri);
    }

    @PostMapping("/addInscriptionAndAssignToSkieur/{numSk}")
    public Inscription addInscriptionAndAssignToSkieur (@RequestBody Inscription inscription, @PathVariable Long numSk){
        return iInscription.addInscriptionAssingToskieur(inscription, numSk);
    }
    @PostMapping("/addInscriptionAndAssignToCours/{numCours}")
    public Inscription addInscriptionAndAssignToCours(@RequestBody Inscription inscription, @PathVariable Long numCours){
        return iInscription.addInscriptionAndAssignToCours(inscription, numCours);
    }
}
