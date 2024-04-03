package builder.test;

public class ComputerMain {

    public static void main(String[] args) {
        Computer c = new Computer.Builder()
                .addCPU("Core i9 1120")
                .addRAM("16 GB RAM")
                .addStorage("1 TB SSD")
                .addScreen("24 inches").build();
        System.out.print(c.toString());
    }

}

