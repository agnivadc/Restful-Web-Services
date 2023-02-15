package com.agniva.rest.webservices.restfulwebservices.User;

import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Stream;

@Component
public class UserDaoService {

    private static List<User> users = new ArrayList<>();

    private static int usercount = 0;

    static{
        users.add(new User(++usercount, "Agniva", LocalDate.now().minusYears(30)));
        users.add(new User(++usercount, "Jim", LocalDate.now().minusYears(20)));
        users.add(new User(++usercount, "John", LocalDate.now().minusYears(50)));
    }

    public static List<User> getUsers() {
        return users;
    }

    public User saveUser(User user){
        user.setId(++usercount);
        users.add(user);
        return user;
    }

    public static User getUser(int id){
        User user = users.stream().filter(a -> a.getId().equals(id)).findFirst().orElse(null);
        return user;
    }

    public static void deleteUser(int id){
        Predicate<User> predicate = user -> user.getId().equals(id);
        users.removeIf(predicate);
    }
}
