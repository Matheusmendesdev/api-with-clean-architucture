package br.com.mendes.arch.controller;

import br.com.mendes.arch.application.gateways.UserCaseGateway;
import br.com.mendes.arch.domain.User;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("user")
public class UserController {

    private final UserCaseGateway userCaseRepository;

    public UserController(UserCaseGateway userCaseRepository) {
        this.userCaseRepository = userCaseRepository;
    }

    @PostMapping
    public String save(@RequestBody User user){
        userCaseRepository.saveUser(user);
        return "Save success!";
    }

    @GetMapping
    public String getUser(@RequestParam Long id){
        return userCaseRepository.findUserById(id);
    }

}
