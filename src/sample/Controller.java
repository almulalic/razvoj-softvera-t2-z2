package sample;

import javafx.scene.control.TextField;
import javafx.scene.control.Label;
import java.util.*;
import java.util.Arrays;


public class Controller {
    public Label outputArea;
    public TextField textField;

    private int SumirajCifre(int n) {
        int suma = 0;
        while(n!=0){
            suma+=n%10;
            n/=10;
        }

        return suma;
    }

    private ArrayList SumaCifara(int n) {
        ArrayList lista = new ArrayList();

        for(int i=1;i<n;i++) {
            if(i%SumirajCifre(i) == 0)
                lista.add(i);
        }
        
        return lista;
    }
    public void ButtonAction(javafx.event.ActionEvent actionEvent) {
        outputArea.setText(String.valueOf(SumaCifara(Integer.parseInt(textField.getText()))));
    }
}
