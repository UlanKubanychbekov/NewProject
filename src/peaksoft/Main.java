package peaksoft;

import peaksoft.dao.UserDao;
import peaksoft.model.Gender;
import peaksoft.model.User;
import peaksoft.service.UserService;
import peaksoft.service.impl.UserServiceImpl;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    /**
     * 1) Жаны проект тузунуз.
     * 2) company деген пакеттин ичине 3 жаны пакет тузунуз - model, service, dao.
     * 3) model пакеттин ичине User деген класс тузунуз, свойствалары - id, name, age, Gender, Genderди enum кылып башка пакетке тузуп койсонуз болот. id бул жон эле userдин уникалдуу свойствасы болот.
     * 4) dao пакеттин ичине UserDao деген класс тузунуз, ичинде бир эле свойствасы болот - userлер, бул класс биздин база данныхыбыз болот.
     * 5) service пакеттин ичине UserService деген interface тузунуз жана impl деген пакет тузуп коюнуз.
     * 6) UserServiceтин ичинде 4 метод болот, userди кошуу, id менен табуу, id менен очуруу жана баардык userлерди алуу.
     * 7) impl пакеттин ичине UserServiceImpl деген класс тузунуз, бул класс UserService интерфейсин ишке ашырат жана бул класста свойства катары биздин база данныхыбыз болот(UserDao).
     * 8) UserServiceImpl класста UserService интерфейсинин бардык методдорун ишке ашырыныз.
     * 9) Main методдо 3 user тузунуз idлери 1,2,3 болсун.
     * 10) Аларды биздин базага кошунуз.
     * 11) 1 деген id менен userди таап консольго чыгарыныз.
     * 12) Эгер ал id жок болсо анда RunTimeException кармасын.
     * 13) Exception ди озунуздор тузунуздорю
     * 14) Баардык userлерди консольго чыгарыныз.
     * 15) 2 деген id менен userди очурунуз.
     * 16) Баардык userлерди консольго чыгарыныз.
     */
    static UserService userService = new UserServiceImpl();

    public static void main(String[] args) {

        User user = new User(1, "Almaz", 19, Gender.MALE);
        User user1 = new User(2, "Dilbara", 18, Gender.FEMALE);
        User user2 = new User(3, "Ulan", 21, Gender.MALE);
        User user3 = new User(4, "Nurzhan", 20, Gender.FEMALE);


        userService.userAdd(user);
        userService.userAdd(user1);
        userService.userAdd(user2);
        userService.userAdd(user3);
        userService.deleteId(2);
        userService.getAllUsers().forEach(System.out::println);
        System.out.println(userService.findId(5));




    }
}

