package example.spring.mvc.config;

import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRegistration;

public class SpringWebApplicationInitializer implements WebApplicationInitializer{

	@Override
	public void onStartup(ServletContext servletContextRef) throws ServletException {
		System.out.println("Application is starting up...");
		WebApplicationContext webctx = getContext();
		
		DispatcherServlet frontControllerServlet = new DispatcherServlet(webctx);
		
		ServletRegistration.Dynamic registration = servletContextRef.addServlet("frontController", frontControllerServlet);
	
		registration.addMapping("/");
	}
	
	private WebApplicationContext getContext() {
		AnnotationConfigWebApplicationContext ctx = new AnnotationConfigWebApplicationContext();
		ctx.setConfigLocation("example");
		return ctx;
	}
}
