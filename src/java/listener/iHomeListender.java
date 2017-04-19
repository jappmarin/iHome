package listener;

import java.sql.Connection;
import java.sql.SQLException;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.sql.DataSource;

public class iHomeListender implements ServletContextListener {

    private Connection connection;
    @Override
    public void contextInitialized(ServletContextEvent sce) {
        try {
            connection = getIhome2().getConnection();
            sce.getServletContext().setAttribute("connection", connection);
        }
        catch (SQLException | NamingException e){
        }
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {
    }    

//    private DataSource getIhome() throws NamingException {
//        Context c = new InitialContext();
//        return (DataSource) c.lookup("java:comp/env/ihome");
//    }

    private DataSource getIhome2() throws NamingException {
        Context c = new InitialContext();
        return (DataSource) c.lookup("java:comp/env/ihome2");
    }

    
}