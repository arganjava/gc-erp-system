package gan.cloud.co.id.controllers.commons_ui;

import gan.cloud.co.id.models.security.User;
import gan.cloud.co.id.repository.security.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by Achmad Nazmy
 * Senior Software Engineer | NetXcel Systems Pte Ltd
 * a.nazmy@gmail.com
 * nazmy@netxcel.com.sg | www.netxcel.com.sg
 */
@Controller
@SuppressWarnings("unchecked")
public class HomeController {


    @Autowired
    private UserRepository userRepository;



    @RequestMapping(value = "/loginpage", method = RequestMethod.GET)
    public String loginPage(ModelMap modelMap) {

        return "loginpage";
    }

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String index(ModelMap map){
        User user = (User) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        System.out.println("USERNYA : "+user.getRole().getName());

        if(user.getRole().getName().equals("GC_ADMIN")){
                return "admin-dashboard";

        }else{
        return "base.definition";
    }
    }

   /* @RequestMapping(value = "/admin-dashboard", method = RequestMethod.GET)
    public String adminDashboard(ModelMap modelMap) {

        return "admin-dashboard";
    }

*/

}