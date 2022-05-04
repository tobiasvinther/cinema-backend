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
//@AllArgsConstructor//Laver det med alle attributter
@Getter
@Setter
public class Movie {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String name;

    @Column(name = "posterlink")
    private String posterLink;

    //En movie bliver vist i mange showings
    @OneToMany(mappedBy = "movie", fetch = FetchType.EAGER)
    private Set<Showing> showings = new HashSet<>();

    public Movie(int id, String name, String posterLink) {
        this.id = id;
        this.name = name;
        this.posterLink = posterLink;
    }

    public void addShowing(Showing showing) {
        showings.add(showing);
    }
}
