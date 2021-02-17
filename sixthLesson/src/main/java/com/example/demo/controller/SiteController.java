package com.example.demo.controller;

import com.example.demo.entity.Request;
import com.example.demo.entity.Response;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@Slf4j
@RestController
@RequestMapping(value = "/rest/api/v1/")
public class SiteController {

    @GetMapping(value = "/app")
    public ResponseEntity<Response> controllerGet() {
        Response response = new Response();
        response.setText("Все ок!");

        log.debug("Outgoing response {}.", response);

        return ResponseEntity.ok(response);
    }

    @PostMapping(value = "/app")
    public ResponseEntity<Response> controllerPost(@RequestBody @Valid Request request) {
        Response response = new Response();
        response.setText("Все ок!");

        log.debug("Outgoing response {}.", response);

        return ResponseEntity.ok(response);
    }
}
