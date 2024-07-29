package estudos.spring.final_deploy.service.impl;

import java.util.NoSuchElementException;

import org.springframework.stereotype.Service;

import estudos.spring.final_deploy.model.User;
import estudos.spring.final_deploy.service.UserService;
import estudos.spring.final_deploy.repository.UserRepository;

@Service
public class UserServiceImpl implements UserService{

    private final UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository){
        this.userRepository = userRepository;
    }

    @Override
    public User findById(Long id) {
        return userRepository.findById(id).orElseThrow(NoSuchElementException::new);
    }
    @Override
    public User create(User userToCreate) {
        if (userToCreate.getId() != null &&userRepository.existsById(userToCreate.getId())){
            throw new IllegalArgumentException("This User ID Already Exists.");
        }
        return null;
    }

}
