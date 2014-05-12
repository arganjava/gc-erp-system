package gan.cloud.co.id.pos.controllers.admin;

import gan.cloud.co.id.repository.security.UserRepository;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
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

    private org.slf4j.Logger log = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private UserRepository userRepository;



    @RequestMapping(value = "/loginpage", method = RequestMethod.GET)
    public String loginPage(ModelMap modelMap) {

        return "/WEB-INF/jsp/login.jsp";
    }



}