package tn.esprit.springproject.service;

import tn.esprit.springproject.entities.SKieur;

import java.util.List;

public interface ISkieur {

    public SKieur addSkieur(SKieur sk);

    public SKieur updateSkieur(SKieur sk);

    public List<SKieur> getAllSkieur();


    public SKieur getSkById (Long numSk);


    public void deleteSkieur (Long numSk);
    public SKieur getskBynom (String nom);


}
