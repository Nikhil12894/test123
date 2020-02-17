package com.nk.test;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

@Path("helloworld")
public class HelloWorld {

	@GET
	public String printHelloWorld() {
		return "hello World!!!!!1";
	}
}
