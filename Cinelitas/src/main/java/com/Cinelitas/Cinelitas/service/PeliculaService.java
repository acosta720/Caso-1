
package com.Cinelitas.Cinelitas.service;

import com.Cinelitas.Cinelitas.entity.Pelicula;
import com.Cinelitas.Cinelitas.repository.PeliculaRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EventoService implements IPelicula{
  
     @Autowired
    private PeliculaRepository pelicularepository;
    
    @Override
    public void delete(long id) {
        pelicularepository.deleteById(id);
    }

    @Override
    public List<Pelicula> getAllPelicula() {
        return (List<Pelicula>)pelicularepository.findAll();
    }

    @Override
    public Pelicula getPeliculaById(long id) {
        return pelicularepository.findById(id).get();
    }

    @Override
    public void savePelicula(Pelicula pelicula) {
        pelicularepository.save(pelicula);
    }
    
}
