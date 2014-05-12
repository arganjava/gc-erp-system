package gan.cloud.co.id.pos.controllers.security;

import gan.cloud.co.id.models.security.User;
import org.springframework.security.core.Authentication;
import org.springframework.security.web.authentication.AuthenticationSuccessHandler;
import org.springframework.stereotype.Service;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by Achmad Nazmy
 * Senior Software Engineer | NetXcel Systems Pte Ltd
 * a.nazmy@gmail.com
 * nazmy@netxcel.com.sg | www.netxcel.com.sg
 */

@Service("customAuthenticationSuccessHandler")
public class CustomAuthenticationSuccessHandler implements AuthenticationSuccessHandler {


    @Override
    public void onAuthenticationSuccess(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Authentication authentication) throws IOException, ServletException {

        if (authentication.getPrincipal() instanceof User) {

            User loggedUser = (User) authentication.getPrincipal();
           /* if (loggedUser.getRole() != null) {
                httpServletRequest.getSession().setAttribute("activity", activity);
            }*/
            System.out.println(" LOGED : "+loggedUser.getUsername());
        }


        httpServletResponse.sendRedirect(httpServletRequest.getContextPath() + "/");
    }
}
