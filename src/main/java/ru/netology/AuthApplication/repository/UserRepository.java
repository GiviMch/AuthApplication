package ru.netology.AuthApplication.repository;

import org.springframework.stereotype.Repository;
import ru.netology.AuthApplication.moled.Authorities;

import java.util.Collections;
import java.util.List;

@Repository
public class UserRepository {
    public List<Authorities> getUserAuthorities(String user, String password) {
        if ("test".equals(user) && "test".equals(password)) {
            return List.of(Authorities.READ, Authorities.WRITE);
        }
        return Collections.emptyList();
    }
}
