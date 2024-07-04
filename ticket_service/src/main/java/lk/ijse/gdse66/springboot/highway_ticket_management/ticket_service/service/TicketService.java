package lk.ijse.gdse66.springboot.highway_ticket_management.ticket_service.service;

import lk.ijse.gdse66.springboot.highway_ticket_management.ticket_service.dto.TicketDTO;

import java.util.List;

public interface TicketService {
    List<TicketDTO> getAllTickets();
    TicketDTO saveTicket(TicketDTO ticketDTO);
    void updateTicket(TicketDTO ticketDTO);
    void deleteTicket(TicketDTO ticketDTO);
    void updateTicketStatus(String ticketId, String status);
    TicketDTO findTicketById(String id);
}
