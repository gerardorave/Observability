package corp.xebia.controller;


import corp.xebia.dto.UserDTO;
import corp.xebia.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@RestController
@RequestMapping(path = "/api/v1/user")
public class UserController {

    private static final Logger logger = LoggerFactory.getLogger(UserController.class);
    private final UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/{id_user}")
    public String getUser(@PathVariable("id_user") String idUser){
        logger.info("getUser has Been Called.");
        return "hello User " + idUser;
    }

    @GetMapping("/findAll")
    public List<UserDTO> getAllUsers(){
        logger.info("find All users.");
        return userService.findAllUsers();
    }
}
