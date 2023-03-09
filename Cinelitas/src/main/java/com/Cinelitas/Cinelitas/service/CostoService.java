
package com.Cinelitas.Cinelitas.service;

import com.Cinelitas.Cinelitas.entity.Costo;
import com.Cinelitas.Cinelitas.repository.CostoRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CostoService implements ICosto{
     @Autowired 
    private CostoRepository costorepository;
    
    
    @Override
    public List<Costo> listCountry() {
      return (List<Costo>)costorepository.findAll();
    }
}
