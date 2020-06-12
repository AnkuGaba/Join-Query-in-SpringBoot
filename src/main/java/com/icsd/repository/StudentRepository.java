package com.icsd.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.icsd.model.StudentEntity;

import java.util.List;
import java.util.Optional;

@Repository
public interface StudentRepository extends CrudRepository<StudentEntity, Integer> {

    @Override
    public List<StudentEntity> findAll();
}
