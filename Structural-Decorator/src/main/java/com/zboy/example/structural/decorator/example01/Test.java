package com.zboy.example.structural.decorator.example01;

public class Test {
    public static void main(String[] args) {
        String salaryRecords = "Name,Salary\nJohn Smith,100000\nSteven Jobs,912000";
        String path = Test.class.getResource("/out/OutputDemo.txt").getPath();
        DataSourceDecorator encoded = new CompressionDecorator(new EncryptionDecorator(new FileDataSource(path)));
        encoded.writeData(salaryRecords);
        DataSource plain = new FileDataSource(path);

        System.out.println("- Input ----------------");
        System.out.println(salaryRecords);
        System.out.println("- Encoded --------------");
        System.out.println(plain.readData());
        System.out.println("- Decoded --------------");
        System.out.println(encoded.readData());
    }
}
