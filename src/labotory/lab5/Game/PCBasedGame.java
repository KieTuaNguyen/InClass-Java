package labotory.lab5.Game;

public class PCBasedGame extends Game {
    private double minRAM;
    private double hardDrive;
    private double minGHZ;

public PCBasedGame(String description, double minRAM, double hardDrive, double minGHZ) {
    super(description);
    this.minRAM = minRAM;
    this.hardDrive = hardDrive;
    this.minGHZ = minGHZ;
}
    public double getMinRAM() {
        return minRAM;
    }

    public void setMinRAM(double minRAM) {
        this.minRAM = minRAM;
    }

    public double getHardDrive() {
        return hardDrive;
    }

    public void setHardDrive(double hardDrive) {
        this.hardDrive = hardDrive;
    }

    public double getMinGHZ() {
        return minGHZ;
    }

    public void setMinGHZ(double minGHZ) {
        this.minGHZ = minGHZ;
    }

    @Override
    public String toString() {
        return "Description" + getDescription() +
                "\nMinimum megabytes of RAM: " + minRAM +
                "\nNumber of megabytes on hard drive: " + hardDrive +
                "\nMinimum GHz performance of the CPU: " + minGHZ;
    }
}
