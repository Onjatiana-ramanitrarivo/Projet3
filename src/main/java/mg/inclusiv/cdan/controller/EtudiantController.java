package mg.inclusiv.cdan.controller;

import mg.inclusiv.cdan.entity.Etudiant;
import mg.inclusiv.cdan.repository.EtudiantRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/etudiant")
public class EtudiantController {
    @Autowired
    EtudiantRepository etudiantRepository;

    @GetMapping("/list")
    public List<Etudiant> etudiants(){
        return etudiantRepository.findAll();
    }

    @GetMapping("/list/{nom}")
    public List<Etudiant> etudiantByNom(@PathVariable("nom") String nom){
        return etudiantRepository.findByNometudiant(nom);
    }



}
