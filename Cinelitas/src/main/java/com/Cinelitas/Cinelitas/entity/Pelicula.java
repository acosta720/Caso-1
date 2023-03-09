
package com.Cinelitas.Cinelitas.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import java.io.Serializable;

@Entity
@Table(name="Pelicula")
public class Pelicula implements Serializable{
     @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private long id;
    private String nombre;
    private String fecha;
    private String sala;
    private String capacidad;
 

      @ManyToOne
      @JoinColumn(name="costo_id")
     private Costo costo;
      
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getSala() {
        return sala;
    }

    public void setLugar(String sala) {
        this.sala = sala;
    }

    public String getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(String capacidad) {
        this.capacidad = capacidad;
    }

    public Precio getPrecio() {
        return precio;
    }

    public void setCosto(Costo costo) {
        this.costo = costo;
    }
   
    
}
