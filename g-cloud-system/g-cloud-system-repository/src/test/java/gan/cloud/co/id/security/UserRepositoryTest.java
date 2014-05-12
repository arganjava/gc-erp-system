package gan.cloud.co.id.security;

import gan.cloud.co.id.models.security.Role;
import gan.cloud.co.id.models.security.User;
import gan.cloud.co.id.repository.security.AccessRepository;
import gan.cloud.co.id.repository.security.RoleRepository;
import gan.cloud.co.id.repository.security.UserRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by Argan on 08/04/14.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath*:META-INF/spring/**/applicationContext*.xml")
@ActiveProfiles({"repository", "LOC","security"})
public class UserRepositoryTest {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private AccessRepository accessRepository;

    @Autowired
    private RoleRepository roleRepository;

    @Autowired
    private PasswordEncoder passwordEncoder;




    @Test
    public void findNoOfAdminUser() {
        System.out.println("No of Admin User :" + userRepository.findAll());
    }

    @Test
    public void insert() {
        System.out.println("FINDALL : "+userRepository.findAll());
        Role roleAdmin = new Role("GC_PURCHASE", "GC Purchase");

        roleRepository.save(roleAdmin);


        User usrAdmin = new User();
        usrAdmin.setFullname("StarHub Super Admin");
        usrAdmin.setEmail("arganjava@gmail.com");
        usrAdmin.setRole(roleAdmin);
        usrAdmin.setUsername("arganjava@gmail.com");
        String encode = passwordEncoder.encode("123");
        usrAdmin.setPassword(encode);
        userRepository.save(usrAdmin);


    }

}
