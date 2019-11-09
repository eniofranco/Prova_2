
public class ProfessorEfetivo extends Professor {
    
    private int tempo;
    
    public ProfessorEfetivo (String n, Servidor c, int t){
        super (n, c);
        this.setTempo (t);
    }
    
    public int getTempo (){
        return this.tempo;
    }
    public void setTempo (int t){
        this.tempo = t;
    }
    
}
