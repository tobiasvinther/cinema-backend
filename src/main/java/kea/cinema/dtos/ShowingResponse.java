package kea.cinema.dtos;

import kea.cinema.entities.Movie;
import kea.cinema.entities.Showing;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

@Getter
@Setter
@NoArgsConstructor
public class ShowingResponse {
    private LocalDate date;
    private LocalTime time;

    public ShowingResponse (Showing showing, boolean includeAll){
        this.date = showing.getDate();
        this.time = showing.getTime();
    }

    public static List<ShowingResponse> ShowingFromEntity(Set<Showing> showings){
        return showings.stream().map(showing -> new ShowingResponse(showing,false)).collect(Collectors.toList());
    }
}
