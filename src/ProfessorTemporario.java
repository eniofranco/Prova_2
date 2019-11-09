public class ProfessorTemporario extends Professor {
    
    private int qtdhoras;
    
    public ProfessorTemporario (String n, Servidor c, int q){
        super (n, c);
        this.setQtdhoras (q);
    }
    
    public int getQtdhoras (){
        return this.qtdhoras;
    }
    public void setQtdhoras (int q){
        this.qtdhoras = q;
    }
    
}
