package com.agniva.rest.webservices.restfulwebservices.Versioning;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class VersioningPersonController {

    @GetMapping("/v1/person")
    public PersonV1 getV1OfPerson(){
        return new PersonV1("Bob Charlie");
    }

    @GetMapping("/v2/person")
    public PersonV2 getV2OfPerson(){
        return new PersonV2("Bob", "Charlie");
    }

    @GetMapping(path = "/person", params = "version=1")
    public PersonV1 getV1OfPersonRequestParameter(){
        return new PersonV1("Bob Charlie");
    }

    @GetMapping(path = "/person", params = "version=2")
    public PersonV2 getV2OfPersonRequestParameter(){
        return new PersonV2("Bob", "Charlie");
    }

    @GetMapping(path = "/person/header", headers = "X-API-VERSION=1")
    public PersonV1 getV1OfPersonRequestHeader(){
        return new PersonV1("Bob Charlie");
    }

    @GetMapping(path = "/person/header", headers = "X-API-VERSION=2")
    public PersonV2 getV2OfPersonRequestHeader(){
        return new PersonV2("Bob", "Charlie");
    }

    @GetMapping(path = "/person/accept", produces = "application/vnd.company.app-v1+json")
    public PersonV1 getV1OfPersonAcceptHeader(){
        return new PersonV1("Bob Charlie");
    }

    @GetMapping(path = "/person/accept", produces = "application/vnd.company.app-v2+json")
    public PersonV2 getV2OfPersonAcceptHeader(){
        return new PersonV2("Bob", "Charlie");
    }
}
