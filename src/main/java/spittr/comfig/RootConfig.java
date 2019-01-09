package spittr.comfig;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@Configuration
@ComponentScan(basePackages = {"spittr"},excludeFilters = {
        @ComponentScan.Filter(type= FilterType.ANNOTATION
        ,value = EnableWebMvc.class)})
public class RootConfig {
    public RootConfig() {
        System.out.println("RootConfig创建了！！！");
    }
}
