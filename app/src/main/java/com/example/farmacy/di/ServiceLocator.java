package com.example.farmacy.di;

import com.example.farmacy.data.repository.IRepository;
import com.example.farmacy.data.repository.Repository;

public class ServiceLocator {
    static ServiceLocator instance;

    public static ServiceLocator getInstance() {
        if (instance == null) instance = new ServiceLocator();
        return instance;
    }

    private IRepository repository;

    public IRepository getRepository() {
        if (repository == null) repository = new Repository();
        return repository;
    }
}
