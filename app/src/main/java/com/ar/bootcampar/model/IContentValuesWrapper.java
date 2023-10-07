package com.ar.bootcampar.model;

import android.content.ContentValues;

public interface IContentValuesWrapper {
    void put(String key, String value);
    void put(String key, Integer value);
    void put(String key, Long value);
    Object get(String key);
    ContentValues generate();
}