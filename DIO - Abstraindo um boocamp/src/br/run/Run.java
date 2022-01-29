package br.run;

import br.bootcamp.*;
import java.time.LocalDate;

public class Run {

    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("Curso java");
        curso1.setDescricao("Descrição Curso Java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso C");
        curso2.setDescricao("Descrição Curso C");
        curso2.setCargaHoraria(4);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria de Java");
        mentoria.setDescricao("Descrição Mentoria Java");
        mentoria.setData(LocalDate.now());

        System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria);

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp DIO");
        bootcamp.setDescricao("Descrição Bootcamp DIO");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Aluno aluno1 = new Aluno();
        aluno1.setNome("Fulano");
        aluno1.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos:" + aluno1.getConteudosInscritos());
        aluno1.progredir();
        aluno1.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos:" + aluno1.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos:" + aluno1.getConteudosConcluidos());
        System.out.println("XP:" + aluno1.calcularTotalXp());

        System.out.println("-------");

        Aluno aluno2 = new Aluno();
        aluno2.setNome("Ciclano");
        aluno2.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos:" + aluno2.getConteudosInscritos());
        aluno2.progredir();
        aluno2.progredir();
        aluno2.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos:" + aluno2.getConteudosInscritos());
        System.out.println("Conteúdos Concluidos:" + aluno2.getConteudosConcluidos());
        System.out.println("XP:" + aluno2.calcularTotalXp());
    }
    
}
