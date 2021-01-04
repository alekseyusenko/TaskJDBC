package jm.task.core.jdbc;
import jm.task.core.jdbc.model.User;
import jm.task.core.jdbc.service.UserServiceImpl;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // реализуйте алгоритм здесь
        UserServiceImpl userServiceImpl = new UserServiceImpl();
        userServiceImpl.createUsersTable();
        userServiceImpl.saveUser("Ivan", "Petrov", (byte)40);
        userServiceImpl.saveUser("Oleg", "Ivanov", (byte)22);
        userServiceImpl.saveUser("Alexander", "Sidorov", (byte)56);
        userServiceImpl.saveUser("Nikolay", "Tarasov", (byte)33);
        List<User> users = userServiceImpl.getAllUsers();
        userServiceImpl.getAllUsers().
                forEach(System.out::println);
        userServiceImpl.cleanUsersTable();
        userServiceImpl.dropUsersTable();
    }
}
