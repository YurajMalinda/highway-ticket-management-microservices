package lk.ijse.gdse66.springboot.highway_ticket_management.payment_service.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class PaymentDTO {
    private String id;
    private String ticketId;
    private String userId;
    private double amount;
    private String paymentDate;
    private String status;
}

