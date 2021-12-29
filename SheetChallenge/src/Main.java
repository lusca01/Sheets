import java.io.IOException;

public class Main {

    public static void main(String[] args) {

        FiltrarArquivo filtroArq = new FiltrarArquivo();

        //Criar uma pasta com o nome 'temp' na raiz do hd e mover o arquivo csv para ela
        //Para fins de teste
        String pathToArchive = "C:\\temp\\marketing_campaign.csv";

        try {
            filtroArq.readFile(pathToArchive);
            filtroArq.readChildrens(pathToArchive);
            filtroArq.readTeenagers(pathToArchive);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
