package gan.cloud.co.id.repository.service.serviceImpl;

import gan.cloud.co.id.models.security.User;
import gan.cloud.co.id.repository.security.UserRepository;
import gan.cloud.co.id.repository.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Argan on 19/04/14.
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;


    @Override
    public List<User> findAll() {
        return userRepository.findAll();
    }
}
