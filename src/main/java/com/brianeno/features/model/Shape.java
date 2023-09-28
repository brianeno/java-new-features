package com.brianeno.features.model;

public sealed interface Shape permits Circle, Square, Triangle {
    String draw();
}
