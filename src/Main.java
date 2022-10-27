import br.com.dio.desafio.dominio.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("curso java");
        curso1.setDescricao("descrição curso java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("curso js");
        curso2.setDescricao("descrição curso js");
        curso2.setCargaHoraria(4);

        Conteudo conteudo = new Curso();

        List<String> palavras = new ArrayList<>();

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("mentoria de java");
        mentoria.setDescricao("descrição mentoria java");
        mentoria.setData(LocalDate.now());

//        System.out.println(curso1);
//        System.out.println(curso2);
//        System.out.println(mentoria);

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devEduardo = new Dev();
        devEduardo.setNome("Eduardo");
        devEduardo.inscreverBootcamp(bootcamp);
        devEduardo.progredir();
        devEduardo.progredir();
        devEduardo.progredir();
        System.out.println("Eduardo\nConteúdos inscritos: "+devEduardo.getConteudosInscritos());
        System.out.println("Conteúdos finalizados: "+devEduardo.getConteudosConcluidos());
        System.out.println("XP: "+devEduardo.calcularXp());

        System.out.println("-----------");

        Dev devGabriela = new Dev();
        devGabriela.setNome("Gabriela");
        devGabriela.inscreverBootcamp(bootcamp);
//        System.out.println("Gabriela \nConteúdos inscritos: "+devGabriela.getConteudosInscritos());
//        devGabriela.progredir();
        devGabriela.progredir();
        System.out.println("Gabriela \nConteúdos inscritos: "+devGabriela.getConteudosInscritos());
        System.out.println("Conteúdos finalizados: "+devGabriela.getConteudosConcluidos());
        System.out.println("XP: "+devGabriela.calcularXp());






    }


}
