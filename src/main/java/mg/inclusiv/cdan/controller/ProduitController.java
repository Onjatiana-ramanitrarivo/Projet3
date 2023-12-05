package mg.inclusiv.cdan.controller;

import mg.inclusiv.cdan.entity.Produit;
import mg.inclusiv.cdan.services.ProduitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;


@Controller
@RequestMapping("/produit")
public class ProduitController {
    @Autowired
    ProduitService produitService;
    @GetMapping("/list")
    public String allProduit(Model model){

        model.addAttribute("produit",new Produit());
        model.addAttribute("produits",produitService.listAll());
        return "index";
    }

    @PostMapping("/add")
    public String addProduit(@ModelAttribute Produit produit, Model model){

        produitService.save(produit);
        model.addAttribute("produit",new Produit());
        model.addAttribute("produits",produitService.listAll());

        return "index";
    }

}
