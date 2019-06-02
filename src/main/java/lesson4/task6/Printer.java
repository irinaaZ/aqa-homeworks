package lesson4.task6;

/*
"6. Create a class and demonstrate proper encapsulation techniques
the class will be called Printer
It will simulate a real Computer printer
It should have fields for toner level, number of pages printed, and also
whether its a duplex printer (capable of printing on both sides of the paper).
Add methods to fill up the toner (up to a maximum of 100%), another method to
simulate printing a page(which should increase the number of pages printed).
Decide on the scope, whether to use constructors, and anything else you think is needed."

 */

public class Printer {
    private String manufacturer;
    private String model;
    private boolean isColor;
    private String type;
    private boolean isDuplex;
    private int tonerLevelBlack;
    private int tonerLevelMagenta;
    private int tonerLevelYellow;
    private int tonerLevelBlue;
    private int printedPages;
    private int amountOfPaper;

    //for isColor == true
    public Printer(String manufacturer, String model, boolean isColor, String type, boolean isDuplex, int tonerLevelBlack, int tonerLevelMagenta, int tonerLevelYellow, int tonerLevelBlue, int printedPages, int amountOfPaper) {
        this.tonerLevelBlack = tonerLevelBlack;
        this.tonerLevelMagenta = tonerLevelMagenta;
        this.tonerLevelYellow = tonerLevelYellow;
        this.tonerLevelBlue = tonerLevelBlue;
        this.amountOfPaper = amountOfPaper;
        this.manufacturer = manufacturer;
        this.model = model;
        this.isColor = isColor;
        this.type = type;
        this.isDuplex = isDuplex;
        this.printedPages = printedPages;
    }

    //for isColor == false
    public Printer(String manufacturer, String model, boolean isColor, String type, boolean isDuplex, int tonerLevelBlack, int printedPages, int amountOfPaper) {
        this.tonerLevelBlack = tonerLevelBlack;
        this.amountOfPaper = amountOfPaper;
        this.manufacturer = manufacturer;
        this.model = model;
        this.isColor = isColor;
        this.type = type;
        this.isDuplex = isDuplex;
        this.printedPages = printedPages;
    }


    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public boolean isColor() {
        return isColor;
    }

    public void setColor(boolean color) {
        isColor = color;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public boolean isDuplex() {
        return isDuplex;
    }

    public void setDuplex(boolean duplex) {
        isDuplex = duplex;
    }

    public int getTonerLevelBlack() {
        return tonerLevelBlack;
    }

    public void setTonerLevelBlack(int tonerLevelBlack) {
        this.tonerLevelBlack = tonerLevelBlack;
    }

    //if isColor == false
    public int getTonerLevelMagenta() {
        if (isColor == false) {
            System.out.println("This is not a color printer!");
        }
        return tonerLevelMagenta;
    }

    public void setTonerLevelMagenta(int tonerLevelMagenta) {
        this.tonerLevelMagenta = tonerLevelMagenta;
    }

    //if isColor == false
    public int getTonerLevelYellow() {
        if (isColor == false) {
            System.out.println("This is not a color printer!");
        }
        return tonerLevelYellow;
    }

    public void setTonerLevelYellow(int tonerLevelYellow) {
        this.tonerLevelYellow = tonerLevelYellow;
    }

    //if isColor == false
    public int getTonerLevelBlue() {
        if (isColor == false) {
            System.out.println("This is not a color printer!");
        }
        return tonerLevelBlue;
    }

    public void setTonerLevelBlue(int tonerLevelBlue) {
        this.tonerLevelBlue = tonerLevelBlue;
    }

    public int getPrintedPages() {
        return printedPages;
    }

    public void setPrintedPages(int printedPages) {
        this.printedPages = printedPages;
    }

    public int getAmountOfPaper() {
        return amountOfPaper;
    }

    public void setAmountOfPaper(int amountOfPaper) {
        this.amountOfPaper = amountOfPaper;
    }


    private boolean blackTonerIsEmpty(int pagesToPrint) {
        if (tonerLevelBlack - (pagesToPrint / 2) < 0) {
            System.out.println("The black toner is out, please fill it up!");
            return true;
        } else {
            return false;
        }
    }

    private boolean magentaTonerIsEmpty(int pagesToPrint) {
        if (tonerLevelMagenta - (pagesToPrint / 2) < 0) {
            System.out.println("The magenta toner is out, please fill it up!");
            return true;
        } else {
            return false;
        }
    }

    private boolean yellowTonerIsEmpty(int pagesToPrint) {
        if (tonerLevelYellow - (pagesToPrint / 2) < 0) {
            System.out.println("The yellow toner is out, please fill it up!");
            return true;
        } else {
            return false;
        }
    }

    private boolean blueTonerIsEmpty(int pagesToPrint) {
        if (tonerLevelBlue - (pagesToPrint / 2) < 0) {
            System.out.println("The blue toner is out, please fill it up!");
            return true;
        } else {
            return false;
        }
    }

    private boolean paperIsEmpty(int pagesToPrint) {
        if ((this.amountOfPaper - pagesToPrint) < 0) {
            System.out.println("The paper block is empty, please fill it up!");
            return true;
        } else {
            return false;
        }
    }

    public void fillUpToner(Colors color, int percent) {
        switch (color) {
            case BLACK:
                if ((this.tonerLevelBlack + percent) > 100) {
                    System.out.println("You have entered large amount of filling percent, try again");
                } else {
                    System.out.println("The black toner was successfully filled up, the black toner level is " + (tonerLevelBlack + percent));
                }
                this.tonerLevelBlack += percent;
                break;

            case MAGENTA:
                if ((this.tonerLevelMagenta + percent) > 100) {
                    System.out.println("You have entered large amount of filling percent, try again");
                } else {
                    System.out.println("The magenta toner was successfully filled up, the magenta toner level is " + (tonerLevelMagenta + percent));
                }
                this.tonerLevelMagenta += percent;
                break;

            case YELLOW:
                if ((this.tonerLevelYellow + percent) > 100) {
                    System.out.println("You have entered large amount of filling percent, try again");
                } else {
                    System.out.println("The yellow toner was successfully filled up, the yellow toner level is " + (tonerLevelYellow + percent));
                }
                this.tonerLevelYellow += percent;
                break;

            case BLUE:
                if ((this.tonerLevelBlue + percent) > 100) {
                    System.out.println("You have entered large amount of filling percent, try again");
                } else {
                    System.out.println("The blue toner was successfully filled up, the blue toner level is " + (tonerLevelBlue + percent));
                }
                this.tonerLevelBlue += percent;
                break;

            default:
                System.out.println("You have choosed inavailable color");
                break;
        }
    }

    public void print(int pages, boolean isColor, boolean isDuplex) {
        if (paperIsEmpty(pages) == true) {
            System.out.println("The paper block is empty");
        }

        if (isColor == true) {
            if ((blackTonerIsEmpty(pages) == true) || (magentaTonerIsEmpty(pages) == true) || (yellowTonerIsEmpty(pages) == true) || (blueTonerIsEmpty(pages) == true)) {
                System.out.println("Color toner/s is/are empty");
            } else {
                if (isDuplex == true) {
                    this.amountOfPaper -= (pages / 2);
                }
                this.amountOfPaper -= pages;
                this.tonerLevelBlack -= 10;
                this.tonerLevelMagenta -= 10;
                this.tonerLevelYellow -= 10;
                this.tonerLevelBlue -= 10;
                showPrintedPages(pages);
            }

        } else if (isColor == false) {
            if ((blackTonerIsEmpty(pages) == true)) {
                System.out.println("Black toner is empty");
            } else {
                if (isDuplex == true) {
                    this.amountOfPaper -= (pages / 2);
                }
                this.amountOfPaper -= pages;
                this.tonerLevelBlack -= 20;
                showPrintedPages(pages);
            }
        }
    }

    private void showPrintedPages(int pagesToPrint) {
        System.out.println("Printing " + pagesToPrint + " pages, paper amount is: " + this.amountOfPaper);
    }

    public void fillUpPaper(int paper) {
        if ((this.amountOfPaper + paper) > 200) {
            System.out.println("The level of paper is more than 200, try to put less amount of paper");
        } else {
            System.out.println("You have successfully filled up the paper, the paper level is " + (amountOfPaper + paper));
            amountOfPaper += paper;
        }
    }
}






