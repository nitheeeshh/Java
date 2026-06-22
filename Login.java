package com.mycompany.login;

import java.util.Scanner;

public class Login {

    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        Login n = new Login();

        System.out.println("Enter your username:");
        String userid = sc.nextLine();

        System.out.println("Enter your password:");
        String pass = sc.nextLine();
       
        boolean h = n.check(userid);
        System.out.println("User validation: " + h);
        
        boolean g = n.checku(pass);
        System.out.println("Password validation: " + g);
        boolean i = n.checkk(g, h);
        System.out.println("Login Successfull " + i);
    }
    public boolean check(String user) {
        if(user.length()<4)
        {
            return false;
        }
        if (user.contains(" ")) {
            return false;}
        if (user.isEmpty()) {
            return false; }
        if(user.contains("0")||user.contains("1")||user.contains("2")||user.contains("3")
                ||user.contains("4")||user.contains("5")
                ||user.contains("6")||user.contains("7")||user.contains("8")||
                user.contains("9")||user.contains("@")||user.contains("#")||
                        user.contains("$")||user.contains("%")||user.contains("^")||
                        user.contains("&")||user.contains("*")){ 
            return false; }
        return true;
    }
     public boolean checku(String a) {

        if (a.contains(" ")) {
            return false;
        }

        if (a.isEmpty()) {
            return false;
        }

        if (a.length() < 4) {
            return false;
        }
        if (!Character.isUpperCase(a.charAt(0))) {
            return false;
        }

        if (!a.contains("@")||a.contains("#")||
               a.contains("$")||a.contains("%")||a.contains("^")||
                  a.contains("&")||a.contains("*")) 
        {
            return false;
        }
        if (!a.contains("1")||a.contains("2")||
               a.contains("3")||a.contains("4")||a.contains("5")||
                  a.contains("6")||a.contains("7")||a.contains("8")||a.contains("9")
                ||a.contains("0")){
            return false;
        }
        
        return true;
    }
public boolean checkk(boolean a, boolean b) {
        return a && b;
}
}
