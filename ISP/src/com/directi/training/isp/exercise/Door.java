package com.directi.training.isp.exercise;

public interface Door
{
    void lock();

    void unlock();

    void open();

    void close();

    void timeOutCallback();

    void proximityCallback(); # ceration de 3 interfaces une pour les fonctionalités door en 
                               generale l'autre a seulement la fct timeoutCallback et la derniere la fct proximity
                               chaque class door va appeler 2 interfaces
}
