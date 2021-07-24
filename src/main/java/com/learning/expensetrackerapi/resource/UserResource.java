package com.learning.expensetrackerapi.resource;

import java.util.Map;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/users")
public class UserResource {
    
    @PostMapping("/register")
    public String registerUser(@RequestBody Map<String,Object> userMap){
        String first_name = (String) userMap.get("first_name");
        String last_name = (String) userMap.get("last_name");
        String email = (String) userMap.get("email");
        String password = (String) userMap.get("password");
        return first_name +","+ last_name;

    }
}
