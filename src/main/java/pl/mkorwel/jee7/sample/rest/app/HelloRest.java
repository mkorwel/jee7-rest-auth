package pl.mkorwel.jee7.sample.rest.app;

import javax.servlet.ServletException;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.SecurityContext;

@Path("hello")
public class HelloRest {

	@GET
	public String hello(@Context SecurityContext context)
			throws ServletException {

		return "Hello " + context.getUserPrincipal().getName();
	}
}
