public class Droid {
    String name;
    int batteryLevel;

    public Droid(String droidName){
        name = droidName;
        batteryLevel = 100;
    }
    public String toString() {
        return "Hello, I'm the droid: " + this.name;
    }
    public void performTask(String task) {
        if (task.equals("sleeping")) {
            batteryLevel = batteryLevel + 30;
            System.out.println("Rest is good");
        } else {
            System.out.println(name + " is performing task: " + task);
            batteryLevel = batteryLevel - 10;
        }
    }
       public void energyReport(){
           System.out.println(batteryLevel);
       }
    public static void main(String[] args){
        Droid codey = new Droid("Codey");
        System.out.println(codey.toString());
        codey.performTask("dancing");
        codey.performTask("cooking");
        codey.performTask("cleaning");
        codey.performTask("running");
        codey.performTask("walking");
        codey.performTask("working");
        codey.performTask("sleeping");
        codey.energyReport();
    }
}
