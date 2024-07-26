package welio.api.first.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import welio.api.first.model.Usuario;
import welio.api.first.repository.UserRepository;

@RestController
@RequestMapping("/users")
public class UserController {
    @Autowired
    private UserRepository repository;
    @GetMapping
    public List<Usuario> getUser(){
        return repository.findAll();
    }
    @GetMapping("/{username}")
    public Usuario getOne(@PathVariable("username") String username){
        return repository.findUsername(username);
    }
    @DeleteMapping("/{id}")
    public void delete(@PathVariable("id") Integer id){
        repository.deleteById(id);
    }
    @PostMapping
    public void postUsers(@RequestBody Usuario user){
        repository.save(user);
    }
}
