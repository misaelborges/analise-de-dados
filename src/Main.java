import entity.Sale;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o caminho do arquivo: ");
        String path = scanner.nextLine();

        try(BufferedReader bufferedReader = new BufferedReader(new FileReader(path))) {

            List<Sale> sales = new ArrayList<>();

            String linha = bufferedReader.readLine();
            while (linha != null) {
                String[] campos = linha.split(",");
                sales.add(new Sale(Integer.parseInt(campos[0]),
                                   Integer.parseInt(campos[1]),
                                   campos[2],
                                   Integer.parseInt(campos[3]),
                                   Double.parseDouble(campos[4])));
                linha = bufferedReader.readLine();
            }

            List<Sale> saleList = sales.stream()
                    .filter(sale -> sale.getYear().equals(2016))
                    .sorted(Comparator.comparing(Sale::averagePrice).reversed())
                    .limit(5)
                    .toList();

            for (Sale sale : saleList) {
                System.out.println(sale);
            }

            Double totalLogan = sales.stream()
                    .filter(sale -> sale.getSaller().equals("Logan"))
                    .filter(sale -> sale.getMonth() == 1 || sale.getMonth() == 7)
                    .mapToDouble(Sale::getTotal)
                    .sum();

            System.out.printf("Valor total vendido pelo vendedor Logan nos meses 1 e 7 = %.2f", totalLogan);

        } catch (IOException e) {
            throw new RuntimeException(
                    String.format("Erro: %s (o sistema não pode encontrar o arquivo especificado)", path));
        }
    }
}
