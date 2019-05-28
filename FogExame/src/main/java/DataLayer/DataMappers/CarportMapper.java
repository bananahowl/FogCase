package DataLayer.DataMappers;

import DataLayer.Connector;
import Logic.CarportException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


/**
 * The purpose of UserMapper is to...
 *
 * @author kasper
 */

public class CarportMapper {

    public static int getMaxLength() throws CarportException {
        try {
            Connection con = Connector.connection();
            String SQL = "select * from maxLength;";
            PreparedStatement ps = con.prepareStatement(SQL);
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                int nr = rs.getInt("max(lengthid)");
                return nr;
            } else {
                throw new CarportException("Error!");
            }
        } catch (ClassNotFoundException | SQLException ex) {
            throw new CarportException(ex.getMessage());
        }
    }

    public static int getMaxAngles() throws CarportException {
        try {
            Connection con = Connector.connection();
            String SQL = "select * from maxAngle;";
            PreparedStatement ps = con.prepareStatement(SQL);
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                int nr = rs.getInt("max(degreeid)");
                return nr;
            } else {
                throw new CarportException("Error!");
            }
        } catch (ClassNotFoundException | SQLException ex) {
            throw new CarportException(ex.getMessage());
        }
    }

    public static int getMaxWidth() throws CarportException {
        try {
            Connection con = Connector.connection();
            String SQL = "select * from maxWidth;";
            PreparedStatement ps = con.prepareStatement(SQL);
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                int nr = rs.getInt("max(widthid)");
                return nr;
            } else {
                throw new CarportException("Error!");
            }
        } catch (ClassNotFoundException | SQLException ex) {
            throw new CarportException(ex.getMessage());
        }
    }

    public static int getMaxShedWidth() throws CarportException {
        try {
            Connection con = Connector.connection();
            String SQL = "select * from maxShedWidth;";
            PreparedStatement ps = con.prepareStatement(SQL);
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                int nr = rs.getInt("max(shedwidthid)");
                return nr;
            } else {
                throw new CarportException("Error!");
            }
        } catch (ClassNotFoundException | SQLException ex) {
            throw new CarportException(ex.getMessage());
        }
    }

    public static int getMaxShedLength() throws CarportException {
        try {
            Connection con = Connector.connection();
            String SQL = "select * from maxShedLength;";
            PreparedStatement ps = con.prepareStatement(SQL);
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                int nr = rs.getInt("max(shedlengthid)");
                return nr;
            } else {
                throw new CarportException("Error!");
            }
        } catch (ClassNotFoundException | SQLException ex) {
            throw new CarportException(ex.getMessage());
        }
    }

    public static int getwidth(int id) throws CarportException {
        try {
            Connection con = Connector.connection();
            String SQL = "SELECT widthValue FROM cWidth WHERE widthid = ? ";
            PreparedStatement ps = con.prepareStatement(SQL);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            
            if (rs.next()) {
                int width = rs.getInt("widthValue");
                return width;
            } else {
                throw new CarportException("Error");
            }
        } catch (ClassNotFoundException | SQLException ex) {
            throw new CarportException(ex.getMessage());
        }
    }

    public static int getlength(int id) throws CarportException  {
        try {
            Connection conn = Connector.connection();
            String query = "select lengthvalue from cLength where lengthid = ?";
            PreparedStatement ps = conn.prepareStatement(query);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                int length = rs.getInt("lengthvalue");
                return length;
            } else {
                throw new CarportException("Error");
            }
        } catch (ClassNotFoundException | SQLException ex) {
            throw new CarportException(ex.getMessage());
        }
    }

    public static int getShedwidth(int id) throws CarportException {
        try {
            Connection conn = Connector.connection();
            String query = "select shedwidthvalue from shedwidth where shedwidthid =?";
            PreparedStatement ps = conn.prepareStatement(query);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                int width = rs.getInt("shedwidthvalue");
                return width;
            } else {
                throw new CarportException("Error");
            }
        } catch (ClassNotFoundException | SQLException ex) {
            throw new CarportException(ex.getMessage());
        }
    }

    public static int getShedlength(int id) throws CarportException {
        try {
            Connection conn = Connector.connection();
            String query = "select shedlengthvalue from shedlength where shedlengthid = ?";
            PreparedStatement ps = conn.prepareStatement(query);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                int length = rs.getInt("shedlengthvalue");
                return length;
            } else {
                throw new CarportException("Error");
            }
        } catch (ClassNotFoundException| SQLException ex) {
            throw new CarportException(ex.getMessage());
        }
    }

    public static int getRoofAngle(int id) throws CarportException {
        try {
            Connection conn = Connector.connection();
            String query = "select degreevalue from angle where degreeid = ?";
            PreparedStatement ps = conn.prepareStatement(query);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                int angle = rs.getInt("degreevalue");
                return angle;
            } else {
                throw new CarportException("Error");
            }
        } catch (ClassNotFoundException | SQLException ex) {
            throw new CarportException(ex.getMessage());
        }
    }
}
