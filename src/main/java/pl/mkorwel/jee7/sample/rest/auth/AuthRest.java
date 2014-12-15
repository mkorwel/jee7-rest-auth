package pl.mkorwel.jee7.sample.rest.auth;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.ws.rs.DELETE;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;

import pl.mkorwel.jee7.sample.rest.auth.model.LoginRequest;

@Path("auth")
public class AuthRest {

	@POST
	public Response login(@Context HttpServletRequest request,
			LoginRequest login) throws ServletException {
		request.login(login.getLogin(), login.getPassword());

		return Response.noContent().build();
	}

	@DELETE
	public Response logout(@Context HttpServletRequest request)
			throws ServletException {
		request.logout();

		return Response.noContent().build();
	}
}
