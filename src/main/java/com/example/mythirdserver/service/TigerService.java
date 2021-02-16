package com.example.mythirdserver.service;

import com.example.mythirdserver.model.Tigers;



public interface TigerService {
    Iterable<Tigers> getTigers();
    Tigers findTigerById(long id);
    Tigers createTiger(Tigers tiger);
}
