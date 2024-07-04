package lk.ijse.gdse66.springboot.highway_ticket_management.ticket_service.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class TicketDTO {
    private String id;
    private String userId;
    private String vehicleId;
    private String issueDate;
    private String status;
}
