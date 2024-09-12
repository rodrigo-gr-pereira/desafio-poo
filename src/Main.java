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

        //Conteudo conteudo = new Curso();
        //Conteudo conteudo = new Mentoria();

        //List<String> palavras = new ArrayList<>();

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("mentoria java");
        mentoria.setDescricao("descricao mentoria");
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

        Dev devRodrigo = new Dev();
        devRodrigo.setNome("Rodrigo");
        devRodrigo.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos inscritos Rodrigo " + devRodrigo.getConteudosIncritos());
        devRodrigo.progredir();
        devRodrigo.progredir();
        System.out.println("-");
        System.out.println("Conteudos inscritos Rodrigo " + devRodrigo.getConteudosIncritos());
        System.out.println("Conteudos concluidos Rodrigo " + devRodrigo.getConteudosConcluidos());
        System.out.println("XP: " +devRodrigo.calcularTotalXp());

        System.out.println("-------------");

        Dev devLeid = new Dev();
        devLeid.setNome("Leid");
        devLeid.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos inscritos Leid " + devLeid.getConteudosIncritos());
        devLeid.progredir();
        devLeid.progredir();
        devLeid.progredir();
        System.out.println("-");
        System.out.println("Conteudos inscritos Leid " + devLeid.getConteudosIncritos());
        System.out.println("Conteudos concluidos Leid " + devLeid.getConteudosConcluidos());
        System.out.println("XP: " +devLeid.calcularTotalXp());

    }
}