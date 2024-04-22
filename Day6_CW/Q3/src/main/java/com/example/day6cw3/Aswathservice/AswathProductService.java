package com.example.day6cw3.Aswathservice;

import java.util.List;

import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.example.day6cw3.Aswathmodel.AswathProduct;
import com.example.day6cw3.Aswathrepository.AswathProductRepo;

@Service
public class AswathProductService {
    public AswathProductRepo productRepo;
    public AswathProductService(AswathProductRepo productRepo)
    {
        this.productRepo = productRepo;
    }
    public boolean postProduct(AswathProduct product)
    {
        try{

            productRepo.save(product);
        }
        catch(Exception e)
        {
            return false;
        }
        return true;
    }
    public List<AswathProduct> pagination(int offset,int size)
    {
        return productRepo.findAll(PageRequest.of(offset, size)).getContent();
    }
    public List<AswathProduct> sortPagination(int offset,int size,String field)
    {
        return productRepo.findAll(PageRequest.of(offset, size, Sort.by(field))).getContent();
    }
    public AswathProduct getProductById(int id)
    {
        return productRepo.findById(id).orElse(null);
    }
}
