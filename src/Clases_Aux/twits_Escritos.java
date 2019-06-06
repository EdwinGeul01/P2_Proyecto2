package Clases_Aux;

import java.util.Date;

public class twits_Escritos {
    public String nombre;
    public String imgurl;
    public String twit;
    public Date date;

    public twits_Escritos(String nombre, String imgurl,String twit, Date date) {
        this.twit = twit;
        this.date = date;
        this.nombre = nombre;
        this.imgurl = imgurl;
    }
    
}
