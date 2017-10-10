/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculatorapp;
import java.math.*;
/**
 *
 * @author Steven
 */

public class Buttons{

           private String value1 ="";
           private String value2 ="";
           private String lastValue="";
           private double double1=0;
           private double double2 =0;
           private double answer=0;
           public String angleMode="Degrees";
           String operator="";
           String screenOp="";
           private int opIndex;
           private double toPower;
           private double powerValue;
           private boolean opIn=false;
           private boolean containsOp=false;
           
           private java.util.ArrayList ops = new java.util.ArrayList(4);
           private java.util.ArrayList numbers = new java.util.ArrayList();
           
           public void startDisplay(javax.swing.JTextField txt){
                txt.setText(String.valueOf((int)answer));
    }
           public void displayToBlank(javax.swing.JTextField txt){
               if(txt.getText().equals("0")||txt.getText().equals("0.0")){
                   txt.setText("");
               }
           }
           public void setScreenOp(String display){
               if(display.contains("+-")){
                   screenOp="+";
               }
               else{
               if(display.contains("+")){
                   screenOp="+";
               }
               else if(display.contains("-")){
                   screenOp="-";
               }
               else if(display.contains("*")){
                   screenOp="*";
               }
               else if(display.contains("/")){
                   screenOp="/";
               }
               else{
                   screenOp="";
               }
               
               }
           }
           public void populateNumbers(javax.swing.JTextField txt){
               
               numbers.add(txt.getText().indexOf(txt.getText().length()));
               for(int i=0; i<txt.getText().indexOf("+"); i++){
                   lastValue+=txt.getText().charAt(i);
           }
           }
           public void clearLastValue(){
                   lastValue = "";               
           }
           public void setOpValue(javax.swing.JTextField txt){

               if(!(txt.getText().contains("+")||txt.getText().contains("-")||
                       txt.getText().contains("*")||txt.getText().contains("/"))){
                   opIn=false;                    
                           }
               else{
                   opIn=true;
                   
               }
               }
           public void opBoolTrue(){        //if txt contains operator. Used in signChange
               containsOp=true;          
           }
           public void opBoolFalse(){
               containsOp=false;
           }
           public void populateOps(){
               ops.add("+");
               ops.add("-");
               ops.add("*");
               ops.add("/");
           }
           public void exceptions(javax.swing.JTextField txt){
               CalculatorAppFrame f = new CalculatorAppFrame();
               String display = txt.getText();
               if(txt.getText().contains("Infinity")){
                   txt.setText(String.valueOf(answer=0));
                   f.setMessageBox("Division by zero is not allowed", "Error");                  
           }
        }
           
           //displayToBlank(txt);
    public void setDouble1(){
        if(!(value1.isEmpty())){
            double1 = Double.parseDouble(value1);
        }
    }
    public void setDouble2(){
        if(!(value2.isEmpty())){
            double2 = Double.parseDouble(value2);
        }
    } 
    public void setOperator(String op){
        operator=op;
    }
     
    public void addOp(String operator, javax.swing.JTextField txt) {
        
        String plus="+";
        String minus="-";
        String multiply="*";
        String divide="/";
        String equals="=";  

        switch(operator){
            case "+": txt.setText(txt.getText()+plus);                       
                break;
            case "-": txt.setText(txt.getText()+minus);
                break;
            case "*": txt.setText(txt.getText()+multiply);
                break;
            case "/": txt.setText(txt.getText()+divide);
                break;
        
        }   
    }
   
    public void sinValue(String value, double answer, javax.swing.JTextField txt){
      
        String display = txt.getText();
        
        if(display.contains("+")){
            value2=display.substring(display.indexOf("+")+1,display.length());

        }
        else if(display.contains("-")){
            value2=display.substring(display.indexOf("-")+1,display.length());
     
        }
        else if(display.contains("*")){
            value2=display.substring(display.indexOf("*")+1,display.length());

        }
        else if(display.contains("/")){
            value2=display.substring(display.indexOf("/")+1,display.length());
        }
        else{
            value2=txt.getText();
        }
        
        if(angleMode=="Degrees"){
                value2=String.valueOf(Math.toRadians(Double.parseDouble(value2)));
                answer=Math.sin(Double.parseDouble(value2));
                }
            else{
                answer=Math.sin(Double.parseDouble(value2));
            }
            txt.setText(String.valueOf(answer));            
    }
    
    public void cosValue(String value, double answer, javax.swing.JTextField txt){
        String display = txt.getText();
        
        if(display.contains("+")){
            value2=display.substring(display.indexOf("+")+1,display.length());

        }
        else if(display.contains("-")){
            value2=display.substring(display.indexOf("-")+1,display.length());
     
        }
        else if(display.contains("*")){
            value2=display.substring(display.indexOf("*")+1,display.length());

        }
        else if(display.contains("/")){
            value2=display.substring(display.indexOf("/")+1,display.length());
        }
        else{
            value2=txt.getText();
        }
        
        if(angleMode=="Degrees"){
                value2=String.valueOf(Math.toRadians(Double.parseDouble(value2)));
                answer=Math.cos(Double.parseDouble(value2));
                }
            else{
                answer=Math.cos(Double.parseDouble(value2));
            }
            txt.setText(String.valueOf(answer));            
    
    }

    public void tanValue(String value, double answer, javax.swing.JTextField txt){
 String display = txt.getText();
        
        if(display.contains("+")){
            value2=display.substring(display.indexOf("+")+1,display.length());

        }
        else if(display.contains("-")){
            value2=display.substring(display.indexOf("-")+1,display.length());
     
        }
        else if(display.contains("*")){
            value2=display.substring(display.indexOf("*")+1,display.length());

        }
        else if(display.contains("/")){
            value2=display.substring(display.indexOf("/")+1,display.length());
        }
        else{
            value2=txt.getText();
        }
        
        if(angleMode=="Degrees"){
                value2=String.valueOf(Math.toRadians(Double.parseDouble(value2)));
                answer=Math.tan(Double.parseDouble(value2));
                }
            else{
                answer=Math.tan(Double.parseDouble(value2));
            }
            txt.setText(String.valueOf(answer));            
            
    }
    
    public void asinValue(String value, double answer, javax.swing.JTextField txt){
 
        String display = txt.getText();
        
        if(display.contains("+")){
            value2=display.substring(display.indexOf("+")+1,display.length());

        }
        else if(display.contains("-")){
            value2=display.substring(display.indexOf("-")+1,display.length());
     
        }
        else if(display.contains("*")){
            value2=display.substring(display.indexOf("*")+1,display.length());

        }
        else if(display.contains("/")){
            value2=display.substring(display.indexOf("/")+1,display.length());
        }
        else{
            value2=txt.getText();
        }
        
        if(angleMode=="Degrees"){
                value2=String.valueOf(Math.asin(Double.parseDouble(value2)));
                answer=Math.toDegrees(Double.parseDouble(value2));
                }
            else{
            double tempAnswer;
                value2=String.valueOf(Math.toRadians(Double.parseDouble(value2)));
                
                tempAnswer=Math.asin(Double.parseDouble(value2));
                answer=Math.toDegrees(tempAnswer);
                
            }
            txt.setText(String.valueOf(answer));            
            
    }    
        
    public void acosValue(String value, double answer, javax.swing.JTextField txt){
String display = txt.getText();
        
        if(display.contains("+")){
            value2=display.substring(display.indexOf("+")+1,display.length());

        }
        else if(display.contains("-")){
            value2=display.substring(display.indexOf("-")+1,display.length());
     
        }
        else if(display.contains("*")){
            value2=display.substring(display.indexOf("*")+1,display.length());

        }
        else if(display.contains("/")){
            value2=display.substring(display.indexOf("/")+1,display.length());
        }
        else{
            value2=txt.getText();
        }
        
        if(angleMode=="Degrees"){
                value2=String.valueOf(Math.acos(Double.parseDouble(value2)));
                answer=Math.toDegrees(Double.parseDouble(value2));
                }
            else{
            double tempAnswer;
                value2=String.valueOf(Math.toRadians(Double.parseDouble(value2)));
                
                tempAnswer=Math.acos(Double.parseDouble(value2));
                answer=Math.toDegrees(tempAnswer);
                
            }
            txt.setText(String.valueOf(answer));            
                 
    }
    
    public void atanValue(String value, double answer, javax.swing.JTextField txt){
        String display = txt.getText();
        
        if(display.contains("+")){
            value2=display.substring(display.indexOf("+")+1,display.length());

        }
        else if(display.contains("-")){
            value2=display.substring(display.indexOf("-")+1,display.length());
     
        }
        else if(display.contains("*")){
            value2=display.substring(display.indexOf("*")+1,display.length());

        }
        else if(display.contains("/")){
            value2=display.substring(display.indexOf("/")+1,display.length());
        }
        else{
            value2=txt.getText();
        }
        
        if(angleMode=="Degrees"){
                value2=String.valueOf(Math.atan(Double.parseDouble(value2)));
                answer=Math.toDegrees(Double.parseDouble(value2));
                }
            else{
                answer=Math.atan(Double.parseDouble(value2));

            }
            txt.setText(String.valueOf(answer));   
    }
    
    public void pie(String value, double answer, javax.swing.JTextField txt){
        double pi=Math.PI;
        if(txt.getText().contains("+")||txt.getText().contains("-")||txt.getText().contains("*")
                ||txt.getText().contains("/")){
            txt.setText(txt.getText()+pi);
        }
        else{
            txt.setText(String.valueOf(pi));
        }
    }
    
    public void E (String value, double answer, javax.swing.JTextField txt){
        double e=Math.E;
        if(txt.getText().contains("+")||txt.getText().contains("-")||txt.getText().contains("*")
                ||txt.getText().contains("/")){
            txt.setText(txt.getText()+e);
        }
        else{
            txt.setText(String.valueOf(e));
        }        
    }
    
    public void overX(String value, double answer, javax.swing.JTextField txt){
        try{
        String display = txt.getText();
        
        if(display.isEmpty()){
            display="";
        }
        else if(display.contains("+")){
            value1=display.substring(0,display.indexOf("+"));
            value2=display.substring(display.indexOf("+")+1,display.length());
            display=value1;
            answer=1/Double.parseDouble(value2);
            display+="+"+answer;
        
        }
        else if( display.contains("-")&!display.startsWith("-")){
            value1=display.substring(0,display.indexOf("-"));
            value2=display.substring(display.indexOf("-")+1,display.length());
            display=value1;
            answer=1/Double.parseDouble(value2);
            display+="-"+answer;
        
        }
        else if(display.contains("*")){
            value1=display.substring(0,display.indexOf("*"));
            value2=display.substring(display.indexOf("*")+1,display.length());
            display=value1;
            answer=1/Double.parseDouble(value2);
            display+="*"+answer;
        
        }
        else if(display.contains("/")){
            value1=display.substring(0,display.indexOf("/"));
            value2=display.substring(display.indexOf("/")+1,display.length());
            display=value1;
            answer=1/Double.parseDouble(value2);
            display+="/"+answer;
        
        }
        else{
            value1=txt.getText();
            answer=1/Double.parseDouble(value1);
            display=String.valueOf(answer);
        }
        txt.setText(display);
        if(txt.getText().contains("Infinity")){ throw new Exception();
        }
        }
        catch(Exception e){
            CalculatorAppFrame f = new CalculatorAppFrame();
            txt.setText(String.valueOf(answer=0));
            f.setMessageBox("Division by zero is not allowed", "Error");
            
        }
        
    } 
    
    public void fact(javax.swing.JTextField txt){
        try{
        int result=1;
        String display = txt.getText();
        String dispPastOne;
        if(display.length()>0){
            dispPastOne = txt.getText().substring(1);
        }
        else{
            dispPastOne=display;
        }
        
        int value=0;
        String line ="";
        CalculatorAppFrame f = new CalculatorAppFrame();
        if(display.startsWith("-")){
            if(dispPastOne.contains("+")||dispPastOne.contains("-")||dispPastOne.contains("*")||dispPastOne.contains("/")){
            display=display.substring(1);
            value=Integer.parseInt(display.substring(display.indexOf(operator)+1));
            line="-"+display.substring(0,display.indexOf(operator))+operator;
            }
        } 
        else if(dispPastOne.contains("+")||dispPastOne.contains("-")||dispPastOne.contains("*")||dispPastOne.contains("/")){
            value=Integer.parseInt(display.substring(display.indexOf(operator)+1));
            line=display.substring(0,display.indexOf(operator))+operator;
         }

        else{
            value=Integer.parseInt(display);
        }
           if(value>20){
            f.setMessageBox("Please provide a positive integer between 0 and 20", "Error");
              txt.setText("");
        }
           else{
               
        int i =value;
        
        while(i>=1){
            result*=i;
            
            i--;
        }
        txt.setText(line+String.valueOf(result));    
    }}
           catch(NumberFormatException nfe){
               CalculatorAppFrame f = new CalculatorAppFrame();
                       f.setMessageBox("Please provide a positive integer between 0 and 20", "Error");
                   
                   }
    }
    
    public void calculate(javax.swing.JButton button, javax.swing.JTextField txt){
        
            String plus="+";
            String minus="-";
            String multiply="*";
            String divide="/";
            String equals="=";
            String display=txt.getText();
            String onDisplay="";
            String dispPastOne=txt.getText().substring(1,txt.getText().length());
            setScreenOp(dispPastOne);
            try{
                
            
            if(!(display.isEmpty())){
                dispPastOne=txt.getText().substring(1,txt.getText().length());
            }
            else{
                dispPastOne="";
            }
            
        switch(button.getText()){
                        
        case"*":    //MULTIPLY                                          

    if(display.contains("^")){

        setPowerValue(txt.getText(), answer, txt);
        workPower(value1, answer, txt,button.getText());     //POWER

    }
    else{
    
    if(dispPastOne.contains(multiply)){
        
        double1=Double.parseDouble(display.substring(0,dispPastOne.indexOf(screenOp)+1));
        double2=Double.parseDouble(dispPastOne.substring(dispPastOne.indexOf(screenOp)+1));
        answer=double1*double2;
        txt.setText(String.valueOf(answer)+multiply);    
        }
    
    
    else if(dispPastOne.contains(plus)){
        
        double1=Double.parseDouble(display.substring(0,dispPastOne.indexOf(screenOp)+1));
        double2=Double.parseDouble(dispPastOne.substring(dispPastOne.indexOf(screenOp)+1));
        answer=double1+double2;
        txt.setText(String.valueOf(answer)+multiply);
    }
    
    else if(dispPastOne.contains(minus)){
        
        double1=Double.parseDouble(display.substring(0,dispPastOne.indexOf(screenOp)+1));
        double2=Double.parseDouble(dispPastOne.substring(dispPastOne.indexOf(screenOp)+1));
        answer=double1-double2;
        txt.setText(String.valueOf(answer)+multiply);
    }
    
    else if(dispPastOne.contains(divide)){
        
        double1=Double.parseDouble(display.substring(0,dispPastOne.indexOf(screenOp)+1));
        double2=Double.parseDouble(dispPastOne.substring(dispPastOne.indexOf(screenOp)+1));
        answer=double1/double2;

        txt.setText(String.valueOf(answer)+multiply);    
        }

    else if(display.isEmpty()){     //CE button program
        txt.setText(String.valueOf(answer)+"*");
    }
    
else{
    answer=Double.parseDouble(txt.getText());
    txt.setText(String.valueOf(answer)+multiply);   
    }
    }
            break;
                    
        case"/":    //DIVIDE
           
    if(display.contains("^")){
 
        setPowerValue(txt.getText(), answer, txt);
        workPower(value1, answer, txt,button.getText());     //POWER
    }
    else{
    if(dispPastOne.contains(divide)){
        
        double1=Double.parseDouble(display.substring(0,dispPastOne.indexOf(screenOp)+1));
        double2=Double.parseDouble(dispPastOne.substring(dispPastOne.indexOf(screenOp)+1));
        answer=double1/double2;

        txt.setText(String.valueOf(answer)+divide);    
        }
    
    
    else if(dispPastOne.contains(plus)){
        
        double1=Double.parseDouble(display.substring(0,dispPastOne.indexOf(screenOp)+1));
         double2=Double.parseDouble(dispPastOne.substring(dispPastOne.indexOf(screenOp)+1));
        answer=double1+double2;

        txt.setText(String.valueOf(answer)+divide);    
                      
    }
    
    else if(dispPastOne.contains(minus)){
        
        double1=Double.parseDouble(display.substring(0,dispPastOne.indexOf(screenOp)+1));
        double2=Double.parseDouble(dispPastOne.substring(dispPastOne.indexOf(screenOp)+1));
        answer=double1-double2;

        txt.setText(String.valueOf(answer)+divide);
    }
    
    else if(dispPastOne.contains(multiply)){
        
        double1=Double.parseDouble(display.substring(0,dispPastOne.indexOf(screenOp)+1));
        double2=Double.parseDouble(dispPastOne.substring(dispPastOne.indexOf(screenOp)+1));
        answer=double1*double2;

        txt.setText(String.valueOf(answer)+divide);    
        }
    
    else if(display.isEmpty()){     //CE button program
        txt.setText(String.valueOf(answer)+"/");
    }
    
else{
    answer=Double.parseDouble(txt.getText());
    txt.setText(String.valueOf(answer)+divide);   
    }
    }
            break;
            
        case"+":
    if(display.contains("^")){
 
        setPowerValue(txt.getText(), answer, txt);
        workPower(value1, answer, txt,button.getText());     //POWER

    }
    else{
    
if(dispPastOne.contains(divide)){
        
        double1=Double.parseDouble(display.substring(0,dispPastOne.indexOf(screenOp)+1));
        double2=Double.parseDouble(dispPastOne.substring(dispPastOne.indexOf(screenOp)+1));
        answer=double1/double2;

        txt.setText(String.valueOf(answer)+plus);    
        }
    
    
    else if(dispPastOne.contains(plus)){
        
        double1=Double.parseDouble(display.substring(0,dispPastOne.indexOf(screenOp)+1));
        double2=Double.parseDouble(dispPastOne.substring(dispPastOne.indexOf(screenOp)+1));
        answer=double1+double2;

        txt.setText(String.valueOf(answer)+plus);    
                      
    }
    
    else if(dispPastOne.contains(minus)){
        
        double1=Double.parseDouble(display.substring(0,dispPastOne.indexOf(screenOp)+1));
        double2=Double.parseDouble(dispPastOne.substring(dispPastOne.indexOf(screenOp)+1));
        answer=double1-double2;

        txt.setText(String.valueOf(answer)+plus);
    }
    
    else if(dispPastOne.contains(multiply)){
        
        double1=Double.parseDouble(display.substring(0,dispPastOne.indexOf(screenOp)+1));
        double2=Double.parseDouble(dispPastOne.substring(dispPastOne.indexOf(screenOp)+1));
        answer=double1*double2;

        txt.setText(String.valueOf(answer)+plus);    
        }
    
    else if(display.isEmpty()){     //CE button program
        txt.setText(String.valueOf(answer)+"+");
    }
    
else{
    answer=Double.parseDouble(txt.getText());
    txt.setText(String.valueOf(answer)+plus);   
    }
    }
            break;
                
        case"-":    //MINUS
    if(display.contains("^")){
 
        setPowerValue(txt.getText(), answer, txt);
        workPower(value1, answer, txt,button.getText());     //POWER

    }
    else{
    
if(dispPastOne.contains(divide)){
        
        double1=Double.parseDouble(display.substring(0,dispPastOne.indexOf(screenOp)+1));
        double2=Double.parseDouble(dispPastOne.substring(dispPastOne.indexOf(screenOp)+1));
        answer=double1/double2;

        txt.setText(String.valueOf(answer)+minus);    
        }
    
    
    else if(dispPastOne.contains(plus)){
        
        double1=Double.parseDouble(display.substring(0,dispPastOne.indexOf(screenOp)+1));
        double2=Double.parseDouble(dispPastOne.substring(dispPastOne.indexOf(screenOp)+1));
        answer=double1+double2;

        txt.setText(String.valueOf(answer)+minus);    
                      
    }
    
    else if(dispPastOne.contains(minus)){
        
        double1=Double.parseDouble(display.substring(0,dispPastOne.indexOf(screenOp)+1));
        double2=Double.parseDouble(dispPastOne.substring(dispPastOne.indexOf(screenOp)+1));
        answer=double1-double2;

        txt.setText(String.valueOf(answer)+minus);
    }
    
    else if(dispPastOne.contains(multiply)){
        
        double1=Double.parseDouble(display.substring(0,dispPastOne.indexOf(screenOp)+1));
        double2=Double.parseDouble(dispPastOne.substring(dispPastOne.indexOf(screenOp)+1));
        answer=double1*double2;

        txt.setText(String.valueOf(answer)+minus);    
        }
    
    else if(display.isEmpty()){     //CE button program
        txt.setText(String.valueOf(answer)+"-");
    }
    
else{
    answer=Double.parseDouble(txt.getText());
    txt.setText(String.valueOf(answer)+minus);   
    } 
    }
            break;                
            
        case "=":   //EQUALS
            exceptions(txt);
    if(display.contains("^")){
        setPowerValue(txt.getText(), answer, txt);
        workPower(value1, answer, txt,button.getText());     //POWER
        
    }     
                   
    else{
if(dispPastOne.contains(divide)){
        
        double1=Double.parseDouble(display.substring(0,dispPastOne.indexOf(screenOp)+1));
        double2=Double.parseDouble(dispPastOne.substring(dispPastOne.indexOf(screenOp)+1));
        answer=double1/double2;

        txt.setText(String.valueOf(answer));    
        }
    
    
    else if(dispPastOne.contains(plus)){
        
        double1=Double.parseDouble(display.substring(0,dispPastOne.indexOf(screenOp)+1));
        double2=Double.parseDouble(dispPastOne.substring(dispPastOne.indexOf(screenOp)+1));
        answer=double1+double2;

        txt.setText(String.valueOf(answer));    
                      
    }
    
    else if(dispPastOne.contains(minus)){
        
        double1=Double.parseDouble(display.substring(0,dispPastOne.indexOf(screenOp)+1));
        double2=Double.parseDouble(dispPastOne.substring(dispPastOne.indexOf(screenOp)+1));
        answer=double1-double2;

        txt.setText(String.valueOf(answer));
    }
    
    else if(dispPastOne.contains(multiply)){
        
        double1=Double.parseDouble(display.substring(0,dispPastOne.indexOf(screenOp)+1));
        double2=Double.parseDouble(dispPastOne.substring(dispPastOne.indexOf(screenOp)+1));
        answer=double1*double2;

        txt.setText(String.valueOf(answer));    
        }
    
    else if(display.isEmpty()){     //CE button program
        txt.setText(String.valueOf(answer));
    }
    
else{
    answer=Double.parseDouble(txt.getText());
    txt.setText(String.valueOf(answer));   
    }
            break;                
            }
        }}
        catch(NumberFormatException nfe){
                CalculatorAppFrame f = new CalculatorAppFrame();
                f.setMessageBox("Please enter an appropriate input", "Error");
                }
         catch(Exception e){
                    CalculatorAppFrame f = new CalculatorAppFrame();
                    f.setMessageBox("Please enter an appropriate input", "Error");
    }

    }
    
    public void addPowerSymbol(javax.swing.JTextField txt){
        String display = txt.getText();
        String dispPastOne="";
        if(display.length()<1){
            dispPastOne="";
        }
        else{
            dispPastOne=txt.getText().substring(1,txt.getText().length());
        }
        if(display.isEmpty()){
            txt.setText("");
        }
        if(screenOp==""&!display.isEmpty()&display.contains("^")){
            txt.setText(display);

        }
        else{
            if(dispPastOne.contains("+")){
                txt.setText(display+"^");
            }
            else{
                txt.setText(display+"^");
            }
        }
    }
    
    public void setValueToPower(double answer, javax.swing.JTextField txt){
        try{
 String display = txt.getText();
 setScreenOp(display);
 String dispPastOne="";
         if(display.length()<1){
            dispPastOne="";
        }
        else{
            dispPastOne=txt.getText().substring(1,txt.getText().length());
        }
         
        if(display.isEmpty()){
            toPower=0;
        }
        else{
            if(dispPastOne.contains("+")){
                
                toPower=Double.parseDouble(dispPastOne.substring(dispPastOne.indexOf("+")+1,dispPastOne.indexOf("^")));
            }
            else if(dispPastOne.contains("-")){
                toPower=Double.parseDouble(dispPastOne.substring(dispPastOne.indexOf("-")+1,dispPastOne.indexOf("^")));
            }
            else if(dispPastOne.contains("*")){
                toPower=Double.parseDouble(dispPastOne.substring(dispPastOne.indexOf("*")+1,dispPastOne.indexOf("^")));
            }
            else if(dispPastOne.contains("/")){
                toPower=Double.parseDouble(dispPastOne.substring(dispPastOne.indexOf("/")+1,dispPastOne.indexOf("^")));
            }
            else{
                toPower=Double.parseDouble(display.substring(0,display.indexOf("^")));
                
            }
            
        } }
        catch(NumberFormatException nfe){
                    CalculatorAppFrame f = new CalculatorAppFrame();
                    f.setMessageBox("Please enter an appropriate input", "Error");
                
        }
         catch(Exception e){
                    CalculatorAppFrame f = new CalculatorAppFrame();
                    f.setMessageBox("Please enter an appropriate input", "Error");
    } 
    }
    
    public void setPowerValue(String display, double answer, javax.swing.JTextField txt){
        try{
        display = txt.getText();

        if(display.contains("^")){   
            powerValue = Double.parseDouble(display.substring(display.indexOf("^")+1, display.length()));
        }
        else{
            powerValue = 0;
            
        }
        }
        catch(NumberFormatException nfe){
                CalculatorAppFrame f = new CalculatorAppFrame();
                f.setMessageBox("Please enter an appropriate input", "Error");
                }
         catch(Exception e){
                    CalculatorAppFrame f = new CalculatorAppFrame();
                    f.setMessageBox("Please enter an appropriate input", "Error");
    }
      
    }
    
    public double returnPower(String sub){
        
        toPower=Double.parseDouble(sub.substring(0,sub.indexOf("^")));
        powerValue=Double.parseDouble(sub.substring(sub.indexOf("^")+1));
        double result=Math.pow(toPower, powerValue);
        return result;
        

    }
    
    public void workPower(String value, double answerX, javax.swing.JTextField txt, String btnTxt){
        try{   
        double result=0;
        String display = txt.getText();
        String dispPastOne=display.substring(1);
        
        if(display.contains("+")){
            double1=Double.parseDouble(display.substring(0, display.indexOf("+")));
            value2=display.substring(display.indexOf("+"));
            result=returnPower(value2);
            txt.setText(String.valueOf(double1)+"+"+String.valueOf(result));    
        }
        if(dispPastOne.contains("-")){
            double1=Double.parseDouble(display.substring(0, display.indexOf("-")));
            value2=display.substring(display.indexOf("-"));
            result=returnPower(value2);
            txt.setText(String.valueOf(double1)+"-"+String.valueOf(result));    
        }
        if(dispPastOne.contains("*")){
            double1=Double.parseDouble(display.substring(0, display.indexOf("*")));
            value2=display.substring(display.indexOf("*")+1);
            result=returnPower(value2);
            txt.setText(String.valueOf(double1)+"*"+String.valueOf(result));    
        }
        if(dispPastOne.contains("/")){
            double1=Double.parseDouble(display.substring(0, display.indexOf("/")));
            value2=display.substring(display.indexOf("/")+1);
            result=returnPower(value2);
            txt.setText(String.valueOf(double1)+"/"+String.valueOf(result));    
        }

        else{
             toPower=Double.parseDouble(display.substring(0,display.indexOf("^")));
             answerX=Math.pow(toPower, powerValue); 
             txt.setText(String.valueOf(answerX)+btnTxt);
         }
        }
                catch(NumberFormatException nfe){
                    CalculatorAppFrame f = new CalculatorAppFrame();
                    f.setMessageBox("Please enter an appropriate input", "Error");
                }
                 catch(Exception e){
                    CalculatorAppFrame f = new CalculatorAppFrame();
                    f.setMessageBox("Please enter an appropriate input", "Error");
    } 
    
    }
 
    public void signChange(javax.swing.JTextField txt){
        try{
String display = txt.getText();
String dispPastOne = display.substring(1);
double value=0;

if(dispPastOne.contains("^")){
    
        if(display.contains("^-")){
            
           value=Double.parseDouble(dispPastOne.substring(dispPastOne.indexOf("-"))); 
        }
        else{
        value=Double.parseDouble(dispPastOne.substring(dispPastOne.indexOf("^")+1));
            }
        double valueInv=value*-1;
        txt.setText(display.substring(0,display.indexOf("^")+1)+String.valueOf(valueInv));
}
else{

if(dispPastOne.contains("+")||dispPastOne.contains("-")||dispPastOne.contains("*")||
        dispPastOne.contains("/")&!display.contains("^")){
    
    if(dispPastOne.contains("+")){
        
        if(display.charAt(display.indexOf("+")+1)=='-'){
            
           value=Double.parseDouble(dispPastOne.substring(dispPastOne.indexOf("-"))); 
        }
        else{
        value=Double.parseDouble(dispPastOne.substring(dispPastOne.indexOf("+")+1));
            }
        }
    if(dispPastOne.contains("-")&!dispPastOne.contains("+")){
        if(dispPastOne.contains("--")&!display.contains("^")){
            value=Double.parseDouble(dispPastOne.substring(dispPastOne.indexOf("-")+1));    //different
        }
        else{
        value=Double.parseDouble(dispPastOne.substring(dispPastOne.indexOf("-")+1));
            }
        }
    if(dispPastOne.contains("*")){
        if(display.charAt(display.indexOf("*")+1)=='-'){
            value=Double.parseDouble(dispPastOne.substring(dispPastOne.indexOf("-")));
        }
        else{
        value=Double.parseDouble(dispPastOne.substring(dispPastOne.indexOf("*")+1));
            }   
    }
    if(dispPastOne.contains("/")){
        if(display.charAt(display.indexOf("/")+1)=='-'){
            value=Double.parseDouble(dispPastOne.substring(dispPastOne.indexOf("-")));
        }
        else{
        value=Double.parseDouble(dispPastOne.substring(dispPastOne.indexOf("/")+1));
            }
    }
}

double valueInv = value*-1;
if(dispPastOne.contains("+-")||dispPastOne.contains("--")||dispPastOne.contains("*-")||dispPastOne.contains("/-")){
    txt.setText(display.substring(0,display.indexOf(screenOp)+1)+String.valueOf(valueInv));
}
     else{
    if(dispPastOne.contains("+")){
        txt.setText(display.substring(0,display.indexOf("+")+1)+valueInv);
    }
    if(dispPastOne.contains("-")){
        txt.setText(display.substring(0,display.indexOf("-")+1)+valueInv);
    }    
    if(dispPastOne.contains("*")){
        txt.setText(display.substring(0,display.indexOf("*")+1)+valueInv);
    }
    if(dispPastOne.contains("/")){
        txt.setText(display.substring(0,display.indexOf("/")+1)+valueInv);
    }
if(!(dispPastOne.contains("+")||dispPastOne.contains("-")||dispPastOne.contains("*")||
        dispPastOne.contains("/")||dispPastOne.contains("^"))){
  
        value=Double.parseDouble(display);
        txt.setText(String.valueOf(value*-1));
     }
    }
    }
        }
        catch(NumberFormatException nfe){
                CalculatorAppFrame f = new CalculatorAppFrame();
                f.setMessageBox("Please enter an appropriate input", "Error");
                }
         catch(Exception e){
                    CalculatorAppFrame f = new CalculatorAppFrame();
                    f.setMessageBox("Please enter an appropriate input", "Error");
    }
    }
    
    public void calculateExt(javax.swing.JButton button, javax.swing.JTextField txt){
        try{
        String display=txt.getText();
        String operator = button.getText();
        
        switch(operator){
            case "sin": sinValue(value2, answer, txt);
                break;
            case "cos": cosValue(value2, answer, txt);
                break;
            case "tan": tanValue(value2, answer, txt);
                break;
            case "asin": asinValue(value2, answer, txt);
                break;
            case "acos": acosValue(value2, answer, txt);
                break;
            case "atan": atanValue(value2, answer, txt);    //check!
                break;
            case "PI": pie(value2, answer, txt);
                break;
            case "E": E(value2, answer, txt);
                break;
            case "1/x": overX(value2, answer, txt);
                break;
            case "x^y": addPowerSymbol(txt);
                        setValueToPower(answer, txt);
                        
                break;
            case "+/-": signChange(txt);
                break;
                        
        }
        }
        catch(NumberFormatException nfe){
                CalculatorAppFrame f = new CalculatorAppFrame();
                f.setMessageBox("Please enter an appropriate input", "Error");
                }
         catch(Exception e){
                    CalculatorAppFrame f = new CalculatorAppFrame();
                    f.setMessageBox("Please enter an appropriate input", "Error");
    }
    }
    public void numberButonsTxt(javax.swing.JButton button, javax.swing.JTextField txt){
    String buttonText=button.getText();
    String toText="";
    displayToBlank(txt);
    switch(buttonText){
        case "1":   txt.setText(txt.getText()+"1");
                    populateNumbers(txt);
                break;
       
        case "2":txt.setText(txt.getText()+"2");
                  
                break;
        case "3": txt.setText(txt.getText()+"3");
        
                break;
        case "4": txt.setText(txt.getText()+"4");
        
                break;
        case "5": txt.setText(txt.getText()+"5");
        
                break;
        case "6": txt.setText(txt.getText()+"6");
        
                break;
        case "7": txt.setText(txt.getText()+"7");
        
                break;
        case "8": txt.setText(txt.getText()+"8");
        
                break;
        case "9": txt.setText(txt.getText()+"9");
        
                break;
        case "0": txt.setText(txt.getText()+"0");
        
                break;
        case ".":if(txt.getText().endsWith(".")){
                    txt.setText(txt.getText());
                }
                else if(txt.getText().equals("0")||txt.getText().equals("0.0")){
                    txt.setText("0.0");
                }
                else{
                    txt.setText(txt.getText()+".");
                }
                break;                  
        }
   
    }
   
    public void otherButtons(javax.swing.JButton button, javax.swing.JTextField txt){
        String other=button.getText();
        
        if(other=="CA"){
            txt.setText("");
            value1="";
            value2="";
            answer=0;  
            txt.setText(String.valueOf(answer));
        }
        if(other=="CE"){
            double temp=0;
            txt.setText(String.valueOf(temp));

        }
    }
}

    

