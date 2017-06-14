package es.claranet.demo.controller;

import es.claranet.demo.domain.User;
import es.claranet.demo.service.UserService;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import java.util.ArrayList;
import java.util.List;

import static org.mockito.Mockito.when;

/**
 * Created by raul on 12/06/17.
 */
@RunWith(MockitoJUnitRunner.class)
public class UserListControllerTest {


    private final String response = "[{\"id\":\"Angel\",\"surname\":\"Perez\"}, {\"id\":\"Marc\",\"surname\":\"Casin\"}, {\"id\":\"Matthieu\",\"surname\":\"Boret\"}, {\"id\":\"Raul\",\"surname\":\"Mesa\"}]";

    @Mock
    private UserService userService;

    private UserListController userListController;

    public void setUp() throws Exception {
        this.userListController = userListController;
    }

    @Test
    public void shouldgetListUsers() throws Exception {
        UserListController userListController = new UserListController(userService);
        when(userService.getList()).thenReturn(this.getUsers());
        Assert.assertEquals(userListController.listUsers(),this.response);
    }

    private List<String> getUsers() {
        List<String> users = new ArrayList<>();

        users.add(new User("Angel", "Perez").toJSON());
        users.add(new User("Marc", "Casin").toJSON());
        users.add(new User("Matthieu", "Boret").toJSON());
        users.add(new User("Raul", "Mesa").toJSON());

        return users;
    }

}
