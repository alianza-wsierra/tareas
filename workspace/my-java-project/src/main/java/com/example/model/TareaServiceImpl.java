package com.example.model;

import java.util.ArrayList;
import java.util.List;

/**
 * Implementación concreta de la interfaz {@link TareaService} que gestiona las tareas en memoria.
 * 
 * Esta clase utiliza una lista interna para almacenar las tareas creadas durante la ejecución de la aplicación.
 * Permite crear nuevas tareas, listar todas las tareas existentes y marcar una tarea cambiando su estado.
 * 
 * Ejemplo de uso:
 * <pre>
 *     TareaService servicio = new TareaServiceImpl();
 *     servicio.crearTarea(new Tarea(1, "Revisión", "Pendiente"));
 *     List&lt;Tarea&gt; tareas = servicio.listarTareas();
 *     servicio.marcarTarea(1, "Completada");
 * </pre>
 * 
 * Nota: Las tareas almacenadas en esta implementación se perderán cuando la aplicación finalice,
 * ya que no existe persistencia en disco o base de datos.
 */
public class TareaServiceImpl implements TareaService {
    private final List<Tarea> tareas = new ArrayList<>();

    @Override
    public void crearTarea(Tarea tarea) {
        tareas.add(tarea);
    }

    @Override
    public List<Tarea> listarTareas() {
        return new ArrayList<>(tareas);
    }

    @Override
    public void marcarTarea(int id, String estado) {
        for (Tarea tarea : tareas) {
            if (tarea.getId() == id) {
                tarea.setEstado(estado);
                break;
            }
        }
    }
}