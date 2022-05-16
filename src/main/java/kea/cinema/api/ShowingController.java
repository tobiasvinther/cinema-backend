package kea.cinema.api;

import kea.cinema.dtos.ShowingResponse;
import kea.cinema.services.ShowingService;
import org.springframework.web.bind.annotation.*;

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

    @GetMapping("api/order-tickets/{id}")
    public ShowingResponse getShowing(@PathVariable int id) throws Exception {
        return showingService.getShowingById(id);
    }
}
