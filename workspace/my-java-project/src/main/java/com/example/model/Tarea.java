package com.example.model;

/**
 * La clase Tarea representa una tarea dentro de la aplicación.
 * Contiene un identificador único, el tipo de tarea y su estado actual.
 * 
 * Ejemplo de uso:
 * <pre>
 *     Tarea tarea = new Tarea(1, "Revisión", "Pendiente");
 * </pre>
 */
public class Tarea {
    private int id; // Identificador único de la tarea
    private String tipoTarea; // Tipo o categoría de la tarea
    private String estado; // Estado actual de la tarea (ej. Pendiente, Completada)

    /**
     * Constructor para crear una nueva tarea.
     * 
     * @param id        Identificador único de la tarea
     * @param tipoTarea Tipo o categoría de la tarea
     * @param estado    Estado actual de la tarea
     */
    public Tarea(int id, String tipoTarea, String estado) {
        this.id = id;
        this.tipoTarea = tipoTarea;
        this.estado = estado;
    }

    public int getId() {
        return id;
    }

    public String getTipoTarea() {
        return tipoTarea;
    }

    public String getEstado() {
        return estado;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setTipoTarea(String tipoTarea) {
        this.tipoTarea = tipoTarea;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "Tarea{" +
                "id=" + id +
                ", tipoTarea='" + tipoTarea + '\'' +
                ", estado='" + estado + '\'' +
                '}';
    }
}