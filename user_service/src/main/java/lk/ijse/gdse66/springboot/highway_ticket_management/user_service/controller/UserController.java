package lk.ijse.gdse66.springboot.highway_ticket_management.user_service.controller;

import lk.ijse.gdse66.springboot.highway_ticket_management.user_service.dto.UserDTO;
import lk.ijse.gdse66.springboot.highway_ticket_management.user_service.service.UserService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/user")
public class UserController {
    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping
    public List<UserDTO> getAllUsers() {
        return userService.getAllUser();
    }

    @PostMapping
    public UserDTO saveUser(@RequestBody UserDTO userDTO) {
        return userService.saveUser(userDTO);
    }

    @PutMapping
    public void updateUser(@RequestBody UserDTO userDTO) {
        userService.updateUser(userDTO);
    }

    @DeleteMapping
    public void deleteUser(@RequestBody UserDTO userDTO) {
        userService.deleteUser(userDTO);
    }

    @GetMapping("/{id}")
    public UserDTO findUserById(@PathVariable String id) {
        return userService.findUserById(id);
    }
}
