import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("Curso Java");
        curso1.setDescricao("Descrição Curso Java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso JavaScript");
        curso2.setDescricao("Descrição Curso JavaScript");
        curso2.setCargaHoraria(4);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria de Java");
        mentoria.setDescricao("Descrição Mentoria Java");
        mentoria.setData(LocalDate.now());

        /*System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria);*/

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devRayanne = new Dev();
        devRayanne.setNome("Rayanne");
        devRayanne.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Rayanne: "+ devRayanne.getConteudosInscritos());
        devRayanne.progredir();
        devRayanne.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos Rayanne: "+ devRayanne.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos Rayanne: "+ devRayanne.getConteudosConcluidos());
        System.out.println("XP:" + devRayanne.calcularTotalXp());

        System.out.println("-----------------");

        Dev devBidu = new Dev();
        devBidu.setNome("Bidu");
        devBidu.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Bidu:"+ devBidu.getConteudosInscritos());
        devBidu.progredir();
        devBidu.progredir();
        devBidu.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos Bidu:"+ devBidu.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos Bidu: "+ devBidu.getConteudosConcluidos());
        System.out.println("XP:" + devBidu.calcularTotalXp());




    }
}
