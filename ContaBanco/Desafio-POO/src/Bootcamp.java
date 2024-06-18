import java.util.HashSet;
import java.util.Set;

public class Bootcamp {
    private String dataInicial;
    private String dataFinal;
    private String nome;
    private String descrição;
    private Set<Devs> devsInscritos = new HashSet<>();
    private Set<Cursos> cursosDoBoot = new HashSet<>();
    private Set<Mentorias> mentoriasDoBoot = new HashSet<>();

   
    public Set<Mentorias> getMentoriasDoBoot() {
        return mentoriasDoBoot;
    }

    public void setMentoriasDoBoot(Set<Mentorias> mentoriasDoBoot) {
        this.mentoriasDoBoot = mentoriasDoBoot;
    }

    public Set<Cursos> getCursosDoBoot() {
        return cursosDoBoot;
    }

    public void setCursosDoBoot(Set<Cursos> cursosDoBoot) {
        this.cursosDoBoot = cursosDoBoot;
    }

    public Set<Devs> getDevsInscritos() {
        return devsInscritos;
    }

    public void setDevsInscritos(Set<Devs> devsInscritos) {
        this.devsInscritos = devsInscritos;
    }

    public String getDataInicial() {
        return dataInicial;
    }

    public void setDataInicial(String dataInicial) {
        this.dataInicial = dataInicial;
    }

    public String getDataFinal() {
        return dataFinal;
    }

    public void setDataFinal(String dataFinal) {
        this.dataFinal = dataFinal;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescrição() {
        return descrição;
    }

    public void setDescrição(String descrição) {
        this.descrição = descrição;
    }

}
