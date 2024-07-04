package lk.ijse.gdse66.springboot.highway_ticket_management.ticket_service.repo;

import lk.ijse.gdse66.springboot.highway_ticket_management.ticket_service.entity.Ticket;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TicketRepo extends JpaRepository<Ticket, String> {
}
