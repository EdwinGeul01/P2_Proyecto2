
package Information_Manager;

import Clases_Aux.Seguidores;
import Clases_Aux.Siguiendo;
import Clases_Aux.Usuario;
import Clases_Aux.twits_Escritos;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


public class Information {
    File fileUser = new File("C:\\Users\\SkyWalker\\Documents\\NetBeansProjects\\Proyecto2_Progra2\\Data Center\\users.twc");
   public ArrayList<Usuario> Usuarios = new ArrayList<>();

    public Information() {
        
        try {
            CargarInformacion();
        } catch (FileNotFoundException ex) {
        } catch (IOException ex) {
            Logger.getLogger(Information.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }

    
    public void UpdateInformation(){
        try {
            Usuarios.clear();
            CargarInformacion();
        } catch (IOException ex) {
        }
    }
    private void CargarInformacion() throws FileNotFoundException, IOException {
       RandomAccessFile ReadUser = new RandomAccessFile(fileUser, "rw");
       
        while (ReadUser.getFilePointer() < ReadUser.length()) {            
            String nombre = ReadUser.readUTF();
            String user = ReadUser.readUTF();
            String pass = ReadUser.readUTF();
            String edad = String.valueOf(ReadUser.readInt());
            char Genero = ReadUser.readChar();
            boolean Estado = ReadUser.readBoolean();
            String RutaImg = ReadUser.readUTF();
            
            Usuarios.add(new Usuario(nombre, user, pass, edad, Genero, Estado, RutaImg));
        }
        
        
        //Cargar twits
        for (int i = 0; i < Usuarios.size(); i++) {
            File twits = new File("C:\\Users\\SkyWalker\\Documents\\NetBeansProjects\\Proyecto2_Progra2\\Data Center\\USUARIOS\\"+Usuarios.get(i).getUser()+"\\twits.twc");
            RandomAccessFile ReadTwits = new RandomAccessFile(twits, "rw");
            
            while (ReadTwits.getFilePointer() < ReadTwits.length()) {                
                
                
            String nombre = ReadTwits.readUTF();
            String imgurl = ReadTwits.readUTF();
            String twit = ReadTwits.readUTF();
            int Año = Integer.valueOf(ReadTwits.readUTF());
            int Mes = Integer.valueOf(ReadTwits.readUTF());
            int dia = Integer.valueOf(ReadTwits.readUTF());
            int hr = Integer.valueOf(ReadTwits.readUTF());
            int min = Integer.valueOf(ReadTwits.readUTF());
            int seg = Integer.valueOf(ReadTwits.readUTF());
            
            Date date = new Date(Año, Mes, dia, hr, min, seg);
            
            
            Usuarios.get(i).twits.add(new twits_Escritos(nombre, imgurl, twit, date));
            
            
            
            
            }
            
            
        
        }
        
        
        //Cargar Seguidores 
        for (int i = 0; i < Usuarios.size(); i++) {

            File followers = new File("C:\\Users\\SkyWalker\\Documents\\NetBeansProjects\\Proyecto2_Progra2\\Data Center\\USUARIOS\\"+Usuarios.get(i).getUser()+"\\followers.twc");
            RandomAccessFile ReadFollowers = new RandomAccessFile(followers, "rw");
            
            while (ReadFollowers.getFilePointer() <ReadFollowers.length()) {                
                
                
            String nombre = ReadFollowers.readUTF();
            boolean estado =  ReadFollowers.readBoolean();
            
             if (estado ) {
                for (int j = 0; j < Usuarios.size(); j++) {
                   if( Usuarios.get(j).getUser().equals(nombre) && Usuarios.get(j).getEstado()){
                      
                                Usuarios.get(i).Seguidores.add(new Seguidores(nombre, estado));

                        
                   }
                }
               
             }

            }

        }
        
        
        
        //Cargar Siguiendo 
        
        for (int i = 0; i < Usuarios.size(); i++) {

            File followers = new File("C:\\Users\\SkyWalker\\Documents\\NetBeansProjects\\Proyecto2_Progra2\\Data Center\\USUARIOS\\"+Usuarios.get(i).getUser()+"\\following.twc");
            RandomAccessFile ReadFollowing = new RandomAccessFile(followers, "rw");
            
            while (ReadFollowing.getFilePointer() < ReadFollowing.length()) {                
                
                
            String nombre = ReadFollowing.readUTF();
            boolean estado =  ReadFollowing.readBoolean();
            
            
                if (estado ) {
                for (int j = 0; j < Usuarios.size(); j++) {
                   if( Usuarios.get(j).getUser().equals(nombre) && Usuarios.get(j).getEstado()){
                      
                                Usuarios.get(i).siguiendo.add(new Siguiendo(nombre, estado));

                        
                   }
                }
               
             }

            }

        }
        
       

    }
    
    public void SobreEscribir(){
        
        for (int i = 0; i < Usuarios.size(); i++) {
        
            
             File followers = new File("C:\\Users\\SkyWalker\\Documents\\NetBeansProjects\\Proyecto2_Progra2\\Data Center\\USUARIOS\\"+Usuarios.get(i).getUser()+"\\followers.twc");
        try {
            RandomAccessFile SobreescrituraFollowers = new  RandomAccessFile(followers, "rw");
            
            SobreescrituraFollowers.seek(0);
            
            for (int j = 0; j < Usuarios.get(i).Seguidores.size(); j++) {
                SobreescrituraFollowers.writeUTF(Usuarios.get(i).Seguidores.get(j).getUser());
                SobreescrituraFollowers.writeBoolean(Usuarios.get(i).Seguidores.get(j).isSiguiendoActualmente());
                
                
            }
            
            
            
        } catch (FileNotFoundException ex) {
        } catch (IOException ex) {
        }
            
            
        }
        
        //-----------------------------------------------------------------------------------------------------------------------------------------
        
        for (int i = 0; i < Usuarios.size(); i++) {
        
            
             File following = new File("C:\\Users\\SkyWalker\\Documents\\NetBeansProjects\\Proyecto2_Progra2\\Data Center\\USUARIOS\\"+Usuarios.get(i).getUser()+"\\following.twc");
        try {
            RandomAccessFile SobreescrituraFollowing = new  RandomAccessFile(following, "rw");
            
            SobreescrituraFollowing.seek(0);
            
            for (int j = 0; j < Usuarios.get(i).siguiendo.size(); j++) {
                SobreescrituraFollowing.writeUTF(Usuarios.get(i).siguiendo.get(j).getUser());
                SobreescrituraFollowing.writeBoolean(Usuarios.get(i).siguiendo.get(j).isSiguiendoActualmente());
                
                
            }
            
            
            
        } catch (FileNotFoundException ex) {
        } catch (IOException ex) {
        }catch (ArithmeticException e) {
        }
            
            
        }
        
        
        
        
        
        
    
    
    }
    
    
    
    
    
    public void SobreEscribirEstado() throws FileNotFoundException, IOException{
                     File Users = new File("C:\\Users\\SkyWalker\\Documents\\NetBeansProjects\\Proyecto2_Progra2\\Data Center\\users.twc");

                    RandomAccessFile SobreescrituraUsers = new  RandomAccessFile(Users, "rw");
                SobreescrituraUsers.seek(0);

    for (int i = 0; i < Usuarios.size(); i++) {

         SobreescrituraUsers.writeUTF(Usuarios.get(i).getNombre());
         SobreescrituraUsers.writeUTF(Usuarios.get(i).getUser());
         SobreescrituraUsers.writeUTF(Usuarios.get(i).getPass());
         SobreescrituraUsers.writeInt(Integer.valueOf(Usuarios.get(i).getEdad()));
         SobreescrituraUsers.writeChar(Usuarios.get(i).getGenero());
         SobreescrituraUsers.writeBoolean(Usuarios.get(i).getEstado());
         SobreescrituraUsers.writeUTF(Usuarios.get(i).getImg_Url());
           
         
   
        }

  
    
    
    }
    
    
}
