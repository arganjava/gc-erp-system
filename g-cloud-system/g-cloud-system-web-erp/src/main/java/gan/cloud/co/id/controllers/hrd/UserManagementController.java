package gan.cloud.co.id.controllers.hrd;

        import gan.cloud.co.id.models.security.User;
        import gan.cloud.co.id.repository.security.UserRepository;
        import org.springframework.beans.factory.annotation.Autowired;
        import org.springframework.stereotype.Controller;
        import org.springframework.ui.ModelMap;
        import org.springframework.web.bind.annotation.RequestMapping;
        import org.springframework.web.bind.annotation.RequestMethod;

        import java.util.List;

/**
 * Created by Argan on 25/04/14.
 */
@Controller
public class UserManagementController {

    @Autowired
    private UserRepository userRepository;

    @RequestMapping(value = "/hrd/user-management", method = RequestMethod.GET)
    public String userManagement(ModelMap map){
        List<User> userList = userRepository.findAll();
        System.out.println("SIZE + "+userList.size());
        map.addAttribute("userList", userList);
        return "user-management";
    }

}
