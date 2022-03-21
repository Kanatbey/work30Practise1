package dao;

import model.User;

import java.util.List;

public class UserDao {
    List<User> users;

    public UserDao(List<User> users) {
        this.users = users;
    }
    public UserDao(){

    }

    public List<User> getUsers() {
        return users;
    }

    public void setUsers(List<User> users) {
        this.users = users;
    }

    @Override
    public String toString() {
        return "UserDao{" +
                "users=" + users +
                '}';
    }
}
// 4) dao пакеттин ичине UserDao деген класс тузунуз, ичинде бир эле свойствасы болот - userлер,
// бул класс биздин база данныхыбыз болот.
//