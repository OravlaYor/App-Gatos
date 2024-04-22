package org.example;

import javax.swing.*;
import java.io.IOException;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws IOException {
        int option_menu = -1;
        String [] botones ={"1. ver gatos", "2. gatos favoritos","3. salir"};
        do {
            ///menu principal
            String opcion = (String) JOptionPane.showInputDialog(null,"gatubelos  en java","menu principal",JOptionPane.INFORMATION_MESSAGE,
                    null, botones,botones[0]);

            ///validamos la opcion que elije el usuario
            for (int i = 0; i < botones.length; i++) {
                if (opcion.equals(botones[i])){
                    option_menu=i;
                }
            }
            switch (option_menu){
                case 0:
                    GatosService.verGatos();
                    break;
                case 1:
                    Gatos gatos = new Gatos();
                    GatosService.verfavoritos(gatos.getApikey());
                default:
                    break;
            }

        }while (option_menu != 2);
    }
}