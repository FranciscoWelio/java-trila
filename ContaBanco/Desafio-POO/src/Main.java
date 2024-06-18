public class Main {
    public static void main(String[] args) {
        Cursos curso1 = new Cursos();
        curso1.setTitulo();
        curso1.setCargaHoraria();
        curso1.setDescrição();

        Cursos curso2 = new Cursos();
        curso2.setTitulo("");
        curso2.setCargaHoraria();
        curso2.setDescrição("");

        Cursos curso3 = new Cursos();
        curso3.setTitulo();
        curso3.setCargaHoraria();
        curso3.setDescrição();
        
        Mentorias mentos =  new Mentorias();
        mentos.setTitulo();
        mentos.setDescrição();
        mentos.setDataMentoria();

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome();
        bootcamp.setDescrição();
        bootcamp.setDataInicial();
        bootcamp.setDataFinal();
        bootcamp.getCursosDoBoot().add();
        bootcamp.getCursosDoBoot().add();
        bootcamp.getMentoriasDoBoot().add();

        System.out.println(bootcamp.getMentoriasDoBoot());
        System.out.println(bootcamp.getDataInicial());
        System.out.println(bootcamp.getDataFinal());
        System.out.println(bootcamp.getNome());
        System.out.println(bootcamp.getDescrição());
        System.out.println(bootcamp.getDevsInscritos());
        System.out.println(bootcamp.getCursosDoBoot());


        Devs devjr = new Devs();
        devjr.setNome();
        devjr.setMentorias();
        devjr.getCursosIngressos().add();
        devjr.InscreverBootcamp(bootcamp, devjr);
        System.out.println(devjr.getCursosIngressos());
        devjr.Progredir();
        System.out.println(devjr.getCursosIngressos());
        
   
    }
}
