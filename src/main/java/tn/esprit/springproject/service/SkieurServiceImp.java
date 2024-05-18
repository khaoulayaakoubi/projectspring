package tn.esprit.springproject.service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.springproject.entities.SKieur;
import tn.esprit.springproject.repository.SkieurRepository;

import java.util.List;
@AllArgsConstructor
@Service
public class SkieurServiceImp implements ISkieur {

    private SkieurRepository skr;
    @Override
    public SKieur addSkieur(SKieur sk) {
        return skr.save(sk);
    }

    @Override
    public SKieur updateSkieur(SKieur sk) {
        return skr.save(sk);
    }

    @Override
    public List<SKieur> getAllSkieur() {
        return skr.findAll();
    }

    @Override
    public SKieur getSkById(Long numSk) {
        return skr.findById(numSk).orElse(null);
    }

    @Override
    public void deleteSkieur(Long numSk) {
        skr.deleteById(numSk);

    }

    @Override
    public SKieur getskBynom(String nom) {
        return skr.findByNomS(nom);
    }
}
