package com.vue.controller;

import com.vue.dto.User;
import com.vue.service.UserRepository;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@CrossOrigin( allowedHeaders = "*")
@RestController
public class VueV3Controller {

    @Autowired
    private UserRepository userRepository;

    @GetMapping("/hello")
    public String sayHello(@RequestParam(value = "myName", defaultValue = "World") String name) {
        return String.format("Hello %s green dsffff11111", name);
    }

    @GetMapping("/api/user/{id}")
    public ResponseEntity<Object> getV1(@PathVariable("id") int id, HttpServletRequest request){
        User u1 = userRepository.findById(id);
        Integer statusCode = (Integer) request.getAttribute(RequestDispatcher.ERROR_STATUS_CODE);
        return new ResponseEntity<>(u1, HttpStatus.valueOf(200));
    }






//    @GetMapping("/{id}")
//    public ResponseEntity<User> findUserById(@PathVariable(value = "id") long id) {
//        // Implement
//    }

//    @GetMapping("/{id}")
//    public ResponseEntity<User> findUserById(@PathVariable(value = "id") long id) {
//        Optional<User> user = userRepository.findById(id);
//
//        if(user.isPresent()) {
//            return ResponseEntity.ok().body(user.get());
//        } else {
//            return ResponseEntity.notFound().build();
//        }
//    }
}
