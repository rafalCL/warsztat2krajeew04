package pl.coderslab.warsztat2krajeew04.controller;

import pl.coderslab.warsztat2krajeew04.dao.UserDao;
import pl.coderslab.warsztat2krajeew04.model.User;

import javax.jws.soap.SOAPBinding;

public class UserController {
    private static UserDao userDao = new UserDao();

    public static void main(String[] args) {
        System.out.println("Display Menu"); // separate private method
        // todo below only example - you must implement handling menu
        //  and calling addUser and other methods
        addUser();
    }

    private static void addUser(){
        System.out.println("get user data from console into local variables");
        // set user data from above variables
        User u = new User("username","username@mail.pl", "password");
        if(userDao.create(u)!=null) {
            System.out.println("Dodano użytkownika!");
        } else {
            System.out.println("Błąd zapisu do bazy!");
        }
    }
}
