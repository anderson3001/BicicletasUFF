/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author aluno
 */
public class IO {
    
    public static ListaBicicletasDupEnc lerBicicletas(String nomeArq){
        ListaBicicletasDupEnc lb = null;
        
        FileReader fr = null;
        BufferedReader br = null;
        
        try{
            fr = new FileReader(nomeArq);
            br = new BufferedReader(fr);
            lb = new ListaBicicletasDupEnc();
            boolean eof = false;
            do{
                String linha = br.readLine();
                if (linha!=null){
                    //System.out.println(linha);
                    String[] campos = linha.split(" ");
                    int id = Integer.parseInt(campos[0]);
                    int patrimonio = Integer.parseInt(campos[1]);
                    int tipo = Integer.parseInt(campos[2]);
                    Bicicleta bicicleta;
                    if (tipo == 0){
                        bicicleta = new Bicicleta(id,patrimonio);
                    }
                    else{
                        bicicleta = new BicicletaGPS(id,patrimonio, "XYZ");
                    }
                    lb.append(bicicleta);
                    
                }
                else{
                    eof = true;
                }
            }while (eof!=true);
            
        }catch(FileNotFoundException e){
            System.out.println(e);
        }catch(IOException e){
            System.out.println(e);
        }finally{
            try{
                if (fr != null) fr.close();
                if (br != null) br.close();
            }catch(IOException e){
                e.printStackTrace();
            }
        }
        
        return lb;
        
    }
    


    public static ListaEstacoesDupEnc lerEstacoes(String nomeArq){
        ListaEstacoesDupEnc a = new ListaEstacoesDupEnc();

        FileReader fr = null;
        BufferedReader br = null;

        try{
            fr = new FileReader(nomeArq);
            br = new BufferedReader(fr);

            boolean eof = false;

            do{
                String linha = br.readLine();
                if (linha != null){
                    String[] campos = linha.split(" ");
                    int id = Integer.parseInt(campos[0]);
                    String nome = campos[1];
                    String localidade = campos[2];
                    Estacao estacao = new Estacao(id, nome, localidade);
                    a.append(estacao);
                }
                else {
                    eof = true;
                }

            }while (eof != true);

        }catch (FileNotFoundException e){
            System.out.println(e);
        }catch(IOException e) {
            System.out.println(e);
        }finally{
            try{
                if (fr != null) fr.close();
                if (br != null) br.close();
            }catch(IOException e){
                e.printStackTrace();
            }
        }
        return a;
        //modifcar
    }
    
    public static void lerLocalizacaoBicicletas(String nomeArq, ListaBicicletasDupEnc lb, ListaEstacoesDupEnc les){
        
        /* Implementar o método que lê a localização das bicicletas.
           Ele deve vincular uma bicicleta a uma estacao e estacionar a bicicleta na devida estação.
        */

    }
    
}


