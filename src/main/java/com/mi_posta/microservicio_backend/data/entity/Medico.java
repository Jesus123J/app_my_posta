package com.mi_posta.microservicio_backend.data.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.sql.Date;

@Entity(name = "medicos")
@Data
public class Medico {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_medico")
    private Integer idMedico;

    @Column(name = "nombres")
    private String nombres;

    @Column(name = "apellidos")
    private String apellidos;

    @Column(name = "dni", unique = true)
    private String dni;

    @Column(name = "correo")
    private String email;

    @Column(name = "telefono")
    private String telefono;

    @Column(name = "direccion_personal")
    private String direccion;

    @Column(name = "fecha_nacimiento")
    private Date fechaNacimiento;

    @Enumerated(EnumType.STRING)
    @Column(name = "sexo")
    private Sexo sexo;

    public enum Sexo {
        Masculino,
        Femenino,
        Otro
    }

    @Column(name = "foto_url", columnDefinition = "TEXT")
    private String foto;

    @Column(name = "id_especialidad")
    private Integer idEspecialidad;

    @Column(name = "direccion_consultorio")
    private String direccionConsultorio;

    @Column(name = "ciudad")
    private String ciudad;

    @Column(name = "region")
    private String region;

    @Column(name = "horario_atencion")
    private String horarioAtencion;

    @Column(name = "id_posta")
    private Integer idPosta;

    @Column(name = "id_usuario")
    private Integer idUsuario;

    @Override
    public String toString() {
        return "Medico{" +
                "idMedico=" + idMedico +
                ", nombres='" + nombres + '\'' +
                ", apellidos='" + apellidos + '\'' +
                ", dni='" + dni + '\'' +
                ", email='" + email + '\'' +
                ", telefono='" + telefono + '\'' +
                ", direccion='" + direccion + '\'' +
                ", fechaNacimiento=" + fechaNacimiento +
                ", sexo=" + sexo +
                ", foto='" + foto + '\'' +
                ", idEspecialidad=" + idEspecialidad +
                ", direccionConsultorio='" + direccionConsultorio + '\'' +
                ", ciudad='" + ciudad + '\'' +
                ", region='" + region + '\'' +
                ", horarioAtencion='" + horarioAtencion + '\'' +
                ", idPosta=" + idPosta +
                ", idUsuario=" + idUsuario +
                '}';
    }
}