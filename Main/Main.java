package desafioExtra.main;

import java.time.LocalDate;

import desafioExtra.Bootcamp;
import desafioExtra.Curso;
import desafioExtra.Dev;
import desafioExtra.Mentoria;

public class Main {
    public static void main(String[] args) {

        Curso curso1 = new Curso();
        curso1.setTitulo("curso java");
        curso1.setDescricao("descrição curso java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("curso js");
        curso2.setDescricao("descrição curso js");
        curso2.setCargaHoraria(3);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("mentoria de java");
        mentoria.setDescricao("descrição mentoria java");
        mentoria.setData(LocalDate.now());

        /*
         * System.out.println(curso1);
         * System.out.println(curso2);
         * System.out.println(mentoria);
         */

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devGabriel = new Dev();
        devGabriel.setNome("Gabriel");
        devGabriel.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Gabriel: " + devGabriel.getConteudosInscritos());
        devGabriel.progredir();
        devGabriel.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos Gabriel: " + devGabriel.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos Gabriel: " + devGabriel.getConteudosConcluidos());
        System.out.println("XP: " + devGabriel.calcularTotalXp());

        System.out.println("--------");

        Dev devRosi = new Dev();
        devRosi.setNome("Rosi");
        devRosi.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Rosi: " + devRosi.getConteudosInscritos());
        devRosi.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos Rosi: " + devRosi.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos Rosi: " + devRosi.getConteudosConcluidos());
        System.out.println("XP: " + devRosi.calcularTotalXp());

    }

}