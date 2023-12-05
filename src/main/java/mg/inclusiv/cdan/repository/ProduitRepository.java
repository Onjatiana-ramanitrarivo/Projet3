package mg.inclusiv.cdan.repository;

import mg.inclusiv.cdan.entity.Produit;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProduitRepository extends JpaRepository<Produit , Long> {
}
