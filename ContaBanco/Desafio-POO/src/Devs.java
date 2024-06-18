import java.util.LinkedHashSet;
import java.util.Set;

public class Devs extends Cursos {
    private String nome;
    private String mentorias;
    private String atividades;
    private Set<Cursos> cursosAssistidos = new LinkedHashSet<>();
    private Set<Cursos> cursosIngressos = new LinkedHashSet<>();
    private Mentorias mentoria = new Mentorias();

    public Set<Cursos> getCursosIngressos() {
        return cursosIngressos;
    }

    public void setCursosIngressos(Set<Cursos> cursosIngressos) {
        this.cursosIngressos = cursosIngressos;
    }

    protected Cursos curso = new Cursos();

    public Set<Cursos> getCursosAssistidos() {
        return cursosAssistidos;
    }

    public void setCursosAssistidos(Set<Cursos> cursosAssistidos) {
        this.cursosAssistidos = cursosAssistidos;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMentorias() {
        return mentorias;
    }

    public void setMentorias(String mentorias) {
        this.mentorias = mentorias;
    }

    public String getAtividades() {
        return atividades;
    }

    public void setAtividades(String atividades) {
        this.atividades = atividades;
    }

    public void InscreverBootcamp(Bootcamp bootcamp, Devs dev) {
        bootcamp.getDevsInscritos().add(dev);
        this.cursosIngressos.add(curso);
    }

    public void Progredir() {
        this.cursosAssistidos.add(curso);
        this.cursosIngressos.remove(curso);
    }

    public void CalcularXpTotal() {
        this.mentoria.CalcularXp(getCargaHoraria(), getCargaHoraria());
    }

    public void ExibirCursos() {
        System.out.println(curso);
    }
}
