package com.gv.spittr.config;

import org.springframework.context.MessageSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ReloadableResourceBundleMessageSource;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.JstlView;
import org.springframework.validation.beanvalidation.LocalValidatorFactoryBean;

@Configuration
@EnableWebMvc                   // Enable Spring MVC
@ComponentScan("com.gv.spittr") // Enable component-scanning (where find beans)
public class WebAppConfig extends WebMvcConfigurerAdapter {

    // Configure a JSP view resolver
    @Bean
    public ViewResolver viewResolver() {
        InternalResourceViewResolver resolver = new InternalResourceViewResolver();
        resolver.setPrefix("/resources/");          // So the view name 'home' will
        resolver.setSuffix(".jsp");                 // be resolved as /resources/views/home.jsp
        resolver.setViewClass(JstlView.class);      // resolving JSTL views
        return resolver;
    }

    // Configure static content handling
    @Override
    public void configureDefaultServletHandling( DefaultServletHandlerConfigurer configurer) {
        configurer.enable();    // asking DispatcherServlet to forward requests for static
        // resources to their servlet containers's default servlet
        // and not to try to handle them itself
    }

    @Bean(name = "messageSource")
    public MessageSource getMessageSource()
    {
        ReloadableResourceBundleMessageSource bean = new ReloadableResourceBundleMessageSource();
        bean.setBasename("classpath:/messages/messages");
        bean.setDefaultEncoding("UTF-8");
        return bean;
    }

    @Bean(name="validator")
    public LocalValidatorFactoryBean getValidator(){
        LocalValidatorFactoryBean bean =  new LocalValidatorFactoryBean();
        bean.setValidationMessageSource(getMessageSource());
        return bean;
    }
}

