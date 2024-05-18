package tn.esprit.springproject.service;

import tn.esprit.springproject.entities.Inscription;

import java.util.List;

public interface IInscription {
    public Inscription addInscription(Inscription in);

    public Inscription updateInscription(Inscription in);

    public List<Inscription> getAllInscription();


    public Inscription getInscriptionById (Long numInscription);


    public void deleteInscription (Long numInscription);
    public Inscription addInscriptionAssingToskieur(Inscription in , Long numSK);
    public Inscription addInscriptionAndAssignToCours(Inscription inscription, Long numCours);




}
