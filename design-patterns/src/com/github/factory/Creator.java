package com.github.factory;

/**
 * 创建者
 */
public abstract class Creator {

    public abstract <T extends Product> T createProduct(Class<T> clazz);
}
