package gan.cloud.co.id.repository.security;

import gan.cloud.co.id.models.security.Role;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;


/**
 * Created by Deny Prasetyo,S.T
 * Java(Script) and Rails Developer
 * Software Engineer | PT. NetXcel Systems Indonesia
 * jasoet87@gmail.com
 * dprasetyo@netxcel.com.sg | www.netxcel.com.sg
 * <p/>
 * http://github.com/jasoet
 * http://bitbucket.com/jasoet
 *
 * @jasoet
 */


public interface RoleRepository extends PagingAndSortingRepository<Role, Long> {

    @Query("SELECT o FROM Role o WHERE o.name=:name")
    Role findByName(@Param("name") String name);


}
