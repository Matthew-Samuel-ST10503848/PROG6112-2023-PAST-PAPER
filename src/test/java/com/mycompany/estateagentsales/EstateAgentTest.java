/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */

/**
 *
 * @author matthewsamuel
 */


package com.mycompany.estateagentsales;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class EstateAgentTest {

    EstateAgent agent = new EstateAgent();

    // Test 1: Calculate total property sales
    @Test
    public void CalculateTotalSales_ReturnsTotalSales() 
    {

        double[] sales = {800000, 1500000, 2000000};

        double result = agent.EstateAgentSales(sales);

        assertEquals(4300000, result, 0.01);
    }

    // Test 2: Calculate 2% commission
    @Test
    public void CalculateTotalCommission_ReturnsCommission() 
    {

        double totalSales = 4300000;

        double result = agent.EstateAgentCommission(totalSales);

        assertEquals(86000, result, 0.01);
    }

    // Test 3: Determine the top estate agent
    @Test
    public void TopAgent_ReturnsTopPosition() 
    {

        double[] totalSales = {4300000, 3500000};

        int result = agent.TopEstateAgent(totalSales);

        assertEquals(0, result);
    }

}
