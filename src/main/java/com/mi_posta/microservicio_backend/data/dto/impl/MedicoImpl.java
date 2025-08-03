package com.mi_posta.microservicio_backend.data.dto.impl;

import com.mi_posta.microservicio_backend.data.dto.MedicoDao;
import com.mi_posta.microservicio_backend.data.dto.MedicoListDto;
import com.mi_posta.microservicio_backend.data.dto.MedicoListResultMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class MedicoImpl implements MedicoDao {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public List<MedicoListDto> listMedicos() {
        StringBuilder query = new StringBuilder();
        query.append("SELECT                                                           ");
        query.append("    m.id_medico,                                                 ");
        query.append("    m.nombres,                                                   ");
        query.append("    m.apellidos,                                                 ");
        query.append("    m.dni,                                                       ");
        query.append("    m.correo,                                                    ");
        query.append("    m.telefono,                                                  ");
        query.append("    m.direccion_personal,                                        ");
        query.append("    m.fecha_nacimiento,                                          ");
        query.append("    m.sexo,                                                      ");
        query.append("    m.foto_url,                                                  ");
        query.append("    m.id_especialidad,                                           ");
        query.append("    e.nombre,                                                    ");
        query.append("    m.direccion_consultorio,                                     ");
        query.append("    m.ciudad,                                                    ");
        query.append("    m.region,                                                    ");
        query.append("    m.horario_atencion,                                          ");
        query.append("    m.id_posta,                                                  ");
        query.append("    p.nombre,                                                    ");
        query.append("    m.id_usuario,                                                ");
        query.append("    u.nombres                                                    ");
        query.append("FROM medicos m                                                   ");
        query.append("LEFT JOIN especialidades e ON m.id_especialidad = e.id_especialidad ");
        query.append("LEFT JOIN postas_medicas p ON m.id_posta = p.id_posta           ");
        query.append("LEFT JOIN usuarios u ON m.id_usuario = u.id_usuario             ");
        query.append("WHERE m.sexo IN ('Masculino', 'Femenino', 'Otro');              ");

        return jdbcTemplate.query(query.toString(), new MedicoListResultMapper());
    }
}