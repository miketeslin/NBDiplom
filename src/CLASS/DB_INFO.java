package CLASS;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 * @author 1BestCsharp
 */
public class DB_INFO {
    
    private static String dbname = "arm_sales";
    private static String username = "root";
    private static String password = "02021993";
    
       static Connection con=null;
    public static Connection getConnection()
    {
        if (con != null) return con;
        // get db, user, pass from settings file
        return getConnection(dbname, username, password);
    }

    private static Connection getConnection(String db_name,String user_name,String password)
    {
        try
        {
            Class.forName("com.mysql.jdbc.Driver");
            con=DriverManager.getConnection("jdbc:mysql://localhost/"+db_name+"?user="+user_name+"&password="+password);
            System.out.println("Подключено к базе данных");
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }

        return con;        
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
  /*  
    public static Connection getConnection(){
        
        Connection con = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost/"+dbname, username, password);
            System.out.println("connected");
        } catch (Exception ex) {
            System.out.println("not connected");
        }
        
        return con;
        
    }
    
   */ 
}
