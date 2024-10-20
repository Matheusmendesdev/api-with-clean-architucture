package br.com.mendes.arch.config;

import br.com.mendes.arch.application.cases.UserCaseImpl;
import br.com.mendes.arch.application.gateways.UserCaseGateway;
import br.com.mendes.arch.infra.gateway.UserRepositoryGateway;
import br.com.mendes.arch.infra.entity.UserEntityRepository;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class UserConfig {

    @Bean
    public UserCaseImpl userCase(UserCaseGateway userCaseRepository){
        return new UserCaseImpl(userCaseRepository);
    }

    @Bean
    public UserRepositoryGateway userCaseRepository(UserEntityRepository userEntityRepository){
        return new UserRepositoryGateway(userEntityRepository);
    }
}
