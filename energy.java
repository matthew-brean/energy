/*******************************************************************************
* Created by: Matthew Brean
* Created on: 2016-09-09
* Created for: ICS4U
* Daily Assignment: Unit #1-03
* This program calculates energy given mass
*******************************************************************************/

import java.util.Scanner;

public class EnergyMass {

public static void main(String[] args)
{
 Scanner log = new Scanner(System.in);

 double c = 2.998 * Math.pow(10,8);

for (;;){

 System.out.println("Enter the mass in kg");
 double mass = log.nextDouble();


 double energy = c * c * mass;

 System.out.println(energy + " J of energy will be produced.");
 System.out.println();

 }
}
}
