package principal;

import connection.Conexao;

public class Main {
    public static void main(String[] args) { // Metodo principal criado
        new Conexao().conectaDB(); // Instanciamos a conexao e passamos a classe
    }
}