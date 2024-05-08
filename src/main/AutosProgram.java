package main;

public class AutosProgram {

    //ha nincs new = NullPointerException (hiba)
    private static AutosProgram prg = new AutosProgram();
    
    public static void main(String[] args) {
        prg.bemutatok();
    }

    private void bemutatok(){
        prg.bemutato_0();
        prg.bemutato_1();
        prg.bemutato_2();
    }
    
    private void bemutato_0() {
        new Auto();
    }

    private void bemutato_1() {
        Auto auto = new Auto(true);
        auto.tankol();
        auto.setBeinditva(false);
        auto.tankol();
        auto.megy();
        auto.setBeinditva(true);
        auto.megy();
        auto.megy();
        auto.tankol();
        auto.setBeinditva(false);
        auto.tankol();
        auto.megy();
    }
    
    private void bemutato_2() {
        new Auto(false, false);
    }
    
}
