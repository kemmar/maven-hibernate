package com.fiirb.peerius.web.Controller;

import com.fiirb.peerius.web.domain.User;
import com.fiirb.peerius.web.dao.UserManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import static org.springframework.web.bind.annotation.RequestMethod.GET;
import static org.springframework.web.bind.annotation.RequestMethod.POST;

@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserManager userManager;

    @RequestMapping(method = GET)
    public ModelAndView user() {
        return new ModelAndView("user", "command", new User());
    }

    @RequestMapping(method = POST)
    public ModelAndView createUser(@ModelAttribute User user) {

        try{
        userManager.persistUser(user);
        return new ModelAndView("userAdded", "message", "Your name has been stored successfully");
        }catch (Throwable e){
            return new ModelAndView("userAdded", "message", "Your name has failed to be stored");
        }

    }
}
