package br.com.mendes.arch.application.gateways;

import br.com.mendes.arch.domain.User;


public interface UserCaseGateway {
    void saveUser(User user);
    String findUserById(Long id);
}
