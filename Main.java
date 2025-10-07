package Java_Polymorphism2;

import javax.swing.JOptionPane;

public class Main {
 public static void main(String[]args){
	 MathOperation math = new MathOperation();
	
     int intA = Integer.parseInt(JOptionPane.showInputDialog("✧･ﾟ: *✧ Enter first integer (๑˃ᴗ˂)ﻭ ✧*:･ﾟ✧"));
     int intB = Integer.parseInt(JOptionPane.showInputDialog("✧･ﾟ: *✧ Enter second integer (o^▽^o) ✧*:･ﾟ✧"));
     int intResult = math.multiply(intA, intB);
     JOptionPane.showMessageDialog(null, 
    		 "Multiplying integers:\n " + intA + " x " + intB + " = " + intResult + "\n ✨(＾▽＾)");

    
     double doubleA = Double.parseDouble(JOptionPane.showInputDialog("✧ Enter first double (◕‿◕✿)"));
     double doubleB = Double.parseDouble(JOptionPane.showInputDialog("✧ Enter second double (｡♥‿♥｡)"));
     double doubleResult = math.multiply(doubleA, doubleB);
     JOptionPane.showMessageDialog(null, 
    		 "Multiplying doubles: \n" + doubleA + " x " + doubleB + "=" + "\n彡(ノ^ ^)ノ✨✨");

     
     Vehicle vehicle = new Vehicle();
     Vehicle car = new Car();
     Vehicle bike = new Bicycle();
     
     StringBuilder messages = new StringBuilder();
     messages.append(vehicle.move()).append("\n");
     messages.append(car.move()).append("\n");
     messages.append(bike.move()).append("\n");

     JOptionPane.showMessageDialog(null, messages.toString());
    
     JOptionPane.showMessageDialog(null, "さようなら, 再见, 안녕, Paalam, Babay, Adyos, Goodbye、");
 }

		 
 }
