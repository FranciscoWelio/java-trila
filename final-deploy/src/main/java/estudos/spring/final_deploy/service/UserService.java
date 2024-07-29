package estudos.spring.final_deploy.service;


import estudos.spring.final_deploy.model.User;

public interface UserService {
    User findById(Long id);

    User create(User userToCreate);
}
