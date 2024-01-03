package com.manas.rest.webservices.restfulwebservices.versioning;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class VersioningPersonController {
	
	@GetMapping("/v1/person")
	public PersonV1 getFirstVersionOfPerson() {
		return new PersonV1("Bob charie");
	}
	
	@GetMapping("/v2/person")
	public PersonV2 getSecondVersionOfPerson() {
		return new PersonV2("Bob" , "Panday");
	}
	
	@GetMapping(path ="/person" , params = "version=1")
	public PersonV1 getFirstVersionOfPersonRequestParam() {
		return new PersonV1("Bob charie");
	}
	
	@GetMapping(path="/person" , params = "version=2")
	public PersonV2 getSecondVersionOfPersonRequestParam() {
		return new PersonV2("Bob" , "Panday");
	}
	
	@GetMapping(path="/person/header" , headers = "X-API-VERSION=2")
	public PersonV2 getSecondVersionOfPersonHeaderParam() {
		return new PersonV2("Bob" , "Panday");
	}
	
	@GetMapping(path ="/person/header" , headers = "X-API-VERSION=1")
	public PersonV1 getFirstVersionOfPersonHeaderParam() {
		return new PersonV1("Bob charie");
	}
	
	@GetMapping(path="/person/accept" , produces = "application/vnd.company.app-v2+json")
	public PersonV2 getSecondVersionOfPersonAcceptHeader() {
		return new PersonV2("Bob" , "Panday");
	}
	
	@GetMapping(path ="/person/accept" , produces = "application/vnd.company.app-v1+json")
	public PersonV1 getFirstVersionOfPersonPersonAcceptHeader() {
		return new PersonV1("Bob charie");
	}
	


}
