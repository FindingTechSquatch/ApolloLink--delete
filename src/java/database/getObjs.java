/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package database;

import static database.db2_conn.getConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashSet;
import obj.*;

/**
 *
 * @author tyleryork
 */
public class getObjs {

    public static ArrayList<School> getSchoolsFromUID(int uid) {
        ArrayList<School> returnList = new ArrayList<School>();
        Connection db2 = getConnection();

        PreparedStatement ps = null;
        ResultSet rs = null;

        try {
            db2.setAutoCommit(false);

            //<<<<<<<<<<<<<<<< Get All School Info >>>>>>>>>>>>>>>>
            String sql = "SELECT * from SCM.S_DETAIL JOIN SCM.X_UID_SID on SCM.S_DETAIL.SID = SCM.X_UID_SID.SID WHERE SCM.X_UID_SID.UID = ?";
            ps = db2.prepareStatement(sql);
            ps.setInt(1, uid);
            rs = ps.executeQuery();
            while (rs.next()) {
                School s = new School();
                s.setSID(rs.getInt("SID"));
                s.setSchlName(rs.getString("SCHL_NAME"));
                s.setSchlAddr1(rs.getString("SCHL_ADDR1"));
                s.setSchlAddr2(rs.getString("SCHL_ADDR2"));
                s.setSchlCity(rs.getString("SCHL_CITY"));
                s.setSchlST(rs.getString("SCHL_STATE"));
                s.setSchlZip(rs.getString("SCHL_ZIP"));
                s.setSchlSize(rs.getString("SCHL_SIZE"));
                s.setSchlPhone(rs.getString("SCHL_PHONE"));
                s.setLogoURL(rs.getString("SCHL_LOGO"));

                returnList.add(s);
            }

            //<<<<<<<<<<<<<<<< Final Commit for New User >>>>>>>>>>>>>>>>
            db2.commit();
            rs.close();
            ps.close();
            db2.close();
        } catch (SQLException e) {
            System.out.println("Database currently unavailable." + e);

            try {
                if (db2 != null) {
                    db2.rollback();
                }
            } catch (SQLException se) {
                System.out.println("Database is currently unavailable " + se);
            }
        } finally {
            try {
                if (rs != null) {
                    rs.close();
                }
                if (ps != null) {
                    ps.close();
                }
                if (db2 != null) {
                    db2.close();
                }
            } catch (SQLException se) {
                System.out.println("Database currently unavailable." + se);
            }
        }

        return returnList;
    }

    public static ArrayList<Group> getGroupsFromSID(int sid) {
        ArrayList<Group> returnList = new ArrayList<Group>();
        Connection db2 = getConnection();

        PreparedStatement ps = null;
        ResultSet rs = null;

        try {
            db2.setAutoCommit(false);

            //<<<<<<<<<<<<<<<< Get All School Info >>>>>>>>>>>>>>>>
            String sql = "SELECT * from SCM.G_DETAIL JOIN SCM.X_SID_GID on SCM.G_DETAIL.GID = SCM.X_SID_GID.GID WHERE SCM.X_SID_GID.SID = ?";
            ps = db2.prepareStatement(sql);
            ps.setInt(1, sid);
            rs = ps.executeQuery();
            while (rs.next()) {
                Group g = new Group();
                g.setGID(rs.getInt("GID"));
                g.setGrpName(rs.getString("GRP_NAME"));
                g.setGrpType(rs.getString("GRP_TYPE"));
                g.setGrpSize(rs.getInt("GRP_SIZE"));

                returnList.add(g);
            }

            //<<<<<<<<<<<<<<<< Final Commit for New User >>>>>>>>>>>>>>>>
            db2.commit();
            rs.close();
            ps.close();
            db2.close();
        } catch (SQLException e) {
            System.out.println("Database currently unavailable." + e);

            try {
                if (db2 != null) {
                    db2.rollback();
                }
            } catch (SQLException se) {
                System.out.println("Database is currently unavailable " + se);
            }
        } finally {
            try {
                if (rs != null) {
                    rs.close();
                }
                if (ps != null) {
                    ps.close();
                }
                if (db2 != null) {
                    db2.close();
                }
            } catch (SQLException se) {
                System.out.println("Database currently unavailable." + se);
            }
        }

        return returnList;
    }

    public static ArrayList<grpLeader> getCurrentLeadersFromGID(int gid) {
        ArrayList<grpLeader> returnList = new ArrayList<grpLeader>();
        Connection db2 = getConnection();

        PreparedStatement ps = null;
        ResultSet rs = null;

        try {
            db2.setAutoCommit(false);

            //<<<<<<<<<<<<<<<< Get All School Info >>>>>>>>>>>>>>>>
            String sql = "SELECT * from SCM.L_DETAIL JOIN SCM.X_GID_LID on SCM.L_DETAIL.LID = SCM.X_GID_LID.LID WHERE SCM.X_GID_LID.LID = ?";
            sql += " AND ((SCM.L_DETAIL.STRT_DTE <= CURRENT TIMESTAMP AND SCM.L_DETAIL.END_DTE >= CURRENT TIMESTAMP) OR (";
            sql += "SCM.L_DETAIL.STRT_DTE <= CURRENT TIMESTAMP AND SCM.L_DETAIL.END_DTE IS NULL))";
            ps = db2.prepareStatement(sql);
            ps.setInt(1, gid);
            rs = ps.executeQuery();
            while (rs.next()) {
                grpLeader l = new grpLeader();
                l.setLID(rs.getInt("LID"));
                l.setLdrFName(rs.getString("FIRST_NAME"));
                l.setLdrLName(rs.getString("LAST_NAME"));
                l.setLdrSchlYr(rs.getString("SCHL_YR"));
                l.setLdrTitle(rs.getString("TITLE"));

                returnList.add(l);
            }

            //<<<<<<<<<<<<<<<< Final Commit for New User >>>>>>>>>>>>>>>>
            db2.commit();
            rs.close();
            ps.close();
            db2.close();
        } catch (SQLException e) {
            System.out.println("Database currently unavailable." + e);

            try {
                if (db2 != null) {
                    db2.rollback();
                }
            } catch (SQLException se) {
                System.out.println("Database is currently unavailable " + se);
            }
        } finally {
            try {
                if (rs != null) {
                    rs.close();
                }
                if (ps != null) {
                    ps.close();
                }
                if (db2 != null) {
                    db2.close();
                }
            } catch (SQLException se) {
                System.out.println("Database currently unavailable." + se);
            }
        }

        return returnList;
    }

    public static ArrayList<Registration> getRegistrationsFromGID(int gid) {
        ArrayList<Registration> returnList = new ArrayList<Registration>();
        Connection db2 = getConnection();

        PreparedStatement ps = null;
        ResultSet rs = null;

        try {
            db2.setAutoCommit(false);

            //<<<<<<<<<<<<<<<< Get All School Info >>>>>>>>>>>>>>>>
            String sql = "SELECT SCM.R_DETAIL.RID, SCM.R_DETAIL.REG_TIME, SCM.R_DETAIL.REG_TYPE, SCM.R_DETAIL.REG_SEL_TIME_SLOT, SCM.R_DETAIL.REG_ADDL_STAFF, SCM.R_DETAIL.REG_BUSES, SCM.R_DETAIL.REG_TRUCK, ";
            sql += "SCM.R_PERFORMANCE.REG_PERF_TITLE, SCM.R_PERFORMANCE.REG_SONG1, SCM.R_PERFORMANCE.REG_SONG2, SCM.R_PERFORMANCE.REG_SONG3, SCM.R_PERFORMANCE.REG_SONG4, SCM.R_PERFORMANCE.REG_SONG5, SCM.R_PERFORMANCE.REG_PRE_ANNOUNCE, SCM.R_PERFORMANCE.REG_POST_ANNOUNCE ";
            sql += " FROM SCM.R_DETAIL JOIN SCM.R_PERFORMANCE ON SCM.R_DETAIL.RID = SCM.R_PERFORMANCE.RID ";
            sql += " JOIN SCM.X_GID_RID ON SCM.R_DETAIL.RID = SCM.X_GID_RID.RID WHERE SCM.X_GID_RID.GID = ?";
            ps = db2.prepareStatement(sql);
            ps.setInt(1, gid);
            rs = ps.executeQuery();
            while (rs.next()) {
                Registration r = new Registration();
                r.setRID(rs.getInt("RID"));
                r.setRegDteTm(LocalDateTime.parse(rs.getString("REG_TIME")));
                r.setType(rs.getString("REG_TYPE"));
                r.setSelDteTm(LocalDateTime.parse(rs.getString("REG_SEL_TIME_SLOT")));
                r.setAddlStff(rs.getString("REG_ADDL_STAFF"));
                r.setBus(rs.getInt("REG_BUSES"));
                r.setTruck(rs.getInt("REG_TRUCK"));
                r.setPerfTitle(rs.getString("REG_PERF_TITLE"));
                r.setSong1(rs.getString("REG_SONG1"));
                r.setSong2(rs.getString("REG_SONG2"));
                r.setSong3(rs.getString("REG_SONG3"));
                r.setSong4(rs.getString("REG_SONG4"));
                r.setSong5(rs.getString("REG_SONG5"));
                r.setPreAnnounce(rs.getString("REG_PRE_ANNOUNCE"));
                r.setPostAnnounce(rs.getString("REG_POST_ANNOUNCE"));

                returnList.add(r);
            }

            //<<<<<<<<<<<<<<<< Final Commit for New User >>>>>>>>>>>>>>>>
            db2.commit();
            rs.close();
            ps.close();
            db2.close();
        } catch (SQLException e) {
            System.out.println("Database currently unavailable." + e);

            try {
                if (db2 != null) {
                    db2.rollback();
                }
            } catch (SQLException se) {
                System.out.println("Database is currently unavailable " + se);
            }
        } finally {
            try {
                if (rs != null) {
                    rs.close();
                }
                if (ps != null) {
                    ps.close();
                }
                if (db2 != null) {
                    db2.close();
                }
            } catch (SQLException se) {
                System.out.println("Database currently unavailable." + se);
            }
        }

        return returnList;
    }

    public static ArrayList<School> getAllFromUID(int uid) {
        ArrayList<School> returnList = new ArrayList<School>();

        try {
            returnList = getObjs.getSchoolsFromUID(uid);
            for (int i = 0; i < returnList.size(); i++) {
                returnList.get(i).setGrps(getObjs.getGroupsFromSID(returnList.get(i).getSID()));
                for (int i2 = 0; i2 < returnList.get(i).getGrps().size(); i2++) {
                    returnList.get(i).getGrps().get(i2).setLdrs(getObjs.getCurrentLeadersFromGID(returnList.get(i).getGrps().get(i2).getGID()));
                    returnList.get(i).getGrps().get(i2).setRegs(getObjs.getRegistrationsFromGID(returnList.get(i).getGrps().get(i2).getGID()));
                }
            }

        } catch (Exception e) {
            System.out.println("Database currently unavailable." + e);

        }

        return returnList;
    }
}
