package com.naldana.data.dao;

import com.naldana.data.entidades.Jugador;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class JugadorDao extends BaseDAO<Jugador> {


    public JugadorDao() {
        table = new TableData("jugador", "id", new String[]{"nombre"});
    }

    @Override
    Jugador mapToObject(ResultSet resultSet) {
        Jugador jugador = new Jugador();
        try {
            jugador.setId(resultSet.getInt(table.PRIMARY_KEY));
            jugador.setNombre(resultSet.getString(table.fields[0]));

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    PreparedStatement getSelectStatement(Connection con, Jugador find, String by) {
        return null;
    }

    @Override
    PreparedStatement getInsertStatement(Connection con, Jugador _new) {
        return null;
    }

    @Override
    PreparedStatement getDeleteStatement(Connection con, Jugador deleteObject) {
        return null;
    }
}
