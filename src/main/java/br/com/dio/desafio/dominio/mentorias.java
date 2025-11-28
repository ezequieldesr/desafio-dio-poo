package br.com.dio.desafio.dominio;

import java.time.LocalDate;

public class mentorias extends conteudo{
    private LocalDate data;


    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    @Override
    public double calcularXP(){
        return XP_padrao + 20d;
    }
    @Override
    public String toString() {
        return "mentorias{" +
                "titulo='" + getTitulo() + '\'' +
                ", descricao='" + getDescricao() + '\'' +
                ", data=" + data +
                ", calcularXP=" + calcularXP() +
                '}';
    }
}
