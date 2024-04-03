package builder.test;

public class Computer {
    String CPU, RAM, Storage, Screen;

    protected Computer(Builder b) {
        this.CPU = b.CPU;
        this.RAM = b.RAM;
        this.Storage = b.Storage;
        this.Screen = b.Screen;
    }

    @Override
    public String toString() {
        return "Máy tính có cấu hình: \n\t" +
                "CPU: " + this.CPU+ "\n\t"+
                "RAM" + this.RAM + "\n\t" +
                "Storage" + this.Storage + "\n\t" +
                "Screen" + this.Screen;
    }

    public static class Builder{
        private String CPU, RAM, Storage, Screen;

        public Builder() {

        }

        public Builder addCPU(String CPU) {
            this.CPU = CPU;
            return this;
        }

        public Builder addRAM(String RAM) {
            this.RAM = RAM;
            return this;
        }

        public Builder addStorage(String Storage) {
            this.Storage = Storage;
            return this;
        }

        public Builder addScreen(String Screen) {
            this.Screen = Screen;
            return this;
        }

        public Computer build() {
            return new Computer(this);
        }
    }
}