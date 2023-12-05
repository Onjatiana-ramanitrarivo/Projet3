package mg.inclusiv.cdan.entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@NoArgsConstructor
@Entity
public class Formateur implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idformateur;
    @Column
    private String nomformateur;
    @Column
    private String prenomformateur;
    @Column
    private String contactformateur;
    @Column
    private String adresseformateur;
    @Column
    private String statusformateur;
}
