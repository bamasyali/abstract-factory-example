/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tr.edu.marun.abstractfactory;

import tr.edu.marun.abstractfactory.factory.AbstractFactory;
import tr.edu.marun.abstractfactory.factory.impl.FactoryA;
import tr.edu.marun.abstractfactory.model.Product;

/**
 *
 * @author bamasyali
 */
public class Main {

    public static void main(String[] args) {
        AbstractFactory factory = FactoryA.getInstance();

        Product product = factory.createProduct();

        System.out.println(product.toString());

    }
}
