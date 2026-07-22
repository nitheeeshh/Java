package structure;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.*;

class Dao {

    public void Dao(int id, String name, String gen, long phn) throws ClassNotFoundException, SQLException {
        Connection c=fun();
        PreparedStatement ps=c.prepareStatement("insert into bio_data values(?,?,?,?)");
        ps.setInt(1, id);
        ps.setString(2, name);
        ps.setString(3, gen);
        ps.setLong(4, phn);
        int r=ps.executeUpdate();
        if(r>0)
        {
            System.out.println("Inserted");
        }
        else
        {
            System.out.println("Not Inserted");
        }
    }
      
    
    public Connection fun() throws ClassNotFoundException, SQLException
            {
                Class.forName("org.postgresql.Driver");
                Connection c=DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres","postgres", "922321105024");
                return c;  
            }
}
