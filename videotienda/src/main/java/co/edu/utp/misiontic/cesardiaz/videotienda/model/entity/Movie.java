package co.edu.utp.misiontic.cesardiaz.videotienda.model.entity;

import javax.persistence.Entity; // JPA
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import lombok.Data;

@Entity
@Data
public class Movie {

    @Id
    private Long code;

    private String name;
    private String description;
    private Integer length;
    private String imageUrl;

    @ManyToOne
    private Category category;
    
}
