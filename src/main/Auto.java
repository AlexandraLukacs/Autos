package main;


public class Auto {
    private static int peldanyDb = 0;
    
    private boolean uzemanyag;
    private boolean beinditva;
    
    public Auto(){
        this(false); //this()- konstruktorra hivatkozás
    }
    
    public Auto(boolean beinditva){
        this(true, beinditva);
    }
    
    public Auto(boolean uzemanyag, boolean beinditva){
        this.uzemanyag = uzemanyag; //this. - adattagra hivatkozás
        this.beinditva = beinditva;
        Auto.peldanyDb++;
        System.out.println("************************");
        System.out.printf("Az %d. verzió!\n".formatted(peldanyDb));
        System.out.println("üzemanyag: " + uzemanyag);
        System.out.println("beindítva: " + beinditva);
        System.out.println("------------------------");
    }
    
    public void setBeinditva(boolean beinditva){
        this.beinditva = beinditva;
        String b = beinditva ? "beindítva!" : "leállítva!";
        System.out.println("Az autó " + b);
    }
    
    //setUzemanyag(false)
    public void megy(){
        if (beinditva && uzemanyag) {
            uzemanyag = false;
            System.out.println("megérkeztünk, de kifogyott a benzin!");
        }else if(!beinditva){
            System.out.println("nem haladtunk, mert nincs beindítva!");
        }else if(!uzemanyag){
            System.out.println("nem haladtunk, mert nincs benzin!");
        }
    }
    
    //setUzemanyag(true)
    public void tankol(){
        if (!beinditva) {
            uzemanyag = true;
            System.out.println("tele a tank!");
        }else{
            System.out.println("nem sikerült tankolni, be van indíta az auto!");
        }
    }
}
