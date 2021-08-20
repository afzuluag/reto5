package utp.misiontic2022.c2.p47.reto4.modelo.dao;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;

import utp.misiontic2022.c2.p47.reto4.modelo.vo.Requerimiento_3;
import utp.misiontic2022.c2.p47.reto4.util.JDBCUtilities;

public class Requerimiento_3Dao {
    public ArrayList<Requerimiento_3> requerimiento3() throws SQLException {
        var response = new ArrayList<Requerimiento_3>();
        Connection connection = null;
        try {
            connection = JDBCUtilities.getConnection();
            var statement = connection.prepareStatement("SELECT ID_Proyecto , strftime('%Y',Fecha) FROM Compra c WHERE Pagado = 'Parcialmente' and strftime('%m',Fecha) = '02'");
            var rset = statement.executeQuery();
            while (rset.next()) {
                var requerimiento_3 = new Requerimiento_3();
                requerimiento_3.setIdCompra(rset.getInt(1));
                requerimiento_3.setAnoCompra(rset.getString(2));

                response.add(requerimiento_3);              
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