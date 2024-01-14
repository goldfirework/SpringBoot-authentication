package fun.jons.panelexample;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class MvcConfig implements WebMvcConfigurer {

    public void addViewControllers(ViewControllerRegistry registry) {
        registry.addViewController("/home").setViewName("home/home");
        registry.addViewController("/").setViewName("home/home");
        registry.addViewController("/hello").setViewName("home/hello");
        registry.addViewController("/login").setViewName("authentication/login");
        registry.addViewController("/panel").setViewName("panel/index");
    }
}
