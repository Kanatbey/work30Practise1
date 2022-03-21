package com.company;

import dao.UserDao;
import model.User;
import service.iml.UserServiceImpl;

import java.util.ArrayList;
import java.util.List;

import static model.Gender.*;

public class Main {

    public static void main(String[] args) {
        // write your code here
        User user1 = new User(1, "Asan", 23, MALE);
        User user2 = new User(2, "Uson", 20, MALE);
        User user3 = new User(3, "Dinara", 18, FEMALE);
        List<User> users = new ArrayList<>(List.of(user1,user2,user3));

        UserDao userDao = new UserDao(users);
        UserServiceImpl userService = new UserServiceImpl(userDao);

        userService.IdFindAble(users,2);

        userService.AllUsersAble(users);

        userService.IdRemoveAble(users,1);

        userService.AllUsersAble(users);




    }
}
//        1) Жаны проект тузунуз.
//        2) company деген пакеттин ичине 3 жаны пакет тузунуз - model, service, dao.
//        3) model пакеттин ичине User деген класс тузунуз, свойствалары - id, name, age, Gender,
//        Genderди enum кылып башка пакетке тузуп койсонуз болот. id бул жон эле userдин уникалдуу свойствасы болот.
//        4) dao пакеттин ичине UserDao деген класс тузунуз, ичинде бир эле свойствасы болот - userлер,
//        бул класс биздин база данныхыбыз болот.
//        5) service пакеттин ичине UserService деген interface тузунуз жана impl деген пакет тузуп коюнуз.
//        6) UserServiceтин ичинде 4 метод болот, userди кошуу, id менен табуу, id менен очуруу жана баардык
//        userлерди алуу.
//        7) impl пакеттин ичине UserServiceImpl деген класс тузунуз, бул класс UserService интерфейсин ишке ашырат жана бул класста свойства катары биздин база данныхыбыз болот(UserDao).
//        8) UserServiceImpl класста UserService интерфейсинин бардык методдорун ишке ашырыныз.
//        9) Main методдо 3 user тузунуз idлери 1,2,3 болсун.
//        10) Аларды биздин базага кошунуз.
//        11) 1 деген id менен userди таап консольго чыгарыныз.
//        12) Эгер ал id жок болсо анда RunTimeException кармасын.
//        13) Exception ди озунуздор тузунуздорю
//        14) Баардык userлерди консольго чыгарыныз.
//        15) 2 деген id менен userди очурунуз.
//        16) Баардык userлерди консольго чыгарыныз.