package com.sachin.service;

import com.sachin.dao.ManagerDao;
import com.sachin.entity.Manager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class ManagerService {
    @Autowired
    private ManagerDao managerDao;

    public Manager addManager(Manager manager)
    {
        return managerDao.save(manager);
    }

    public void deleteManagerById(int id)
    {
        managerDao.deleteById(id);
    }

    public Manager getManagerById(int id)
    {
        return managerDao.findById(id).get();
    }

    public List<Manager> getManagers()
    {
        return (List<Manager>) managerDao.findAll();
    }
}
