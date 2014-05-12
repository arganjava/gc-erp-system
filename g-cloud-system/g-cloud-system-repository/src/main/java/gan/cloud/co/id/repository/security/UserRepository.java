package gan.cloud.co.id.repository.security;

import gan.cloud.co.id.models.security.User;
import gan.cloud.co.id.repository.service.UserService;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.security.access.method.P;
import org.springframework.security.core.userdetails.UserDetails;

/**
 * Created by Argan on 17/04/14.
 */
public interface UserRepository extends PagingAndSortingRepository<User, Long>,UserService {

 @Query("SELECT u FROM User u where u.username=:username")
 public User loadUserByUsername(@Param("username") String username);

}
