package br.com.mendes.arch.infra.entity;

import br.com.mendes.arch.domain.User;
import org.springframework.stereotype.Service;

import java.util.HashMap;

@Service
public class UserEntityRepository{
    HashMap<Long, String> userEntityDB = new HashMap<>();

    public void save(User user){
        userEntityDB.put(user.getId(), user.getName());
    }

    public String getUserById(Long id){
        return userEntityDB.get(id);
    }
}
