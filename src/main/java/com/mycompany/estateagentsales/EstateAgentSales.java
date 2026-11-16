/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.estateagentsales;

/**
 *
 * @author matthewsamuel
 */
public class EstateAgentSales {

    public static void main(String[] args) {
        
        //Store the property sales for both estate agents in a 2D array called propertySales
        double[][] propertySales = { {800000, 1500000, 2000000}, {700000, 1200000, 1600000} };
        
        //Store the estate agent names in a 1D array called agentNames
        String[] agentNames = {"Joe Bloggs", "Jane Doe"};
        
        //Store Month names
        String[] months = {"January", "February", "March"};
        
        
        
        //Create an EstateAgent object to call those methods 
        EstateAgent agent = new EstateAgent();
       
        
        //Store the total sales for each estate agent
        double[] totalSales = new double[2];
        
        //Calculate and display the sales and commission report
        System.out.println("ESTATE AGENT SALES REPORT");
        System.out.println("----------------------------------------");
        
        for (int r = 0; r < propertySales.length; r++)
        {
           //Calculate total sales
            totalSales[r] = agent.EstateAgentSales(propertySales[r]);
            
           //Calculate Commission
           double commission = agent.EstateAgentCommission(totalSales[r]);
           
           System.out.println("\nEstate Agent: " + agentNames[r]);
           
           //Display Monthly Sales
           for (int c = 0; c < propertySales[r].length; c++)
           {
               System.out.println(months[c] + ": R" + String.format("%,.2f", propertySales[r][c]));
           }
           
           // Display total sales and commission
            System.out.println("Total Sales: R" + String.format("%,.2f", totalSales[r]));

            System.out.println("Commission: R" + String.format("%,.2f", commission));
        }
        
        // Find the top-performing estate agent
        int topAgent = agent.TopEstateAgent(totalSales);

        System.out.println("\nTOP PERFORMING ESTATE AGENT");
        System.out.println("Estate Agent: " + agentNames[topAgent]);
        System.out.println("Total Sales: R" + String.format("%,.2f", totalSales[topAgent]));
        
    } // end of main method
} //end of class
