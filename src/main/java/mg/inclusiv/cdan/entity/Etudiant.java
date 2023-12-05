package mg.inclusiv.cdan.entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@NoArgsConstructor
@Entity
public class Etudiant implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idetudiant;
    @Column
    private String nometudiant;
    @Column
    private String prenometudiant;
    @Column
    private String contactetudiant;
    @Column
    private String adresseetudiant;
    @Column String statusetudiant;
}