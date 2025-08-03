package com.mi_posta.microservicio_backend.data.dto;

import lombok.Builder;
import lombok.Data;

import java.sql.Date;

@Data
@Builder
public class MedicoListDto {

    private Integer idMedico;
    private String nombres;
    private String apellidos;
    private String dni;
    private String email;
    private String telefono;
    private String direccion;
    private Date fechaNacimiento;

    private Sexo sexo;
    private String foto;
    private Integer idEspecialidad;
    private String direccionConsultorio;
    private String ciudad;
    private String region;
    private String horarioAtencion;
    private Integer idPosta;
    private Integer idUsuario;

    public enum Sexo {
        Masculino,
        Femenino,
        Otro
    }
}