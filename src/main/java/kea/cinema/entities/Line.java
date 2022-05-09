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
    @OneToMany(mappedBy = "lines", fetch = FetchType.EAGER)
    private Set<Hall> lines = new HashSet<>();

    //A row have many seats
    @ManyToOne
    @JoinColumn(name = "seat_ID")
    private Seat seats;

    public Line(char rowName){
        this.rowName = rowName;
    }

}
