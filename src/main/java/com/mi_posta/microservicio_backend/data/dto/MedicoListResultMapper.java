package com.mi_posta.microservicio_backend.data.dto;

import com.mi_posta.microservicio_backend.data.dto.MedicoListDto;
import com.mi_posta.microservicio_backend.data.dto.MedicoListDto.Sexo;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class MedicoListResultMapper implements RowMapper<MedicoListDto> {

    @Override
    public MedicoListDto mapRow(ResultSet rs, int rowNum) throws SQLException {
        return MedicoListDto.builder()
                .idMedico(rs.getInt("id_medico"))
                .nombres(rs.getString("nombres"))
                .apellidos(rs.getString("apellidos"))
                .dni(rs.getString("dni"))
                .email(rs.getString("correo"))
                .telefono(rs.getString("telefono"))
                .direccion(rs.getString("direccion_personal"))
                .fechaNacimiento(rs.getDate("fecha_nacimiento"))
                .sexo(Sexo.valueOf(rs.getString("sexo")))
                .foto(rs.getString("foto_url"))
                .idEspecialidad(rs.getInt("id_especialidad"))
                .direccionConsultorio(rs.getString("direccion_consultorio"))
                .ciudad(rs.getString("ciudad"))
                .region(rs.getString("region"))
                .horarioAtencion(rs.getString("horario_atencion"))
                .idPosta(rs.getInt("id_posta"))
                .idUsuario(rs.getInt("id_usuario"))
                .build();
    }
}