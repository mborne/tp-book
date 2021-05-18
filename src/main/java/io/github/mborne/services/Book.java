package io.github.mborne.services;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.MediaType;

@Path("/book")
public class Book {
	@GET
	@Produces(MediaType.TEXT_HTML)
	@Path("{name}")
	public String sayHell(@PathParam("name") String name) {
		String response = "<h1> Hi " + name + "  </h1>";
		return response;
	}
}