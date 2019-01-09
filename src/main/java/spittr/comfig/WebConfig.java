package spittr.comfig;

import org.springframework.context.MessageSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ResourceBundleMessageSource;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.JstlView;

@Configuration
@EnableWebMvc       //启用Spring MVC
@ComponentScan({"spittr.web","spittr.controller"})//启动组件扫描
public class WebConfig extends WebMvcConfigurationSupport {

    public WebConfig() {
        System.out.println("WebConfig创建了！！");
    }

    /**
     * 配置jsp视图解析器
     * @return 视图解析器
     */
    @Bean
    public ViewResolver viewResolver(){
        //内部资源解析器
        InternalResourceViewResolver resolver=new
                InternalResourceViewResolver();
        resolver.setPrefix("/WEB-INF/view/");
        resolver.setSuffix(".jsp");
        resolver.setExposeContextBeansAsAttributes(true);
        resolver.setViewClass(JstlView.class);
        return resolver;
        /*return new TilesViewResolver();*/
    }

    @Bean
    public MessageSource messageSource(){
        ResourceBundleMessageSource messageSource=new ResourceBundleMessageSource();
        messageSource.setBasename("classpath:message.properties");
        return messageSource;
    }

    /**
     * 配置静态资源处理
     * @param configurer
     */
    @Override
    protected void configureDefaultServletHandling(DefaultServletHandlerConfigurer configurer) {
       configurer.enable();
    }

    /*@Bean
    public TilesConfigurer tilesConfigurer(){
        TilesConfigurer tiles=new TilesConfigurer();
        tiles.setDefinitions(new String[]{
                "/WEB-INF/layout/titles.xml"
        });
        tiles.setCheckRefresh(true);
        return tiles;
    }*/
}
