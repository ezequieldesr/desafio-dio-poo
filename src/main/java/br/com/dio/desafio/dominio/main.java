package br.com.dio.desafio.dominio;

import java.time.LocalDate;

public class main {
    public static void main(String[] args) {

        cursos cursos1 = new cursos();
        cursos1.setTitulo("Curso de Java");
        cursos1.setDescricao("POO de Java completo");
        cursos1.setCargaHoraria(8);
//        System.out.println(cursos1);

        cursos cursos2 = new cursos();
        cursos2.setTitulo("Curso de JS");
        cursos2.setDescricao("POO de JS completo");
        cursos2.setCargaHoraria(10);
//        System.out.println(cursos2);

        mentorias mentoria = new mentorias();
        mentoria.setTitulo("Mentoria Java completo");
        mentoria.setDescricao("Uma mentoria completa de Java");
        mentoria.setData(LocalDate.now());

//        System.out.println(mentoria);

        bootcamp bootcamp = new bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Bootcamp/descricao");
        bootcamp.getConteudos().add(cursos1);
        bootcamp.getConteudos().add(cursos2);
        bootcamp.getConteudos().add(mentoria);

        dev ezequiel = new dev();
        ezequiel.setNome("Ezequiel");
        ezequiel.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos inscritos Ezequiel: " + ezequiel.getConteudosInscritos());
        ezequiel.progredir();
        ezequiel.progredir();
        ezequiel.progredir();
        System.out.println("----------------");
        System.out.println("Conteudos inscritos Ezequiel: " + ezequiel.getConteudosInscritos());
        System.out.println("Conteudos concluidos Ezequiel: " + ezequiel.getConteudosConcluidos());
        System.out.println("XP: " + ezequiel.calcularTotalXp());

        System.out.println("----------------||---------------------");

        dev eduarda = new dev();
        eduarda.setNome("Eduarda");
        eduarda.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos inscritos Eduarda: " + eduarda.getConteudosInscritos());
        eduarda.progredir();
        System.out.println("----------------");
        System.out.println("Conteudos inscritos Eduarda: " + eduarda.getConteudosInscritos());
        System.out.println("Conteudos concluidos Eduarda: " + eduarda.getConteudosConcluidos());
        System.out.println("XP: " + eduarda.calcularTotalXp());


    }
}
