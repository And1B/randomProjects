public class Droid {
    String name;
    int batteryLevel;

    public Droid(String droidName){
        this.name = droidName;
        this.batteryLevel = 100;
    }

    public static void main (String[] args) {
        Droid codey = new Droid("Codey");
        Droid maria = new Droid("Maria");
        System.out.println(codey.toString());
        System.out.println(maria.toString());
        codey.performTask("cleaning");
        codey.performTask("codeying");
        maria.performTask("cleaning");
        codey.energyReport();
        maria.energyReport();
        codey.energyTransfer(maria, 10);
        codey.energyReport();
        maria.energyReport();
    }


    public String toString() {
        return ("Hello, I'm the droid "+ this.name);
    }

    public void performTask(String task){
        System.out.println(this.name +" is performing task: "+ task);
        this.batteryLevel -= 10;
        System.out.println("New batteryLevel: "+ this.batteryLevel);
    }

    public void energyReport() {
        System.out.println(this.name +"s Battery Level is: "+ this.batteryLevel);
    }

    public void energyTransfer(Droid droidName, int amountToTransfer) {
        if (droidName.batteryLevel < amountToTransfer) {
            System.out.println("Error, not enough Energy to transfer!");
        }  else {
            droidName.batteryLevel -= amountToTransfer;
            batteryLevel += amountToTransfer;
        }
    }
}
