package pl.coderslab.warsztat2krajeew04.controller;

import pl.coderslab.warsztat2krajeew04.dao.UserDao;
import pl.coderslab.warsztat2krajeew04.model.User;

import javax.jws.soap.SOAPBinding;
import java.util.Scanner;

public class UserController {
    private static UserDao userDao = new UserDao();

    public static void main(String[] args) {
        System.out.println("Display Menu"); // separate private method
        // todo below only example - you must implement handling menu
        //  and calling addUser and other methods
//        switch (userOption){
//            case 1:
//                //        addUser();
//            case 2:
                getUser();
//        }


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

    private static void getUser() {
        Scanner scan = new Scanner(System.in);

        System.out.println("get user id from console");
        User u = userDao.read(1);
        System.out.println(u.getEmail());
    }
}
