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
   @ManyToOne
   @JoinColumn(name = "line_ID")
   private Line line;

   //A hall can have many showings
   @OneToMany(mappedBy = "hall", fetch = FetchType.EAGER)
   private Set<Showing> showings = new HashSet<>();

}
