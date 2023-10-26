package br.com.bb.amb.tecnotour.config;

import java.util.EnumSet;
import java.util.EventListener;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.FilterRegistration;
import javax.servlet.Servlet;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;

import org.primefaces.webapp.filter.FileUploadFilter;
import org.springframework.beans.factory.config.CustomScopeConfigurer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.format.FormatterRegistry;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.validation.MessageCodesResolver;
import org.springframework.validation.Validator;
import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.ContextLoaderListener;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.filter.CharacterEncodingFilter;
import org.springframework.web.method.support.HandlerMethodArgumentResolver;
import org.springframework.web.method.support.HandlerMethodReturnValueHandler;
import org.springframework.web.multipart.MultipartResolver;
import org.springframework.web.multipart.support.StandardServletMultipartResolver;
import org.springframework.web.servlet.DispatcherServlet;
import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.config.annotation.AsyncSupportConfigurer;
import org.springframework.web.servlet.config.annotation.ContentNegotiationConfigurer;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.PathMatchConfigurer;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.ViewResolverRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import br.com.bb.amb.controlador.BBTSViewScope;
import br.com.bb.amb.tecnotour.bean.TecnotourPostProcessor;

@Configuration
@EnableWebMvc
@EnableAspectJAutoProxy(proxyTargetClass = true)
@ComponentScan(basePackages = { "br.com.bb.amb.tecnotour.*","br.com.bb.amb.converter.*" })
public class TecnotourWebXml implements WebApplicationInitializer, WebMvcConfigurer {
    public void onStartup(final ServletContext servletContext) throws ServletException {
        final AnnotationConfigWebApplicationContext appContext = new AnnotationConfigWebApplicationContext();
        appContext.register(new Class[] { TecnotourWebXml.class });
        this.inicializarParametros(servletContext);
        final ServletRegistration.Dynamic dispatcher = servletContext.addServlet("SpringDispatcher", (Servlet)new DispatcherServlet((WebApplicationContext)appContext));
        dispatcher.setLoadOnStartup(1);
        dispatcher.addMapping(new String[] { "/" });
        final ContextLoaderListener contextLoaderListener = new ContextLoaderListener((WebApplicationContext)appContext);
        servletContext.addListener((EventListener)contextLoaderListener);
        this.adicionarFiltroFileUpload(servletContext);
        this.adicionarFiltroEncoding(servletContext);
        
     
    }
    
    private void adicionarFiltroFileUpload(final ServletContext servletContext) {
        final FilterRegistration.Dynamic filterFileUpload = servletContext.addFilter("PrimeFaces FileUpload Filter", (Class)FileUploadFilter.class);
        filterFileUpload.addMappingForServletNames((EnumSet)null, true, new String[] { "Faces Servlet" });
    }
    
    private void adicionarFiltroEncoding(final ServletContext servletContext) {
        final FilterRegistration.Dynamic fr = servletContext.addFilter("encodingFilter", (Class)CharacterEncodingFilter.class);
        fr.setInitParameter("encoding", "UTF-8");
        fr.setInitParameter("forceEncoding", "true");
        fr.addMappingForUrlPatterns((EnumSet)null, true, new String[] { "/*" });
    }
    

    
    protected void inicializarParametros(final ServletContext servletContext) {
        servletContext.setInitParameter("javax.faces.FACELETS_SKIP_COMMENTS", "true");
        servletContext.setInitParameter("javax.faces.STATE_SAVING_METHOD", "client");
        servletContext.setInitParameter("javax.faces.DEFAULT_SUFFIX", ".xhtml");
        servletContext.setInitParameter("javax.faces.PROJECT_STAGE", "Production");
        servletContext.setInitParameter("com.sun.faces.verifyObjects", "false");
        servletContext.setInitParameter("com.sun.faces.validateXml", "true");
        servletContext.setInitParameter("javax.faces.DATETIMECONVERTER_DEFAULT_TIMEZONE_IS_SYSTEM_TIMEZONE", "true");
        servletContext.setInitParameter("com.sun.faces.expressionFactory", "com.sun.el.ExpressionFactoryImpl");
        servletContext.setInitParameter("com.sun.faces.forceLoadConfiguration", Boolean.TRUE.toString());
        servletContext.setInitParameter("primefaces.THEME", "start");
        servletContext.setInitParameter("primefaces.FONT_AWESOME", "true");
        servletContext.setInitParameter("javax.faces.FACELETS_BUFFER_SIZE", "65535");
    }
    
    @Bean
    public static TecnotourPostProcessor tecnotourPostProcessor() {
        return new TecnotourPostProcessor();
    }
    
    @Bean
    public static CustomScopeConfigurer customScopeConfigurer() {
        final CustomScopeConfigurer configurer = new CustomScopeConfigurer();
        final Map<String, Object> scopes = new HashMap<String, Object>();
        scopes.put("view", new BBTSViewScope());
        configurer.setScopes((Map)scopes);
        return configurer;
    }
    
    @Bean
    public MultipartResolver multipartResolver() {
        return (MultipartResolver)new StandardServletMultipartResolver();
    }
    
    public void addCorsMappings(final CorsRegistry registry) {
        registry.addMapping("/**").allowedOrigins(new String[] { "*" }).allowedHeaders(new String[] { "Origin", "X-Requested-With", "Content-Type, Accept" }).maxAge(3600L).allowedMethods(new String[] { "POST", "GET", "PUT", "OPTIONS", "DELETE", "PATCH" }).exposedHeaders(new String[] { "Location" });
    }
    
    public void configureViewResolvers(final ViewResolverRegistry registry) {
        registry.jsp("/webapp/", ".xhtml");
    }
    
    public void configureContentNegotiation(final ContentNegotiationConfigurer configurer) {
        configurer.favorPathExtension(false).favorParameter(true).ignoreAcceptHeader(false);
    }
    
    public void configureDefaultServletHandling(final DefaultServletHandlerConfigurer configurer) {
        configurer.enable();
    }
    
    public void addViewControllers(final ViewControllerRegistry registry) {
        registry.addViewController("/").setViewName("forward:/login.xhtml");
    }
    
    public void addResourceHandlers(final ResourceHandlerRegistry registry) {
    }
    
    public void configurePathMatch(final PathMatchConfigurer configurer) {
        configurer.setUseSuffixPatternMatch(Boolean.valueOf(false));
    }
    
    public void configureAsyncSupport(final AsyncSupportConfigurer configurer) {
    }
    
    public void addFormatters(final FormatterRegistry registry) {
    }
    
    public void addInterceptors(final InterceptorRegistry registry) {
    }
    
    public void addArgumentResolvers(final List<HandlerMethodArgumentResolver> argumentResolvers) {
    }
    
    public void addReturnValueHandlers(final List<HandlerMethodReturnValueHandler> returnValueHandlers) {
    }
    
    public void configureMessageConverters(final List<HttpMessageConverter<?>> converters) {
    }
    
    public void extendMessageConverters(final List<HttpMessageConverter<?>> converters) {
    }
    
    public void configureHandlerExceptionResolvers(final List<HandlerExceptionResolver> exceptionResolvers) {
    }
    
    public void extendHandlerExceptionResolvers(final List<HandlerExceptionResolver> exceptionResolvers) {
    }
    
    public Validator getValidator() {
        return null;
    }
    
    public MessageCodesResolver getMessageCodesResolver() {
        return null;
    }
}