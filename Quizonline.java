
package com.mycompany.quiz1;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;


public class Quizonline extends JFrame implements ActionListener {
    JLabel label;
    JRadioButton radioButtons[] =new JRadioButton[5];
    JButton btnNext,btnResult;
    ButtonGroup bg;
    int count=0, current=0,x=1,y=1,now=0;
    int m[]=new int[10];
    Quizonline (String s){
        super(s);
        label=new JLabel();
        add(label);
        bg =new ButtonGroup();
        for(int i=0;i<5;i++){
            radioButtons[i]=new JRadioButton();
            add(radioButtons[i]);
            bg.add(radioButtons[i]);
            
            
        }
        btnNext=new JButton("Next");
        btnResult =new JButton("Result");
        btnResult.setVisible(false);
        btnResult.addActionListener(this);
        btnNext.addActionListener(this);
        add(btnNext);
        add(btnResult);
        setQuestion();
        label.setBounds(30,40,450,20);
        radioButtons[0].setBounds(50,80,450,20);
        radioButtons[1].setBounds(50,110,200,20);
        radioButtons[2].setBounds(50,140,200,20);
        
        radioButtons[3].setBounds(50,170,200,20);
        btnNext.setBounds(100,240,100,30);
        btnResult.setBounds(270,240,100,30);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);
        setLocation(250,100);
        setVisible(true);
        setSize(600,350);
        
        
        
        
        
        
    }
    void setQuestion(){
    radioButtons[4].setSelected(true);
if(current==0){
    label.setText("Q1 : what is full form of JVM ? ");
    radioButtons[0].setText("Java Virtual Machine");
    radioButtons[1].setText("Java viral machine");
   radioButtons[2].setText("java virtual machanism");
   radioButtons[3].setText("none of the above");
}
if(current==1){
    label.setText("Q2 :Is java Platform independent?");
    radioButtons[0].setText("True");
    radioButtons[1].setText("False");
   radioButtons[2].setText("all of the above");
   radioButtons[3].setText("none of the above");
}
if(current==2){
    label.setText("Q3 : what is full form of JIT ? ");
    radioButtons[0].setText("Java institue of tech");
    radioButtons[1].setText("Just-in-Time");
   radioButtons[2].setText("all of the above");
   radioButtons[3].setText("none of the above");
}
if(current==3){
    label.setText("Q4 :can we declare a pointer in java?");
    radioButtons[0].setText("Yes");
    radioButtons[1].setText("No");
   radioButtons[2].setText("all of the above");
   radioButtons[3].setText("none of the above");
}
if(current==4){
    label.setText("Q5 :dafault value of byte datatype in java");
    radioButtons[0].setText("1");
    radioButtons[1].setText("2");
   radioButtons[2].setText("0");
   radioButtons[3].setText("none of the above");
}
if(current==5){
    label.setText("Q6 : will java supports reusability?");
    radioButtons[0].setText("yes");
    radioButtons[1].setText("no");
   radioButtons[2].setText("all of the above");
   radioButtons[3].setText("none of the above");
}
if(current==6){
    label.setText("Q7 :how many types of polymorphism java supports? ");
    radioButtons[0].setText("2");
    radioButtons[1].setText("1");
   radioButtons[2].setText("0");
   radioButtons[3].setText("none of the above");
}
if(current==7){
    label.setText("Q8 :multitasking can be achieved by:");
    radioButtons[0].setText("Multiprocessing");
    radioButtons[1].setText("multithreading");
   radioButtons[2].setText("both a and b");
   radioButtons[3].setText("none of the above");
}
if(current==8){
    label.setText("Q9 : which class is the superclass of all classes?");
    radioButtons[0].setText("java.lang.Object");
    radioButtons[1].setText("Java.awt.event.");
   radioButtons[2].setText("all of the above");
   radioButtons[3].setText("none of the above");
}
if(current==9){
    label.setText("Q10 : when is the super keyword used? ");
    radioButtons[0].setText("immediate parent class constructor");
    radioButtons[1].setText("immediate parent class variable");
   radioButtons[2].setText("immediate parent class method");
   radioButtons[3].setText("all of the above");
}
label.setBounds(30,40,450,20);
for(int i=0,j=0;i<=90;i+=30,j++){
radioButtons[j].setBounds(50,80+i,200,20);
}


    
    
    

}
boolean checkAnswer(){
    if(current==0){
        return(radioButtons[0].isSelected());
        
    }
    if(current==1){
        return(radioButtons[0].isSelected());
        
    }
    if(current==2){
        return(radioButtons[1].isSelected());
        
    }
    if(current==3){
        return(radioButtons[1].isSelected());
        
    }
    if(current==4){
        return(radioButtons[2].isSelected());
        
    }
    if(current==5){
        return(radioButtons[0].isSelected());
        
    }
    if(current==6){
        return(radioButtons[0].isSelected());
        
    }
    if(current==7){
        return(radioButtons[2].isSelected());
        
    }
    if(current==8){
        return(radioButtons[0].isSelected());
        
    }
    if(current==9){
        return(radioButtons[3].isSelected());
        
    }
    return false;
}
    public static void main(String[] args){
        new Quizonline("Quiz application");
    }
    @Override
    public void actionPerformed(ActionEvent e) {
       if(e.getSource()==btnNext){
           if(checkAnswer())
               count=count+1;
           current++;
           setQuestion();
           if(current==9){
               btnNext.setEnabled(false);
               btnResult.setVisible(true);
               btnResult.setText("submit");
       }
    }
       if(e.getActionCommand().equals("submit")){
           count=count+1;
           current++;
           JOptionPane.showMessageDialog(this, "score:"+count);
           System.exit(0);
       }
    
    
}
}
