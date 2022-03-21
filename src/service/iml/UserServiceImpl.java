package service.iml;

import ExceptionId.ExceptionID;
import dao.UserDao;
import model.User;
import service.UserService;

import java.util.List;
import java.util.Optional;

public class UserServiceImpl implements UserService {

    private final UserDao userDao;

    public UserServiceImpl(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public void UserAddAble(List<User> users, User user) {
        users.add(user);
    }

    @Override
    public void IdFindAble(List<User> users, int id) {
        boolean empty = users.stream().filter(x -> x.getId() == id).findAny().isEmpty();
        try {
            if (empty) {
                throw new ExceptionID();
            } else {
                System.out.println(users.stream().filter(x -> x.getId() == id).findFirst().get() + "\n");
            }
        } catch (ExceptionID e) {
            System.err.println("Myndai Index jok!");
        }
    }


    @Override
    public void IdRemoveAble(List<User> users, int id) {
        Optional<User> remove = users.stream().filter(x -> x.getId() == id).findFirst();

        try {
            if (remove.isEmpty()) {
                throw new ExceptionID();
            } else {
                users.removeIf(x -> x.getId() == id);
            }
        } catch (ExceptionID e) {
            System.err.println("Myndai index jok!");
        }
    }

    @Override
    public void AllUsersAble(List<User> users) {
        users.stream().forEach(System.out::println);
        System.out.println();
    }
}
//        7) impl пакеттин ичине UserServiceImpl деген класс тузунуз, бул класс UserService интерфейсин
//        ишке ашырат жана бул класста свойства катары биздин база данныхыбыз болот(UserDao).
