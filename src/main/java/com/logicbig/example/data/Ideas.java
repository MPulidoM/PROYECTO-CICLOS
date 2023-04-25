package com.logicbig.example.data;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.time.LocalDate;

@Entity
public class Ideas {

    @Id
    private String name;

    private String description;

    private LocalDate fecha;

    private String proponent;

    private String ocupacion;

    private String keyWords;

    private String proponentArea;

    public Ideas() {
    }

    public Ideas(String name, String description, LocalDate fecha, String proponent, String ocupacion, String keyWords, String proponentArea) {
        this.name = name;
        this.description = description;
        this.fecha = fecha;
        this.proponent = proponent;
        this.ocupacion = ocupacion;
        this.keyWords = keyWords;
        this.proponentArea = proponentArea;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public String getProponent() {
        return proponent;
    }

    public void setProponent(String proponent) {
        this.proponent = proponent;
    }

    public String getOcupacion() {
        return ocupacion;
    }

    public void setOcupacion(String ocupacion) {
        this.ocupacion = ocupacion;
    }

    public String getKeyWords() {
        return keyWords;
    }

    public void setKeyWords(String keyWords) {
        this.keyWords = keyWords;
    }

    public String getProponentArea() {
        return proponentArea;
    }

    public void setProponentArea(String proponentArea) {
        this.proponentArea = proponentArea;
    }

    @Override
    public String toString() {
        return "Ideas{" +
                "name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", fecha=" + fecha +
                ", proponent='" + proponent + '\'' +
                ", ocupacion='" + ocupacion + '\'' +
                ", keyWords='" + keyWords + '\'' +
                ", proponentArea='" + proponentArea + '\'' +
                '}';
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }
}
