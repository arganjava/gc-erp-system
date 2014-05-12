package gan.cloud.co.id.pos.controllers.admin;

import gan.cloud.co.id.repository.security.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by Argan on 17/04/14.
 */
@Controller
public class IndexController {
    @Autowired
    private UserRepository userRepository;

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String index(ModelMap map){

        map.addAttribute("text", userRepository.findAll());
        return "/WEB-INF/jsp/index.jsp";
    }

}
