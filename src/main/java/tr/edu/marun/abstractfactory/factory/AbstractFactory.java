/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tr.edu.marun.abstractfactory.factory;

import tr.edu.marun.abstractfactory.model.Product;

/**
 *
 * @author bamasyali
 * @param <T>
 */
public interface AbstractFactory<T extends Product> {

    T createProduct();
}
