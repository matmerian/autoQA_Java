package course.lesson7;

import java.io.*;
import java.util.ArrayList;

public class AppData {
    private String[] header;
    private int[][] data;

    public AppData() {

    }

    public AppData(String[] header, int[][] data) {
        this.header = header;
        this.data = data;
    }

    public int[][] getData() {
        return data;
    }

    public String[] getHeader() {
        return header;
    }

    public void setData(int[][] data) {
        this.data = data;
    }

    public void setHeader(String[] header) {
        this.header = header;
    }


    public void save(String filename) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filename))) {
            System.out.printf("Запись данных в файл %s\n", filename);

            for (String s : header) {
                writer.write(s + ";");
                System.out.print(s + "\t");
            }
            writer.write("\n");
            System.out.println();

            for (int i = 0; i < data.length; i++) {
                for (int j = 0; j < data[0].length; j++) {
                    writer.write(data[i][j] + ";");
                    System.out.print(data[i][j] + "\t\t");
                }
                writer.write("\n");
                System.out.println();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void read(String filename) {
        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            ArrayList<String[]> rowList = new ArrayList<>();
            String x;
            while ((x = reader.readLine()) != null) {
                rowList.add(x.split(";"));
            }
            /*
            System.out.printf("Вывод содержимого файла %s списками (для ленивых)\n", filename);
            for (String[] row: rowList){
                System.out.println(Arrays.toString(row));
            }
             */

            header = rowList.get(0);
            int[][] data = new int[rowList.size()][header.length];
            for (int i = 1; i < rowList.size(); i++) {
                String[] tmp = rowList.get(i);
                for (int j = 0; j < tmp.length; j++) {
                    data[i][j] = Integer.parseInt(tmp[j]);
                }
            }

            System.out.printf("Вывод содержимого файла %s в виде таблицы\n", filename);
            for (String head : header) {
                System.out.print(head + "\t");
            }
            System.out.println();
            for (int i = 0; i < data.length; i++) {
                for (int j = 0; j < data[0].length; j++) {
                    System.out.print(data[i][j] + "\t\t");
                }
                System.out.println();
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}


