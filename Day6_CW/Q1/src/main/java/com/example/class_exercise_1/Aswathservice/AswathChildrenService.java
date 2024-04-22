package com.example.class_exercise_1.Aswathservice;

import java.util.List;
import org.springframework.data.domain.Sort;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import com.example.class_exercise_1.Aswathmodel.AswathChildren;
import com.example.class_exercise_1.Aswathrepository.AswathChildrenRepo;

@Service
public class AswathChildrenService {

     @Autowired
     public AswathChildrenRepo childrenRepo;

     public List<AswathChildren> sort(String field) {
          return childrenRepo.findAll(Sort.by(Sort.Direction.DESC, field));
     }

     public AswathChildren save(AswathChildren children) {
          return childrenRepo.save(children);

     }

     public List<AswathChildren> sortedPage(int offset, int pagesize, String field) {
          Page<AswathChildren> sortedPage = childrenRepo
                    .findAll(PageRequest.of(offset, pagesize, Sort.by(Sort.Direction.ASC, field)));
          return sortedPage.getContent();
     }

     public List<AswathChildren> pagination(int offset, int pagesize) {
          Page<AswathChildren> pages = childrenRepo.findAll(PageRequest.of(offset, pagesize));
          return pages.getContent();

     }

}
