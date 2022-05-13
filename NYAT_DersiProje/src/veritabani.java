import java.sql.Connection;

import java.sql.DriverManager;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;


public class veritabani {

    public void baglanti()
    {

        try{
            /*
            Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection(
                    "jdbc:mysql:localhost[2]:tables");

            Statement stmt=con.createStatement();
            ResultSet rs=stmt.executeQuery("select * from emp");
            while(rs.next())
                System.out.println(rs.getInt(1)+"  "+rs.getString(2));
            con.close();*/



            String jdbcURL = "jdbc:mysql://localhost:3306/hesap";
            String username = "root";
            String password = "x7qercskp";

            Connection connection = DriverManager.getConnection(jdbcURL, username, password);
            Statement myStatement = connection.createStatement();
            //String sql = "INSERT INTO";
            ResultSet myRs = myStatement.executeQuery("select * from hesaptablosu");
            while(myRs.next())
            {
            	System.out.print(myRs.getInt("sifre")  + myRs.getString("kullanici_adi"));
            }
            System.out.print("calisti");
        }catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}
