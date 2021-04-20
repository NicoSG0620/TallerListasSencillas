/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metodos;

/**
 ** *****
 * @author Nico y Juan Marin
 */
public class nodo {
    String Nombre;
    String ID;
    String Genero;
    String EPS;
    double FechaNac;
    double Peso;
    double Estatura;
    double NivGlucosa;
    double NivHemogl;
    
    nodo sig;

    //Metodos constructores
    public nodo(String Nombre, String ID, String Genero, String EPS, double FechaNac, double Peso, double Estatura, double NivGlucosa, double NivHemogl) {
        this.Nombre = Nombre;
        this.ID = ID;
        this.Genero = Genero;
        this.EPS = EPS;
        this.FechaNac = FechaNac;
        this.Peso = Peso;
        this.Estatura = Estatura;
        this.NivGlucosa = NivGlucosa;
        this.NivHemogl = NivHemogl;
    }

    
    //Metodos Analizadores
    public String getNombre() {
        return Nombre;
    }

    public String getID() {
        return ID;
    }

    public String getGenero() {
        return Genero;
    }

    public String getEPS() {
        return EPS;
    }

    public double getFechaNac() {
        return FechaNac;
    }

    public double getPeso() {
        return Peso;
    }

    public double getEstatura() {
        return Estatura;
    }

    public double getNivGlucosa() {
        return NivGlucosa;
    }

    public double getNivHemogl() {
        return NivHemogl;
    }

    
    //Metodos Modificadores
    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public void setGenero(String Genero) {
        this.Genero = Genero;
    }

    public void setEPS(String EPS) {
        this.EPS = EPS;
    }

    public void setFechaNac(double FechaNac) {
        this.FechaNac = FechaNac;
    }

    public void setPeso(double Peso) {
        this.Peso = Peso;
    }

    public void setEstatura(double Estatura) {
        this.Estatura = Estatura;
    }

    public void setNivGlucosa(double NivGlucosa) {
        this.NivGlucosa = NivGlucosa;
    }

    public void setNivHemogl(double NivHemogl) {
        this.NivHemogl = NivHemogl;
    }

}
