package listener;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

@WebListener
public class ListenerLesson implements ServletContextListener {

    public ListenerLesson() {
    }

    public void contextDestroyed(ServletContextEvent arg0)  {
    }

    public void contextInitialized(ServletContextEvent sce)  {
    	ServletContext context = sce.getServletContext();
    	Integer count = 0;
    	context.setAttribute("count", count);
    }

}
