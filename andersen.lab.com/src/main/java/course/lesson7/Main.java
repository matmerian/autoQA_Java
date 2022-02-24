package course.lesson7;

public class Main {
    public static void main(String[] args) {

        String filename1 = "test1.csv";
        String filename2 = "test2.csv";

        String[] header1 = new String[]{"Value1", "Value2", "Value3"};
        int[][] data1 = new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};


        String[] header2 = new String[]{"Value1", "Value2", "Value3", "Value4"};
        int[][] data2 = new int[][]{{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}};

        AppData dataset1 = new AppData(header1, data1);
        AppData dataset2 = new AppData(header2, data2);

        AppData loadData = new AppData();

        dataset1.save(filename1);
        loadData.read(filename1);

        dataset2.save(filename2);
        loadData.read(filename2);

        dataset1.save(filename2);
        loadData.read(filename2);
    }
}
