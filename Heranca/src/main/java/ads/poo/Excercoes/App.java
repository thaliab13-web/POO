//package ads.poo.Excercoes;
//
//public class App {
//    static void main(String[] args) {
//        Biblioteca biblioteca = new Biblioteca();
//
//        Aluno aluno = new Aluno("Thalia", "123", 999);
//
//        Admin admin = new Admin("Toto", "456", 445);
//
//        Bibliotecario bibliotecario = new Bibliotecario("Lucas", "777", 123);
//
//        Livro livro = new Livro("POO", false);
//
//        //polimorfismo
//
//        biblioteca.cadastrarUsuario(aluno);
//        biblioteca.cadastrarUsuario(admin);
//        biblioteca.cadastrarUsuario(bibliotecario);
//        biblioteca.cadastrarLivro(livro);
//
//        // Associação
//        biblioteca.emprestar(aluno, livro);
//
//        // Interface
//        admin.gerarRelatorio();
//        bibliotecario.gerarRelatorio();
//
//        IO.println(
//                "Limite do Aluno: " + aluno.getLimiteEmprestimo());
//
//        IO.println("Limite do Admin: " + admin.getLimiteEmprestimo());
//
//        IO.println("Limite do bibliotecario: " + bibliotecario.getLimiteEmprestimo());
//
//        biblioteca.devolver(livro);
//    }
//}
