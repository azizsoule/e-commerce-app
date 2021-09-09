package com.app.ecommerce.services;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public abstract class BaseService<ENTITY, ID> {

    public abstract ENTITY findById(ID id);

    public abstract List<ENTITY> findAll();

    public abstract ENTITY save(ENTITY entity);

    public ENTITY update(ENTITY entity) {
        return this.save(entity);
    }

    public abstract void deleteById(ID id);

    public abstract void delete(ENTITY entity);

}
