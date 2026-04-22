public class ComputerSpecs {
    private String processor;
    private int ram;
    private int secondaryMemory;
    private String secondaryMemoryType;
    private String os;

    public ComputerSpecs(String processor, int ram, int secondaryMemory, String secondaryMemoryType, String os) {
        this.processor = processor;
        this.ram = ram;
        this.secondaryMemory = secondaryMemory;
        this.secondaryMemoryType = secondaryMemoryType;
        this.os = os;
    }

    public String getProcessor() {
        return processor;
    }

    public int getRam() {
        return ram;
    }

    public int getSecondaryMemory() {
        return secondaryMemory;
    }

    public String getSecondaryMemoryType() {
        return secondaryMemoryType;
    }

    public String getOs() {
        return os;
    }

    @Override
    public String toString() {
        return processor + ", ram=" + ram +
                ", secondaryMemory=" + secondaryMemory +
                ", secondaryMemoryType='" + secondaryMemoryType + '\'' +
                ", os='" + os;
    }
}
