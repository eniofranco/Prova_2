
public class Professor extends Servidor {
    
    Servidor coordenador;
    
    public Professor (String n, Servidor c){
        super (n);
        this.setCoordenador (c);
    }

        
    public Servidor getCoordenador (){
        return this.coordenador;
    }
    public void setCoordenador (Servidor c){
        this.coordenador = c;
    }
    
}
