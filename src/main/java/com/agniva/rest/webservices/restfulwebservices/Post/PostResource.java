package com.agniva.rest.webservices.restfulwebservices.Post;

import com.agniva.rest.webservices.restfulwebservices.jpa.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PostResource {

    @Autowired
    private PostRepository postRepository;


}
