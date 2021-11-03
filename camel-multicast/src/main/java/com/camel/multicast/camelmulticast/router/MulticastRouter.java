package com.camel.multicast.camelmulticast.router;

import org.apache.camel.builder.RouteBuilder;
import org.springframework.stereotype.Component;

@Component
public class MulticastRouter extends RouteBuilder {

	@Override
	public void configure() throws Exception {

		from("file://src/main/resources/input")
		.multicast()
		.to("log: log1 ${body}","log: log2 ${body}","log: log3 ${body}");
		
	}

}
