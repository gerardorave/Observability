package corp.xebia.service;


import corp.xebia.dto.UserDTO;

import java.util.List;

public interface UserService {

    List<UserDTO> findAllUsers();
}
