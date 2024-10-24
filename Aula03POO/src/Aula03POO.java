
import java.util.ArrayList;
import java.util.List;


public class Aula03POO {
    public static void main(String[] args) throws Exception {
        Usuario u = new Usuario();
        u.definirNome("Rogerio");
        u.setLogin("Amanda");
        String login = u.getLogin();
        System.out.println(u.mostrarNome());

        Usuario u2 = new Usuario();
        u2.definirNome("Amanda");
        System.out.println(u2.mostrarNome());

        Usuario u3 = new Usuario();
        u3.definirNome("Gabriele");
        System.out.println(u3.mostrarNome());

        List<Usuario> usuarios = new ArrayList<Usuario>();
        usuarios.add(u);
        usuarios.add(u2);

        System.out.println("Tamanho da minha lista " + usuarios.size());
        
        usuarios.add(u3);

        System.out.println("Tamanho da minha lista " + usuarios.size());

        usuarios.remove(u3);

        System.out.println("Tamanho da minha lista " + usuarios.size());

        for (int i = 0; i < usuarios.size(); i++){
            System.out.println("Elementos da lista " + usuarios.get(i).mostrarNome());
        }
    }
}
