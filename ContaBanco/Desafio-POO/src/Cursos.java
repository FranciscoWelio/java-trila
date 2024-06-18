public class Cursos {
    private String titulo;
    private String descrição;
    private int cargaHoraria;
    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public String getDescrição() {
        return descrição;
    }
    public void setDescrição(String descrição) {
        this.descrição = descrição;
    }
    public int getCargaHoraria() {
        return cargaHoraria;
    }
    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }
    public int CalcularXp(int horasAssistidas, int custoXP){
        int xp = horasAssistidas * custoXP;
        return xp;
    }
}
