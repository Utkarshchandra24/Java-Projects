public class Main {
    public static void main(String[] args) {
        ComputerCase thecase = new ComputerCase("2208","Dell","240");
        Monitor theMonitor = new Monitor("27inch Beast","Acer",27,"2540 x 1440");
        Motherboard theMotherboard = new Motherboard("BJ-200","Asus",4,6,"v2.44");
        PersonalComputer ThePC = new PersonalComputer("2208","Dell",thecase,theMonitor,theMotherboard);

//        ThePC.getMonitor().drawPixelAt(10,10,"red");
//        ThePC.getMotherboard().loadProgram("Windows OS");
//        ThePC.getComputerCase().pressPowerButton();

        ThePC.powerUp();

    }




}