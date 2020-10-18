package te.jonathan.kit.spring.web.config;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class MyWebAppInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {

//    If an application context hierarchy is not required,
//    applications can return all configuration through getRootConfigClasses()
//    and null from getServletConfigClasses()

    @Override
    protected Class<?>[] getRootConfigClasses() {
        return new Class<?>[] { RootConfig.class };
    }

    @Override
    protected Class<?>[] getServletConfigClasses() {
//        return new Class<?>[] { App1Config.class };
        return null;
    }

    @Override
    protected String[] getServletMappings() {
        return new String[] { "/app1/*" };
    }
}