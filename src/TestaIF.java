
public class TestaIF {
    
    public static void main (String [] args){
        
        Servidor s1 = new Servidor ("Luciano");
        Professor p1 = new Professor ("Allan", s1);
        ProfessorTemporario pt1 = new ProfessorTemporario ("Elias", p1.getCoordenador(), 425);
        ProfessorSubstituto ps1 = new ProfessorSubstituto ("Thor", p1.getCoordenador(), "21/05/2019");
        ProfessorEfetivo pe1 = new ProfessorEfetivo ("Iron", p1.getCoordenador(), 360);
        Assistente a1 = new Assistente ("João", "Biblioteca");
                
        
        
        
        
    }
    
}
