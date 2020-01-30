// Ethan King
package computingtaxes_ethanking;

import javax.swing.JOptionPane;

public class ComputingTaxes_EthanKing
{

    public static void main(String[] args)
    {
        //Declare Variables
        int status;
        double income;
        double taxes;
        String input;
        String formattedString;
       
        taxes = 0;
        
        //Prompt user for status and income
        input = JOptionPane.showInputDialog("Please enter your status: "
                + "\nSingle = 0 \nMarried Filing Jointly = 1 "
                + "\nMarried Filing Separately = 2"
                + "\nHead of Household = 3");
        status = Integer.parseInt(input);
        
        input = JOptionPane.showInputDialog("Please enter your taxeable income:");
        income = Double.parseDouble(input);
       
        //Calculate taxes (Really hope I didn't misplace a value)
        if (status == 0)
        {
            if (income <= 8350)
            {
                taxes = income * 0.10;
            }
            else if (income <= 33950)
            {
                taxes = (8350 * .10) + (income - 8350) * 0.15;
            }
            else if (income <= 82250)
            {
                taxes = (8350 * .10) + ((33950 - 8350) * 0.15) 
                        + (income - 33950) * 0.25;
            }
            else if (income <= 171550)
            {
                taxes = (8350 * .10) + ((33950 - 8350) * .15)
                        + ((82250 - 33950) * .25) + ((income - 82250) * 0.28);
            }
            else if (income <= 372950)
            {
                taxes = (8350 * .10) + ((33950 - 8350) * .15)
                        + ((82250 - 33950) * .25) + ((171550 - 82250) * 0.28)
                        + (income - 171550) * .33;
            }
            else
            {
                taxes = (8350 * .10) + ((33950 - 8350) * .15)
                        + ((82250 - 33950) * .25) + ((171550 - 82250) * 0.28)
                        + (372950 - 171550) * .33 + (income - 372950) * 0.35;
            }
        }
        else if (status == 1)
        {                    
            if (income <= 16700)
            {
                taxes = income * 0.10;
            }
            else if (income <= 67900)
            {
                taxes = (16700 * .10) + (income - 16700) * 0.15;
            }
            else if (income <= 137050)
            {
                taxes = (16700 * .10) + ((67900 - 16700) * 0.15) 
                        + (income - 33950) * 0.25;
            }
            else if (income <= 208850)
            {
                taxes = (16700 * .10) + ((67900 - 16700) * .15)
                        + ((137050 - 67900) * .25) + ((income - 137050) * 0.28);
            }
            else if (income <= 372950)
            {
                taxes = (16700 * .10) + ((67900 - 16700) * .15)
                        + ((137050 - 67900) * .25) + ((208850 - 137050) * 0.28)
                        + (income - 208850) * .33;
            }
            else
            {
                taxes = (16700 * .10) + ((67900 - 16700) * .15)
                        + ((137050 - 67900) * .25) + ((208850 - 137050) * 0.28)
                        + (372950 - 208850) * .33 + (income - 372950) * 0.35;
            }                   
        }
        else if (status == 2)
        {                     
            if (income <= 8350)
            {
                taxes = income * 0.10;
            }
            else if (income <= 33950)
            {
                taxes = (8350 * .10) + (income - 8350) * 0.15;
            }
            else if (income <= 68525)
            {
                taxes = (8350 * .10) + ((33950 - 8350) * 0.15) 
                        + (income - 33950) * 0.25;
            }
            else if (income <= 104425)
            {
                taxes = (8350 * .10) + ((33950 - 8350) * .15)
                        + ((68525 - 33950) * .25) + ((income - 68525) * 0.28);
            }
            else if (income <= 186475)
            {
                taxes = (8350 * .10) + ((33950 - 8350) * .15)
                        + ((68525 - 33950) * .25) + ((104425 - 68525) * 0.28)
                        + (income - 104425) * .33;
            }
            else
            {
                taxes = (8350 * .10) + ((33950 - 8350) * .15)
                        + ((68525 - 33950) * .25) + ((104425 - 68525) * 0.28)
                        + (186475 - 104425) * .33 + (income - 186475) * 0.35;
            }                                             
        }
        else if (status == 3)
        {   
            if (income <= 11950)
            {
                taxes = income * 0.10;
            }
            else if (income <= 45500)
            {
                taxes = (11950 * .10) + (income - 11950) * 0.15;
            }
            else if (income <= 117450)
            {
                taxes = (11950 * .10) + ((45500 - 11950) * 0.15) 
                        + (income - 45500) * 0.25;
            }
            else if (income <= 190200)
            {
                taxes = (11950 * .10) + ((45500 - 11950) * .15)
                        + ((117450 - 45500) * .25) + ((income - 117450) * 0.28);
            }
            else if (income <= 372950)
            {
                taxes = (11950 * .10) + ((45500 - 11950) * .15)
                        + ((117450 - 45500) * .25) + ((190200 - 117450) * 0.28)
                        + (income - 190200) * .33;
            }
            else
            {
                taxes = (11950 * .10) + ((45500 - 11950) * .15)
                        + ((117450 - 45500) * .25) + ((190200 - 82250) * 0.28)
                        + (372950 - 190200) * .33 + (income - 372950) * 0.35;
            }   
        }
        else
        {
            JOptionPane.showMessageDialog(null, "You did not enter a valid"
                    + " status!");
        }
        
        //Format string and output user taxes in dialog box
        formattedString = "Your tax is: " + Double.toString(taxes);
        JOptionPane.showMessageDialog(null, formattedString);
        
        /** The input I used to cover all cases was 400000, it fell into the 
         highest tax bracket of all statuses which allowed it to pass
         through all the code*/
    }
    
}
