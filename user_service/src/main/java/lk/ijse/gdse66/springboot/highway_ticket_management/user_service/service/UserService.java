package lk.ijse.gdse66.springboot.highway_ticket_management.user_service.service;

import lk.ijse.gdse66.springboot.highway_ticket_management.user_service.dto.UserDTO;

import java.util.List;

public interface UserService {
    List<UserDTO> getAllUser();
    UserDTO saveUser(UserDTO userDTO);
    void updateUser(UserDTO userDTO);
    void deleteUser(UserDTO userDTO);
    UserDTO findUserById(String id);
}
