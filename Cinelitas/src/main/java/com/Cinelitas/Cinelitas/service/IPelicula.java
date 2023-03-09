
package com.Cinelitas.Cinelitas.service;

import com.Cinelitas.Cinelitas.entity.Pelicula;
import java.util.List;



public interface IPelicula {
    public List<Pelicula> getAllPelicula();
    public Pelicula getPeliculaById (long id);
    public void savePelicula(Pelicula pelicula);
    public void delete(long id);


}
