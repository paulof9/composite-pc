package br.ufes.computador;

import br.ufes.computador.builder.ComputadorEscritorioBuilder;
import br.ufes.computador.builder.ComputadorGamerBuilder;
import br.ufes.computador.builder.ComputadorServidorWebBuilder;
import br.ufes.computador.builder.Diretor;
import br.ufes.computador.model.Todo;

public class Principal {

    public static void main(String[] args) {
        Diretor diretor = new Diretor(new ComputadorEscritorioBuilder());
        Todo pcEscritorio = diretor.construir();

        System.out.println("Descrição: " + pcEscritorio.getDescricao());
        System.out.println("Preço total: " + String.format("%.2f", pcEscritorio.getPreco()));
        System.out.println();

        diretor.setBuilder(new ComputadorGamerBuilder());
        Todo pcGamer = diretor.construir();

        System.out.println("Descrição: " + pcGamer.getDescricao());
        System.out.println("Preço total: " + String.format("%.2f", pcGamer.getPreco()));
        System.out.println();

        diretor.setBuilder(new ComputadorServidorWebBuilder());
        Todo pcServidorWeb = diretor.construir();

        System.out.println("Descrição: " + pcServidorWeb.getDescricao());
        System.out.println("Preço total: " + String.format("%.2f", pcServidorWeb.getPreco()));
    }
}
