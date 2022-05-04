package kea.cinema.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@NoArgsConstructor //Laver en tom constructor uden attributter
@AllArgsConstructor//Laver det med alle attributter
@Getter
@Setter
public class Movie {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String name;

    //En movie bliver vist i mange showings
    @OneToMany(mappedBy = "movie", fetch = FetchType.EAGER)
    private Set<Showing> showings = new HashSet<>();

    private String posterLink;

}
