import java.sql.*;
import java.util.*;
import java.io.*;
public class Conn {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Roll Number:");
        int roll=sc.nextInt();
        System.out.println("Full Name:");
        String Name=sc.next();
        System.out.println("Age:");
        int age=sc.nextInt();
        try
        {
            Class.forName("com.mysql.jdbc.Driver");
            String s1="jdbc:mysql://localhost/data";
            Connection conn= (Connection) DriverManager.getConnection(s1,"Omkar","Omkar@4141");
            Statement st=conn.createStatement();
            st.executeUpdate("insert into T1 values("+roll+",'"+ Name+"',"+age+")");

        }
        catch(Exception e){
            System.out.println("Exception Occured "+ e);

    }

}



}

