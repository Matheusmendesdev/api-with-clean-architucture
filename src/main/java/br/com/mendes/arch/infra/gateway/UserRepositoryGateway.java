package br.com.mendes.arch.infra.gateway;

import br.com.mendes.arch.application.gateways.UserCaseGateway;
import br.com.mendes.arch.domain.User;
import br.com.mendes.arch.infra.entity.UserEntityRepository;

public class UserRepositoryGateway implements UserCaseGateway {

    private final UserEntityRepository userEntityRepository;

    public UserRepositoryGateway(UserEntityRepository userEntityRepository) {
        this.userEntityRepository = userEntityRepository;
    }

    @Override
    public void saveUser(User user) {
        userEntityRepository.save(user);
    }

    @Override
    public String findUserById(Long id) {
        return userEntityRepository.getUserById(id);
    }
}
