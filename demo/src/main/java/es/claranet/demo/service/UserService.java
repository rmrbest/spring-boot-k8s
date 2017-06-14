package es.claranet.demo.service;

import es.claranet.demo.domain.User;
import es.claranet.demo.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by raul on 12/06/17.
 */
@Service
public class UserService implements IUserService{

    private final UserRepository userRepository;

    public UserService(final UserRepository userRepository) {
        this.userRepository = userRepository;
    }


    @Override
    public List<String> getList() {
        List<String> users = new ArrayList<>();
        for( User user : this.userRepository.findAll()) {
            users.add(user.toJSON());
        }
        return users;
    }
}
