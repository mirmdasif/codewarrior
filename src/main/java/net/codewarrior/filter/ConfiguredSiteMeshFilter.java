package net.codewarrior.filter;

import org.sitemesh.builder.SiteMeshFilterBuilder;
import org.sitemesh.config.ConfigurableSiteMeshFilter;

import javax.servlet.annotation.WebFilter;

/**
 * @author asif.hossain
 * @since 1/14/15
 */
@WebFilter(urlPatterns = "/*")
public class ConfiguredSiteMeshFilter extends ConfigurableSiteMeshFilter {
    @Override
    protected void applyCustomConfiguration(SiteMeshFilterBuilder builder) {
        builder.addDecoratorPath("/*", "/WEB-INF/decorators/defaultDecorator.jsp");
    }
}
