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
public class Seat {

    //Is id also seat number?
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    //Seats number repeats for every row of seats
    @ManyToOne
    private Line line;

    public Seat(int id) {
        this.id = id;
    }
}
