package com.example;

import org.springframework.data.repository.CrudRepository;

import javax.transaction.Transactional;

/**
 * Created by hinrek on 24/04/2017.
 */

@Transactional
public interface ToiduaineDao extends CrudRepository<Toiduaine, Integer> {

}
