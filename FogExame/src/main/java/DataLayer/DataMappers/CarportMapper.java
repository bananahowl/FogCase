package DataLayer.DataMappers;

import DataLayer.Connector;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import Logic.CarportException;
import java.sql.Connection;

/**
 * The purpose of our carportmapper is get different value from the database by using different sql queries in our methods. 
 * We have two basis methods - get the maksimum amount and get width, length, shedlength, shedwidth, angle.
 *
 * @author Frederikke, Emil
 */


public class CarportMapper {

    /**
     * This method get the maksimum number of length id representing in the database. 
     * @return the amount of lengthid's
     * @throws CarportException 
     */
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

    /**
     * This method get the maksimum number of angle id representing in the database.
     * @return the amount of angleid's
     * @throws CarportException 
     */
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

    /**
     * Thsi method get the maksimum number of widthid representing in the database.
     * @return the amount of widthid's.
     * @throws CarportException 
     */
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

    /**
     * This method get the maksimum number of shedwidthid representing in the database.
     * @return the amount of shedwidthid
     * @return
     * @throws CarportException 
     */
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
    
    /**
     * This method get the maksimum number of shedlengthid representing in the database.
     * @return the amount of shedlengthid
     * @return
     * @throws CarportException 
     */
    
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
    
    /**
     * This method get the widthvalue when selecting an id in the database
     * @param id
     * @return the widthvalue from the id
     * @throws CarportException 
     */

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
    
    /**
     * This method get the lengthvalue when selecting an id in the database
     * @param id
     * @return the lengthvalue from the id
     * @throws CarportException 
     */

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

    /**
     * This method get the shedWidthvalue when selecting an id in the database
     * @param id
     * @return the shedlengthvalue from the id
     * @throws CarportException 
     */
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

    /**
     * This method get the shedlengthvalue when selecting an id in the database
     * @param id
     * @return the shedlengthvalue from id 
     * @throws CarportException 
     */
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

    /**
     * This method get the roofanglevalue when selecting an id in the database
     * @param id
     * @return the anglevalue from id 
     * @throws CarportException 
     */
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
