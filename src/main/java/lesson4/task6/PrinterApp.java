package lesson4.task6;

public class PrinterApp {
    public static void main(String[] args) {
        Printer printer1 = new Printer("Canon","XP122",true,"multifunctional",
                true,100,100,100,80,0,200);
        Printer printer2 = new Printer("Canon","XP122",false,"multifunctional",
                false,50,60,100);

        printer1.print(10,true,false);
        printer2.print(20,false,true);

        printer1.fillUpToner(Colors.BLUE,20);

        System.out.println(printer2.getAmountOfPaper());

        printer1.fillUpPaper(2);

        printer2.getTonerLevelBlue();

    }
}
