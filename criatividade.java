package subprogramas;
import java.text.DecimalFormat;
import java.util.Scanner;

public class criatividade {
	static Scanner s = new Scanner(System.in);
	static DecimalFormat dc = new DecimalFormat("00");
	
	
	public static void criaPersona() {
		System.out.println("Insira o nome do personagem: ");
		String nome = s.next();
		
		System.out.println("Insira a idade do personagem: ");
		int idade = s.nextInt();
		
		System.out.println("Insira a visão do personagem: ");
		String elemento = s.next();
		
		System.out.println("Insira a nação do personagem: ");
		String nacao = s.next();
		
        System.out.println("Insira a Vida: ");
        int hp = s.nextInt();
        System.out.println("Insira o Ataque: ");
        int atk = s.nextInt();
        System.out.println("Insira a Defesa: ");
        int def = s.nextInt();
        System.out.println("Insira a Recarga de Energia: ");
        int re = s.nextInt();
        System.out.println("Insira a proficiência: ");
        int prof = s.nextInt();
        
        
        double scale = multiplicadores();
        int atributo = 0;
        
        if(scale == 1) {
        	atributo = hp;
        }
        if(scale == 2) {
        	atributo =atk;
        }
        if(scale == 3) {
        	atributo = def;
        }
        if(scale == 4) {
        	atributo = re;
        }
        if(scale == 5) {
        	atributo = prof;
        }
        if(scale == 6){
        	atributo = 1;
        	
        }
        
        
        double dano = calculaDano(scale, atributo);
        
		System.out.println("| Introduzindo: " + nome + " |\n"
                + " ° HP: " + hp
                + " ° ATK: " + atk
                + " ° DEF: " + def
                + " ° Recarga de Energia: " + re
                + " ° Proficiência: " + prof
                + " | Dano do personagem: " + dano
                );
	}
	public static double calculaDano(double scale, int atributo) {
		
        if(scale == 1) return atributo * 0.21;
        if(scale == 2) return atributo * 0.32;
        if(scale == 3) return atributo * 0.16;
        if(scale == 4) return atributo * 0.32;
        if(scale == 5) return atributo * 0.12;
        if(scale == 6) return atributo * 1;
        return atributo * 1;
        }
    
	
	public static double multiplicadores() {
        int option = 0;
        while(option < 1 || option > 5) {
            System.out.println("Qual atributo o personagem vai escalar?\n(1)Vida\n(2)Ataque\n(3)Defesa\n(4)Recarga de energia\n(5)Proeficiência\n(6)Nenhuma");
            option = s.nextInt();
            
            if(option == 1) {
            	System.out.println("O seu personagem vai escalar com vida");
            	return 1;
            }
            
            if(option == 2) {
            	System.out.println("O seu personagem vai escalar com ataque");
            	return 2;
            }
            
            if(option == 3) {
            	System.out.println("O seu personagem vai escalar com defesa");
            	return 3;
            }
            
            if(option == 4) {
            	System.out.println("O seu personagem vai escalar com recarga de energia");
            	return 4;
            }
            
            if(option == 5) {
            	System.out.println("O seu personagem vai escalar com proeficiência");
            	return 5;
            }
            
            if(option == 6) {
            	System.out.println("O seu personagem não vai escalar com nada");
            }
            
            }
        return 6;
        }
 
	public static void main(String[] args) {

		System.out.println("Vamos criar um personagem para o Genshin Impact.\nQuantos personagens você deseja criar?");
		int quantidade = s.nextInt();
		
		for(int i = 1; i <= quantidade; i++) {
			System.out.println("Criando o " + i + "° personagem.");
			criaPersona();

		
	}

}
}