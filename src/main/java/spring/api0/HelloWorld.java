package spring.api0;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("/welcome")
public class HelloWorld {
	@GET
	@Path("plain")
	@Produces(MediaType.TEXT_PLAIN)
	public String text() {
		return "sayPlainTextHello";
	}
	@GET
	@Path("xml")
	@Produces(MediaType.TEXT_XML)
	public String xml() {
		return "<hello>sayXMLHello</hello>";
	}
	@GET
	@Path("html")
	@Produces(MediaType.TEXT_HTML)
	public String html() {
		return "<h1>sayPlainTextHello</h1>";
	}
}
