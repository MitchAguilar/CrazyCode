package Index;

import MotorLogico.Cuenta;
import MotorLogico.Era;
import MotorLogico.Granja;
import MotorLogico.Huerto;
import MotorLogico.Posiciones;
import java.io.IOException;
import java.util.Calendar;
import java.util.Scanner;
/*
    Solo Dios y yo conocemos éste código, ahora solo él lo conoce,
    no pierdas el tiempo entendiéndolo, y suma el siguiente contador
    de horas que otros han perdido intentando entenderlo...  

post:si eres tan descabellado en no prestar atención a la advertencia por favor por lo menos prepara café mucho cafè.
    cout= 48 h;
*/

public class Principal {

    public static void menu() {
        System.out.println("\n------------------------------------------------------------------\n");
        System.out.println("OPCIONES...");
        System.out.println("1. Ver granja Completa.");
        System.out.println("2. Comprar semillas.");
        System.out.println("3. Plantar en posiciones.");
        System.out.println("4. Plantar era completa.");
        System.out.println("5. Cosechar las posiciones.");
        System.out.println("6. Cosechar era completa.");
        System.out.println("7. Cosechar Todos los huertos con sus eras.");
        System.out.println("8. Ver cuenta.");
        System.out.println("9. Ver su estancia...");
        System.out.println("10. SALIR\n");
        System.out.println("------------------------------------------------------------------");
    }
    //precio de la semilla es de 100 pero al recilectar gana 300 asì hay una ganncia de 200 por cada colecta
    //pero tiempo para cosechar es de 5sg 
    public static void main(String[] args) throws IOException, InterruptedException {
        Scanner datos = new Scanner(System.in);
        Granja b = new Granja();
        Cuenta cue= new Cuenta();
                //tiempo de èste instante
                Calendar calendario = Calendar.getInstance();
                int ho, mi, se;
                ho = calendario.get(Calendar.HOUR_OF_DAY);
                mi = calendario.get(Calendar.MINUTE);
                se = calendario.get(Calendar.SECOND);
                
        System.out.println(" █████╗ ███████╗ ██████ ██╗███████╗███╗    ██╗ ██████  █████╗ ");
        System.out.println("██╔══██╗██╔════╝██╔════╝██║██╔════╝████╗   ██║██╔══██╗██╔══██╗");
        System.out.println("███████║███████╗██║     ██║█████╗  ██╔██╗  ██║██║  ██║███████║");
        System.out.println("██╔══██║╚════██║██║     ██║██╔══   ██║ ╚██╗██║██║  ██║██╔══██║");
        System.out.println("██║  ██║███████║╚██████╗██║███████╗██║ ╚████║ ██████╔╝██║  ██║");
        System.out.println("╚═╝  ╚═╝╚══════╝ ╚═════╝╚═╝╚══════╝╚═╝  ╚═══╝╚═════╝ ╚═╝  ╚═╝");
        System.out.println("");
        System.out.println("");
        System.out.println("                  ███████╗ ██╗     ");
        System.out.println("                  ██╔════╝ ██║     ");
        System.out.println("                  █████╗   ██║     ");
        System.out.println("                  ██╔══╝   ██║     ");
        System.out.println("                  ███████ ╗███████╗");
        System.out.println("                  ╚══════╝╚══════╝");
        System.out.println("");
        System.out.println("");
        System.out.println("    ██████╗  █████╗  ██╗      ███╗   ███╗  █████╗  ██████╗ ");
        System.out.println("    ██╔══██╗██╔══██╗ ██║      ████╗ ████║ ██╔══██╗ ██╔══██╗");
        System.out.println("    ██████╔╝███████║ ██║      ██╔████╔██║ ███████║ ██████╔╝");
        System.out.println("    ██╔═══╝ ██╔══██║ ██║      ██║╚██╔╝██║ ██╔══██║ ██╔══██╗");
        System.out.println("    ██║     ██║  ██ ║███████ ╗██║ ╚═╝ ██║ ██║  ██║ ██║  ██║");
        System.out.println("    ╚═╝     ╚═╝  ╚═╝╚══════╝╚═╝    ╚═╝╚═╝   ╚═╝╚═╝  ╚═╝");
        System.out.println(""); 
        boolean activateco = true;//cuadrar bien
           if (activateco) {
            System.out.println("Digite su nombre de usuario:\n");
            String nom = datos.nextLine();
            if (!"".equals(nom)) {b.setnombrec(nom);}else{b.setnombrec("Grangero Ranchero jamiquino terrorista");}
            System.out.println("Digite su numero de cedula:\n");
            String cedu = datos.nextLine();
            if (!"".equals(cedu)) {b.setcedula(cedu);}else{b.setcedula("400092954");}
            System.out.println("Digite su numero de telefono:\n");
            String tele = datos.nextLine();
            if (!"".equals(tele)) {b.settele(tele);}else{b.settele("313232795");}
            b.muertealacuenta(100);
            System.out.println("");
            activateco = false;
        }
        while (true) {
            menu();
            int a = datos.nextInt();
            switch (a) {
                case 1:
                    System.out.println(b.toString() + "\n");
                    break;
                case 2:
                    
                    if (b.returncuenta()<100) {
                        System.out.println("\n Cosecha Algo Para Obtener Màs Dinero \n");
                    }else{
                        System.out.println("\n ¿Cuàntas Semillas Deceas Comprar? recuerde que cada semilla cuesta 100$");
                        int semi= datos.nextInt();
                        if((b.returncuenta()-(semi*100))<0){
                            System.out.println("No Posee Suficiente Dinero\n");
                            break;
                        }
                        b.setsemillas((semi*100)/100);
                        b.muertealacuenta(b.returncuenta()-(semi*100));
                    }
                    break;
                case 3:
                    if(b.getsemillas()>=1){
                        b.setsemillas(b.getsemillas()-1);
                    System.out.println("En que huerto decea plantar");
                    int pa=datos.nextInt();
                    if (pa > 5 || pa < 0) {
                        System.out.println("DIGITE UN HUERTO CORRECTO.\n");
                        break;
                    }
                    System.out.println("\n En que era lo decea hacer");
                    int pa1= datos.nextInt();
                    if (pa1 > 3 || pa1 < 0) {
                        System.out.println("DIGITE UNA ERA CORRECTA.\n");
                        break;
                    }
                    System.out.println("\n En cual posiciòn decea plantar");
                    int pa2= datos.nextInt();
                    if(pa2 > 2 || pa2 < 0){
                        System.out.println("DIGITE UNA POSICIÒN CORRECTA\n");
                        break;
                    }
                    b.sembrarenunaposicion(new Huerto(), new Era(),new Posiciones(), pa, pa1, pa2);
                    System.out.println(b.toString());  
                    
                    }else{
                        System.out.println("\n No posees suficinetes semillas, intenta cosechar para ganar algo..");
                    }
                    break;
                case 4:
                    if (b.getsemillas()>=2) {
                        b.setsemillas(b.getsemillas()-2);
                        System.out.println("En que huerto desea sembrar (Digite un numero de 1-5)");
                        int c = datos.nextInt();
                        if (c > 5 || c < 0) {
                            System.out.println("DIGITE UN HUERTO CORRECTO.\n");
                            break;
                        }
                        System.out.println("");
                        System.out.println("En que era desea sembrar (Digite un numero de 1-3)");
                        int d = datos.nextInt();
                        if (d > 3 || d < 0) {
                            System.out.println("DIGITE UNA ERA CORRECTA.\n");
                            break;
                        }
                        b.Sembrartodaera(c, d);
                        System.out.println(b.toString() + "\n");
                    }else {
                        System.out.println("\n No posees suficinetes semillas, intenta cosechar para ganar algo..");    
                    }
                    
                    break;
                case 5:
                    b.muertealacuenta(b.returncuenta()+200);
                    System.out.println("En que huerto desea cosechar");
                    int pr1=datos.nextInt();
                    if (pr1 > 5 || pr1 < 0) {
                        System.out.println("DIGITE UN HUERTO CORRECTO.\n");
                        break;
                    }
                    System.out.println("\n En que era lo desea cosechar");
                    int pr2= datos.nextInt();
                    if (pr2 > 3 || pr2 < 0) {
                        System.out.println("DIGITE UNA ERA CORRECTA.\n");
                        break;
                    }
                    System.out.println("\n En cual posiciòn desea cosechar");
                    int pr3= datos.nextInt();
                    if(pr3 > 2 || pr3 < 0){
                        System.out.println("DIGITE UNA POSICIÒN CORRECTA\n");
                        break;
                    }
                    b.recolectarposicio(pr1, pr2, pr3);
                    System.out.println(b.toString());
                    break;
                case 6:
                    b.setcuenta(b.returncuenta()+400);
                    System.out.println("En que huerto desea cosechar (Digite un numero de 1-5)");
                    int c1 = datos.nextInt();
                    if (c1 > 5 || c1 < 0) {
                        System.out.println("DIGITE UN HUERTO CORRECTO.\n");
                        break;
                    }
                    System.out.println("");
                    System.out.println("Que era desea cosechar (Digite un numero de 1-3)");
                    int d1 = datos.nextInt();
                    if (d1 > 3 || d1 < 0) {
                        System.out.println("DIGITE UNA ERA CORRECTA.\n");
                        break;
                    }
                    b.cosechareracompleta(c1, d1);
                    System.out.println(b.toString() + "\n");
                    break;
                case 7:
                    //debo probar bien
                    b.cosechartodo();
                    System.out.println(b.toString());    
                    break;
                case 8:
                    System.out.println("\n"+b.invocardinero());
                    break;
                case 9:
                    //tiempo de èste instante
                Calendar calendario2 = Calendar.getInstance();
                int ho1, mi1, se1;
                ho1 = calendario2.get(Calendar.HOUR_OF_DAY);
                mi1 = calendario2.get(Calendar.MINUTE);
                se1 = calendario2.get(Calendar.SECOND);
                
                int re1=ho1-ho;
                int re2=mi1-mi;
                int re3=se1-se;
                if(re1<0){re1*=-1;}if(re2<0){re2*=-1;}if(re3<0){re3*=-1;}
                    System.out.println("\n"+"Señor(a) "+b.returnnombre()+" Usted llava entretenido es èsta pendejadita: ["+re1+" h] ["+re2+" m] ["+re3+" sg]");
                   break;
                case 10:
                    System.out.println(" ****************************************        ");
                    System.out.println(" *    Muchas Gracias Por  visitarnos    *        ");
                    System.out.println(" *             Vuelva Pronto            *        ");
                    System.out.println(" *                                      *        ");
                    System.out.println(" *      Profe la calificacion:          *        ");
                    System.out.println(" *                                      *        ");
                    System.out.println(" *      _______        _______          *        ");
                    System.out.println(" *     |       |      |  _    |         *        ");
                    System.out.println(" *     |   ____|      | | |   |         *        ");
                    System.out.println(" *     |  |____       | | |   |         *        ");
                    System.out.println(" *     |_____  | ___  | |_|   |         *        ");
                    System.out.println(" *      _____| ||   | |       |         *        ");
                    System.out.println(" *     |_______||___| |_______|         *        ");
                    System.out.println(" *                                      *        ");
                    System.out.println(" *           Gracias!!!!!!!             *        ");
                    System.out.println(" *                                      *        ");
                    System.out.println(" ****************************************        ");
                    System.out.println("  ************************************");
                    System.out.println("    ********************************");
                    System.out.println(" by:David Anacona, Stefany Cardenas,Maicol Aguilar");
                    return;
                default:
                    System.out.println("ERROR DIGITE UNA OPCIÓN CORRECTA--- lml\n");
                    break;
            }
        }
    }

}
