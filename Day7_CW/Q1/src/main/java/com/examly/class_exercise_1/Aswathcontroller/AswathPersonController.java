package com.examly.class_exercise_1.Aswathcontroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.examly.class_exercise_1.Aswathmodel.AswathPerson;
import com.examly.class_exercise_1.Aswathservice.AswathPersonService;

@RestController
public class AswathPersonController {

     @Autowired
     public AswathPersonService personService;

     @PostMapping("/api/person")
     public ResponseEntity<AswathPerson> postMethodName(@RequestBody AswathPerson entity) {

          AswathPerson inst = personService.SaveEntity(entity);

          return new ResponseEntity<AswathPerson>(inst, HttpStatus.CREATED);

     }

     @GetMapping("/api/person")
     public ResponseEntity<List<AswathPerson>> getMethodName() {

          List<AswathPerson> show = personService.getDetails();
          if (!show.isEmpty()) {
               return new ResponseEntity<List<AswathPerson>>(show, HttpStatus.OK);
          } else {
               return new ResponseEntity<List<AswathPerson>>(show, HttpStatus.NOT_FOUND);
          }
     }

     @GetMapping("api/person/byAge")
     public List<AswathPerson> custom(@RequestParam int byAge) {
          return personService.findByAge(byAge);

     }
}