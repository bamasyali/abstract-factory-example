/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tr.edu.marun.abstractfactory.model.impl;

import tr.edu.marun.abstractfactory.model.Product;

/**
 *
 * @author bamasyali
 */
public class ProductA implements Product {

    public ProductA() {
        System.out.println("ProductA Constructed");
    }

    @Override
    public String toString() {
        return "ProductA{" + '}';
    }

}
