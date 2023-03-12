package config;

/*In Spring MVC, The DispatcherServlet  needs to be declared and mapped for processing all requests either using java or web.xml configuration.
In a Servlet 3.0+ environment, you can use AbstractAnnotationConfigDispatcherServletInitializer class to register
 and initialize the DispatcherServlet programmatically as follows.*/

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;


public class SpringMvcDispatcherServletInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {

    @Override
    protected Class << ? > [] getRootConfigClasses() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    protected Class << ? > [] getServletConfigClasses() {
        return new Class[] {
            MVCConfig.class
        };
    }

    @Override
    protected String[] getServletMappings() {
        return new String[] {
            "/"
        };
    }
}