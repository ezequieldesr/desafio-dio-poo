package br.com.dio.desafio.dominio;

import java.time.LocalDate;

public class main {
    public static void main(String[] args) {

        cursos cursos1 = new cursos();
        cursos1.setTitulo("Curso de Java");
        cursos1.setDescricao("POO de Java completo");
        cursos1.setCargaHoraria(8);
        System.out.println(cursos1);

        cursos cursos2 = new cursos();
        cursos2.setTitulo("Curso de JS");
        cursos2.setDescricao("POO de JS completo");
        cursos2.setCargaHoraria(10);
        System.out.println(cursos2);

        mentorias mentoria = new mentorias();
        mentoria.setTitulo("Mentoria Java completo");
        mentoria.setDescricao("Uma mentoria completa de Java");
        mentoria.setData(LocalDate.now());

        System.out.println(mentoria);

    }
}
