package net.codewarrior.config;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.JstlView;
import org.springframework.web.servlet.view.UrlBasedViewResolver;

/**
 * @author manuel
 * @since 0.0.1
 */
@Configuration
@ComponentScan("net.codewarrior")
@EnableWebMvc
public class AppConfig {

    private static final String DEFAULT_VIEW_PREFIX = "/WEB-INF/views/";
    private static final String DEFAULT_VIEW_SUFFIX = ".jsp";

    @Bean
    public UrlBasedViewResolver setupViewResolver() {
        UrlBasedViewResolver resolver = new UrlBasedViewResolver();
        resolver.setPrefix(DEFAULT_VIEW_PREFIX);
        resolver.setSuffix(DEFAULT_VIEW_SUFFIX);
        resolver.setViewClass(JstlView.class);
        return resolver;
    }
}

