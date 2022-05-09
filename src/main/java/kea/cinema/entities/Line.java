package kea.cinema.entities;

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
public class Line {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    //Row name example with seat number: H10
    private char rowName;

    //A rows ID can be used in many halls
    @ManyToOne
    private Hall hall;

    //A row have many seats
    @OneToMany(mappedBy = "line", fetch = FetchType.EAGER)
    private Set<Seat> seats = new HashSet<>();;

    public Line(char rowName){
        this.rowName = rowName;
    }

}
