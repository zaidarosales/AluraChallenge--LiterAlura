package com.alurachallenge.literalura.service;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

public interface IConvierteDatos {
    <T> T obtenerDatos(String json, Class<T> clase);
}
