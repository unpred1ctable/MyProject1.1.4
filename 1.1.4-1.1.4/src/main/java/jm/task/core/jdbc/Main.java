package jm.task.core.jdbc;

import jm.task.core.jdbc.model.User;
import jm.task.core.jdbc.service.UserService;
import jm.task.core.jdbc.service.UserServiceImpl;
import jm.task.core.jdbc.util.Util;

import java.sql.SQLException;

public class Main {
    private static final UserService user = new UserServiceImpl();

    public static void main(String[] args) throws SQLException {
        user.createUsersTable();
        user.saveUser("Mike", "Tyson", (byte) 56);
        user.saveUser("Bob", "Marley", (byte) 36);
        user.saveUser("Tom", "Clancy", (byte) 66);
        user.saveUser("Jack", "Napier", (byte) 49);
        user.removeUserById(3);
        for (User allUser : user.getAllUsers()) {
            System.out.println(allUser);
        }
        user.cleanUsersTable();
        user.dropUsersTable();
    }
}
