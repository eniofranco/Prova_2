
public class Assistente extends Servidor {
    
    private String setor;
    
    public Assistente (String n, String s){
        super (n);
        this.setSetor (s);
    }
    
    public String getSetor (){
        return this.setor;
    }
    
    public void setSetor (String s){
        this.setor = s;
    }
    
    
}
