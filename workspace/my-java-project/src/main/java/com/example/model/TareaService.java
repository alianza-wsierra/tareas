package com.example.model;

import java.util.List;

/**
 * Interfaz que define las operaciones básicas para gestionar tareas.
 */
public interface TareaService {
    /**
     * Crea una nueva tarea.
     * 
     * @param tarea La tarea a crear.
     */
    void crearTarea(Tarea tarea);

    /**
     * Lista todas las tareas existentes.
     * 
     * @return Lista de tareas.
     */
    List<Tarea> listarTareas();

    /**
     * Marca una tarea como completada o cambia su estado.
     * 
     * @param id     Identificador de la tarea a marcar.
     * @param estado Nuevo estado de la tarea.
     */
    void marcarTarea(int id, String estado);
}