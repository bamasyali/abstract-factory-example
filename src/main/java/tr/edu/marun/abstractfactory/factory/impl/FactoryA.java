/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tr.edu.marun.abstractfactory.factory.impl;

import tr.edu.marun.abstractfactory.factory.AbstractFactory;
import tr.edu.marun.abstractfactory.model.impl.ProductA;

/**
 *
 * @author bamasyali
 */
public final class FactoryA implements AbstractFactory<ProductA> {

    private static FactoryA INSTANCE;

    static {
        INSTANCE = null;
    }

    private FactoryA() {
    }

    public static FactoryA getInstance() {

        if (INSTANCE == null) {
            synchronized (FactoryA.class) {
                if (INSTANCE == null) {
                    INSTANCE = new FactoryA();
                }
            }
        }
        return INSTANCE;
    }

    @Override
    public ProductA createProduct() {
        return new ProductA();
    }
}
