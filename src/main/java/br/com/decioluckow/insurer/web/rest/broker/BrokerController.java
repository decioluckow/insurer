package br.com.decioluckow.insurer.web.rest.broker;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/broker")
class BrokerController {

	@RequestMapping("/")
	public String home() {
		return "Hello World!";
	}

}