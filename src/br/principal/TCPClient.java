/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.principal;

import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author roger
 */
public class TCPClient {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)throws IOException {
       
       Scanner teclado = new Scanner(System.in);
       String mensagem;
        ComunicadorTCP comunicacao = new ComunicadorTCP("127.0.0.1", 6789);
        
        while(true){
            System.out.println("Entre com a mensagem: ");
            mensagem = teclado.nextLine();
            comunicacao.enviarMensagem(mensagem);
            System.out.println(comunicacao.receberMensagem());
        }
    }
    
}
