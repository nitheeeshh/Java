package structure;

import java.sql.SQLException;
import java.util.Scanner;

public class Structure {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Scanner sc=new Scanner(System.in);
        Scanner se=new Scanner(System.in);
        System.out.print("Enter id : ");
        int id=sc.nextInt();
        System.out.print("Enter name : ");
        String name=se.nextLine();
        System.out.print("Enter gender : ");
        String gen=se.nextLine();
        System.out.print("Enter phn_no : ");
        long phn=se.nextLong();
        Service s=new Service();
        s.Services(id, name, gen, phn);
        
    }
}