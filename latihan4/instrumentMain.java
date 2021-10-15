class polymorphismGuitar{ // polymorphism source
    public void sound(){
        System.out.println("Jreng");
        System.out.println();
    }
    public void typeOfString(){
        System.out.println("String polymorphismGuitar");
        System.out.println();
    }
}

class nylonpolymorphismGuitar extends polymorphismGuitar{
    public void sound(){
        System.out.println("jrung jrung (more bass)");
    }
    public void typeOfString(){
        System.out.println("Nylon type");
    }
}

class stringpolymorphismGuitar extends polymorphismGuitar{
    public void sound(){
        System.out.println("jriieng jriieng (more sharp)");
    }
    public void typeOfString(){
        System.out.println("String type");
    }
} // End - Polymorphism

public class instrumentMain{
    public static void main(String[] args) {
        // Polymorphism
        nylonpolymorphismGuitar nylon = new nylonpolymorphismGuitar();
        System.out.println("Class polymorphismGuitar");
        System.out.println("==========================================");
        
        nylon.sound();
        nylon.typeOfString();

        System.out.println("==========================================");
        stringpolymorphismGuitar str = new stringpolymorphismGuitar();
        str.sound();
        str.typeOfString();
        System.out.println("==========================================");

        // Encapsulation
        System.out.println("Encapsulation");
        product p = new product();
        
        p.name = "polymorphismGuitar";p.type = "Classic";p.colour = "Brown Metalic";p.manyString = 6; //bad typing code
        System.out.println("Name = "+p.name);
        System.out.println("polymorphismGuitar type = " +p.type);
        System.out.println("polymorphismGuitar Colour = " +p.colour);
        System.out.println( "Many String on polymorphismGuitar is " +p.manyString+ " String");
        System.out.println("==========================================");

        // inheritance
        System.out.println("==========================================");
        guitar1 guiOne = new guitar1();
        System.out.println(guiOne.gName);
        System.out.println("Guitar brand = " +guiOne.brand);
        System.out.println("This Guitar is elecetric = "+guiOne.electricInstrument);
        System.out.println("This Guitar using amplifier = " +guiOne.canUseAmpilifer);
        guiOne.plucked();
        guiOne.stringOne();
        guiOne.stringTwo();
        guiOne.stringThree();
        guiOne.stringFour();
        guiOne.stringFive();
        guiOne.stringSix();
        System.out.println("==========================================");
        
        guitar2 guiTwo = new guitar2();
        System.out.println(guiTwo.gName);
        System.out.println("Guitar brand = " +guiTwo.brand);
        System.out.println("This Guitar is elecetric = " +guiTwo.electricInstrument);
        System.out.println("This Guitar using amplifier = " +guiTwo.canUseAmpilifer);
        guiTwo.plucked();
        guiTwo.stringOne();
        guiTwo.stringTwo();
        guiTwo.stringThree();
        guiTwo.stringFour();
        guiTwo.stringFive();
        guiTwo.stringSix();
    }
}