package utp.misiontic2022.c2.p47.reto4.modelo.dao;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;

import utp.misiontic2022.c2.p47.reto4.modelo.vo.Requerimiento_1;
import utp.misiontic2022.c2.p47.reto4.util.JDBCUtilities;

public class Requerimiento_1Dao {
    public ArrayList<Requerimiento_1> requerimiento1() throws SQLException {
        var response = new ArrayList<Requerimiento_1>();
        Connection connection = null;
        try {
            connection = JDBCUtilities.getConnection();
            var statement = connection.prepareStatement("SELECT ID_Compra FROM Compra c WHERE Pagado = 'No' AND Proveedor ='JUMBO'");
            var rset = statement.executeQuery();
            while (rset.next()) {
                var requerimiento_1 = new Requerimiento_1();
                requerimiento_1.setIdCompra(rset.getInt(1));                            
                response.add(requerimiento_1);              
            }
            rset.close();
            statement.close();
        } finally {
            if (connection != null) {
                connection.close();
            }
        }
        
        return response;
    }
}