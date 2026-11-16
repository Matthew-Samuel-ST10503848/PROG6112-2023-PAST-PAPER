/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.estateagentsales;

/**
 *
 * @author matthewsamuel
 */
public class EstateAgent implements IEstateAgent {
    
    //Calculate the total sales for one estate agent
    @Override
    public double EstateAgentSales(double [] propertySales) 
    { 
        double totalSales = 0;
        
        for (int r = 0; r < propertySales.length; r++) 
        {
            totalSales += propertySales[r];
        }
        
        return totalSales;
    }
    
    //Calculate 2% commission
    @Override
    public double EstateAgentCommission(double propertySales)
    {
        return propertySales * 0.02;
    }
    
    //Find the estate agent with the highest sales
    @Override
    public int TopEstateAgent (double [] totalSales)
    {
        int topAgent = 0;
        
        for (int r = 1; r < totalSales.length; r++)
        {
            if (totalSales[r] > totalSales[topAgent])
            {
                topAgent = r;
            }
        }
        
        return topAgent;
    }
    
}
