public class aula01POO {
    public static void main(String[] args) throws Exception {
        // System.out.println("Hello, World!");
        // int idade = 20;

        // String primeiroNome = "Amanda";

        // String ultimoNome = "Camargo";

        // String resultado = primeiroNome + " " + ultimoNome;

        // System.out.println("A idade e " + idade);
        // System.out.println("Nome Completo: " + resultado);

        // double preco = 10.50;

        // double valorDesconto = preco * 0.9;

        // System.out.println("Valor com desconto " + valorDesconto);

        // System.out.println("Digite sua idade");
        // Scanner ler = new Scanner(System.in);
        // int idade = ler.nextInt();
        // System.out.println("A idade digitada foi " + idade);

        // JOptionPane.showMessageDialog(null, "Ola Mundo!");

        // String nome = JOptionPane.showInputDialog("Digite seu nome");
        // JOptionPane.showMessageDialog(null, "O Nome digitado foi " + nome);

        // int idade = Integer.parseInt(JOptionPane.showInputDialog("Digite sua idade"));

        // JOptionPane.showMessageDialog(null, "A idade digitada foi " + idade);

        // if (idade >= 18){
        //     JOptionPane.showMessageDialog(null, "Voce e maior de idade");
        
        // }else{
        //     JOptionPane.showMessageDialog(null, "Voce e menor de idade");
        // }

        for(int i = 0; i < 10; i++){
            System.out.println("Ola mundo FOR " + i);
        }

        int cont = 0; 
        while(cont < 10){
            System.out.println("While Condicional");
            cont = cont + 1;
        }

        do{
            System.out.println("While Condicional");
            cont++;
        }while (cont < 10);
        int[] vetor = new int [10];

        int diaSemana = 2;

        switch(diaSemana){
            case 1: {
                System.out.println("1 Segunda-feira");
                break;
        }
            case 2: {
                System.out.println(" 2 Terca-Feira");
                break;
            }
            default: {


            }

            
            }
        }
    }

