
package com.Cinelitas.Cinelitas.controller;


import com.Cinelitas.Cinelitas.entity.Pelicula;
import com.Cinelitas.Cinelitas.entity.Costo;
import com.Cinelitas.Cinelitas.service.IPelicula;
import com.Cinelitas.Cinelitas.service.ICosto;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;




@Controller
public class PeliculaController {
     @Autowired
    private IPelicula peliculaservice;

     @Autowired
    private ICosto Costoservice;
     
    @GetMapping("/Pelicula")
    public String mostrarpeliculas (Model model){
      List<Pelicula> listaPelicula = peliculaservice.getAllPelicula();
      model.addAttribute("titulo", "PeliculasDisponibles");
      model.addAttribute("pelicula", listaPelicula);     
        return "Pelicula";
    }
    
   @GetMapping("/Nuevo") 
   public String crearPeliculas(Model model){
         List<Precio> listaCosto =  costoservice.listCountry();
         model.addAttribute("pelicula", new Pelicula());  
          model.addAttribute("costo", listaCosto); 
        return "Nuevo";  
   }
   @PostMapping("/Guardar")
   public String guardarPelicula(@ModelAttribute pelicula pelicula){
       peliculaservice.savePelicula(pelicula);
       return "redirect:/Pelicula";
   }
   @GetMapping("/delete/{id}")
   public String eliminarPelicula(@PathVariable Long id){
       peliculaservice.delete(id);
       return "redirect:/Pelicula";
   }
  @GetMapping("/editPelicula/{id}")
  public String editarpelicula(@PathVariable("id") Long idPelicula, Model model){
      Pelicula pelicula= peliculaservice.getPeliculaById(idPelicula);
        List<Costo> listaCosto = costoservice.listCountry();
       model.addAttribute("pelicula", pelicula);
      model.addAttribute("costo", listaCosto);
      return "Nuevo";
  }
   
}
