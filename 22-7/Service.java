package structure;

import java.sql.SQLException;

public class Service {
    public void Services(int id, String name, String gen, long phn) throws ClassNotFoundException, SQLException {
        Dao d=new Dao();
        d.Dao(id, name, gen, phn);
    }

    
}
