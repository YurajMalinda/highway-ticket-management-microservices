package lk.ijse.gdse66.springboot.highway_ticket_management.payment_service.service.impl;

import lk.ijse.gdse66.springboot.highway_ticket_management.payment_service.dto.PaymentDTO;

import java.util.List;

public interface PaymentService {
    List<PaymentDTO> getAllPayments();
    PaymentDTO savePayment(PaymentDTO paymentDTO);
    void updatePayment(PaymentDTO paymentDTO);
    void deletePayment(PaymentDTO paymentDTO);
    PaymentDTO findPaymentById(String id);
}
