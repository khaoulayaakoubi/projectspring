package tn.esprit.springproject.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.springproject.entities.Inscription;

public interface InscriptionRepository extends JpaRepository<Inscription,Long> {

}
