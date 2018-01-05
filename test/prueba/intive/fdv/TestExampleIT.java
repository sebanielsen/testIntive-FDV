/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prueba.intive.fdv;
import Testejemplo.*;
import prueba.intive.fdv.*;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author sebastian
 */
public class TestExampleIT {
    
    public TestExampleIT() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    @Test
    public void testSomeMethod() {
       System.out.println("Testeando Metodo Descuento por Porcentaje...");
       int porcentaje = 30;
       int valor = 200;
       TestExample instance = new TestExample();

       double resultado = instance.TestDescuentoPorcentaje(porcentaje, valor);
        assertEquals(140, resultado, resultado);
    }
    
    @Test
    public void testGetTipodeAlquiler(){
          System.out.println("Testeando Metodo getTipodeAlquiler...");
          int tipoHora = 1;
          int tipoDiario = 2;
          int tipoSemanal = 3;
          TestExample instance = new TestExample();
          String resultadoTipoHora = instance.TestGetTipoDeAlquiler(tipoHora);
          String resultadoTipoDiario = instance.TestGetTipoDeAlquiler(tipoDiario);
          String resultadoTipoSemanal = instance.TestGetTipoDeAlquiler(tipoSemanal);
          
          assertEquals("Alquiler por Hora", resultadoTipoHora);
          assertEquals("Alquiler Diario", resultadoTipoDiario);
          assertEquals("Alquiler Semanal", resultadoTipoSemanal);    
    }
    @Test
    public void testImporteACobrar(){
              System.out.println("Testeando Metodo Importe a Cobrar...");
          int importePorHora = 1;
          int importeDiario = 2;
          int importeSemanal = 3;
          TestExample instance = new TestExample();
          double resultadoImporteTipoHora = instance.importeaCobrar(importePorHora, 10);
          double resultadoImporteTipoDiario = instance.importeaCobrar(importeDiario, 20);
          double resultadoImporteTipoSemanal = instance.importeaCobrar(importeSemanal, 30);
          
          assertEquals(50, resultadoImporteTipoHora, 0);
          assertEquals(400, resultadoImporteTipoDiario, 0);
          assertEquals(1800, resultadoImporteTipoSemanal, 0);
          
    }         
}
