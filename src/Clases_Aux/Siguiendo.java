
package Clases_Aux;

public class Siguiendo {
       public String User;
    public boolean SiguiendoActualmente;

    public Siguiendo(String User, boolean SiguiendoActualmente) {
        this.User = User;
        this.SiguiendoActualmente = SiguiendoActualmente;
    }

    public String getUser() {
        return User;
    }

    public void setUser(String User) {
        this.User = User;
    }

    public boolean isSiguiendoActualmente() {
        return SiguiendoActualmente;
    }

    public void setSiguiendoActualmente(boolean SiguiendoActualmente) {
        this.SiguiendoActualmente = SiguiendoActualmente;
    }
    
}
