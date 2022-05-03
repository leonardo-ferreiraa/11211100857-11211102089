/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atv10;

/**
 *
 * @author 11211100857@alunos.umc.br
 * @author 11211192989@alunos.umc.br
 */
public class Pokedex {

    /*
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        Eevee E = new Eevee();
        Jolteon J = new Jolteon();
        Glaceon G = new Glaceon();
        Leafeon L = new Leafeon();
        Vaporeon V = new Vaporeon();
        Flareon F = new Flareon();
        Espeon esp = new Espeon();
        Umbreon U = new Umbreon();
        Sylveon S = new Sylveon();
        
        System.out.println("Nome: " + E.Nome());
        System.out.println("Ataque: " + E.Ataque());
        System.out.println("Especial: " + E.Especial());
        System.out.println("Defesa: " + E.Defesa());
        System.out.println("------------------------");
        //Aponta Pokemon

        E = J;
        System.out.println("Nome: " + J.Nome());
        System.out.println("Ataque: " + J.Ataque());
        System.out.println("Especial: " + J.Especial());
        System.out.println("Defesa: " + J.Defesa());
        System.out.println("------------------------");
        E = G;
        System.out.println("Nome: " + G.Nome());
        System.out.println("Ataque: " + G.Ataque());
        System.out.println("Especial: " + G.Especial());
        System.out.println("Defesa: " + G.Defesa());
        System.out.println("------------------------");
        E = L;
        System.out.println("Nome: " + L.Nome());
        System.out.println("Ataque: " + L.Ataque());
        System.out.println("Especial: " + L.Especial());
        System.out.println("Defesa: " + L.Defesa());
        System.out.println("------------------------");
        E = V;
        System.out.println("Nome: " + V.Nome());
        System.out.println("Ataque: " + V.Ataque());
        System.out.println("Especial: " + V.Especial());
        System.out.println("Defesa: " + V.Defesa());
        System.out.println("------------------------");
        E = F;
        System.out.println("Nome: " + F.Nome());
        System.out.println("Ataque: " + F.Ataque());
        System.out.println("Especial: " + F.Especial());
        System.out.println("Defesa: " + F.Defesa());
        System.out.println("------------------------");
       E = esp;
        System.out.println("Nome: " + esp.Nome());
        System.out.println("Ataque: " + esp.Ataque());
        System.out.println("Especial: " + esp.Especial());
        System.out.println("Defesa: " + esp.Defesa());
        System.out.println("------------------------");
        E = U;
        
        System.out.println("Nome: " + U.Nome());
        System.out.println("Ataque: " + U.Ataque());
        System.out.println("Especial: " + U.Especial());
        System.out.println("Defesa: " + U.Defesa());
        System.out.println("------------------------");
        E = S;
        System.out.println("Nome: " + S.Nome());
        System.out.println("Ataque: " + S.Ataque());
        System.out.println("Especial: " + S.Especial());
        System.out.println("Defesa: " + S.Defesa());
    }

}
