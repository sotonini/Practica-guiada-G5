package org.example.Ayudas;

import java.time.LocalDate;

public class Licor {
    private String tipoProducto;

   private String marca;

   private Double porcentajeAlcohol;

   private LocalDate fechaCaducidad;

    private Integer valorUnidad;

    public Licor() {
    }

    public Licor(String tipoProducto, String marca, Double porcentajeAlcohol, LocalDate fechaCaducidad, Integer valorUnidad) {
        this.tipoProducto = tipoProducto;
        this.marca = marca;
        this.porcentajeAlcohol = porcentajeAlcohol;
        this.fechaCaducidad = fechaCaducidad;
        this.valorUnidad = valorUnidad;
    }

    public String getTipoProducto() {
        return tipoProducto;
    }

    public void setTipoProducto(String tipoProducto) {
        this.tipoProducto = tipoProducto;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public Double getPorcentajeAlcohol() {
        return porcentajeAlcohol;
    }

    public void setPorcentajeAlcohol(Double porcentajeAlcohol) {
        this.porcentajeAlcohol = porcentajeAlcohol;
    }

    public LocalDate getFechaCaducidad() {
        return fechaCaducidad;
    }

    public void setFechaCaducidad(LocalDate fechaCaducidad) {
        this.fechaCaducidad = fechaCaducidad;
    }

    public Integer getValorUnidad() {
        return valorUnidad;
    }

    public void setValorUnidad(Integer valorUnidad) {
        this.valorUnidad = valorUnidad;
    }
}
