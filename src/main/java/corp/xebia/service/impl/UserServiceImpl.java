package corp.xebia.service.impl;

import corp.xebia.controller.UserController;
import corp.xebia.dto.UserDTO;
import corp.xebia.model.User;
import corp.xebia.repository.UserRepository;
import corp.xebia.service.UserService;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;
    private final ModelMapper modelMapper;
    private static final Logger logger = LoggerFactory.getLogger(UserServiceImpl.class);
    @Autowired
    public UserServiceImpl(UserRepository userRepository, ModelMapper modelMapper) {
        this.userRepository = userRepository;
        this.modelMapper = modelMapper;
    }

    public List<UserDTO> findAllUsers() {
        logger.info("find All users service method: findAllUsers.");
        return modelMapper.map(userRepository.findAll(), new TypeToken<List<UserDTO>>() {
        }.getType());
    }
}
