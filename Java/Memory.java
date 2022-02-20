public class Memory extends Hardware {

    /* Private Attribute */
    private String frequency;
    private String memorySize;
    private String supportsCuda;

    /* Constuctor */
    public Memory(String frequency, String memorySize, String supportsCuda) {
        this.frequency = frequency;
        this.memorySize = memorySize;
        this.supportsCuda = supportsCuda;
    }

    public Memory() {

    }

    /* Setter dan Getter Frequency */
    public void setFrequency(String frequency) {
        this.frequency = frequency;
    }

    public String getFrequency() {
        return frequency;
    }

    /* Setter dan Getter Memory Size */
    public void setMemorySize(String memorySize) {
        this.memorySize = memorySize;
    }

    public String getMemorySize() {
        return memorySize;
    }

    /* Setter dan Getter Supports Cuda */
    public void setSupportsCuda(String supportsCuda) {
        this.supportsCuda = supportsCuda;
    }

    public String getSupportsCuda() {
        return supportsCuda;
    }

    public void showMemoryData() {
        System.out.println("__/Product Data___________________");
        System.out.println("Price : " + this.getPrice());
        System.out.println("Id Product : " + this.getIdProduct());
        System.out.println("__________________________________");
        System.out.println(" ");
        System.out.println("__/Hardware Data___________________");
        System.out.println("Brand : " + this.getBrand());
        System.out.println("Model : " + this.getModel());
        System.out.println("__________________________________");
        System.out.println(" ");
        System.out.println("__/Memory Data____________________");
        System.out.println("Frequency : " + this.getFrequency());
        System.out.println("Memory Size : " + this.getMemorySize());
        System.out.println("Supports Cuda : " + this.getSupportsCuda());
        System.out.println("__________________________________");
        System.out.println(" ");
    }

}