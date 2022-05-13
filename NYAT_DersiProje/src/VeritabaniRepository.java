import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.Connection;

import java.sql.DriverManager;

public class VeritabaniRepository implements IVeritabaniRepository {
	private String jdbcURL;
	private String username;
	private String password;
	public void atama()
	{
		this.jdbcURL = "jdbc:mysql://localhost:3306/hesap";
        this.username = "root";
        this.password = "x7qercskp";
	}
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



            //String /*
        	/*
        	this.jdbcURL = "jdbc:mysql://localhost:3306/hesap";
            this.username = "root";
            this.password = "x7qercskp";*/
            this.atama();
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
    public boolean kullaniciIsmiDogrulama(String kullaniciAdi1)
    {
    	boolean x = false;
    	String a;
    	int v;
    	try{
    	this.atama();
    	Connection connection = DriverManager.getConnection(jdbcURL, username, password);
        Statement myStatement = connection.createStatement();
        //String sql = "INSERT INTO";
        ResultSet myRs = myStatement.executeQuery("select * from hesaptablosu ");
        while(myRs.next())
        {
        	a = myRs.getString("kullanici_adi");
        	//System.out.println(kullaniciAdi1.equals(a));
        	if(kullaniciAdi1.equals(a) == true)
        	{
        		x = true;
        	}
        	//System.out.print(" " +a);
        	v = myRs.getInt("sifre");
        	//System.out.print(" " +v);
        	
        }
        
        
    	}catch (Exception e)
        {
            e.printStackTrace();
        }
        
        return x;
     }
    public boolean kullaniciSifreDogrulama(int kullaniciSifre)
    {
    	boolean x = false;
    	String a;
    	int v;
    	try{
    	this.atama();
    	Connection connection = DriverManager.getConnection(jdbcURL, username, password);
        Statement myStatement = connection.createStatement();
        //String sql = "INSERT INTO";
        ResultSet myRs = myStatement.executeQuery("select * from hesaptablosu ");
        while(myRs.next())
        {
        	a = myRs.getString("kullanici_adi");
        	v = myRs.getInt("sifre");
        	//System.out.println(kullaniciAdi1.equals(a));
        	if(kullaniciSifre == v)
        	{
        		x = true;
        	}
        	//System.out.print(" " +x);
        	
        	//System.out.print(" " +v);
        	
        }
        
        
    	}catch (Exception e)
        {
            e.printStackTrace();
        }
        
        return x;
    }
}
