public class ProfessorSubstituto extends Professor {
    
    private String data;
    
    public ProfessorSubstituto (String n, Servidor c, String d){
        super (n, c);
        this.setData (d);
    }
    
    public String getData (){
        return this.data;
    }
    public void setData (String d){
        this.data = d;
    }
    
}