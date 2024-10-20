package br.com.mendes.arch.application.cases;

import br.com.mendes.arch.domain.User;

import java.util.UUID;


public interface IUserCase {
    void save(User user);
    String findById(Long id);
}
