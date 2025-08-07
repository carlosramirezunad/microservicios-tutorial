package com.moto.service.moto_service.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.moto.service.moto_service.entity.Moto;
import com.moto.service.moto_service.repository.MotoRepository;

@Service
public class MotoService {
    
    @Autowired
    private MotoRepository motorePository;

    public List<Moto> getAll(){
        return motorePository.findAll();
    }

    public Moto getMotoById(int id){
        return motorePository.findById(id).orElse(null);
    }

    public Moto save(Moto moto){
        Moto nuevaMoto = motorePository.save(moto);
        return nuevaMoto;
    }  

    public List<Moto> byUsuarioId(int usuarioId){
        return motorePository.findByUsuarioId(usuarioId);
    }
}
