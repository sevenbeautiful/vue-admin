/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import dao.UserDAO;
import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class UserDAOTest {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        UserDAO userDAO = new UserDAO();
        String userId = sc.next(); //
        String password = sc.next();
        if (userDAO.findByIDAndPassword(userId, password)) {
            System.out.print(userId + "登录成功");
        } else {
            System.out.println("登录失败");
        }

    } 
}


