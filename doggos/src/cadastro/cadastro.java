package cadastro;
import adoção.cachorros;
import adoção.gatos;
import petrescuesaga.petrescuesaga;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class cadastro {


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("bem vindo ao pet rescue saga");
        System.out.print("escolha um a opção para continuar");
        System.out.println("1 - login");
        System.out.println("2 - novo cadastro");
        int operation_choice = input.nextInt();
        if (operation_choice == 1) {
            System.out.print("insira seu email e senha");
            String email;
            String senha;
            email=input.next();
            senha=input.next();
            System.out.println("logado com sucesso");
        }else{
            if (operation_choice == 2) {
                System.out.print("Por favor,insira seus dados para se cadastrar:");
            }
            String nome_completo;
            String endereço;
            String Data_de_nascimento;
            String email;
            String senha;
            System.out.println("Nome completo: ");
            nome_completo = input.next();
            System.out.println("endereço: ");
            endereço = input.next();
            System.out.println("Data de nascimento: ");
            Data_de_nascimento = input.next();
            System.out.println("email: ");
            email = input.next();
            System.out.println("senha: ");
            senha = input.next();
            if(nome_completo.equals(nome_completo) && senha.equals(senha))
                System.out.println("cadastro realizado com sucesso!");
            input = new Scanner(System.in);
            List<petrescuesaga> ListaAnimais = new ArrayList<petrescuesaga>();
                System.out.println("escolha um animal para adotar!");
                System.out.println("1-cachorro");
                System.out.println("2-gato");
                int escolha = input.nextInt();
                if (escolha == 1) {
                    System.out.println(petrescuesaga.cachorros1);
                }else{
                        if (escolha == 2){
                            System.out.println(gatos.nome());
                        }
                    
                }
            }
                }
            }



