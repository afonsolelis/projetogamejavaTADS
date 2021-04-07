
package javagameshow2;

import java.util.HashMap;

/*
* Classe Jogador
* 
* Esta classe e responsavel por armazenar as perguntas criadas,gerar um mecanismo
* que lança aleatoriamente para o jogador,calcula e armazena os acertos e erros.
*
* Para evitar que a classe pergunta ficasse com muitas responsabilidade foi criada 
* essa classe,em conjunto com um objeto da classe Pergunta sera responsavel por gerenciar
* as pergunta que serão lançadas no jogo
*
* Instruções de uso: Utilize esta classe para calcular e armazenar o total de perguntas
* respondidas,calcular e armazenar o total de acertos e inicializar e armazenar todas as 
* perguntas que estarão presentes no jogo.
* 
* Limitações de uso:Possui alto acoplamento com a classe Pergunta
* 
*/

public class Jogador {

    private int totalRespondidas; // Total de perguntas respondidas
    private int totalAcertos; // Total de perguntas respondidas corretamente
    HashMap hashPerguntas; // Hashmap responsavel por armazenar as perguntas
    
    
    /*
    * Construtor Jogador;
    * 
    * Trabalhando em conjunto com uma variavel de referencia do tipo HashMap o
    * construtor inicializa a construção das perguntas com todas as informações
    * necessarias
    *
    * Evita que os objeto sejam atribuidos com valores "null"
    */
    public Jogador(){
        hashPerguntas = new HashMap();
        
        Pergunta p1 = new Pergunta("Nome da linguagem criada pela Sun Microsystems",
            "a)Java  b)C++   c)Delphi   d)COBOL","a");
        
        Pergunta p2 = new Pergunta("Java é uma linguagem Orientada a...",
            "a)metodos   b)objetos   c)UML  d)funcoes ","b");
        
               Pergunta p3 = new Pergunta("______ sao reservados(as) para uso pelo Java",
            "a)Metodos   b)Objetos c)Palavras-chave d)Funcoes","c");
        
        Pergunta p4 = new Pergunta("A instrucao_____ e utilizada para tomar decisoes",
            "a)continue  b)break  c)else  d)if","d");
        
        Pergunta p5 = new Pergunta("A palavra-chave public e um______ de acesso",
            "a)modificador  b)criador  c)restaurador  d)apontador","a");
        
        Pergunta p6 = new Pergunta("A classe String esta no pacote______",
            "a)java.lag  b)java.pointer  c)java.lang  d)java.util","c");
        
        Pergunta p7 = new Pergunta("O metodo scanner _______ retorna um valor double",
            "a)nextInt()  b)nextDouble()  c)nextdouble()  d)next()","b");
        
         Pergunta p8 = new Pergunta("O Java e uma linguagem_____,exige que todas as variaveis tenha um tipo",
            "a)fortemente tipada  b)tipada  c)flexivel  d)engessada","a");
         
         Pergunta p9 = new Pergunta("O operador de incremento___ adiciona + 1 ao valor da variavel",
            "a)+  b)--  c)+++  d)++","d");
         
         Pergunta p10 = new Pergunta("Tipo primitivo que possui os valores true e false",
            "a)boolean  b)int  c)char  d)double","a");
         
         Pergunta p11 = new Pergunta("Estrutura que executa a acao pelo menos uma vez antes da verificacao condicional",
            "a)to while  b)do while  c)while  d)for ","b");
         
         Pergunta p12 = new Pergunta("Os metodos que realizam tarefas e nao exigem objeto sao chamados de metodos_____",
            "a)public  b)extends  c)final  d)static ","d");
         
         Pergunta p13 = new Pergunta("Comando que se acionado interrompe a execução de uma estrutura de repeticao",
            "a)exit  b)if  c)break  d)continue ","c");
         
         Pergunta p14 = new Pergunta("Comando que se acionado interrompe a execução de uma estrutura de repeticao",
            "a)exit  b)if  c)break  d)continue ","c");
         
         Pergunta p15 = new Pergunta("Um metodo e invocado com um(a)_______",
            "a)chamada de metodo  b)objeto  c)instancia  d)criacao ","a");
         
         Pergunta p16 = new Pergunta("A palavra-chave______ indica que um metodo nao retorna um valor",
            "a)String  b)void  c)abstract  d)int ","b");
         
         Pergunta p17 = new Pergunta("Listas e tabelas de valores podem ser armazenados em_____",
            "a)instancia  b)variaveis simples  c)matrizes  d)arrays ","d");
         
         Pergunta p18 = new Pergunta("Um array que utiliza dois indices e referido como um array_____",
            "a)composto  b)unidimensional  c)bidimensional  d)simples ","c");
         
         Pergunta p19 = new Pergunta("Um indice de array deve ser normalmente do tipo_____",
            "a)float  b)int  c)double  d)positivo ","b");
         
         Pergunta p20 = new Pergunta("Variaveis do tipo_____ nao podem ter seu valor alterado apos a criacao",
            "a)integer  b)final  c)const  d)long ","b");
        
        hashPerguntas.put(1,p1);
        hashPerguntas.put(2,p2);
        hashPerguntas.put(3,p3);
        hashPerguntas.put(4,p4);
        hashPerguntas.put(5,p5);
        hashPerguntas.put(6,p6);
        hashPerguntas.put(7,p7);
        hashPerguntas.put(8,p8); 
        hashPerguntas.put(9,p9);
        hashPerguntas.put(10,p10);
        hashPerguntas.put(11,p11);
        hashPerguntas.put(12,p12);
        hashPerguntas.put(13,p13);
        hashPerguntas.put(14,p14);
        hashPerguntas.put(15,p15);
        hashPerguntas.put(16,p16);
        hashPerguntas.put(17,p17);
        hashPerguntas.put(18,p18);
        hashPerguntas.put(19,p19);
        hashPerguntas.put(20,p20); 
    }
    
    /*
    * Metodo getHashPerguntas
    *
    * Extrai as informações das pergunta, retorna um objeto que contem todas as
    * informaçoes necessarias sobre a pergunta
    */
    public HashMap getHashPerguntas() {
        return hashPerguntas;
    }
    
    
    /*
    * Metodo setHashPerguntas
    *
    * Insere as informações das perguntas na forma de um objeto
    * 
    */
    public void setHashPerguntas(HashMap hashPerguntas) {
        this.hashPerguntas = hashPerguntas;
    }

    
    
    
}
