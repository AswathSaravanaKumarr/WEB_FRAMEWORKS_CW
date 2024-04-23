package com.example.springapp.Aswathservice;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.springapp.Aswathmodel.AswathDoor;
import com.example.springapp.Aswathrepository.AswathDoorRepo;

@Service
public class AswathDoorService {
    @Autowired
    private AswathDoorRepo rep;

    public boolean post(AswathDoor door)
    {
        try
        {
            rep.save(door);
            return true;
        }
        catch (Exception e)
        {
            return false;
        }
    }

    public List<AswathDoor> getAll()
    {
        return rep.findAll();
    }

    public List<AswathDoor> getbyDoorId(int doorId)
    {
        return rep.findByDoorId(doorId);
    }
    public List<AswathDoor> getbyType(String type)
    {
        return rep.findByAccessType(type);
    }
    
}
