package MotorLogico;

import javax.swing.JOptionPane;

public class Granja {

    protected String nombre;
    private Huerto[] huerto;
    private Era[] eras;
    private Posiciones[] posiciones;
    public int cuenta;
    public int semillas;
    private String nombrecu, cedula, telefono;
    Cuenta cue = new Cuenta();

    public Granja(String nombre, Huerto[] huerto, Era[] eras, Posiciones[] posiciones, int cuenta, int semillas, String nombrecu, String cedula, String telefono) {
        this.nombre = nombre;
        this.huerto = huerto;
        this.eras = eras;
        this.posiciones = posiciones;
        this.cuenta = cuenta;
        this.semillas = semillas;
        this.nombrecu = nombrecu;
        this.cedula = cedula;
        this.telefono = telefono;
    }
    

    public Granja() {
        this.nombre = "";
        this.huerto = new Huerto[5];
        this.eras = new Era[15];
        this.posiciones = new Posiciones[30];
        this.cuenta = 0;
        this.nombrecu = "";
        this.cedula = "";
        this.telefono = "";
        this.semillas=0;
        for (int i = 0; i < huerto.length; i++) {
            huerto[i] = new Huerto();
        }
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Huerto[] getHuerto() {
        return huerto;
    }

    public void setHuerto(Huerto[] huerto) {
        this.huerto = huerto;
    }
    //rama de metodos para cuenta

    public void muertealacuenta(int cuenta) {
        this.cuenta = cuenta;
    }
    public void setcuenta(int cuenta){
        this.cuenta=cuenta;
    }

    public int returncuenta() {
        return cuenta;
    }

    public void setnombrec(String nombre) {
        this.nombrecu = nombre;
    }

    public void setcedula(String cedula) {
        this.cedula = cedula;
    }

    public void settele(String tele) {
        this.telefono = tele;
    }

    public String returnnombre() {
        return nombrecu;
    }

    public String returncedula() {
        return cedula;
    }

    public String returntele() {
        return telefono;
    }
    
    public int getsemillas(){
        return semillas;
    }
    public void setsemillas(int semillas){
        this.semillas= semillas;
    }

    //dee la granja
    public String MostrarGranja() {
        //formato
        Cuenta cue = new Cuenta();
        cue.setVcuenta(returncuenta());
        cue.setNombre(returnnombre());
        cue.setCedula(returncedula());
        cue.setTelefono(returntele());
        //estructura
        String mostrar = "";
        int cout = 0;
        int cout2 = 0;
        mostrar += "\t\t " + cue.toString()+" Semillas= " +getsemillas()+" )" + "\n";
        for (int i = 1; i <= huerto.length; i++) {
            if (huerto[i - 1] == null) {
                mostrar += ">  " + "Huerto " + (i) + ":\n";
                for (int j = 1; j <= 3; j++) {
                    if (eras[cout] == null) {
                        cout++;
                        mostrar += "\t\t" + "- Era " + (j) + " vacio" + "\n";
                        for (int k = 1; k <= 2; k++) {
                            cout2++;
                            mostrar += "\t\t\t\t" + "- pos " + (k) + " vacio" + "\n";
                        }
                    } else {
                        cout++;
                        mostrar += "\t\t" + "- Era " + (j) + " vacio" + "\n";
                        for (int k = 1; k <= 2; k++) {
                            cout2++;
                            mostrar += "\t\t\t\t" + "- pos " + (k) + " vacio" + "\n";

                        }
                    }
                }
            } //else if (i % 2 == 0) {
            //                            mostrar += "\t\t\t\t\t\t\t>  " + "Huerto " + (i) + ":\n";
            //                            for (int j = 1; j <= 3; j++) {
            //                                if (eras[cout] != null) {
            //                                    cout++;
            //                                    mostrar += "\t\t\t\t\t\t\t\t\t" + "- Era " + (j) + " Ocupado" + "\n";
            //                                    for (int k = 1; k <= 2; k++) {
            //                                        if (posiciones[cout2] != null) {
            //                                            cout2++;
            //                                            mostrar += "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t" + "- pos " + (k) + " ocupado" + "\n";
            //                                        } else {
            //                                            cout2++;
            //                                            mostrar += "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t" + "- pos " + (k) + " vacio" + "\n";
            //                                        }
            //                                    }
            //                                } else {
            //                                    cout++;
            //                                    mostrar += "\t\t\t\t\t\t\t\t\t" + "- Era " + (j) + " vacio" + "\n";
            //                                    for (int k = 1; k <= 2; k++) {
            //                                        if (posiciones[cout2] == null) {
            //                                            cout2++;
            //                                            mostrar += "\t\t\t\t\t\t\t\t\t\t\t" + "- pos " + (k) + " vacio" + "\n";
            //                                        } else {
            //                                            cout2++;
            //                                            mostrar += "\t\t\t\t\t\t\t\t\t\t\t" + "- pos " + (k) + " ocupado" + "\n";
            //                                        }
            //                                    }
            //                                }
            //                            }
            //                        } 
            else {
                mostrar += ">  " + "Huerto " + (i) + ":\n";
                for (int j = 1; j <= 3; j++) {
                    if (eras[cout] != null) {
                        cout++;
                        mostrar += "\t\t" + "- Era " + (j) + " Ocupado" + "\n";
                        for (int k = 1; k <= 2; k++) {
                            if (posiciones[cout2] != null) {
                                cout2++;
                                mostrar += "\t\t\t\t" + "- pos " + (k) + " ocupado" + "\n";
                            } else {
                                cout2++;
                                mostrar += "\t\t\t\t" + "- pos " + (k) + " vacio" + "\n";
                            }
                        }
                    } else {
                        cout++;
                        mostrar += "\t\t" + "- Era " + (j) + " vacio" + "\n";
                        for (int k = 1; k <= 2; k++) {
                            if (posiciones[cout2] == null) {
                                cout2++;
                                mostrar += "\t\t\t\t" + "- pos " + (k) + " vacio" + "\n";
                            } else {
                                cout2++;
                                mostrar += "\t\t\t\t" + "- pos " + (k) + " ocupado" + "\n";
                            }
                        }
                    }
                }
            }
            mostrar += "\n";
        }

        return mostrar;
    }

    @Override
    public String toString() {
        return "Granja" + ": " + nombre + "\n" + this.MostrarGranja() + " \n";
    }

    public void sembrarenunaposicion(Huerto nuevohuerto, Era nuevaera, Posiciones nuevapos, int poshuerto, int posera, int pospos) {
        if (poshuerto == 1) {
            if(posera==1){
                if(pospos==1){
                    pospos=pospos;
                }else{
                    pospos=pospos;
                }
            }else if(posera==2){
                if(pospos==1){
                    pospos+=2;
                }else{
                    pospos+=2;
                }
            }else{
                if(pospos==1){
                    pospos+=4;
                }else{
                    pospos+=4;
                }
            }//voy aquì
        } else if (poshuerto == 2) {
            
            if(posera==1){
                posera+=3;
                if(pospos==1){
                    pospos+=6;
                }else{
                    pospos+=6;
                }
            }else if(posera==2){
                posera+=3;
                if(pospos==1){
                    pospos+=8;
                }else{
                    pospos+=8;
                }
            }else{
                posera+=3;
                if(pospos==1){
                    pospos+=10;
                }else{
                    pospos+=10;
                }
            }//voy aquì
        } else if (poshuerto == 3) {
           
            if(posera==1){
                posera+=6;
                if(pospos==1){
                    pospos+=12;
                }else{
                    pospos+=12;
                }
            }else if(posera==2){
                posera+=6;
                if(pospos==1){
                    pospos+=14;
                }else{
                    pospos+=14;
                }
            }else{
                posera+=6;
                if(pospos==1){
                    pospos+=16;
                }else{
                    pospos+=16;
                }
            }//voy aquì
        } else if (poshuerto == 4) {
            
            if(posera==1){
                posera+=9;
                if(pospos==1){
                    pospos+=18;
                }else{
                    pospos+=18;
                }
            }else if(posera==2){
                posera+=9;
                if(pospos==1){
                    pospos+=20;
                }else{
                    pospos+=20;
                }
            }else{
                posera+=9;
                if(pospos==1){
                    pospos+=22;
                }else{
                    pospos+=22;
                }
            }//voy aquì
        } else if (poshuerto == 5) {
            
            if(posera==1){
                posera+=12;
                if(pospos==1){
                    pospos+=24;
                }else{
                    pospos+=24;
                }
            }else if(posera==2){
                posera+=12;
                if(pospos==1){
                    pospos+=26;
                }else{
                    pospos+=26;
                }
            }else{
                posera+=12;
                if(pospos==1){
                    pospos+=28;
                }else{
                    pospos+=28;
                }
            }//voy aquì
        }

        huerto[poshuerto - 1] = nuevohuerto;
        eras[posera - 1] = nuevaera;
        posiciones[pospos - 1] = nuevapos;
    }

    public void cosechartodo() {
        int cout=0;
        for (int i = 0; i < huerto.length; i++) {
            huerto[i] = null;
        }
        for (int i = 0; i < eras.length; i++) {
            eras[i] = null;
        }
        for (int i = 0; i < posiciones.length; i++) {
            if(posiciones[i]!=null){
                ++cout;
            }
            posiciones[i] = null;
        }
        muertealacuenta(cout*200);
    }

    public void Sembrartodaera(int pos1, int pos2) {
        if (pos1 == 1) {//heurto
            if (pos2 == 1) {//era
                eras[0] = new Era();
                for (int i = 0; i <= 1; i++) {
                    posiciones[i] = new Posiciones();
                }
            } else if (pos2 == 2) {
                eras[1] = new Era();
                for (int i = 2; i <= 3; i++) {
                    posiciones[i] = new Posiciones();
                }
            } else {
                eras[2] = new Era();
                for (int i = 4; i <= 5; i++) {
                    posiciones[i] = new Posiciones();
                }
            }
        } else if (pos1 == 2) {
            if (pos2 == 1) {//era
                eras[3] = new Era();
                for (int i = 6; i <= 7; i++) {
                    posiciones[i] = new Posiciones();
                }
            } else if (pos2 == 2) {
                eras[4] = new Era();
                for (int i = 8; i <= 9; i++) {
                    posiciones[i] = new Posiciones();
                }
            } else {
                eras[5] = new Era();
                for (int i = 10; i <= 11; i++) {
                    posiciones[i] = new Posiciones();
                }
            }
        } else if (pos1 == 3) {
            if (pos2 == 1) {//era
                eras[6] = new Era();
                for (int i = 12; i <= 13; i++) {
                    posiciones[i] = new Posiciones();
                }
            } else if (pos2 == 2) {
                eras[7] = new Era();
                for (int i = 14; i <= 15; i++) {
                    posiciones[i] = new Posiciones();
                }
            } else {
                eras[8] = new Era();
                for (int i = 16; i <= 17; i++) {
                    posiciones[i] = new Posiciones();
                }
            }
        } else if (pos1 == 4) {
            if (pos2 == 1) {//era
                eras[9] = new Era();
                for (int i = 18; i <= 19; i++) {
                    posiciones[i] = new Posiciones();
                }
            } else if (pos2 == 2) {
                eras[10] = new Era();
                for (int i = 20; i <= 21; i++) {
                    posiciones[i] = new Posiciones();
                }
            } else {
                eras[11] = new Era();
                for (int i = 22; i <= 23; i++) {
                    posiciones[i] = new Posiciones();
                }
            }
        } else if (pos1 == 5) {
            if (pos2 == 1) {//era
                eras[12] = new Era();
                for (int i = 24; i <= 25; i++) {
                    posiciones[i] = new Posiciones();
                }
            } else if (pos2 == 2) {
                eras[13] = new Era();
                for (int i = 26; i <= 27; i++) {
                    posiciones[i] = new Posiciones();
                }
            } else {
                eras[14] = new Era();
                for (int i = 28; i <= 29; i++) {
                    posiciones[i] = new Posiciones();
                }
            }
        }

    }

    public void recolectarposicio(int poshuerto, int posera, int pospos) {
        if (poshuerto == 1) {
            if (posera == 1) {
                posera = posera;
                if (pospos == 1) {
                    pospos = pospos;
                } else {
                    pospos = pospos;
                }
            } else if (posera == 2) {
                if (pospos == 1) {
                    pospos += 3;
                } else if (pospos == 2) {
                    pospos += 4;
                }
            } else if (pospos == 3) {
                pospos += 5;
            } else if (pospos == 2) {
                pospos += 6;
            }
        } else if (poshuerto == 2) {
            if (posera == 1) {
                posera += 3;
                if (pospos == 1) {
                    pospos += 6;
                } else if (pospos == 2) {
                    pospos += 6;
                } else {
                    pospos += 8;
                }
            } else if (posera == 2) {
                posera += 3;
                if (pospos == 1) {
                    pospos += 8;
                } else if (pospos == 2) {
                    pospos += 8;
                }
            } else {
                posera += 3;
                if (pospos == 1) {
                    pospos += 10;
                } else if (pospos == 2) {
                    pospos += 10;
                }
            }
        } else if (poshuerto == 3) {
            if (posera == 1) {
                posera += 6;
                if (pospos == 1) {
                    pospos += 12;
                } else if (pospos == 2) {
                    pospos += 12;
                } else {
                    pospos += 14;
                }
            } else if (posera == 2) {
                posera += 6;
                if (pospos == 1) {
                    pospos += 14;
                } else if (pospos == 2) {
                    pospos += 14;
                }
            } else {
                posera += 6;
                if (pospos == 1) {
                    pospos += 16;
                } else if (pospos == 2) {
                    pospos += 16;
                }
            }
        } else if (poshuerto == 4) {
            if (posera == 1) {
                posera += 9;
                if (pospos == 1) {
                    pospos += 18;
                } else if (pospos == 2) {
                    pospos += 18;
                }
            } else if (posera == 2) {
                posera += 9;
                if (pospos == 1) {
                    pospos += 20;
                } else if (pospos == 2) {
                    pospos += 20;
                }
            } else {
                posera += 9;
                if (pospos == 1) {
                    pospos += 22;
                } else if (pospos == 2) {
                    pospos += 22;
                }
            }
        } else if (poshuerto == 5) {
            if (posera == 1) {
                posera += 12;
                if (pospos == 1) {
                    pospos += 24;
                } else if (pospos == 2) {
                    pospos += 24;
                }
            } else if (posera == 2) {
                posera += 12;
                if (pospos == 1) {
                    pospos += 26;
                } else if (pospos == 2) {
                    pospos += 26;
                }
            } else {
                posera += 12;
                if (pospos == 1) {
                    pospos += 28;
                } else if (pospos == 2) {
                    pospos += 28;
                }
            }
        }
        posiciones[pospos - 1] = null;
    }
    
    public void cosechareracompleta(int pos1, int pos2) {
        if (pos1 == 1) {//heurto
            if (pos2 == 1) {//era
                eras[0] = null;
                for (int i = 0; i <= 1; i++) {
                    posiciones[i] = null;
                }
            } else if (pos2 == 2) {
                eras[1] = null;
                for (int i = 2; i <= 3; i++) {
                    posiciones[i] = null;
                }
            } else {
                eras[2] = null;
                for (int i = 4; i <= 5; i++) {
                    posiciones[i] =null;
                }
            }
        } else if (pos1 == 2) {
            if (pos2 == 1) {//era
                eras[3] = null;
                for (int i = 6; i <= 7; i++) {
                    posiciones[i] = null;
                }
            } else if (pos2 == 2) {
                eras[4] = null;
                for (int i = 8; i <= 9; i++) {
                    posiciones[i] = null;
                }
            } else {
                eras[5] = null;
                for (int i = 10; i <= 11; i++) {
                    posiciones[i] = null;
                }
            }
        } else if (pos1 == 3) {
            if (pos2 == 1) {//era
                eras[6] = null;
                for (int i = 12; i <= 13; i++) {
                    posiciones[i] = null;
                }
            } else if (pos2 == 2) {
                eras[7] = null;
                for (int i = 14; i <= 15; i++) {
                    posiciones[i] = null;
                }
            } else {
                eras[8] = null;
                for (int i = 16; i <= 17; i++) {
                    posiciones[i] = null;
                }
            }
        } else if (pos1 == 4) {
            if (pos2 == 1) {//era
                eras[9] = null;
                for (int i = 18; i <= 19; i++) {
                    posiciones[i] = null;
                }
            } else if (pos2 == 2) {
                eras[10] = null;
                for (int i = 20; i <= 21; i++) {
                    posiciones[i] =null;
                }
            } else {
                eras[11] = null;
                for (int i = 22; i <= 23; i++) {
                    posiciones[i] = null;
                }
            }
        } else if (pos1 == 5) {
            if (pos2 == 1) {//era
                eras[12] = null;
                for (int i = 24; i <= 25; i++) {
                    posiciones[i] = null;
                }
            } else if (pos2 == 2) {
                eras[13] = null;
                for (int i = 26; i <= 27; i++) {
                    posiciones[i] = null;
                }
            } else {
                eras[14] = null;
                for (int i = 28; i <= 29; i++) {
                    posiciones[i] = null;
                }
            }
        }

    }
    public  String invocardinero(){
        Cuenta cue = new Cuenta();
        cue.setVcuenta(returncuenta());
        cue.setNombre(returnnombre());
        cue.setCedula(returncedula());
        cue.setTelefono(returntele());
        return cue.toString()+" Semillas= " +getsemillas()+" )" + "\n"; 
    }
    
    public void tiem() throws InterruptedException{
        
    }
}
