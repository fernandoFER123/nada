package chat;

import java.net.*;
import java.io.*;

public class chat {

    public static void main(String[] args) throws Exception {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in)); 
        Socket socket;
        
        String mencli1="";
        String mencli2="";  
        
               
        socket = new Socket("localhost",8000);  
        
        DataInputStream in =
        new DataInputStream(socket.getInputStream());  
        
        DataOutputStream out =
        new DataOutputStream(socket.getOutputStream()); 
    
        
        
        while(!mencli1.equals("Fin")){ 
            
            System.out.println("Envie mensaje: ");
            
            mencli1=br.readLine();
            
            out.writeUTF(mencli1); 
            
            out.flush();  
            
            mencli2=in.readUTF();  
            
            System.out.println("Mensaje recibido de Servidor: "+mencli2); 

        }  
        
        out.close(); 
        socket.close(); 
              
    } 

}


