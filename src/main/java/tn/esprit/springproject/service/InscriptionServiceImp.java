package tn.esprit.springproject.service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.springproject.entities.Cours;
import tn.esprit.springproject.entities.Inscription;
import tn.esprit.springproject.entities.SKieur;
import tn.esprit.springproject.repository.CoursRepository;
import tn.esprit.springproject.repository.InscriptionRepository;
import tn.esprit.springproject.repository.SkieurRepository;

import java.util.List;
@AllArgsConstructor
@Service
public class InscriptionServiceImp implements IInscription {

    private InscriptionRepository ir;
    private SkieurRepository skieurRepository;
    private CoursRepository coursRepository;
    @Override
    public Inscription addInscription(Inscription in) {
        return ir.save(in);
    }

    @Override
    public Inscription updateInscription(Inscription in) {
        return ir.save(in);
    }

    @Override
    public List<Inscription> getAllInscription() {
        return ir.findAll();
    }

    @Override
    public Inscription getInscriptionById(Long numInscription) {
        return ir.findById(numInscription).orElse(null);
    }

    @Override
    public void deleteInscription(Long numInscription) {
        ir.deleteById(numInscription);

    }

    @Override
    public Inscription addInscriptionAssingToskieur(Inscription inscription, Long numSk) {
        SKieur skieur = skieurRepository.findById(numSk).orElse(null);
        inscription.setSkieur(skieur);
        return ir.save(inscription);
    }
    @Override
    public Inscription addInscriptionAndAssignToCours(Inscription inscription, Long numCours) {
        Cours cours = coursRepository.findById(numCours).orElse(null);
        inscription.setCours(cours);
        return ir.save(inscription);
    }
}
