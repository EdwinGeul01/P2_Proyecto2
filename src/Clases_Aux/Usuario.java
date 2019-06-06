
package Clases_Aux;

import java.util.ArrayList;

public class Usuario {
    String nombre;
    String User;
    String Pass;
    String Edad;
    char Genero;
    Boolean Estado;
    String img_Url;

    public ArrayList<Siguiendo> siguiendo = new ArrayList<>();
    public ArrayList<Seguidores> Seguidores = new ArrayList<>();
    public ArrayList<twits_Escritos> twits = new ArrayList<>();
    
    public Usuario(String nombre, String User, String Pass, String Edad, char Genero, Boolean Estado, String img_Url) {
        this.nombre = nombre;
        this.User = User;
        this.Pass = Pass;
        this.Edad = Edad;
        this.Genero = Genero;
        this.Estado = Estado;
        this.img_Url = img_Url;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getUser() {
        return User;
    }

    public void setUser(String User) {
        this.User = User;
    }

    public String getPass() {
        return Pass;
    }

    public void setPass(String Pass) {
        this.Pass = Pass;
    }

    public String getEdad() {
        return Edad;
    }

    public void setEdad(String Edad) {
        this.Edad = Edad;
    }

    public char getGenero() {
        return Genero;
    }

    public void setGenero(char Genero) {
        this.Genero = Genero;
    }

    public Boolean getEstado() {
        return Estado;
    }

    public void setEstado(Boolean Estado) {
        this.Estado = Estado;
    }

    public String getImg_Url() {
        return img_Url;
    }

    public void setImg_Url(String img_Url) {
        this.img_Url = img_Url;
    }


   
    
    
}
