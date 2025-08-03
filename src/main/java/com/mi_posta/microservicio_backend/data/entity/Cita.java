package com.mi_posta.microservicio_backend.data.entity;


import jakarta.persistence.*;
import lombok.Data;


@Entity(name = "citas")
@Data
public class Cita {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idCita"  )
    private Integer idCita;

    @Column(name = "idUsuario")
    private Integer idUsuario;

    //cada uno
    private Integer idMedico;
    private Integer idPosta;
    private Integer idEspecialidad;
    private java.sql.Date fecha;
    private java.sql.Time hora;
    private String tipoCita;
    private EstadoCita estado;
    private String motivo;
    private String observaciones;
    private java.sql.Date fechaReprogramada;
    private java.sql.Time horaReprogramada;

    public enum EstadoCita {
        pendiente,
        confirmada,
        reprogramada,
        cancelada,
        atendida
    }

    @Override
    public String toString() {
        return "Cita{" +
                "idCita=" + idCita +
                ", idUsuario=" + idUsuario +
                ", idMedico=" + idMedico +
                ", idPosta=" + idPosta +
                ", idEspecialidad=" + idEspecialidad +
                ", fecha=" + fecha +
                ", hora=" + hora +
                ", tipoCita='" + tipoCita + '\'' +
                ", estado=" + estado +
                ", motivo='" + motivo + '\'' +
                ", observaciones='" + observaciones + '\'' +
                ", fechaReprogramada=" + fechaReprogramada +
                ", horaReprogramada=" + horaReprogramada +
                '}';
    }
}
