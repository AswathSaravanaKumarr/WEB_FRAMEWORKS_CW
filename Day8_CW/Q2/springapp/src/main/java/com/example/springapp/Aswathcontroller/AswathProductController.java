package com.example.springapp.Aswathcontroller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import java.util.*;

import com.example.springapp.Aswathmodel.AswathProduct;
import com.example.springapp.Aswathservice.AswathProductService;

@RestController
public class AswathProductController {
    @Autowired
    private AswathProductService ser;

    @PostMapping("/product")
    public ResponseEntity<AswathProduct> post(@RequestBody AswathProduct person) {
        if (ser.post(person)) {
            return new ResponseEntity<>(person, HttpStatus.CREATED);
        } else {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping("/product/distinct/startwith/{name}")
    public ResponseEntity<List<AswathProduct>> getAll(@PathVariable("name") String name) {
        List<AswathProduct> li = ser.start(name);
        if (li.size() > 0) {
            return new ResponseEntity<>(li, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @GetMapping("product/distict/endswith/{name}")
    public ResponseEntity<List<AswathProduct>> getbyAge(@PathVariable("name") String name) {
        List<AswathProduct> li = ser.end(name);
        if (li.size() > 0) {
            return new ResponseEntity<>(li, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
    @GetMapping("/product/sortBy/price")
    public ResponseEntity<List<AswathProduct>> getbyge() {
        List<AswathProduct> li = ser.sort();
        if (li.size() > 0) {
            return new ResponseEntity<>(li, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
}
