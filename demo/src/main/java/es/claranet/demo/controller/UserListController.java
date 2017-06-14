package es.claranet.demo.controller;

import es.claranet.demo.service.UserService;
import jdk.nashorn.internal.parser.JSONParser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by raul on 12/06/17.
 */
@RestController
public class UserListController {


    @Autowired
    private final UserService userService;

    @Autowired
    public UserListController(final UserService userService) {
        this.userService = userService;
    }

    @RequestMapping(value = {"", "/users"}, method = RequestMethod.GET, produces = "application/json;charset=utf-8")
    @CrossOrigin(origins = "*")
    public String listUsers() throws Exception {
        return this.userService.getList().toString();
    }
}
