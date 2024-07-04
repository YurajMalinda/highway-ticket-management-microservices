package lk.ijse.gdse66.springboot.highway_ticket_management.vehicle_service.service.impl;

import lk.ijse.gdse66.springboot.highway_ticket_management.vehicle_service.dto.VehicleDTO;

import java.util.List;

public interface VehicleService {
    List<VehicleDTO> getAllVehicles();
    VehicleDTO saveVehicle(VehicleDTO vehicle);
    void updateVehicle(VehicleDTO vehicle);
    void deleteVehicle(VehicleDTO vehicle);
    VehicleDTO findVehicleByLicensePlate(String licensePlate);
}
