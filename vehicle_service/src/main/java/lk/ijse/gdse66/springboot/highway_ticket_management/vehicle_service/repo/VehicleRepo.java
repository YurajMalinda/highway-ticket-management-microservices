package lk.ijse.gdse66.springboot.highway_ticket_management.vehicle_service.repo;

import lk.ijse.gdse66.springboot.highway_ticket_management.vehicle_service.entity.Vehicle;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VehicleRepo extends JpaRepository<Vehicle, String> {
    Vehicle findByLicensePlate(String licensePlate);
}
