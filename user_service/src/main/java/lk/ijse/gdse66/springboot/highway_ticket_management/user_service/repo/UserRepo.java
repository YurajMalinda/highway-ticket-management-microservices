package lk.ijse.gdse66.springboot.highway_ticket_management.user_service.repo;

import lk.ijse.gdse66.springboot.highway_ticket_management.user_service.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<User, String> {
}
