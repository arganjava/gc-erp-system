package gan.cloud.co.id.pos.controllers.security;

import gan.cloud.co.id.models.security.User;
import gan.cloud.co.id.repository.security.UserRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class SecurityService implements UserDetailsService {
    /*------------------------------ Fields ------------------------------*/
    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private UserRepository userRepository;

    @Override
    public UserDetails loadUserByUsername(String s) throws UsernameNotFoundException, DataAccessException {
        logger.info("Start Load By Username[" + s + "]");
        System.out.println("FIND");

        User o = userRepository.loadUserByUsername(s);
        if (o != null) {
            logger.info("End Load By Username[" + s + "] Found");
            return o;
        } else {
            logger.info("End Load By Username[" + s + "] Not Found");
            throw new UsernameNotFoundException("User Not Found");
        }

       /* try {
            if (o != null) {
                logger.info("End Load By Username[" + s + "] Found");
                return o;
            } else {
                logger.info("End Load By Username[" + s + "] Not Found");
                throw new UsernameNotFoundException("User Not Found");
            }
        } catch (Exception x) {
            logger.error("Error Load By Username[" + s + "] Not Found", x);
            throw new UsernameNotFoundException(x.getMessage());
        }*/
    }



}
