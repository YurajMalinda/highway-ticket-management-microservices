package lk.ijse.gdse66.springboot.highway_ticket_management.ticket_service.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Ticket {
    @Id
    private String id;
    private String userId;
    private String vehicleId;
    private String issueDate;
    private String status;
}
