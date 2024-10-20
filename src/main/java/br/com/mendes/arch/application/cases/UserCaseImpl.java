package br.com.mendes.arch.application.cases;

import br.com.mendes.arch.application.gateways.UserCaseGateway;
import br.com.mendes.arch.domain.User;

public class UserCaseImpl implements IUserCase{

    private final UserCaseGateway userCaseRepository;

    public UserCaseImpl(UserCaseGateway userCaseRepository) {
        this.userCaseRepository = userCaseRepository;
    }

    @Override
    public void save(User user) {
        userCaseRepository.saveUser(user);
    }

    @Override
    public String findById(Long id) {
        return userCaseRepository.findUserById(id);
    }
}
