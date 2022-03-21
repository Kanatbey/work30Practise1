package service;

import ExceptionId.ExceptionID;
import model.User;

import java.util.List;

public interface UserService {

    void UserAddAble(List<User> users, User user);

    void IdFindAble(List<User> users, int id);

    void IdRemoveAble(List<User> users, int id);

    void AllUsersAble(List<User> users);
}
//        6) UserServiceтин ичинде 4 метод болот, userди кошуу, id менен табуу, id менен очуруу жана баардык
//        userлерди алуу.
