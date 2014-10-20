/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tr.edu.marun.abstractfactory.factory.impl;

import tr.edu.marun.abstractfactory.factory.AbstractFactory;
import tr.edu.marun.abstractfactory.model.impl.ProductB;

/**
 *
 * @author bamasyali
 */
public final class FactoryB implements AbstractFactory<ProductB> {

    private static FactoryB INSTANCE;

    static {
        INSTANCE = null;
    }

    private FactoryB() {
    }

    public static FactoryB getInstance() {

        if (INSTANCE == null) {
            synchronized (FactoryB.class) {
                if (INSTANCE == null) {
                    INSTANCE = new FactoryB();
                }
            }
        }
        return INSTANCE;
    }

    @Override
    public ProductB createProduct() {
        return new ProductB();
    }
}
