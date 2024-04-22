package com.example.day5cw3.Aswathservice;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.day5cw3.Aswathmodel.AswathLanguage;
import com.example.day5cw3.Aswathrepository.AswathLanguageRepo;

@Service
public class AswathLanguageService {
    private AswathLanguageRepo languageRepo;
    public AswathLanguageService(AswathLanguageRepo languageRepo)
    {
        this.languageRepo=languageRepo;
    }
    public boolean saveLanguage(AswathLanguage language)
    {
        try
        {
            languageRepo.save(language);

        }
        catch(Exception e)
        {
            return false;
        }
        return true;
    }
    public List<AswathLanguage> getLanguages()
    {
        return languageRepo.findAll();
    }
    public boolean updateLanguage(int id,AswathLanguage language)
    {
        if(getLanguageById(id)==null)
        {
            return false;
        }
        try{
            languageRepo.save(language);
        }
        catch(Exception e)
        {
            return false;
        }
        return true;
    }
    public boolean deleteLanguage(int id)
    {
        if(getLanguageById(id)==null)
        {
            return false;
        }
        languageRepo.deleteById(id);
        return true;
        
    }
    public AswathLanguage getLanguageById(int id)
    {
        return languageRepo.findById(id).orElse(null);
    }

}
