import java.io.*;

public class FiltrarArquivo {

    public void readFile(String pathToArchive) throws IOException {
        File arq = new File(pathToArchive);
        if(arq.exists() && arq.isFile()) {
            FileInputStream fluxo = new FileInputStream(arq);
            InputStreamReader leitor = new InputStreamReader(fluxo);
            BufferedReader buffer = new BufferedReader(leitor);
            String linha = buffer.readLine();
            linha = buffer.readLine();
            int contadorGeral = 1, contadorFiltro = 0;
            while(linha != null) {
                String[] vetor = linha.split("\t");
                if((Integer.parseInt(vetor[1]) >= 1957 && Integer.parseInt(vetor[1]) <= 1967) && vetor[2].contains("Master") && vetor[3].contains("Married")) {
                    System.out.println(vetor[0] + "\t" + vetor[1] + "\t" + vetor[2] + "\t" + vetor[3]);
                    contadorFiltro++;
                }
                contadorGeral++;
                linha = buffer.readLine();
            }
            System.out.println("\nTotal geral: " + contadorGeral + "\nFiltrados: " + contadorFiltro);
            float difference = (contadorFiltro * 100) / contadorGeral;
            System.out.println("\nConsumer found in relation of total: " + difference + "%\n");
            buffer.close();
            leitor.close();
            fluxo.close();
        }else {
            throw new IOException("Arquivo Inválido");
        }
    }

    public void readChildrens(String pathToArchive) throws IOException {
        File arq = new File(pathToArchive);
        if(arq.exists() && arq.isFile()) {
            FileInputStream fluxo = new FileInputStream(arq);
            InputStreamReader leitor = new InputStreamReader(fluxo);
            BufferedReader buffer = new BufferedReader(leitor);
            String linha = buffer.readLine();
            linha = buffer.readLine();
            int contador = 0;
            while(linha != null) {
                String[] vetor = linha.split("\t");
                if(Integer.parseInt(vetor[5]) != 0) {
                    contador++;
                }
                linha = buffer.readLine();
            }
            System.out.println("Number of customers who have children: " + contador);
            buffer.close();
            leitor.close();
            fluxo.close();
        }else {
            throw new IOException("Arquivo Inválido");
        }
    }

    public void readTeenagers(String pathToArchive) throws IOException {
        File arq = new File(pathToArchive);
        if(arq.exists() && arq.isFile()) {
            FileInputStream fluxo = new FileInputStream(arq);
            InputStreamReader leitor = new InputStreamReader(fluxo);
            BufferedReader buffer = new BufferedReader(leitor);
            String linha = buffer.readLine();
            linha = buffer.readLine();
            int contador = 0;
            while(linha != null) {
                String[] vetor = linha.split("\t");
                if(Integer.parseInt(vetor[6]) != 0) {
                    contador++;
                }
                linha = buffer.readLine();
            }
            System.out.println("Number of customers who have teenagers: " + contador);
            buffer.close();
            leitor.close();
            fluxo.close();
        }else {
            throw new IOException("Arquivo Inválido");
        }
    }
}
