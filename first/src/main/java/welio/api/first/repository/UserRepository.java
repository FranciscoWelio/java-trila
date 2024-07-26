package welio.api.first.repository;

import java.util.ArrayList;
import java.util.List;


import org.springframework.stereotype.Repository;

import welio.api.first.model.Usuario;

@Repository
public class UserRepository {
    public void save(Usuario user){
        if(user.getId()==null){
            System.out.println("Save - Usuário sendo salvo no repositorio");
        }else{
            System.out.println("Update - Usuário sendo atualizado no repositorio");
        }
        System.out.println(user);
    }
    public void deleteById(Integer id){
        System.out.println(String.format("DELETE/id - Recebendo Id: %d para remoção", id));
        System.out.println(id);
    }
    public List<Usuario> findAll(){
        System.out.println();
        List<Usuario> usuario = new ArrayList<>();
        usuario.add(new Usuario("", "Senha"));
        usuario.add(new Usuario("", "SenhaMaster"));
        return usuario;
    }
    public Usuario findById(Integer id){
        System.out.println(String.format("FIND/id - %d para localizar", id));
        return new Usuario("", "senha");
    }
    public Usuario findUsername(String username){
        System.out.println(String.format("FIND/Username - pesquisando %s ", username));
        return new Usuario("", "Senha");
    }
}
