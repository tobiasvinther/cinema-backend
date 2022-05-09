package kea.cinema.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class Hall {

    //Is id also hall name?
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    //A hall has many rows
   @OneToMany (mappedBy = "hall", fetch = FetchType.EAGER)
   private Set<Line> lines = new HashSet<>();

   //A hall can have many showings
   @OneToMany(mappedBy = "hall", fetch = FetchType.EAGER)
   private Set<Showing> showings = new HashSet<>();

    public Hall(int id, Set<Line> lines, Set<Showing> showings) {
        this.id = id;
        this.lines = lines;
        this.showings = showings;
    }
}
