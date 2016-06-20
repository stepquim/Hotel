package Clases;


public class Habitacion {
    String tipo="";
    String genero="";
    int edad;
    

    /**
     * @param args the command line arguments
     */
   

    public Habitacion(String tipo,String genero,int edad) {
        this.tipo = tipo;
        this.genero = genero;
        this.edad = edad;
        
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

// Reglas:


//    Habitación sencilla tiene un costo de $100.


//    Habitación doble tiene un costo de $200.


//    Habitación matrimonial tiene un costo de $300.


//    Habitación suite tiene un costo de $500.


//    Si es hombre entre 18 y 25 años y su habitación es sencilla añadir $50.


//    Si es mujer entre 26 y 49 años y su habitación es doble añadir $100.


//    Si es mujer y su habitación es matrimonial, reducir $100.


//    Si es hombre o mujer y su edad es mayor a 50 reducir $50.


    public int getPrecioHabitacion(){
        int precio;
        precio=0;
        int valorExtra= 0;
        
        if (this.getTipo().equals("sencilla")){
            precio=100;
            
            if (this.getGenero().equals("H")){
                if (this.getEdad()>= 18 && this.getEdad()<=25){
                    valorExtra=50;
                }
                else if (this.getEdad()>= 50 && this.getEdad()<=100){
                    precio=precio-50;
                }
                else if (this.getEdad()< 18 || this.getEdad()>100){
                    System.out.println("Edad incorrecta");
                    return -1;
                }
            }
            else if(this.getGenero().equals("M")){
                if (this.getEdad()> 50 && this.getEdad()<=100){
                    precio=precio-50;
                }
                else if (this.getEdad()< 18 || this.getEdad()>100){
                    System.out.println("Edad incorrecta");
                    return -1;
                }
            }
            else{
                System.out.println("Genero no valido");
                return -1;
            }
        }
        else if  (this.getTipo().equals("doble")){
            precio=200;
            
            if (this.getGenero().equals("H")){
                
                if (this.getEdad()> 50 && this.getEdad()<=100){
                    precio=precio-50;
                }
                else if (this.getEdad()< 18 || this.getEdad()>100){
                    System.out.println("Edad incorrecta");
                    return -1;
                }
            }
            else if(this.getGenero().equals("M")){
                if (this.getEdad()>= 26 && this.getEdad()<=49){
                    valorExtra=100;
                }
                else if (this.getEdad()> 50 && this.getEdad()<=100){
                    precio=precio-50;
                }
                else if (this.getEdad()< 18 || this.getEdad()>100){
                    System.out.println("Edad incorrecta");
                    return -1;
                }
            }
            else{
                System.out.println("Genero no valido");
                return -1;
            }
        }
        else if  (this.getTipo().equals("matrimonial")){
            precio=300;
            if (this.getGenero().equals("H")){
                if (this.getEdad()> 50 && this.getEdad()<=100){
                    precio=precio-50;
                }
                else if (this.getEdad()< 18 || this.getEdad()>100){
                    System.out.println("Edad incorrecta");
                    return -1;
                }
            }
            else if(this.getGenero().equals("M")){
                precio=precio-100;
                
                if (this.getEdad()> 50 && this.getEdad()<=100){
                    precio=precio-50;
                }
                else if (this.getEdad()< 18 || this.getEdad()>100){
                    System.out.println("Edad incorrecta");
                    return -1;
                }
            }
            else{
                System.out.println("Genero no valido");
                return -1;
            }
        }
        else if (this.getTipo().equals("suite")){
            precio=500;
            if (this.getGenero().equals("H")){
                if (this.getEdad()> 50 && this.getEdad()<=100){
                    precio=precio-50;
                }
                else if (this.getEdad()< 18 || this.getEdad()>100){
                    System.out.println("Edad incorrecta");
                    return -1;
                }
            }
            else if(this.getGenero().equals("M")){
                if (this.getEdad()> 50 && this.getEdad()<=100){
                    precio=precio-50;
                }
                else if (this.getEdad()< 18 || this.getEdad()>100){
                    System.out.println("Edad incorrecta");
                    return -1;
                }
            }
            else{
                System.out.println("Genero no valido");
                return -1;
            }
    
        }
        else{
            System.out.println("Tipo de habitacion no valida");
            return -1;
        }
        
    return precio+valorExtra;
}
}

