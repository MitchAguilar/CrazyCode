package MotorLogico;

public class Huerto {

    private Era[] era;

    public Huerto(Era[] era) {
        this.era = era;
        
    }

    public Huerto() {
        this.era = new Era[15];
    }

    public Era[] getEra() {
        return era;
    }

    public void setEra(Era[] era) {
        this.era = era;
    }

    
    public String MostrarHuerto() {
        String mostrar = "";
        for (int i = 0; i < era.length; i++) {

            mostrar += "<<<<<  " + era[i] + "\n";
        }
        return mostrar;
    }

    public boolean Sembrar(Era nuevo){
        for (int i = 0; i < era.length; i++) {
            if(era[i]==null){
                era[i]=nuevo;
                return true;
            }
        }        
        return false;
    }
    
    @Override
    public String toString() {
        return "Huerto " + MostrarHuerto();
    }

}
