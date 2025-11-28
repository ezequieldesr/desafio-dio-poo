package br.com.dio.desafio.dominio;

public class cursos extends conteudo{
    private int cargaHoraria;

    @Override
    public double calcularXP(){
        return XP_padrao * cargaHoraria;
    }

    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    @Override
    public String toString() {
        return "cursos{" +
                "titulo='" + getTitulo() + '\'' +
                ", descricao='" + getDescricao() + '\'' +
                ", cargaHoraria=" + cargaHoraria +
                ", calcularXP=" + calcularXP() +
                '}';
    }
}
