package com.camel.file.camelfile.router;

import org.apache.camel.builder.RouteBuilder;
import org.springframework.stereotype.Component;

@Component
public class File extends RouteBuilder {

	@Override
	public void configure() throws Exception {

		from("file://src/main/resources/input")
		.to("log: log1 ${body}");
		
	}

}
