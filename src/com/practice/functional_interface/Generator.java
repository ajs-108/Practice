package com.practice.functional_interface;

@FunctionalInterface
public interface Generator<T> {

    T generate();
}
