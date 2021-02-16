package com.example.mythirdserver.repository;

import com.example.mythirdserver.model.Tigers;
import org.springframework.data.repository.CrudRepository;

public interface TigersRepository extends CrudRepository <Tigers, Long> {
}
