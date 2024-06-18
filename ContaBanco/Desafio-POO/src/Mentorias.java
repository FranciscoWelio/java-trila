public class Mentorias {
    private String titulo;
    private String descrição;
    private String dataMentoria;
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
    public String getDataMentoria() {
        return dataMentoria;
    }
    public void setDataMentoria(String dataMentoria) {
        this.dataMentoria = dataMentoria;
    }
    public int CalcularXp(int horasAssistidas, int custoXP){
        int xp = horasAssistidas * custoXP;
        return xp;
    }
    
}
