package kea.cinema.entities;

import antlr.collections.List;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.HashSet;

@Entity
@NoArgsConstructor //Laver en tom constructor uden attributter
@AllArgsConstructor//Laver det med alle attributter
@Getter
@Setter
public class Movie {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id; //change if id is not to be an int

    private String name;
    //En movie bliver vist i mange showings
    @OneToMany(mappedBy = "movie", fetch = FetchType.EAGER)
    private HashSet<Showing> showings = new HashSet<>();

    private String posterLink;

}
