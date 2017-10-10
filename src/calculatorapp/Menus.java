/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculatorapp;

import java.awt.Font;

/**
 *
 * @author Steven
 */
public class Menus {
//private boolean isBold=false;

    

//    txt.setText(toText);
//    return txt.getText();

public int toBold(javax.swing.JTextField txtBold){
    int font;
    font = java.awt.Font.BOLD;
    txtBold.setFont(new Font(null, font, 12));
    return font;
    }
public int toPlain(javax.swing.JTextField txtBold){
    int font;
    font = java.awt.Font.PLAIN;
    txtBold.setFont(new Font(null, font, 12));
    return font;
}

public void initialiseTxt(javax.swing.JTextField txtInOut){
    int font;
    font = java.awt.Font.PLAIN;
    txtInOut.setFont(new Font(null, font,12));
    
    }

public String round(javax.swing.JRadioButtonMenuItem rnd, javax.swing.JTextField txt){
    try{
    String display = txt.getText();
    double txtParse=Double.parseDouble(txt.getText());
    String txtReturn=String.valueOf(txtParse);
    String rndSel=rnd.getText();
    switch(rndSel){
        case "0": java.text.DecimalFormat dec = new java.text.DecimalFormat("#");                   
                    txt.setText(dec.format(txtParse)); 
                    
                    break;              
        case "1": java.text.DecimalFormat dec1 = new java.text.DecimalFormat("#.#");
                    txt.setText(dec1.format(txtParse));                   
                    break;
        case "2": java.text.DecimalFormat dec2 = new java.text.DecimalFormat("#.##");
                    txt.setText(dec2.format(txtParse));
                    break;
        case "3": java.text.DecimalFormat dec3 = new java.text.DecimalFormat("#.###");
                    txt.setText(dec3.format(txtParse));
                    break;
        case "4": java.text.DecimalFormat dec4 = new java.text.DecimalFormat("#.####");            
                    txt.setText(dec4.format(txtParse));
                    break;
        case "5": java.text.DecimalFormat dec5 = new java.text.DecimalFormat("#.#####");
                    txt.setText(dec5.format(txtParse));
                    break;
        case "6": java.text.DecimalFormat dec6 = new java.text.DecimalFormat("#.######");
                    txt.setText(dec6.format(txtParse));
                    break;
        case "7": java.text.DecimalFormat dec7 = new java.text.DecimalFormat("#.#######");
                    txt.setText(dec7.format(txtParse));
                    break;
        case "8": java.text.DecimalFormat dec8 = new java.text.DecimalFormat("#.########");
                    txt.setText(dec8.format(txtParse));
                    break;
        case "9": if(display.contains(".")){
                        if(display.substring(display.indexOf(".")).length()>9){
                            java.text.DecimalFormat dec9 = new java.text.DecimalFormat("#.#########");
                            txt.setText(dec9.format(txtParse));  
                        }
                        else{
                            txt.setText(txt.getText());
                        }
        }
        else{
            txt.setText(txt.getText());
        }
                    break;
      }

    }

        catch(NumberFormatException nfe){
                CalculatorAppFrame f = new CalculatorAppFrame();
                f.setMessageBox("Insure you have reached the end of your calculation", "Error");
                }
         catch(Exception e){
                    CalculatorAppFrame f = new CalculatorAppFrame();
                    f.setMessageBox("Please enter an appropriate input", "Error");
    }
        return txt.getText();
}
}