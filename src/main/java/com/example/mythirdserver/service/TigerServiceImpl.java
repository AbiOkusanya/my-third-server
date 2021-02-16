package com.example.mythirdserver.service;

import com.example.mythirdserver.repository.TigersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.mythirdserver.model.Tigers;

@Service
public class TigerServiceImpl implements TigerService{

    @Autowired
    TigersRepository tigersRepository;

    @Override
    public Iterable<Tigers> getTigers(){
        return  tigersRepository.findAll();
    }

    @Override
    public Tigers findTigerById(long id) {
        return tigersRepository.findById(id).get();
    }

    @Override
    public Tigers createTiger(Tigers tiger) {
        return tigersRepository.save(tiger);
    }


}
