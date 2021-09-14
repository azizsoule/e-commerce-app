package com.app.ecommerce.services;

import com.app.ecommerce.models.Privilege;
import com.app.ecommerce.repositories.PrivilegeRepository;
import io.debezium.data.Envelope;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class PrivilegeService extends BaseService<Privilege, Long> {
    @Autowired
    private PrivilegeRepository repository;

    @Override
    public Privilege findById(Long idPrivilege) {
        return repository.getById(idPrivilege);
    }

    @Override
    public List<Privilege> findAll() {
        return repository.findAll();
    }

    @Override
    public Privilege save(Privilege privilege) {
        privilege.setLabel(privilege.getLabel().trim().replace(" ","_").toUpperCase());
        return repository.save(privilege);
    }

    @Override
    public void deleteById(Long idPrivilege) {
        repository.deleteById(idPrivilege);
    }

    @Override
    public void delete(Privilege Privilege) {
        repository.delete(Privilege);
    }
    public Long count(){
        return repository.count();
    }

    public void replicateData(Map<String, Object> data, Envelope.Operation operation) {
        final Privilege privilege = this.modelMapper().map(data, Privilege.class);
        if (Envelope.Operation.DELETE == operation) {
            deleteById(privilege.getIdPrivilege());
        } else {
            save(privilege);
        }
    }

}