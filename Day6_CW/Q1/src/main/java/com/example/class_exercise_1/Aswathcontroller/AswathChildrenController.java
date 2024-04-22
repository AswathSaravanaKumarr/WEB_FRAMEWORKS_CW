package com.example.class_exercise_1.Aswathcontroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.http.HttpStatus;
// import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import com.example.class_exercise_1.Aswathmodel.AswathChildren;
import com.example.class_exercise_1.Aswathservice.AswathChildrenService;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
// import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
public class AswathChildrenController {

     @Autowired
     public AswathChildrenService childrenService;

     @GetMapping("/api/children/sortBy/{babyFirstName}")
     public ResponseEntity<List<AswathChildren>> sort(@PathVariable String babyFirstName) {
          List<AswathChildren> child = childrenService.sort(babyFirstName);

          if (child.isEmpty()) {

               return new ResponseEntity<>(child, HttpStatus.NOT_FOUND);
          }
          return new ResponseEntity<>(child, HttpStatus.OK);

     }

     // Pagination
     @GetMapping("api/children/{offset}/{pagesize}")
     public ResponseEntity<List<AswathChildren>> pagination(@PathVariable int offset, @PathVariable int pagesize) {
          List<AswathChildren> pages = childrenService.pagination(offset, pagesize);
          if (pages.isEmpty()) {
               return new ResponseEntity<List<AswathChildren>>(pages, HttpStatus.NOT_FOUND);
          }
          return new ResponseEntity<List<AswathChildren>>(pages, HttpStatus.OK);
     }

     @GetMapping("/api/children/{offset}/{pagesize}/{field}")
     public ResponseEntity<List<AswathChildren>> sortedPage(@PathVariable int offset, @PathVariable int pagesize,
               @PathVariable String field) {
          List<AswathChildren> sortedPage = childrenService.sortedPage(offset, pagesize, field);
          if (sortedPage.isEmpty()) {

               return new ResponseEntity<>(sortedPage, HttpStatus.NOT_FOUND);
          }
          return new ResponseEntity<>(sortedPage, HttpStatus.OK);
     }

     @PostMapping("/api/children")
     public ResponseEntity<AswathChildren> postDetails(@RequestBody AswathChildren children) {

          return new ResponseEntity<AswathChildren>(childrenService.save(children), HttpStatus.CREATED);
     }

}