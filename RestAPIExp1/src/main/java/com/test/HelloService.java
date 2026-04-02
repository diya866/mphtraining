package com.test;



import java.util.List;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import com.test.*;
@Path("/hello")
public class HelloService {
@GET
@Path("/text")
@Produces(MediaType.TEXT_PLAIN)
public String simplePlainTextResponse() {
	return "This is simple Rest API";
	
}
@GET
@Path("/{id}")
@Produces(MediaType.TEXT_HTML)
public String simpleHTMLResponse(@PathParam("id")long num) {
	return "<html><body> <h1> This is dimple Rest api HTML RESPONsE: "+num+"</h1></body></html>";
}
@GET
@Path("/fruits")
@Produces(MediaType.APPLICATION_JSON)
public List<Fruits>getAllFruits(){
	return List.of(new Fruits(1,"Apple",12),new Fruits(2,"Mango",234),new Fruits(3,"Orange",23));
}
}
