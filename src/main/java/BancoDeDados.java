import java.util.logging.Logger;

public class BancoDeDados {

    private static final Logger LOGGER = Logger.getLogger(BancoDeDados.class.getName());

    public static void iniciarConexao() {
        LOGGER.info("Iniciou Conexão");
    }

    public static void finalizarConexao() {
        LOGGER.info("Finalizou Conexão");
    }

    public static void insereDados(Pessoa pessoa){
        //insere pessoa no DB
        LOGGER.info("Inseriu dados");
    }

    public static void removeDados(Pessoa pessoa){
        //remove pessoa do DB
        LOGGER.info("Removeu dados");
    }
}
