package connection;
// Importando as bibliotecas de conexao, janela para exibicao de erro
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class Conexao {
        public Connection conectaDB() {
            Connection conn = null;
            // Tentativa de conexao com o banco de dados
            try {
                // Passamos os parametros do banco para a variavel URL para economizar linhas
                String url = "jdbc:mysql://localhost:3306/cadastro?user=&password=";
                conn = DriverManager.getConnection(url); // Passamos a variavel URL como parametro para conexao com banco
            } catch (SQLException e) { // O "e" seria o erro caso a conexao nao seja feita
                JOptionPane.showMessageDialog(null, "Verificar a classe de conexao" + e.getMessage());
            }
            return conn; // Como o metodo nao e void ele tem de retornar algo por isso a variavel "conn"
        }
}
