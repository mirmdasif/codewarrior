package net.codewarrior.config;

import net.codewarrior.filter.ConfiguredSiteMeshFilter;
import org.sitemesh.config.ConfigurableSiteMeshFilter;
import org.sitemesh.webapp.SiteMeshFilter;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

import javax.servlet.Filter;

/**
 * @author asif.hossain
 * @since 1/14/15
 */
public class WebAppInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {
    @Override
    protected Class<?>[] getRootConfigClasses() {
        return new Class<?>[]{AppConfig.class};
    }

    @Override
    protected Class<?>[] getServletConfigClasses() {
        return new Class<?>[0];
    }

    @Override
    protected String[] getServletMappings() {
        return new String[]{"/"};
    }

    @Override
    protected Filter[] getServletFilters() {
        return new  Filter[]{new ConfiguredSiteMeshFilter()};
    }
}
