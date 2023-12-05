package mg.inclusiv.cdan.services;

import jakarta.transaction.Transactional;
import mg.inclusiv.cdan.entity.Produit;
import mg.inclusiv.cdan.repository.ProduitRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@Transactional
public class ProduitService {
    @Autowired
    private ProduitRepository produitRepository;

    public List<Produit> listAll(){
        return produitRepository.findAll();
    }

    public void save(Produit produit){
        produitRepository.save(produit);
    }

    public Produit get(long id){
        return produitRepository.findById(id).get();
    }

    public void delete(long id){
        produitRepository.deleteById(id);
    }
}
