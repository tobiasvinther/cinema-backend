package kea.cinema.api;

import kea.cinema.services.ShowingService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin
@RestController
public class ShowingController {

    ShowingService showingService;

    public ShowingController(ShowingService showingService) {
        this.showingService = showingService;
    }

    @PatchMapping("api/order-tickets/{id}/{ticketAmount}")
    public void orderTickets(@PathVariable int id, @PathVariable int ticketAmount) throws Exception {
        showingService.subtractTickets(id, ticketAmount);
    }

}
