package gan.cloud.co.id;

import gan.cloud.co.id.repository.security.UserRepository;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by Argan on 18/04/14.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath*:META-INF/spring/**/applicationContext*.xml")
@ActiveProfiles({"repository", "LOC"})
public class Test {


    @Autowired
    private UserRepository userRepository;

    @org.junit.Test
    public void findNoOfAdminUser() {
        System.out.println("No of Admin User :" + userRepository.findAll().size());
    }
}
