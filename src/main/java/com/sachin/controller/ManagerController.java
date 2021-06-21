package com.sachin.controller;

import com.sachin.entity.Manager;
import com.sachin.service.ManagerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ManagerController {
    @Autowired
    private ManagerService managerService;

    @PostMapping("/addManager")
    public Manager addManager(@RequestBody Manager manager)
    {
        return managerService.addManager(manager);
    }

    @DeleteMapping("/deleteManagerById/{id}")
    public void deleteManagerById(@PathVariable int id)
    {
        managerService.deleteManagerById(id);
    }

    @GetMapping("/getManagerById/{id}")
    public Manager getManagerById(@PathVariable int id)
    {
        return managerService.getManagerById(id);
    }

    @GetMapping("/getManagers")
    public List<Manager> getManagers()
    {
        return (List<Manager>) managerService.getManagers();
    }
}
