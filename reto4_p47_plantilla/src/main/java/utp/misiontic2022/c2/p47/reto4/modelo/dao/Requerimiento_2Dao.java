package utp.misiontic2022.c2.p47.reto4.modelo.dao;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;

import utp.misiontic2022.c2.p47.reto4.modelo.vo.Requerimiento_2;
import utp.misiontic2022.c2.p47.reto4.util.JDBCUtilities;

public class Requerimiento_2Dao {
    public ArrayList<Requerimiento_2> requerimiento2() throws SQLException {
        var response = new ArrayList<Requerimiento_2>();
        Connection connection = null;
        try {
            connection = JDBCUtilities.getConnection();
            var statement = connection.prepareStatement("SELECT ID_Compra FROM Compra c JOIN MaterialConstruccion mc on (c.ID_MaterialConstruccion = mc.ID_MaterialConstruccion) WHERE mc.Precio_Unidad < 1100");
            var rset = statement.executeQuery();
            while (rset.next()) {
                var requerimiento_2 = new Requerimiento_2();
                requerimiento_2.setIdCompra(rset.getInt(1));
                response.add(requerimiento_2);              
            }
            rset.close();
            statement.close();
        } finally {
            if (connection != null) {
                connection.close();
            }
        }
        return response;
        // Su código
    }
}