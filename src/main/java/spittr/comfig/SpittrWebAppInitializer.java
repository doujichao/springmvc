package spittr.comfig;


import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class SpittrWebAppInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {

    public SpittrWebAppInitializer() {
        System.out.println("SpittrWebAppInitializer创建了");
    }

    protected Class<?>[] getRootConfigClasses() {

        return new Class[]{RootConfig.class};
    }


    protected Class<?>[] getServletConfigClasses() {

        return new Class[]{ WebConfig.class };
    }


    protected String[] getServletMappings() {
        return new String[]{ "/" };
    }
}
