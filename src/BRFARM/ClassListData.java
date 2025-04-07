/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BRFARM;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Wattana
 */
public class ClassListData {

    DecimalFormat df = new DecimalFormat("#");

    public List<String> GetResultFarm(String farm) {

        List<String> getListFarm = new ArrayList<String>();
        getListFarm.add("Please Select : Farm");
        Connection conn = null;
        try {
            conn = ConnectSQLite.ConnectionSQLite();
            Statement sta = conn.createStatement();
            String Sql = "SELECT FARM_CODE \n"
                    + "FROM FAR_MFARM \n"
                    + "WHERE FARM_CODE = '" + farm + "' \n"
                    + "ORDER BY FARM_CODE";
            ResultSet rs = sta.executeQuery(Sql);

            while (rs.next()) {
                getListFarm.add(rs.getString("FARM_CODE").trim());
            }
            return getListFarm;

        } catch (Exception ex) {
            System.out.println(ex.toString());
        } finally {
            if (conn != null) {
                try {
                    conn.close();
                } catch (SQLException ex) {
                    System.out.println(ex.toString());
                }
            }
        }
        return null;
    }

    public List<String> GetResultFarmDesc() {

        List<String> getListFarmDesc = new ArrayList<String>();
        getListFarmDesc.add("Please Select : Farm");
        Connection conn = null;
        try {
            conn = ConnectSQLite.ConnectionSQLite();
            Statement sta = conn.createStatement();
            String Sql = "SELECT FARM_CODE,FARM_NAME,FARM_ADDR1 \n"
                    + "FROM FAR_MFARM \n"
                    + "ORDER BY FARM_CODE";
            ResultSet rs = sta.executeQuery(Sql);

            while (rs.next()) {
//                getListFarmDesc.add(rs.getString("FARM_CODE").trim() + " : " + rs.getString("FARM_NAME").trim());
                getListFarmDesc.add(rs.getString("FARM_CODE").trim() + " : " + rs.getString("FARM_NAME").trim() + " : " + rs.getString("FARM_NAME").trim());
            }
            return getListFarmDesc;

        } catch (Exception ex) {
            System.out.println(ex.toString());
        } finally {
            if (conn != null) {
                try {
                    conn.close();
                } catch (SQLException ex) {
                    System.out.println(ex.toString());
                }
            }
        }
        return null;
    }

    public List<String> GetResultFarmDesc(String farm) {

        List<String> getListFarmDesc = new ArrayList<String>();
        getListFarmDesc.add("Please Select : Farm");
        Connection conn = null;
        try {
            conn = ConnectSQLite.ConnectionSQLite();
            Statement sta = conn.createStatement();
            String Sql = "SELECT FARM_CODE,FARM_NAME \n"
                    + "FROM FAR_MFARM \n"
                    + "WHERE FARM_CODE = '" + farm + "' \n"
                    + "ORDER BY FARM_CODE";
            ResultSet rs = sta.executeQuery(Sql);

            while (rs.next()) {
                getListFarmDesc.add(rs.getString("FARM_CODE").trim() + " : " + rs.getString("FARM_NAME").trim());
            }
            return getListFarmDesc;

        } catch (Exception ex) {
            System.out.println(ex.toString());
        } finally {
            if (conn != null) {
                try {
                    conn.close();
                } catch (SQLException ex) {
                    System.out.println(ex.toString());
                }
            }
        }
        return null;
    }

    public List<String> GetResultFarmDetail(String farm) {

        List<String> getListFarmDetail = new ArrayList<String>();
        Connection conn = null;
        try {
            conn = ConnectSQLite.ConnectionSQLite();
            Statement sta = conn.createStatement();
            String Sql = "SELECT FARM_CODE,FARM_NAME,FARM_COSTC,FARM_ADDR1,FARM_ADDR2,FARM_TEL,FARM_FAX \n"
                    + "FROM FAR_MFARM \n"
                    + "WHERE FARM_CODE = '" + farm + "' \n"
                    + "ORDER BY FARM_CODE";
            ResultSet rs = sta.executeQuery(Sql);

            while (rs.next()) {
                getListFarmDetail.add(
                        rs.getString("FARM_CODE").trim() + " ; "
                        + rs.getString("FARM_NAME").trim() + " ; "
                        + rs.getString("FARM_COSTC").trim() + " ; "
                        + rs.getString("FARM_ADDR1").trim() + " ; "
                        + rs.getString("FARM_ADDR2").trim() + " ; "
                        + rs.getString("FARM_TEL").trim() + " ; "
                        + rs.getString("FARM_FAX").trim());
            }
            return getListFarmDetail;

        } catch (Exception ex) {
            System.out.println(ex.toString());
        } finally {
            if (conn != null) {
                try {
                    conn.close();
                } catch (SQLException ex) {
                    System.out.println(ex.toString());
                }
            }
        }
        return null;
    }

    public List<String> GetResultMainHouse(String farm, String breed, String breedall) {

        List<String> getListHouseDesc = new ArrayList<String>();
        getListHouseDesc.add("Please Select : House");
        Connection conn = null;
        try {
            conn = ConnectSQLite.ConnectionSQLite();
            Statement sta = conn.createStatement();
            String Sql = "SELECT DISTINCT SUBSTR(HOUS_CODE,5,6) AS HOUS_CODE \n"
                    + "FROM FAR_MHOUSE\n"
                    + "WHERE HOUS_FARM = '" + farm + "' \n"
                    + "AND HOUS_BREED IN ('" + breed + "','" + breedall + "')";
            ResultSet rs = sta.executeQuery(Sql);

            while (rs.next()) {
                getListHouseDesc.add(rs.getString("HOUS_CODE").trim());
            }
            return getListHouseDesc;

        } catch (Exception ex) {
            System.out.println(ex.toString());
        } finally {
            if (conn != null) {
                try {
                    conn.close();
                } catch (SQLException ex) {
                    System.out.println(ex.toString());
                }
            }
        }
        return null;
    }

    public List<String> GetResultHouse(String farm, String breed, String breedall) {

        List<String> getListHouseDesc = new ArrayList<String>();
        getListHouseDesc.add("Please Select : House");
        Connection conn = null;
        try {
            conn = ConnectSQLite.ConnectionSQLite();
            Statement sta = conn.createStatement();
            String Sql = "SELECT HOUS_CODE \n"
                    + "FROM FAR_MHOUSE\n"
                    + "WHERE HOUS_FARM = '" + farm + "' \n"
                    + "AND HOUS_BREED IN ('" + breed + "','" + breedall + "')";
            ResultSet rs = sta.executeQuery(Sql);

            while (rs.next()) {
                getListHouseDesc.add(rs.getString("HOUS_CODE").trim());
            }
            return getListHouseDesc;

        } catch (Exception ex) {
            System.out.println(ex.toString());
        } finally {
            if (conn != null) {
                try {
                    conn.close();
                } catch (SQLException ex) {
                    System.out.println(ex.toString());
                }
            }
        }
        return null;
    }

    public List<String> GetResultHouseDesc(String farm, String breed, String breedall) {

        List<String> getListHouseDesc = new ArrayList<String>();
        getListHouseDesc.add("Please Select : House");
        Connection conn = null;
        try {
            conn = ConnectSQLite.ConnectionSQLite();
            Statement sta = conn.createStatement();
            String Sql = "SELECT HOUS_CODE,HOUS_NAME \n"
                    + "FROM FAR_MHOUSE\n"
                    + "WHERE HOUS_FARM = '" + farm + "' \n"
                    + "AND HOUS_BREED IN ('" + breed + "','" + breedall + "')";
            ResultSet rs = sta.executeQuery(Sql);

            while (rs.next()) {
                getListHouseDesc.add(rs.getString("HOUS_CODE").trim() + " : " + rs.getString("HOUS_NAME").trim());
            }
            return getListHouseDesc;

        } catch (Exception ex) {
            System.out.println(ex.toString());
        } finally {
            if (conn != null) {
                try {
                    conn.close();
                } catch (SQLException ex) {
                    System.out.println(ex.toString());
                }
            }
        }
        return null;
    }

    public List<String> GetResultEggHouseDesc(String farm, String breed, String breedall) {

        List<String> getListHouseDesc = new ArrayList<String>();
        getListHouseDesc.add("Please Select : House");
        Connection conn = null;
        try {
            conn = ConnectSQLite.ConnectionSQLite();
            Statement sta = conn.createStatement();
            String Sql = "SELECT HOUS_CODE,HOUS_NAME \n"
                    + "FROM FAR_MHOUSE\n"
                    + "WHERE HOUS_FARM = '" + farm + "' \n"
                    + "AND HOUS_BREED IN ('" + breed + "','" + breedall + "') \n"
                    + "AND SUBSTR(HOUS_CODE,4) NOT IN ('201','301')";
            ResultSet rs = sta.executeQuery(Sql);

            while (rs.next()) {
                getListHouseDesc.add(rs.getString("HOUS_CODE").trim() + " : " + rs.getString("HOUS_NAME").trim());
            }
            return getListHouseDesc;

        } catch (Exception ex) {
            System.out.println(ex.toString());
        } finally {
            if (conn != null) {
                try {
                    conn.close();
                } catch (SQLException ex) {
                    System.out.println(ex.toString());
                }
            }
        }
        return null;
    }

    public List<String> GetResultHouseDetail(String farm, String breed, String breedall) {

        List<String> getListHouseDetail = new ArrayList<String>();
        Connection conn = null;
        try {
            conn = ConnectSQLite.ConnectionSQLite();
            Statement sta = conn.createStatement();
            String Sql = "Select HOUS_FARM,HOUS_CODE,HOUS_NAME,COALESCE(HOUS_LASTMO,'') AS HOUS_LASTMO,HOUS_MULTI \n"
                    + "FROM FAR_MHOUSE \n"
                    + "WHERE HOUS_FARM = '" + farm + "' \n"
                    + "AND HOUS_BREED IN ('" + breed + "','" + breedall + "')";
            ResultSet rs = sta.executeQuery(Sql);

            while (rs.next()) {
                getListHouseDetail.add(
                        rs.getString("HOUS_CODE").trim() + " ; "
                        + rs.getString("HOUS_NAME").trim() + " ; "
                        + rs.getString("HOUS_LASTMO").trim() + " ; "
                        + rs.getString("HOUS_MULTI").trim());
            }
            return getListHouseDetail;

        } catch (Exception ex) {
            System.out.println(ex.toString());
        } finally {
            if (conn != null) {
                try {
                    conn.close();
                } catch (SQLException ex) {
                    System.out.println(ex.toString());
                }
            }
        }
        return null;
    }

    public List<String> GetResultPene(String farm) {

        List<String> getListPeneDesc = new ArrayList<String>();
        getListPeneDesc.add("Please Select : Pene");
        Connection conn = null;
        try {
            conn = ConnectSQLite.ConnectionSQLite();
            Statement sta = conn.createStatement();
            String Sql = "SELECT PENE_CODE \n"
                    + "FROM FAR_MPENE \n"
                    + "WHERE PENE_FARM = '" + farm + "' ";
            ResultSet rs = sta.executeQuery(Sql);

            while (rs.next()) {
                getListPeneDesc.add(rs.getString("PENE_CODE").trim());
            }
            return getListPeneDesc;

        } catch (Exception ex) {
            System.out.println(ex.toString());
        } finally {
            if (conn != null) {
                try {
                    conn.close();
                } catch (SQLException ex) {
                    System.out.println(ex.toString());
                }
            }
        }
        return null;
    }

    public List<String> GetResultPeneDesc(String farm) {

        List<String> getListPeneDesc = new ArrayList<String>();
        getListPeneDesc.add("Please Select : Pene");
        Connection conn = null;
        try {
            conn = ConnectSQLite.ConnectionSQLite();
            Statement sta = conn.createStatement();
            String Sql = "SELECT PENE_CODE, PENE_NAME \n"
                    + "FROM FAR_MPENE \n"
                    + "WHERE PENE_FARM = '" + farm + "' ";
            ResultSet rs = sta.executeQuery(Sql);

            while (rs.next()) {
                getListPeneDesc.add(rs.getString("PENE_CODE").trim() + " : " + rs.getString("PENE_NAME").trim());
            }
            return getListPeneDesc;

        } catch (Exception ex) {
            System.out.println(ex.toString());
        } finally {
            if (conn != null) {
                try {
                    conn.close();
                } catch (SQLException ex) {
                    System.out.println(ex.toString());
                }
            }
        }
        return null;
    }

    public List<String> GetResultPeneDetail(String farm) {

        List<String> getListPeneDetail = new ArrayList<String>();
        Connection conn = null;
        try {
            conn = ConnectSQLite.ConnectionSQLite();
            Statement sta = conn.createStatement();
            String Sql = "SELECT PENE_CODE, PENE_NAME \n"
                    + "FROM FAR_MPENE \n"
                    + "WHERE PENE_FARM = '" + farm + "' ";
            ResultSet rs = sta.executeQuery(Sql);

            while (rs.next()) {
                getListPeneDetail.add(rs.getString("PENE_CODE").trim() + " ; " + rs.getString("PENE_NAME").trim());
            }
            return getListPeneDetail;

        } catch (Exception ex) {
            System.out.println(ex.toString());
        } finally {
            if (conn != null) {
                try {
                    conn.close();
                } catch (SQLException ex) {
                    System.out.println(ex.toString());
                }
            }
        }
        return null;
    }

    public List<String> GetResultFlock(String farm, String breed) {

        List<String> getListFlock = new ArrayList<String>();
        getListFlock.add("Please Select : Flock");
        Connection conn = null;
        try {
            conn = ConnectSQLite.ConnectionSQLite();
            Statement sta = conn.createStatement();
            String Sql = "SELECT FLOC_CODE \n"
                    + "FROM FAR_FLOCK \n"
                    + "WHERE FLOC_FARM = '" + farm + "' \n"
                    + "AND FLOC_BREED = '" + breed + "'";
            ResultSet rs = sta.executeQuery(Sql);

            while (rs.next()) {
                getListFlock.add(rs.getString("FLOC_CODE").trim());
            }
            return getListFlock;

        } catch (Exception ex) {
            System.out.println(ex.toString());
        } finally {
            if (conn != null) {
                try {
                    conn.close();
                } catch (SQLException ex) {
                    System.out.println(ex.toString());
                }
            }
        }
        return null;
    }

    public List<String> GetResultFlockDesc(String farm, String breed) {

        List<String> getListFlockDesc = new ArrayList<String>();
        getListFlockDesc.add("Please Select : Flock");
        Connection conn = null;
        try {
            conn = ConnectSQLite.ConnectionSQLite();
            Statement sta = conn.createStatement();
            String Sql = "SELECT FLOC_CODE,FLOC_DESC \n"
                    + "FROM FAR_FLOCK \n"
                    + "WHERE FLOC_FARM = '" + farm + "' \n"
                    + "AND FLOC_BREED = '" + breed + "' \n"
                    + "AND FLOC_STATUS = '1'";
            ResultSet rs = sta.executeQuery(Sql);

            while (rs.next()) {
                getListFlockDesc.add(rs.getString("FLOC_CODE").trim() + " : " + rs.getString("FLOC_DESC").trim());
            }
            return getListFlockDesc;

        } catch (Exception ex) {
            System.out.println(ex.toString());
        } finally {
            if (conn != null) {
                try {
                    conn.close();
                } catch (SQLException ex) {
                    System.out.println(ex.toString());
                }
            }
        }
        return null;
    }

    public List<String> GetResultFlockDetail(String farm, String breed) {

        List<String> getListFlockDetail = new ArrayList<String>();
        Connection conn = null;
        try {
            conn = ConnectSQLite.ConnectionSQLite();
            Statement sta = conn.createStatement();
            String Sql = "SELECT FLOC_CODE,FLOC_FARM,FLOC_STDATE,COALESCE(FLOC_ENDATE,'') AS FLOC_ENDATE,FLOC_DESC,FLOC_STATUS,FLOC_STWEEK \n"
                    + "FROM FAR_FLOCK \n"
                    + "WHERE FLOC_FARM = '" + farm + "' "
                    + "AND FLOC_BREED = '" + breed + "'";
            ResultSet rs = sta.executeQuery(Sql);

            while (rs.next()) {
                getListFlockDetail.add(
                        rs.getString("FLOC_CODE").trim() + " ; "
                        + rs.getString("FLOC_STDATE").trim() + " ; "
                        + rs.getString("FLOC_ENDATE").trim() + " ; "
                        + rs.getString("FLOC_DESC").trim() + " ; "
                        + rs.getString("FLOC_STATUS").trim() + " ; "
                        + rs.getString("FLOC_STWEEK").trim());
            }
            return getListFlockDetail;

        } catch (Exception ex) {
            System.out.println(ex.toString());
        } finally {
            if (conn != null) {
                try {
                    conn.close();
                } catch (SQLException ex) {
                    System.out.println(ex.toString());
                }
            }
        }
        return null;
    }

    public List<String> GetResultType(String farm) {

        List<String> getListTypeDesc = new ArrayList<String>();
        getListTypeDesc.add("Please Select : Type");
        Connection conn = null;
        try {
            conn = ConnectSQLite.ConnectionSQLite();
            Statement sta = conn.createStatement();
            String Sql = "SELECT TYPE_CODE \n"
                    + "FROM FAR_MTYPE \n"
                    + "WHERE TYPE_FARM = '" + farm + "' \n"
                    + "ORDER BY TYPE_CODE";
            ResultSet rs = sta.executeQuery(Sql);

            while (rs.next()) {
                getListTypeDesc.add(rs.getString("TYPE_CODE").trim());
            }
            return getListTypeDesc;

        } catch (Exception ex) {
            System.out.println(ex.toString());
        } finally {
            if (conn != null) {
                try {
                    conn.close();
                } catch (SQLException ex) {
                    System.out.println(ex.toString());
                }
            }
        }
        return null;
    }

    public List<String> GetResultTypeDescWOM(String farm) {

        List<String> getListTypeDesc = new ArrayList<String>();
        getListTypeDesc.add("Please Select : Type");
        Connection conn = null;
        try {
            conn = ConnectSQLite.ConnectionSQLite();
            Statement sta = conn.createStatement();
            String Sql = "SELECT TYPE_CODE,TYPE_NAME \n"
                    + "FROM FAR_MTYPE \n"
                    + "WHERE TYPE_FARM = '" + farm + "' \n"
                    + "AND TYPE_TRANSECTION = '1' \n"
                    + "AND TYPE_PROPERTY = '0' \n"
                    + "ORDER BY TYPE_CODE";
            ResultSet rs = sta.executeQuery(Sql);

            while (rs.next()) {
                getListTypeDesc.add(rs.getString("TYPE_CODE").trim() + " : " + rs.getString("TYPE_NAME").trim());
            }
            return getListTypeDesc;

        } catch (Exception ex) {
            System.out.println(ex.toString());
        } finally {
            if (conn != null) {
                try {
                    conn.close();
                } catch (SQLException ex) {
                    System.out.println(ex.toString());
                }
            }
        }
        return null;
    }

    public List<String> GetResultTypeDescWOP(String farm) {

        List<String> getListTypeDesc = new ArrayList<String>();
        getListTypeDesc.add("Please Select : Type");
        Connection conn = null;
        try {
            conn = ConnectSQLite.ConnectionSQLite();
            Statement sta = conn.createStatement();
            String Sql = "SELECT TYPE_CODE,TYPE_NAME \n"
                    + "FROM FAR_MTYPE \n"
                    + "WHERE TYPE_FARM = '" + farm + "' \n"
                    + "AND TYPE_TRANSECTION = '1' \n"
                    + "AND TYPE_PROPERTY = '1' \n"
                    + "ORDER BY TYPE_CODE";
            ResultSet rs = sta.executeQuery(Sql);

            while (rs.next()) {
                getListTypeDesc.add(rs.getString("TYPE_CODE").trim() + " : " + rs.getString("TYPE_NAME").trim());
            }
            return getListTypeDesc;

        } catch (Exception ex) {
            System.out.println(ex.toString());
        } finally {
            if (conn != null) {
                try {
                    conn.close();
                } catch (SQLException ex) {
                    System.out.println(ex.toString());
                }
            }
        }
        return null;
    }

    public List<String> GetBE(String farm) {

        List<String> getListTypeDesc = new ArrayList<String>();
        getListTypeDesc.add("Please Select : Type");
        Connection conn = null;
        try {
            conn = ConnectSQLite.ConnectionSQLite();
            Statement sta = conn.createStatement();
            String Sql = "SELECT TYPE_CODE,TYPE_NAME FROM FAR_MTYPE fm \n"
                    + "where TYPE_FARM  = '" + farm + "'\n"
                    + "and TYPE_CODE = 'BE'";
            ResultSet rs = sta.executeQuery(Sql);

            while (rs.next()) {
                getListTypeDesc.add(rs.getString("TYPE_CODE").trim() + " : " + rs.getString("TYPE_NAME").trim());
            }
            return getListTypeDesc;

        } catch (Exception ex) {
            System.out.println(ex.toString());
        } finally {
            if (conn != null) {
                try {
                    conn.close();
                } catch (SQLException ex) {
                    System.out.println(ex.toString());
                }
            }
        }
        return null;
    }

    public List<String> GetResultTypeDescAdj(String farm) {

        List<String> getListTypeDesc = new ArrayList<String>();
        getListTypeDesc.add("Please Select : Type");
        Connection conn = null;
        try {
            conn = ConnectSQLite.ConnectionSQLite();
            Statement sta = conn.createStatement();
            String Sql = "SELECT TYPE_CODE,TYPE_NAME \n"
                    + "FROM FAR_MTYPE \n"
                    + "WHERE TYPE_FARM = '" + farm + "' \n"
                    + "AND TYPE_TRANSECTION = '0' \n"
                    + "ORDER BY TYPE_CODE";
            ResultSet rs = sta.executeQuery(Sql);

            while (rs.next()) {
                getListTypeDesc.add(rs.getString("TYPE_CODE").trim() + " : " + rs.getString("TYPE_NAME").trim());
            }
            return getListTypeDesc;

        } catch (Exception ex) {
            System.out.println(ex.toString());
        } finally {
            if (conn != null) {
                try {
                    conn.close();
                } catch (SQLException ex) {
                    System.out.println(ex.toString());
                }
            }
        }
        return null;
    }

    public List<String> GetResultTypeDetail(String farm) {

        List<String> getListTypeDetail = new ArrayList<String>();
        Connection conn = null;
        try {
            conn = ConnectSQLite.ConnectionSQLite();
            Statement sta = conn.createStatement();
            String Sql = "SELECT TYPE_CODE,TYPE_NAME,TYPE_PROPERTY \n"
                    + "FROM FAR_MTYPE \n"
                    + "WHERE TYPE_FARM = '" + farm + "'";
            ResultSet rs = sta.executeQuery(Sql);

            while (rs.next()) {
                getListTypeDetail.add(
                        rs.getString("TYPE_CODE").trim() + " ; "
                        + rs.getString("TYPE_NAME").trim() + " ; "
                        + rs.getString("TYPE_PROPERTY").trim());
            }
            return getListTypeDetail;

        } catch (Exception ex) {
            System.out.println(ex.toString());
        } finally {
            if (conn != null) {
                try {
                    conn.close();
                } catch (SQLException ex) {
                    System.out.println(ex.toString());
                }
            }
        }
        return null;
    }

    public List<String> GetResultItem(String farm, String breed, String breedall) {

        List<String> getListItem = new ArrayList<String>();
        getListItem.add("Please Select : Item");
        Connection conn = null;
        try {
            conn = ConnectSQLite.ConnectionSQLite();
            Statement sta = conn.createStatement();
            String Sql = "SELECT ITEM_CODE \n"
                    + "FROM FAR_MITEM \n"
                    + "WHERE ITEM_FARM = '" + farm + "' \n"
                    + "AND ITEM_BREED IN ('" + breed + "','" + breedall + "')";
            ResultSet rs = sta.executeQuery(Sql);

            while (rs.next()) {
                getListItem.add(rs.getString("ITEM_CODE").trim());
            }
            return getListItem;

        } catch (Exception ex) {
            System.out.println(ex.toString());
        } finally {
            if (conn != null) {
                try {
                    conn.close();
                } catch (SQLException ex) {
                    System.out.println(ex.toString());
                }
            }
        }
        return null;
    }

    public List<String> GetResultItemDesc(String farm, String breed, String breedall) {

        List<String> getListItemDesc = new ArrayList<String>();
        getListItemDesc.add("Please Select : Item");
        Connection conn = null;
        try {
            conn = ConnectSQLite.ConnectionSQLite();
            Statement sta = conn.createStatement();
            String Sql = "SELECT ITEM_CODE,ITEM_NAME \n"
                    + "FROM FAR_MITEM \n"
                    + "WHERE ITEM_FARM = '" + farm + "' \n"
                    + "AND ITEM_BREED IN ('" + breed + "','" + breedall + "')";
            ResultSet rs = sta.executeQuery(Sql);

            while (rs.next()) {
                getListItemDesc.add(rs.getString("ITEM_CODE").trim() + " : " + rs.getString("ITEM_NAME").trim());
            }
            return getListItemDesc;

        } catch (Exception ex) {
            System.out.println(ex.toString());
        } finally {
            if (conn != null) {
                try {
                    conn.close();
                } catch (SQLException ex) {
                    System.out.println(ex.toString());
                }
            }
        }
        return null;
    }

    public List<String> GetResultEggTran(String farm, String breed, String breedall) {

        List<String> getListItemDesc = new ArrayList<String>();
        getListItemDesc.add("Please Select : Date Transfer");
        Connection conn = null;
        try {
            conn = ConnectSQLite.ConnectionSQLite();
            Statement sta = conn.createStatement();
            String Sql = "SELECT TRAN_LOTDATE\n"
                    + "FROM\n"
                    + "(SELECT TRAN_DATE || \" : \" || SUBSTR(TRAN_LOTNO,14,16) AS TRAN_LOTDATE,SUM(TRAN_QTY) AS TRAN_QTY\n"
                    + "FROM FAR_DTRANSECTION\n"
                    + "WHERE TRAN_FARM = '" + farm + "'\n"
                    + "AND TRAN_BREED = '" + breed + "'\n"
                    + "AND TRAN_TYPE = 'ISS' \n"
                    + "GROUP BY TRAN_DATE,SUBSTR(TRAN_LOTNO,14,16)\n"
                    + "ORDER BY SUBSTR(TRAN_DATE,7) || SUBSTR(TRAN_DATE,4,2) || SUBSTR(TRAN_DATE,1,2) DESC,SUBSTR(TRAN_LOTNO,14,16) ASC)\n"
                    + "WHERE TRAN_QTY > 0";
            ResultSet rs = sta.executeQuery(Sql);

            while (rs.next()) {
                getListItemDesc.add(rs.getString("TRAN_LOTDATE").trim());
            }
            return getListItemDesc;

        } catch (Exception ex) {
            System.out.println(ex.toString());
        } finally {
            if (conn != null) {
                try {
                    conn.close();
                } catch (SQLException ex) {
                    System.out.println(ex.toString());
                }
            }
        }
        return null;
    }

    public List<String> GetResultItemDetail(String farm, String breed, String breedall) {

        List<String> getListItemDetail = new ArrayList<String>();
        Connection conn = null;
        try {
            conn = ConnectSQLite.ConnectionSQLite();
            Statement sta = conn.createStatement();
            String Sql = "SELECT ITEM_CODE,ITEM_NAME,ITEM_UNIT,ITEM_GROUP,COALESCE(ITEM_FLOCATION,'') AS ITEM_FLOCATION,ITEM_STKCTL,ITEM_STOCK,COALESCE(ITEM_EFFITEM,'') AS ITEM_EFFITEM,ITEM_MULTI \n"
                    + "FROM FAR_MITEM \n"
                    + "WHERE ITEM_FARM = '" + farm + "' \n"
                    + "AND ITEM_BREED IN ('" + breed + "','" + breedall + "')";
            ResultSet rs = sta.executeQuery(Sql);

            while (rs.next()) {
                getListItemDetail.add(
                        rs.getString("ITEM_CODE").trim() + " ; "
                        + rs.getString("ITEM_NAME").trim() + " ; "
                        + rs.getString("ITEM_UNIT").trim() + " ; "
                        + rs.getString("ITEM_GROUP").trim() + " ; "
                        + rs.getString("ITEM_FLOCATION").trim() + " ; "
                        + rs.getString("ITEM_STKCTL").trim() + " ; "
                        + rs.getString("ITEM_STOCK").trim() + " ; "
                        + rs.getString("ITEM_EFFITEM").trim() + " ; "
                        + rs.getString("ITEM_MULTI").trim());
            }
            return getListItemDetail;

        } catch (Exception ex) {
            System.out.println(ex.toString());
        } finally {
            if (conn != null) {
                try {
                    conn.close();
                } catch (SQLException ex) {
                    System.out.println(ex.toString());
                }
            }
        }
        return null;
    }

    public List<String> GetResultByItemDesc(String farm, String panel, String breed, String breedall) {

        List<String> getListByItemDesc = new ArrayList<String>();
        getListByItemDesc.add("Please Select : Item");
        Connection conn = null;
        try {
            conn = ConnectSQLite.ConnectionSQLite();
            Statement sta = conn.createStatement();
            String Type = "", Type2 = "";

            if ("Feed".equals(panel)) {
                Type = "FM" + "%";
                Type2 = "";
            } else if ("Duck".equals(panel)) {
                Type = BRLogin.vDuckBreed + "%";
                Type2 = BRLogin.vDuckHC + "3" + "%";
            } else if ("Other".equals(panel)) {
                Type = "RM" + "%";
                Type2 = "";
            } else {
                Type = BRLogin.vDuckHC + "3" + "%";
                Type2 = "";
            }

            String Sql = "SELECT ITEM_CODE,ITEM_NAME,ITEM_UNIT \n"
                    + "FROM FAR_MITEM \n"
                    + "WHERE ITEM_FARM = '" + farm + "' \n"
                    + "AND ITEM_BREED IN ('" + breed + "','" + breedall + "') \n"
                    + "AND ITEM_CODE LIKE '" + Type + "' \n"
                    + "AND ITEM_CODE NOT LIKE '" + Type2 + "'";
            ResultSet rs = sta.executeQuery(Sql);

            while (rs.next()) {
                getListByItemDesc.add(rs.getString("ITEM_CODE").trim() + " : " + rs.getString("ITEM_NAME").trim() + " : " + rs.getString("ITEM_UNIT").trim());
            }
            return getListByItemDesc;

        } catch (Exception ex) {
            System.out.println(ex.toString());
        } finally {
            if (conn != null) {
                try {
                    conn.close();
                } catch (SQLException ex) {
                    System.out.println(ex.toString());
                }
            }
        }
        return null;
    }

    public List<String> GetResultByItemHouse(String farm, String house, String breed) {

        List<String> getListByItemDesc = new ArrayList<String>();
        getListByItemDesc.add("Please Select : Item");
        Connection conn = null;
        try {
            conn = ConnectSQLite.ConnectionSQLite();
            Statement sta = conn.createStatement();

            String Sql = "SELECT ITEM_CODE,ITEM_NAME,ITEM_UNIT \n"
                    + "FROM FAR_ITEMHOUSE,FAR_MITEM\n"
                    + "WHERE ITEMH_FARM = '" + farm + "'\n"
                    + "AND ITEMH_BREED = '" + breed + "'\n"
                    + "AND ITEMH_HOUSE = '" + house + "'\n"
                    + "AND ITEM_CODE = ITEMH_CODE\n"
                    + "AND ITEMH_FARM = ITEM_FARM";
            ResultSet rs = sta.executeQuery(Sql);

            while (rs.next()) {
                getListByItemDesc.add(rs.getString("ITEM_CODE").trim() + " : " + rs.getString("ITEM_NAME").trim() + " : " + rs.getString("ITEM_UNIT").trim());
            }
            return getListByItemDesc;

        } catch (Exception ex) {
            System.out.println(ex.toString());
        } finally {
            if (conn != null) {
                try {
                    conn.close();
                } catch (SQLException ex) {
                    System.out.println(ex.toString());
                }
            }
        }
        return null;
    }

    public List<String> GetResultByItemHouseDesc(String farm, String house, String breed) {

        List<String> getListByItemDesc = new ArrayList<String>();
        Connection conn = null;
        try {
            conn = ConnectSQLite.ConnectionSQLite();
            Statement sta = conn.createStatement();

            String Sql = "SELECT ITEMH_HOUSE,ITEM_CODE,ITEM_NAME \n"
                    + "FROM FAR_ITEMHOUSE,FAR_MITEM\n"
                    + "WHERE ITEMH_FARM = '" + farm + "'\n"
                    + "AND ITEMH_BREED = '" + breed + "'\n"
                    + "AND ITEMH_HOUSE = '" + house + "'\n"
                    + "AND ITEM_CODE = ITEMH_CODE\n"
                    + "AND ITEMH_FARM = ITEM_FARM";
            ResultSet rs = sta.executeQuery(Sql);

            while (rs.next()) {
                getListByItemDesc.add(rs.getString("ITEMH_HOUSE").trim() + " ; " + rs.getString("ITEM_CODE").trim() + " : " + rs.getString("ITEM_NAME").trim());
            }
            return getListByItemDesc;

        } catch (Exception ex) {
            System.out.println(ex.toString());
        } finally {
            if (conn != null) {
                try {
                    conn.close();
                } catch (SQLException ex) {
                    System.out.println(ex.toString());
                }
            }
        }
        return null;
    }

    public List<String> GetResultItemUnit(String farm) {

        List<String> getListItemUnit = new ArrayList<String>();
        getListItemUnit.add("Please Select : Item Unit");
        Connection conn = null;
        try {
            conn = ConnectSQLite.ConnectionSQLite();
            Statement sta = conn.createStatement();
            String Sql = "SELECT ITUN_CODE,ITUN_NAME \n"
                    + "FROM FAR_ITEMUNIT\n"
                    + "WHERE ITUN_FARM = '" + farm + "'\n"
                    + "AND ITUN_STATUS = '1'";
            ResultSet rs = sta.executeQuery(Sql);

            while (rs.next()) {
                getListItemUnit.add(rs.getString("ITUN_CODE").trim());
            }
            return getListItemUnit;

        } catch (Exception ex) {
            System.out.println(ex.toString());
        } finally {
            if (conn != null) {
                try {
                    conn.close();
                } catch (SQLException ex) {
                    System.out.println(ex.toString());
                }
            }
        }
        return null;
    }

    public List<String> GetResultItemUnitDesc(String farm) {

        List<String> getListItemUnitDesc = new ArrayList<String>();
        getListItemUnitDesc.add("Please Select : Item Unit");
        Connection conn = null;
        try {
            conn = ConnectSQLite.ConnectionSQLite();
            Statement sta = conn.createStatement();
            String Sql = "SELECT ITUN_CODE,ITUN_NAME \n"
                    + "FROM FAR_ITEMUNIT\n"
                    + "WHERE ITUN_FARM = '" + farm + "'\n"
                    + "AND ITUN_STATUS = '1'";
            ResultSet rs = sta.executeQuery(Sql);

            while (rs.next()) {
                getListItemUnitDesc.add(
                        rs.getString("ITUN_CODE").trim() + " ; "
                        + rs.getString("ITUN_NAME").trim());
            }
            return getListItemUnitDesc;

        } catch (Exception ex) {
            System.out.println(ex.toString());
        } finally {
            if (conn != null) {
                try {
                    conn.close();
                } catch (SQLException ex) {
                    System.out.println(ex.toString());
                }
            }
        }
        return null;
    }

    public List<String> GetResultItemUnitDetail(String farm) {

        List<String> getListItemUnitDetail = new ArrayList<String>();
        Connection conn = null;
        try {
            conn = ConnectSQLite.ConnectionSQLite();
            Statement sta = conn.createStatement();
            String Sql = "SELECT ITUN_CODE,ITUN_NAME,ITUN_STATUS \n"
                    + "FROM FAR_ITEMUNIT \n"
                    + "WHERE ITUN_FARM = '" + farm + "'";
            ResultSet rs = sta.executeQuery(Sql);

            while (rs.next()) {
                getListItemUnitDetail.add(
                        rs.getString("ITUN_CODE").trim() + " ; "
                        + rs.getString("ITUN_NAME").trim() + " ; "
                        + rs.getString("ITUN_STATUS").trim());
            }
            return getListItemUnitDetail;

        } catch (Exception ex) {
            System.out.println(ex.toString());
        } finally {
            if (conn != null) {
                try {
                    conn.close();
                } catch (SQLException ex) {
                    System.out.println(ex.toString());
                }
            }
        }
        return null;
    }

    public List<String> GetResultItemGroup(String farm) {

        List<String> getListItemGroup = new ArrayList<String>();
        getListItemGroup.add("Please Select : Item Group");
        Connection conn = null;
        try {
            conn = ConnectSQLite.ConnectionSQLite();
            Statement sta = conn.createStatement();
            String Sql = "SELECT ITGR_CODE \n"
                    + "FROM FAR_ITEMGROUP\n"
                    + "WHERE ITGR_FARM = '" + farm + "'\n"
                    + "AND ITGR_STATUS = '1'";
            ResultSet rs = sta.executeQuery(Sql);

            while (rs.next()) {
                getListItemGroup.add(rs.getString("ITGR_CODE").trim());
            }
            return getListItemGroup;

        } catch (Exception ex) {
            System.out.println(ex.toString());
        } finally {
            if (conn != null) {
                try {
                    conn.close();
                } catch (SQLException ex) {
                    System.out.println(ex.toString());
                }
            }
        }
        return null;
    }

    public List<String> GetResultItemGroupDesc(String farm) {

        List<String> getListItemGroupDesc = new ArrayList<String>();
        getListItemGroupDesc.add("Please Select : Item Group");
        Connection conn = null;
        try {
            conn = ConnectSQLite.ConnectionSQLite();
            Statement sta = conn.createStatement();
            String Sql = "SELECT ITGR_CODE,ITGR_NAME \n"
                    + "FROM FAR_ITEMGROUP\n"
                    + "WHERE ITGR_FARM = '" + farm + "'\n"
                    + "AND ITGR_STATUS = '1'";
            ResultSet rs = sta.executeQuery(Sql);

            while (rs.next()) {
                getListItemGroupDesc.add(
                        rs.getString("ITGR_CODE").trim() + " ; "
                        + rs.getString("ITGR_NAME").trim());
            }
            return getListItemGroupDesc;

        } catch (Exception ex) {
            System.out.println(ex.toString());
        } finally {
            if (conn != null) {
                try {
                    conn.close();
                } catch (SQLException ex) {
                    System.out.println(ex.toString());
                }
            }
        }
        return null;
    }

    public List<String> GetResultItemGroupDetail(String farm) {

        List<String> getListItemGroupDetail = new ArrayList<String>();
        Connection conn = null;
        try {
            conn = ConnectSQLite.ConnectionSQLite();
            Statement sta = conn.createStatement();
            String Sql = "SELECT ITGR_CODE,ITGR_NAME,ITGR_STATUS \n"
                    + "FROM FAR_ITEMGROUP \n"
                    + "WHERE ITGR_FARM = '" + farm + "'";
            ResultSet rs = sta.executeQuery(Sql);

            while (rs.next()) {
                getListItemGroupDetail.add(
                        rs.getString("ITGR_CODE").trim() + " ; "
                        + rs.getString("ITGR_NAME").trim() + " ; "
                        + rs.getString("ITGR_STATUS").trim());
            }
            return getListItemGroupDetail;

        } catch (Exception ex) {
            System.out.println(ex.toString());
        } finally {
            if (conn != null) {
                try {
                    conn.close();
                } catch (SQLException ex) {
                    System.out.println(ex.toString());
                }
            }
        }
        return null;
    }

    public List<String> GetResultDuckRecieved(String farm, String type, String table) {

        List<String> getListItemDuckRecieved = new ArrayList<String>();
        Connection conn = null;
        try {
            conn = ConnectSQLite.ConnectionSQLite();
            Statement sta = conn.createStatement();
            String Sql = "SELECT PSGR_FLOCK,PSGR_HOUSE,PSGR_DATE,PSGR_MO,PSGR_DODF,\n"
                    + "PSGR_DODM, PSGR_DEADAPF, PSGR_DEADAPM, PSGR_CULLAPF\n"
                    + ", PSGR_CULLAPM, PSGR_DEADTF, PSGR_DEADTM, PSGR_CULLTF\n"
                    + ", PSGR_CULLTM, PSGR_DEADVACF, PSGR_DEADVACM, PSGR_FEMALE\n"
                    + ", PSGR_MALE\n"
                    + "FROM " + table + "\n"
                    + "WHERE PSGR_FARM = '" + farm + "'\n"
                    + "AND PSGR_BREED = '" + type + "'";
            ResultSet rs = sta.executeQuery(Sql);

            while (rs.next()) {
                getListItemDuckRecieved.add(
                        //                        , PSGR_HOUSE, PSGR_DATE, PSGR_MO, PSGR_DODF, PSGR_DODM, PSGR_DEADAPF, PSGR_DEADAPM, PSGR_CULLAPF, PSGR_CULLAPM, PSGR_DEADTF, PSGR_DEADTM, PSGR_CULLTF, PSGR_CULLTM, PSGR_DEADVACF, PSGR_DEADVACM, PSGR_FEMALE,
                        rs.getString("PSGR_FLOCK").trim() + " ; "
                        + rs.getString("PSGR_HOUSE").trim() + " ; "
                        + rs.getString("PSGR_DATE").trim() + " ; "
                        + rs.getString("PSGR_MO").trim() + " ; "
                        + rs.getString("PSGR_DODF").trim() + " ; "
                        + rs.getString("PSGR_DODM").trim() + " ; "
                        + rs.getString("PSGR_DEADAPF").trim() + " ; "
                        + rs.getString("PSGR_DEADAPM").trim() + " ; "
                        + rs.getString("PSGR_CULLAPF").trim() + " ; "
                        + rs.getString("PSGR_CULLAPM").trim() + " ; "
                        + rs.getString("PSGR_DEADTF").trim() + " ; "
                        + rs.getString("PSGR_DEADTM").trim() + " ; "
                        + rs.getString("PSGR_CULLTF").trim() + " ; "
                        + rs.getString("PSGR_CULLTM").trim() + " ; "
                        + rs.getString("PSGR_DEADVACF").trim() + " ; "
                        + rs.getString("PSGR_DEADVACM").trim() + " ; "
                        + rs.getString("PSGR_FEMALE").trim() + " ; "
                        + rs.getString("PSGR_MALE").trim());
            }
            return getListItemDuckRecieved;

        } catch (Exception ex) {
            System.out.println(ex.toString());
        } finally {
            if (conn != null) {
                try {
                    conn.close();
                } catch (SQLException ex) {
                    System.out.println(ex.toString());
                }
            }
        }
        return null;
    }

    public List<String> GetDuckData(String farm, String type, String table) {

        List<String> getListItemDuckRecieved = new ArrayList<String>();
        Connection conn = null;
        try {
            conn = ConnectSQLite.ConnectionSQLite();
            Statement sta = conn.createStatement();
            String Sql = "SELECT PSGR_FLOCK,PSGR_HOUSE,PSGR_DATE,PSGR_MO,PSGR_DODF,\n"
                    + "PSGR_DODM, PSGR_DEADAPF, PSGR_DEADAPM, PSGR_CULLAPF\n"
                    + ", PSGR_CULLAPM, PSGR_DEADTF, PSGR_DEADTM, PSGR_CULLTF\n"
                    + ", PSGR_CULLTM, PSGR_DEADVACF, PSGR_DEADVACM, PSGR_FEMALE\n"
                    + ", PSGR_MALE\n"
                    + "FROM " + table + "\n"
                    + "WHERE PSGR_FARM = '" + farm + "'\n"
                    + "AND PSGR_BREED = '" + type + "'";
            ResultSet rs = sta.executeQuery(Sql);

            while (rs.next()) {
                getListItemDuckRecieved.add(
                        //                        , PSGR_HOUSE, PSGR_DATE, PSGR_MO, PSGR_DODF, PSGR_DODM, PSGR_DEADAPF, PSGR_DEADAPM, PSGR_CULLAPF, PSGR_CULLAPM, PSGR_DEADTF, PSGR_DEADTM, PSGR_CULLTF, PSGR_CULLTM, PSGR_DEADVACF, PSGR_DEADVACM, PSGR_FEMALE,
                        rs.getString("PSGR_FLOCK").trim() + " ; "
                        + rs.getString("PSGR_HOUSE").trim() + " ; "
                        + rs.getString("PSGR_DATE").trim() + " ; "
                        + rs.getString("PSGR_MO").trim() + " ; "
                        + rs.getString("PSGR_DODF").trim() + " ; "
                        + rs.getString("PSGR_DODM").trim() + " ; "
                        + rs.getString("PSGR_DEADAPF").trim() + " ; "
                        + rs.getString("PSGR_DEADAPM").trim() + " ; "
                        + rs.getString("PSGR_CULLAPF").trim() + " ; "
                        + rs.getString("PSGR_CULLAPM").trim() + " ; "
                        + rs.getString("PSGR_DEADTF").trim() + " ; "
                        + rs.getString("PSGR_DEADTM").trim() + " ; "
                        + rs.getString("PSGR_CULLTF").trim() + " ; "
                        + rs.getString("PSGR_CULLTM").trim() + " ; "
                        + rs.getString("PSGR_DEADVACF").trim() + " ; "
                        + rs.getString("PSGR_DEADVACM").trim() + " ; "
                        + rs.getString("PSGR_FEMALE").trim() + " ; "
                        + rs.getString("PSGR_MALE").trim());
            }
            return getListItemDuckRecieved;

        } catch (Exception ex) {
            System.out.println(ex.toString());
        } finally {
            if (conn != null) {
                try {
                    conn.close();
                } catch (SQLException ex) {
                    System.out.println(ex.toString());
                }
            }
        }
        return null;
    }

    public List<String> GetDuckDataForChange(String Flock, String House, String DateReceived, String MO, String Table, String farm) {

        List<String> GetDuckDataForChange = new ArrayList<String>();
        Connection conn = null;
        try {
            conn = ConnectSQLite.ConnectionSQLite();
            Statement sta = conn.createStatement();
            String Sql = "SELECT " + Table + ".*\n"
                    + ",COALESCE(PSGR_HOUSE||' : '||HOUS_NAME,'') as HOUSCODE\n"
                    + ",COALESCE(FLOC_CODE ||' : '||FLOC_DESC,'') AS FLOCKCODE\n"
                    + "FROM " + Table + "\n"
                    + "LEFT JOIN FAR_MHOUSE \n"
                    + "ON PSGR_HOUSE = HOUS_CODE\n"
                    + "AND PSGR_FARM = HOUS_FARM\n"
                    + "LEFT JOIN FAR_FLOCK\n"
                    + "ON FLOC_FARM = PSGR_FARM\n"
                    + "AND FLOC_CODE  = PSGR_FLOCK\n"
                    + "WHERE PSGR_FARM = '" + farm + "'\n"
                    + "AND PSGR_DATE = '" + DateReceived + "'\n"
                    + "AND PSGR_HOUSE = '" + House + "'\n"
                    + "AND PSGR_FLOCK = '" + Flock + "'\n"
                    + "AND PSGR_MO = '" + MO + "'";
            ResultSet rs = sta.executeQuery(Sql);

            while (rs.next()) {
                GetDuckDataForChange.add(
                        //                        , PSGR_HOUSE, PSGR_DATE, PSGR_MO, PSGR_DODF, PSGR_DODM, PSGR_DEADAPF, PSGR_DEADAPM, PSGR_CULLAPF, PSGR_CULLAPM, PSGR_DEADTF, PSGR_DEADTM, PSGR_CULLTF, PSGR_CULLTM, PSGR_DEADVACF, PSGR_DEADVACM, PSGR_FEMALE,
                        rs.getString("PSGR_FARM").trim() + " ; "
                        + rs.getString("PSGR_DATE").trim() + " ; "
                        + rs.getString("HOUSCODE").trim() + " ; "
                        + rs.getString("FLOCKCODE") + " ; "
                        + rs.getString("PSGR_FROM").trim() + " ; "
                        + rs.getString("PSGR_FLIGHT").trim() + " ; "
                        + rs.getString("PSGR_CAR1").trim() + " ; "
                        + rs.getString("PSGR_CAR2").trim() + " ; "
                        + rs.getString("PSGR_ST1").trim() + " ; "
                        + rs.getString("PSGR_ST2").trim() + " ; "
                        + rs.getString("PSGR_ARF1").trim() + " ; "
                        + rs.getString("PSGR_ARF2").trim() + " ; "
                        + rs.getString("PSGR_TEMP1").trim() + " ; "
                        + rs.getString("PSGR_TEMP2").trim() + " ; "
                        + rs.getString("PSGR_DODF").trim() + " ; "
                        + rs.getString("PSGR_DODM").trim() + " ; "
                        + rs.getString("PSGR_DEADAPF").trim() + " ; "
                        + rs.getString("PSGR_DEADAPM").trim() + " ; "
                        + rs.getString("PSGR_CULLAPF").trim() + " ; "
                        + rs.getString("PSGR_CULLAPM").trim() + " ; "
                        + rs.getString("PSGR_DEADTF").trim() + " ; "
                        + rs.getString("PSGR_DEADTM").trim() + " ; "
                        + rs.getString("PSGR_CULLTF").trim() + " ; "
                        + rs.getString("PSGR_CULLTM").trim() + " ; "
                        + rs.getString("PSGR_DEADVACF").trim() + " ; "
                        + rs.getString("PSGR_DEADVACM").trim() + " ; "
                        + rs.getString("PSGR_FEMALE").trim() + " ; "
                        + rs.getString("PSGR_MALE").trim() + " ; "
                        + rs.getString("PSGR_MO").trim() + " ; "
                        + rs.getString("PSGR_BREED").trim());
            }
            return GetDuckDataForChange;

        } catch (Exception ex) {
            System.out.println(ex.toString());
        } finally {
            if (conn != null) {
                try {
                    conn.close();
                } catch (SQLException ex) {
                    System.out.println(ex.toString());
                }
            }
        }
        return null;
    }

    public List<String> GetResultInforDetail(String farm) {

        List<String> getListInforDetail = new ArrayList<String>();
        Connection conn = null;
        try {
            conn = ConnectSQLite.ConnectionSQLite();
            Statement sta = conn.createStatement();
            String Sql = "SELECT INFO_FARM,INFO_DATE,INFO_HOUSE,INFO_ITEM,INFO_DESC,INFO_DISE,COALESCE(INFO_QTY,0) AS INFO_QTY,COALESCE(INFO_REFER,0) AS INFO_REFER  \n"
                    + "FROM FAR_MINFORM \n"
                    + "WHERE INFO_FARM = '" + farm + "' \n"
                    + "ORDER BY INFO_FARM,SUBSTR(INFO_DATE,7) || SUBSTR(INFO_DATE,4,2) || SUBSTR(INFO_DATE,1,2) DESC ,INFO_HOUSE,INFO_ITEM";
            ResultSet rs = sta.executeQuery(Sql);

            while (rs.next()) {
                getListInforDetail.add(
                        rs.getString("INFO_DATE").trim() + " ; "
                        + rs.getString("INFO_HOUSE").trim() + " ; "
                        + rs.getString("INFO_ITEM").trim() + " ; "
                        + rs.getString("INFO_DESC").trim() + " ; "
                        + rs.getString("INFO_DISE").trim() + " ; "
                        + rs.getString("INFO_QTY").trim() + " ; "
                        + rs.getString("INFO_REFER").trim());
            }
            return getListInforDetail;

        } catch (Exception ex) {
            System.out.println(ex.toString());
        } finally {
            if (conn != null) {
                try {
                    conn.close();
                } catch (SQLException ex) {
                    System.out.println(ex.toString());
                }
            }
        }
        return null;
    }

    public List<String> InforDetailwithnopene(String farm, String House, String StartDate, String EndDate) {

        List<String> getListInforDetail = new ArrayList<String>();
        Connection conn = null;
        try {
            String Houseswithoutname = null;
            String[] Housesplit = House.split(":");
            Houseswithoutname = Housesplit[0].trim();
            conn = ConnectSQLite.ConnectionSQLite();
            Statement sta = conn.createStatement();
            String Sql = "SELECT INFO_FARM,INFO_DATE,INFO_HOUSE,INFO_ITEM,INFO_DESC,INFO_DISE,COALESCE(INFO_QTY,0) AS INFO_QTY,COALESCE(INFO_REFER,0) AS INFO_REFER  \n"
                    + "FROM FAR_MINFORM \n"
                    + "WHERE INFO_FARM = '" + farm + "'  and INFO_HOUSE = '" + Houseswithoutname + "'\n"
                    + "AND  SUBSTR(INFO_DATE,7) || SUBSTR(INFO_DATE,4,2) || SUBSTR(INFO_DATE,1,2) BETWEEN '" + StartDate + "' and '" + EndDate + "'\n"
                    + "ORDER BY INFO_FARM,SUBSTR(INFO_DATE,7) || SUBSTR(INFO_DATE,4,2) || SUBSTR(INFO_DATE,1,2) DESC ,INFO_HOUSE,INFO_ITEM";
            ResultSet rs = sta.executeQuery(Sql);

            while (rs.next()) {
                getListInforDetail.add(
                        rs.getString("INFO_DATE").trim() + " ; "
                        + rs.getString("INFO_HOUSE").trim() + " ; "
                        + rs.getString("INFO_ITEM").trim() + " ; "
                        + rs.getString("INFO_DESC").trim() + " ; "
                        + rs.getString("INFO_DISE").trim() + " ; "
                        + rs.getString("INFO_QTY").trim() + " ; "
                        + rs.getString("INFO_REFER").trim());
            }
            return getListInforDetail;

        } catch (Exception ex) {
            System.out.println(ex.toString());
        } finally {
            if (conn != null) {
                try {
                    conn.close();
                } catch (SQLException ex) {
                    System.out.println(ex.toString());
                }
            }
        }
        return null;
    }

    public List<String> GetResultInforDetailWithPene(String farm, String pene, String House, String startDate, String endDate) {

        List<String> getListInforDetail = new ArrayList<String>();
        Connection conn = null;
        try {
            conn = ConnectSQLite.ConnectionSQLite();
            Statement sta = conn.createStatement();
            String Houseswithoutname = null;
            String[] Housesplit = House.split(":");
            Houseswithoutname = Housesplit[0].trim();
            String Sql = "SELECT INFO_FARM,INFO_DATE,INFO_HOUSE,INFO_ITEM,INFO_DESC,INFO_DISE,COALESCE(INFO_QTY,0) AS INFO_QTY,COALESCE(INFO_REFER,0) AS INFO_REFER  \n"
                    + "FROM FAR_MINFORM \n"
                    + "WHERE INFO_FARM = '" + farm + "' AND INFO_DESC = '" + pene + "'  AND INFO_HOUSE = '" + Houseswithoutname + "'\n"
                    + "AND  SUBSTR(INFO_DATE,7) || SUBSTR(INFO_DATE,4,2) || SUBSTR(INFO_DATE,1,2) BETWEEN '" + startDate + "' and '" + endDate + "'\n"
                    + "ORDER BY INFO_FARM,SUBSTR(INFO_DATE,7) || SUBSTR(INFO_DATE,4,2) || SUBSTR(INFO_DATE,1,2) DESC ,INFO_HOUSE,INFO_ITEM";
            ResultSet rs = sta.executeQuery(Sql);

            while (rs.next()) {
                getListInforDetail.add(
                        rs.getString("INFO_DATE").trim() + " ; "
                        + rs.getString("INFO_HOUSE").trim() + " ; "
                        + rs.getString("INFO_ITEM").trim() + " ; "
                        + rs.getString("INFO_DESC").trim() + " ; "
                        + rs.getString("INFO_DISE").trim() + " ; "
                        + rs.getString("INFO_QTY").trim() + " ; "
                        + rs.getString("INFO_REFER").trim());
            }
            return getListInforDetail;

        } catch (Exception ex) {
            System.out.println(ex.toString());
        } finally {
            if (conn != null) {
                try {
                    conn.close();
                } catch (SQLException ex) {
                    System.out.println(ex.toString());
                }
            }
        }
        return null;
    }

    public List<String> GetResultDInforDetail(String farm, String house, String date, String item, String group, String breed, String respon) {

        List<String> getListInforDetail = new ArrayList<String>();
        Connection conn = null;
        try {
            conn = ConnectSQLite.ConnectionSQLite();
            Statement sta = conn.createStatement();
            String Type;
            if ("G".equals(group.substring(0, 1)) || "P".equals(group.substring(0, 1))) {
                Type = "LIKE 'P%'";
            } else if ("H".equals(group.substring(0, 1))) {
                Type = "NOT LIKE 'P%'";
            } else {
                Type = "LIKE ''";
            }

            String Sql = "SELECT DISE_CODE,DISE_NAME,COALESCE(INFO_QTY,0) AS INFO_QTY \n"
                    + "FROM \n"
                    + "(SELECT UPPER(DISE_CODE) AS DISE_CODE,DISE_NAME \n"
                    + "FROM FAR_MDISEASE \n"
                    + "WHERE DISE_FARM = '" + farm + "' \n"
                    + "AND DISE_CODE " + Type + ") as a\n"
                    + "LEFT JOIN \n"
                    + "(SELECT INFO_DATE,INFO_HOUSE,INFO_ITEM,UPPER(INFO_DISE) AS INFO_DISE,INFO_QTY \n"
                    + "FROM FAR_DINFORM \n"
                    + "WHERE INFO_FARM = '" + farm + "' \n"
                    + "AND INFO_HOUSE = '" + house + "' \n"
                    + "AND INFO_DATE = '" + date + "' \n"
                    + "AND INFO_ITEM = '" + item + "' \n"
                    + "AND INFO_BREED = '" + breed + "' \n"
                    + "AND INFO_RESP = '" + respon + "') AS b \n"
                    + "ON a.DISE_CODE = b.INFO_DISE";
            ResultSet rs = sta.executeQuery(Sql);

            while (rs.next()) {
                getListInforDetail.add(
                        rs.getString("DISE_CODE").trim() + " ; "
                        + rs.getString("DISE_NAME").trim() + " ; "
                        + rs.getString("INFO_QTY").trim());
            }
            return getListInforDetail;

        } catch (Exception ex) {
            System.out.println(ex.toString());
        } finally {
            if (conn != null) {
                try {
                    conn.close();
                } catch (SQLException ex) {
                    System.out.println(ex.toString());
                }
            }
        }
        return null;
    }

    public List<String> GetResultMInforDetail(String farm, String house, String date, String item, String refer, String breed) {

        List<String> getListMInforDetail = new ArrayList<String>();
        Connection conn = null;
        try {
            conn = ConnectSQLite.ConnectionSQLite();
            Statement sta = conn.createStatement();
            String Sql = "SELECT DISTINCT INFO_DATE,INFO_DISE,DISE_NAME,INFO_QTY  \n"
                    + "FROM \n"
                    + "(SELECT INFO_DATE,INFO_HOUSE,INFO_ITEM,UPPER(INFO_DISE) AS INFO_DISE,INFO_QTY,INFO_REFER \n"
                    + "FROM FAR_MINFORM \n"
                    + "WHERE INFO_FARM = '" + farm + "' \n"
                    + "AND INFO_BREED = '" + breed + "') AS a \n"
                    + "LEFT JOIN \n"
                    + "(SELECT UPPER(DISE_CODE) AS DISE_CODE,DISE_NAME \n"
                    + "FROM FAR_MDISEASE \n"
                    + "WHERE DISE_FARM = '" + farm + "') AS b \n"
                    + "ON a.INFO_DISE = b.DISE_CODE \n"
                    + "WHERE a.INFO_HOUSE = '" + house + "' \n"
                    + "AND a.INFO_ITEM = '" + item + "' \n"
                    + "AND a.INFO_DATE = '" + date + "' \n"
                    //                    + "AND a.INFO_REFER = '" + refer + "'"
                    + "";
            ResultSet rs = sta.executeQuery(Sql);

            while (rs.next()) {
                getListMInforDetail.add(
                        rs.getString("INFO_DISE").trim() + " ; "
                        + rs.getString("DISE_NAME").trim() + " ; "
                        + rs.getString("INFO_QTY").trim());
            }
            return getListMInforDetail;

        } catch (Exception ex) {
            System.out.println(ex.toString());
        } finally {
            if (conn != null) {
                try {
                    conn.close();
                } catch (SQLException ex) {
                    System.out.println(ex.toString());
                }
            }
        }
        return null;
    }

    public List<String> GetResultCertDetail(String farm) {

        List<String> getListCertDetail = new ArrayList<String>();
        Connection conn = null;
        try {
            conn = ConnectSQLite.ConnectionSQLite();
            Statement sta = conn.createStatement();
            String Sql = "SELECT CERT_CODE,CERT_NAME\n"
                    + "FROM FAR_CERTIFICATION\n"
                    + "WHERE CERT_FARM = '" + farm + "'";
            ResultSet rs = sta.executeQuery(Sql);

            while (rs.next()) {
                getListCertDetail.add(
                        rs.getString("CERT_CODE").trim() + " ; "
                        + rs.getString("CERT_NAME").trim());
            }
            return getListCertDetail;

        } catch (Exception ex) {
            System.out.println(ex.toString());
        } finally {
            if (conn != null) {
                try {
                    conn.close();
                } catch (SQLException ex) {
                    System.out.println(ex.toString());
                }
            }
        }
        return null;
    }

    public List<String> GetResultDisease(String farm) {

        List<String> getListDiseaseDetail = new ArrayList<String>();
        Connection conn = null;
        try {
            conn = ConnectSQLite.ConnectionSQLite();
            Statement sta = conn.createStatement();

            String Sql = "SELECT DISE_CODE,DISE_NAME \n"
                    + "FROM FAR_MDISEASE \n"
                    + "WHERE DISE_FARM = '" + farm + "'";
            ResultSet rs = sta.executeQuery(Sql);

            while (rs.next()) {
                getListDiseaseDetail.add(rs.getString("DISE_CODE").trim());
            }
            return getListDiseaseDetail;

        } catch (Exception ex) {
            System.out.println(ex.toString());
        } finally {
            if (conn != null) {
                try {
                    conn.close();
                } catch (SQLException ex) {
                    System.out.println(ex.toString());
                }
            }
        }
        return null;
    }

    public List<String> GetResultDiseaseDetail(String farm) {

        List<String> getListDiseaseDetail = new ArrayList<String>();
        Connection conn = null;
        try {
            conn = ConnectSQLite.ConnectionSQLite();
            Statement sta = conn.createStatement();

            String Sql = "SELECT DISE_CODE,DISE_NAME \n"
                    + "FROM FAR_MDISEASE \n"
                    + "WHERE DISE_FARM = '" + farm + "'";
            ResultSet rs = sta.executeQuery(Sql);

            while (rs.next()) {
                getListDiseaseDetail.add(
                        rs.getString("DISE_CODE").trim() + " ; "
                        + rs.getString("DISE_NAME").trim());
            }
            return getListDiseaseDetail;

        } catch (Exception ex) {
            System.out.println(ex.toString());
        } finally {
            if (conn != null) {
                try {
                    conn.close();
                } catch (SQLException ex) {
                    System.out.println(ex.toString());
                }
            }
        }
        return null;
    }

    //BF01U001 User
    public List<String> GetResultUserDriver(String farm) {

        List<String> getListUserDetail = new ArrayList<String>();
        getListUserDetail.add("Please Select : Receive");
        Connection conn = null;
        try {
            conn = ConnectSQLite.ConnectionSQLite();
            Statement sta = conn.createStatement();
            String Sql = "SELECT USE_USER,USE_NAME \n"
                    + "FROM FAR_USER \n"
                    + "WHERE USE_FARM = '" + farm + "' \n"
                    + "AND USE_AUTH = 'DRI' \n"
                    + "ORDER BY USE_USER";
            ResultSet rs = sta.executeQuery(Sql);

            while (rs.next()) {
                getListUserDetail.add(rs.getString("USE_NAME").trim());
            }
            return getListUserDetail;

        } catch (Exception ex) {
            System.out.println(ex.toString());
        } finally {
            if (conn != null) {
                try {
                    conn.close();
                } catch (SQLException ex) {
                    System.out.println(ex.toString());
                }
            }
        }
        return null;
    }

    public List<String> GetResultUserNonAppr(String farm) {

        List<String> getListUserDetail = new ArrayList<String>();
        getListUserDetail.add("Please Select : Given");
        Connection conn = null;
        try {
            conn = ConnectSQLite.ConnectionSQLite();
            Statement sta = conn.createStatement();
            String Sql = "SELECT USE_USER,USE_NAME \n"
                    + "FROM FAR_USER \n"
                    + "WHERE USE_FARM = '" + farm + "' \n"
                    + "AND USE_AUTH = 'USER' \n"
                    + "AND USE_APPR = '0' \n"
                    + "ORDER BY USE_USER";
            ResultSet rs = sta.executeQuery(Sql);

            while (rs.next()) {
                getListUserDetail.add(rs.getString("USE_NAME").trim());
            }
            return getListUserDetail;

        } catch (Exception ex) {
            System.out.println(ex.toString());
        } finally {
            if (conn != null) {
                try {
                    conn.close();
                } catch (SQLException ex) {
                    System.out.println(ex.toString());
                }
            }
        }
        return null;
    }

    public List<String> GetResultUserAppr(String farm) {

        List<String> getListUserDetail = new ArrayList<String>();
        getListUserDetail.add("Please Select : Approve");
        Connection conn = null;
        try {
            conn = ConnectSQLite.ConnectionSQLite();
            Statement sta = conn.createStatement();
            String Sql = "SELECT USE_USER,USE_NAME \n"
                    + "FROM FAR_USER \n"
                    + "WHERE USE_FARM = '" + farm + "' \n"
                    + "AND USE_AUTH = 'USER' \n"
                    + "AND USE_APPR = '1' \n"
                    + "ORDER BY USE_USER";
            ResultSet rs = sta.executeQuery(Sql);

            while (rs.next()) {
                getListUserDetail.add(rs.getString("USE_NAME").trim());
            }
            return getListUserDetail;

        } catch (Exception ex) {
            System.out.println(ex.toString());
        } finally {
            if (conn != null) {
                try {
                    conn.close();
                } catch (SQLException ex) {
                    System.out.println(ex.toString());
                }
            }
        }
        return null;
    }

    public List<String> GetResultUserDetail(String farm) {

        List<String> getListUserDetail = new ArrayList<String>();
        Connection conn = null;
        try {
            conn = ConnectSQLite.ConnectionSQLite();
            Statement sta = conn.createStatement();
            String Sql = "SELECT USE_USER,USE_NAME,USE_APPR,USE_AUTH \n"
                    + "FROM FAR_USER \n"
                    + "WHERE USE_FARM = '" + farm + "' \n"
                    + "AND USE_AUTH <> 'DRI' \n"
                    + "ORDER BY USE_USER";
            ResultSet rs = sta.executeQuery(Sql);

            while (rs.next()) {
                getListUserDetail.add(
                        rs.getString("USE_USER").trim() + " ; "
                        + rs.getString("USE_NAME").trim() + " ; "
                        + rs.getString("USE_APPR").trim() + " ; "
                        + rs.getString("USE_AUTH").trim());
            }
            return getListUserDetail;

        } catch (Exception ex) {
            System.out.println(ex.toString());
        } finally {
            if (conn != null) {
                try {
                    conn.close();
                } catch (SQLException ex) {
                    System.out.println(ex.toString());
                }
            }
        }
        return null;
    }

    public List<String> GetResultDriverDetail(String farm) {

        List<String> getListUserDetail = new ArrayList<String>();
        Connection conn = null;
        try {
            conn = ConnectSQLite.ConnectionSQLite();
            Statement sta = conn.createStatement();
            String Sql = "SELECT USE_USER,USE_NAME,USE_APPR,USE_AUTH \n"
                    + "FROM FAR_USER \n"
                    + "WHERE USE_FARM = '" + farm + "' \n"
                    + "AND USE_AUTH = 'DRI' \n"
                    + "ORDER BY USE_USER";
            ResultSet rs = sta.executeQuery(Sql);

            while (rs.next()) {
                getListUserDetail.add(
                        rs.getString("USE_USER").trim() + " ; "
                        + rs.getString("USE_NAME").trim() + " ; "
                        + rs.getString("USE_APPR").trim() + " ; "
                        + rs.getString("USE_AUTH").trim());
            }
            return getListUserDetail;

        } catch (Exception ex) {
            System.out.println(ex.toString());
        } finally {
            if (conn != null) {
                try {
                    conn.close();
                } catch (SQLException ex) {
                    System.out.println(ex.toString());
                }
            }
        }
        return null;
    }

    //BF01D001
    public List<String> GetResultDuckStockDesc(String farm, String house, String breed, String egg, String duck4, String duck5) {

        List<String> getListDuckStockDesc = new ArrayList<String>();
        Connection conn = null;
        try {
            conn = ConnectSQLite.ConnectionSQLite();
            Statement sta = conn.createStatement();
            String Sql = "SELECT INVE_FARM,INVE_HOUSE,HOUS_NAME,INVE_DATE,INVE_ITEM,ITEM_NAME,INVE_BALANCE,ITEM_UNIT \n"
                    + "FROM \n"
                    + "(SELECT INVE_FARM,INVE_DATE,INVE_HOUSE,INVE_ITEM,INVE_BALANCE \n"
                    + "FROM FAR_INVENBAL \n"
                    + "WHERE INVE_FARM = '" + farm + "' \n"
                    + "AND INVE_BREED = '" + breed + "' \n"
                    + "AND INVE_BALANCE > 0) AS a \n"
                    + "LEFT JOIN \n"
                    + "(SELECT HOUS_CODE,HOUS_NAME \n"
                    + "FROM FAR_MHOUSE \n"
                    + "WHERE HOUS_FARM = '" + farm + "' \n"
                    + "AND HOUS_BREED = '" + breed + "') AS b \n"
                    + "ON a.INVE_HOUSE = b.HOUS_CODE \n"
                    + "LEFT JOIN \n"
                    + "(SELECT ITEM_CODE,ITEM_NAME,ITEM_UNIT \n"
                    + "FROM FAR_MITEM \n"
                    + "WHERE ITEM_FARM = '" + farm + "') AS c \n"
                    + "ON a.INVE_ITEM = c.ITEM_CODE \n"
                    + "WHERE a.INVE_HOUSE LIKE '" + "%" + house + "' \n"
                    + "AND a.INVE_ITEM LIKE '" + breed + "%" + "' \n"
                    + "AND (a.INVE_ITEM NOT LIKE '" + egg + "%" + "' \n"
                    + "AND a.INVE_ITEM NOT LIKE '" + duck4 + "%" + "' \n"
                    + "AND a.INVE_ITEM NOT LIKE '" + duck5 + "%" + "')";
            ResultSet rs = sta.executeQuery(Sql);

            while (rs.next()) {
                getListDuckStockDesc.add(
                        rs.getString("INVE_HOUSE").trim() + " ; "
                        + rs.getString("INVE_DATE").trim() + " ; "
                        + rs.getString("INVE_ITEM").trim() + " ; "
                        + rs.getString("ITEM_NAME").trim() + " ; "
                        + df.format(rs.getFloat("INVE_BALANCE")) + " ; "
                        + rs.getString("ITEM_UNIT").trim());
            }
            return getListDuckStockDesc;

        } catch (Exception ex) {
            System.out.println(ex.toString());
        } finally {
            if (conn != null) {
                try {
                    conn.close();
                } catch (SQLException ex) {
                    System.out.println(ex.toString());
                }
            }
        }
        return null;
    }

    public List<String> GetResultCullDuckStockDesc(String farm, String house, String breed, String duck4, String duck5) {

        List<String> getListCullDuckStockDesc = new ArrayList<String>();
        Connection conn = null;
        try {
            conn = ConnectSQLite.ConnectionSQLite();
            Statement sta = conn.createStatement();
            String Sql = "SELECT INVE_FARM,INVE_HOUSE,HOUS_NAME,INVE_DATE,INVE_ITEM,ITEM_NAME,INVE_BALANCE,ITEM_UNIT \n"
                    + "FROM \n"
                    + "(SELECT INVE_FARM,INVE_DATE,INVE_HOUSE,INVE_ITEM,INVE_BALANCE \n"
                    + "FROM FAR_INVENBAL \n"
                    + "WHERE INVE_FARM = '" + farm + "' \n"
                    + "AND INVE_BREED = '" + breed + "'\n"
                    + "AND INVE_BALANCE > 0) AS a \n"
                    + "LEFT JOIN \n"
                    + "(SELECT HOUS_CODE,HOUS_NAME \n"
                    + "FROM FAR_MHOUSE \n"
                    + "WHERE HOUS_FARM = '" + farm + "' \n"
                    + "AND HOUS_BREED = '" + breed + "') AS b \n"
                    + "ON a.INVE_HOUSE = b.HOUS_CODE \n"
                    + "LEFT JOIN \n"
                    + "(SELECT ITEM_CODE,ITEM_NAME,ITEM_UNIT \n"
                    + "FROM FAR_MITEM \n"
                    + "WHERE ITEM_FARM = '" + farm + "') AS c \n"
                    + "ON a.INVE_ITEM = c.ITEM_CODE \n"
                    + "WHERE a.INVE_HOUSE LIKE '" + "%" + house + "' \n"
                    + "AND (a.INVE_ITEM LIKE '" + duck4 + "%" + "' \n"
                    + "OR a.INVE_ITEM LIKE '" + duck5 + "%" + "')";
            ResultSet rs = sta.executeQuery(Sql);

            while (rs.next()) {
                getListCullDuckStockDesc.add(
                        rs.getString("INVE_HOUSE").trim() + " ; "
                        + rs.getString("INVE_DATE").trim() + " ; "
                        + rs.getString("INVE_ITEM").trim() + " ; "
                        + rs.getString("ITEM_NAME").trim() + " ; "
                        + df.format(rs.getFloat("INVE_BALANCE")) + " ; "
                        + rs.getString("ITEM_UNIT").trim());
            }
            return getListCullDuckStockDesc;

        } catch (Exception ex) {
            System.out.println(ex.toString());
        } finally {
            if (conn != null) {
                try {
                    conn.close();
                } catch (SQLException ex) {
                    System.out.println(ex.toString());
                }
            }
        }
        return null;
    }

    public List<String> GetResultEggStockDesc(String farm, String breed, String egg, String fegg1, String fegg2, String fegg3, String fegg4, String megg1, String megg2, String megg3, String megg4) {

        List<String> getListEggStockDesc = new ArrayList<String>();
        Connection conn = null;
        try {
            conn = ConnectSQLite.ConnectionSQLite();
            Statement sta = conn.createStatement();
            String Sql = "SELECT GENDER,LINEHOUSE,INVE_HOUSE,GoodEgg + Desc.'Double+Small+Crack' AS 'Qty',GoodEgg,DoubleEgg,SmallEgg,CrackEgg,Desc.'Double+Small+Crack' AS 'Total' \n"
                    + "FROM \n"
                    + "(SELECT CASE WHEN SUBSTR(INVE_HOUSE,4,1) %2 = 0 THEN 'F' ELSE 'M' END AS GENDER,SUBSTR(INVE_HOUSE,4,1) AS LINEHOUSE,SUBSTR(INVE_HOUSE,4,1) AS LINEHOUSE,INVE_HOUSE, \n"
                    + "SUM(CASE WHEN INVE_ITEM = '" + fegg1 + "' OR INVE_ITEM = '" + megg1 + "' THEN INVE_BALANCE ELSE '0' END) AS GoodEgg, \n"
                    + "SUM(CASE WHEN INVE_ITEM = '" + fegg2 + "' OR INVE_ITEM = '" + megg2 + "' THEN INVE_BALANCE ELSE '0' END) AS DoubleEgg, \n"
                    + "SUM(CASE WHEN INVE_ITEM = '" + fegg3 + "' OR INVE_ITEM = '" + megg3 + "' THEN INVE_BALANCE ELSE '0' END) AS SmallEgg, \n"
                    + "SUM(CASE WHEN INVE_ITEM = '" + fegg4 + "' OR INVE_ITEM = '" + megg4 + "' THEN INVE_BALANCE ELSE '0' END) AS CrackEgg, \n"
                    + "SUM(CASE WHEN INVE_ITEM = '" + fegg2 + "' OR INVE_ITEM = '" + megg2 + "' THEN INVE_BALANCE ELSE '0' END) + \n"
                    + "SUM(CASE WHEN INVE_ITEM = '" + fegg3 + "' OR INVE_ITEM = '" + megg3 + "' THEN INVE_BALANCE ELSE '0' END) + \n"
                    + "SUM(CASE WHEN INVE_ITEM = '" + fegg4 + "' OR INVE_ITEM = '" + megg4 + "' THEN INVE_BALANCE ELSE '0' END) AS 'Double+Small+Crack' \n"
                    + "FROM FAR_INVENBAL \n"
                    + "WHERE INVE_FARM = '" + farm + "' \n"
                    + "AND INVE_BREED = '" + breed + "' \n"
                    + "AND INVE_ITEM LIKE '" + egg + "%' \n"
                    + "AND INVE_BALANCE > 0 \n"
                    + "GROUP BY GENDER,LINEHOUSE,INVE_HOUSE) as Desc \n"
                    //                    + "WHERE GENDER = 'F' \n"
                    + "UNION ALL \n"
                    + "SELECT GENDER,LINEHOUSE,'Total Line',SUM(SumHouse.'Qty(Pcs)') AS 'Qty(Pcs)',SUM(GoodEgg) AS GoodEgg,SUM(DoubleEgg) AS DoubleEgg,SUM(SmallEgg) AS SmallEgg,SUM(CrackEgg) AS CrackEgg, \n"
                    + "SUM(SumHouse.'Double+Small+Crack') AS 'Double+Small+Crack' \n"
                    + "FROM \n"
                    + "(SELECT GENDER,LINEHOUSE,INVE_HOUSE,GoodEgg + Desc.'Double+Small+Crack' AS 'Qty(Pcs)',GoodEgg,DoubleEgg,SmallEgg,CrackEgg,Desc.'Double+Small+Crack' \n"
                    + "FROM \n"
                    + "(SELECT CASE WHEN SUBSTR(INVE_HOUSE,4,1) %2 = 0 THEN 'F' ELSE 'M' END AS GENDER,SUBSTR(INVE_HOUSE,4,1) AS LINEHOUSE,INVE_HOUSE, \n"
                    + "SUM(CASE WHEN INVE_ITEM = '" + fegg1 + "' OR INVE_ITEM = '" + megg1 + "' THEN INVE_BALANCE ELSE '0' END) AS GoodEgg, \n"
                    + "SUM(CASE WHEN INVE_ITEM = '" + fegg2 + "' OR INVE_ITEM = '" + megg2 + "' THEN INVE_BALANCE ELSE '0' END) AS DoubleEgg, \n"
                    + "SUM(CASE WHEN INVE_ITEM = '" + fegg3 + "' OR INVE_ITEM = '" + megg3 + "' THEN INVE_BALANCE ELSE '0' END) AS SmallEgg, \n"
                    + "SUM(CASE WHEN INVE_ITEM = '" + fegg4 + "' OR INVE_ITEM = '" + megg4 + "' THEN INVE_BALANCE ELSE '0' END) AS CrackEgg, \n"
                    + "SUM(CASE WHEN INVE_ITEM = '" + fegg2 + "' OR INVE_ITEM = '" + megg2 + "' THEN INVE_BALANCE ELSE '0' END) + \n"
                    + "SUM(CASE WHEN INVE_ITEM = '" + fegg3 + "' OR INVE_ITEM = '" + megg3 + "' THEN INVE_BALANCE ELSE '0' END) + \n"
                    + "SUM(CASE WHEN INVE_ITEM = '" + fegg4 + "' OR INVE_ITEM = '" + megg4 + "' THEN INVE_BALANCE ELSE '0' END) AS 'Double+Small+Crack' \n"
                    + "FROM FAR_INVENBAL \n"
                    + "WHERE INVE_FARM = '" + farm + "' \n"
                    + "AND INVE_BREED = '" + breed + "' \n"
                    + "AND INVE_ITEM LIKE '" + egg + "%' \n"
                    + "AND INVE_BALANCE > 0 \n"
                    + "GROUP BY GENDER,LINEHOUSE,INVE_HOUSE) as Desc) AS SumHouse \n"
                    //                    + "WHERE GENDER = 'F' \n"
                    + "GROUP BY GENDER,LINEHOUSE \n"
                    + "UNION All \n"
                    + "SELECT 'Z','Z','Total All',SUM(SumHouse.'Qty(Pcs)') AS 'Qty(Pcs)',SUM(GoodEgg) AS GoodEgg,SUM(DoubleEgg) AS DoubleEgg,SUM(SmallEgg) AS SmallEgg,SUM(CrackEgg) AS CrackEgg, \n"
                    + "SUM(SumHouse.'Double+Small+Crack') AS 'Double+Small+Crack' \n"
                    + "FROM \n"
                    + "(SELECT GENDER,LINEHOUSE,INVE_HOUSE,GoodEgg + Desc.'Double+Small+Crack' AS 'Qty(Pcs)',GoodEgg,DoubleEgg,SmallEgg,CrackEgg,Desc.'Double+Small+Crack' \n"
                    + "FROM \n"
                    + "(SELECT CASE WHEN SUBSTR(INVE_HOUSE,4,1) %2 = 0 THEN 'F' ELSE 'M' END AS GENDER,SUBSTR(INVE_HOUSE,4,1) AS LINEHOUSE,INVE_HOUSE, \n"
                    + "SUM(CASE WHEN INVE_ITEM = '" + fegg1 + "' OR INVE_ITEM = '" + megg1 + "' THEN INVE_BALANCE ELSE '0' END) AS GoodEgg, \n"
                    + "SUM(CASE WHEN INVE_ITEM = '" + fegg2 + "' OR INVE_ITEM = '" + megg2 + "' THEN INVE_BALANCE ELSE '0' END) AS DoubleEgg, \n"
                    + "SUM(CASE WHEN INVE_ITEM = '" + fegg3 + "' OR INVE_ITEM = '" + megg3 + "' THEN INVE_BALANCE ELSE '0' END) AS SmallEgg, \n"
                    + "SUM(CASE WHEN INVE_ITEM = '" + fegg4 + "' OR INVE_ITEM = '" + megg4 + "' THEN INVE_BALANCE ELSE '0' END) AS CrackEgg, \n"
                    + "SUM(CASE WHEN INVE_ITEM = '" + fegg2 + "' OR INVE_ITEM = '" + megg2 + "' THEN INVE_BALANCE ELSE '0' END) + \n"
                    + "SUM(CASE WHEN INVE_ITEM = '" + fegg3 + "' OR INVE_ITEM = '" + megg3 + "' THEN INVE_BALANCE ELSE '0' END) + \n"
                    + "SUM(CASE WHEN INVE_ITEM = '" + fegg4 + "' OR INVE_ITEM = '" + megg4 + "' THEN INVE_BALANCE ELSE '0' END) AS 'Double+Small+Crack' \n"
                    + "FROM FAR_INVENBAL \n"
                    + "WHERE INVE_FARM = '" + farm + "' \n"
                    + "AND INVE_BREED = '" + breed + "' \n"
                    + "AND INVE_ITEM LIKE '" + egg + "%' \n"
                    + "AND INVE_BALANCE > 0 \n"
                    + "GROUP BY GENDER,LINEHOUSE,INVE_HOUSE) as Desc) AS SumHouse \n"
                    //                    + "WHERE GENDER = 'F' \n"
                    + "ORDER BY GENDER,LINEHOUSE";
            ResultSet rs = sta.executeQuery(Sql);

            while (rs.next()) {
                getListEggStockDesc.add(
                        rs.getString("INVE_HOUSE").trim() + " ; "
                        + df.format(rs.getFloat("QTY")) + " ; "
                        + df.format(rs.getFloat("GOODEGG")) + " ; "
                        + df.format(rs.getFloat("DOUBLEEGG")) + " ; "
                        + df.format(rs.getFloat("SMALLEGG")) + " ; "
                        + df.format(rs.getFloat("CRACKEGG")) + " ; "
                        + df.format(rs.getFloat("TOTAL")));
            }
            return getListEggStockDesc;

        } catch (Exception ex) {
            System.out.println(ex.toString());
        } finally {
            if (conn != null) {
                try {
                    conn.close();
                } catch (SQLException ex) {
                    System.out.println(ex.toString());
                }
            }
        }
        return null;
    }

    public List<String> GetResultEggStockDescTransfer(String farm, String breed, String egg, String fegg1, String fegg2, String fegg3, String fegg4, String megg1, String megg2, String megg3, String startdate, String enddate, String megg4) {

        List<String> getListEggStockDesc = new ArrayList<String>();
        Connection conn = null;
        try {
            conn = ConnectSQLite.ConnectionSQLite();
            Statement sta = conn.createStatement();
            String Sql = "SELECT GENDER,LINEHOUSE,INVE_HOUSE,GoodEgg + Desc.'Double+Small+Crack' AS 'Qty',GoodEgg,DoubleEgg,SmallEgg,CrackEgg,Desc.'Double+Small+Crack' AS 'Total' \n"
                    + "FROM \n"
                    + "(SELECT CASE WHEN SUBSTR(INVE_HOUSE,4,1) %2 = 0 THEN 'F' ELSE 'M' END AS GENDER,SUBSTR(INVE_HOUSE,4,1) AS LINEHOUSE,SUBSTR(INVE_HOUSE,4,1) AS LINEHOUSE,INVE_HOUSE, \n"
                    + "SUM(CASE WHEN INVE_ITEM = '" + fegg1 + "' OR INVE_ITEM = '" + megg1 + "' THEN INVE_BALANCE ELSE '0' END) AS GoodEgg, \n"
                    + "SUM(CASE WHEN INVE_ITEM = '" + fegg2 + "' OR INVE_ITEM = '" + megg2 + "' THEN INVE_BALANCE ELSE '0' END) AS DoubleEgg, \n"
                    + "SUM(CASE WHEN INVE_ITEM = '" + fegg3 + "' OR INVE_ITEM = '" + megg3 + "' THEN INVE_BALANCE ELSE '0' END) AS SmallEgg, \n"
                    + "SUM(CASE WHEN INVE_ITEM = '" + fegg4 + "' OR INVE_ITEM = '" + megg4 + "' THEN INVE_BALANCE ELSE '0' END) AS CrackEgg, \n"
                    + "SUM(CASE WHEN INVE_ITEM = '" + fegg2 + "' OR INVE_ITEM = '" + megg2 + "' THEN INVE_BALANCE ELSE '0' END) + \n"
                    + "SUM(CASE WHEN INVE_ITEM = '" + fegg3 + "' OR INVE_ITEM = '" + megg3 + "' THEN INVE_BALANCE ELSE '0' END) + \n"
                    + "SUM(CASE WHEN INVE_ITEM = '" + fegg4 + "' OR INVE_ITEM = '" + megg4 + "' THEN INVE_BALANCE ELSE '0' END) AS 'Double+Small+Crack' \n"
                    + "FROM FAR_INVENLOT \n"
                    + "WHERE INVE_FARM = '" + farm + "' \n"
                    + "AND INVE_BREED = '" + breed + "' \n"
                    + "AND INVE_ITEM LIKE '" + egg + "%' \n"
                    + "AND INVE_BALANCE > 0 \n"
                    + "AND (SUBSTR(INVE_DATE,7) || SUBSTR(INVE_DATE,4,2) || SUBSTR(INVE_DATE,1,2)) BETWEEN '" + startdate + "' AND '" + enddate + "' \n"
                    + "GROUP BY GENDER,LINEHOUSE,INVE_HOUSE) as Desc \n"
                    //                    + "WHERE GENDER = 'F' \n"
                    + "UNION ALL \n"
                    + "SELECT GENDER,LINEHOUSE,'Total Line',SUM(SumHouse.'Qty(Pcs)') AS 'Qty(Pcs)',SUM(GoodEgg) AS GoodEgg,SUM(DoubleEgg) AS DoubleEgg,SUM(SmallEgg) AS SmallEgg,SUM(CrackEgg) AS CrackEgg, \n"
                    + "SUM(SumHouse.'Double+Small+Crack') AS 'Double+Small+Crack' \n"
                    + "FROM \n"
                    + "(SELECT GENDER,LINEHOUSE,INVE_HOUSE,GoodEgg + Desc.'Double+Small+Crack' AS 'Qty(Pcs)',GoodEgg,DoubleEgg,SmallEgg,CrackEgg,Desc.'Double+Small+Crack' \n"
                    + "FROM \n"
                    + "(SELECT CASE WHEN SUBSTR(INVE_HOUSE,4,1) %2 = 0 THEN 'F' ELSE 'M' END AS GENDER,SUBSTR(INVE_HOUSE,4,1) AS LINEHOUSE,INVE_HOUSE, \n"
                    + "SUM(CASE WHEN INVE_ITEM = '" + fegg1 + "' OR INVE_ITEM = '" + megg1 + "' THEN INVE_BALANCE ELSE '0' END) AS GoodEgg, \n"
                    + "SUM(CASE WHEN INVE_ITEM = '" + fegg2 + "' OR INVE_ITEM = '" + megg2 + "' THEN INVE_BALANCE ELSE '0' END) AS DoubleEgg, \n"
                    + "SUM(CASE WHEN INVE_ITEM = '" + fegg3 + "' OR INVE_ITEM = '" + megg3 + "' THEN INVE_BALANCE ELSE '0' END) AS SmallEgg, \n"
                    + "SUM(CASE WHEN INVE_ITEM = '" + fegg4 + "' OR INVE_ITEM = '" + megg4 + "' THEN INVE_BALANCE ELSE '0' END) AS CrackEgg, \n"
                    + "SUM(CASE WHEN INVE_ITEM = '" + fegg2 + "' OR INVE_ITEM = '" + megg2 + "' THEN INVE_BALANCE ELSE '0' END) + \n"
                    + "SUM(CASE WHEN INVE_ITEM = '" + fegg3 + "' OR INVE_ITEM = '" + megg3 + "' THEN INVE_BALANCE ELSE '0' END) + \n"
                    + "SUM(CASE WHEN INVE_ITEM = '" + fegg4 + "' OR INVE_ITEM = '" + megg4 + "' THEN INVE_BALANCE ELSE '0' END) AS 'Double+Small+Crack' \n"
                    + "FROM FAR_INVENLOT \n"
                    + "WHERE INVE_FARM = '" + farm + "' \n"
                    + "AND INVE_BREED = '" + breed + "' \n"
                    + "AND INVE_ITEM LIKE '" + egg + "%' \n"
                    + "AND INVE_BALANCE > 0 \n"
                    + "AND (SUBSTR(INVE_DATE,7) || SUBSTR(INVE_DATE,4,2) || SUBSTR(INVE_DATE,1,2)) BETWEEN '" + startdate + "' AND '" + enddate + "' \n"
                    + "GROUP BY GENDER,LINEHOUSE,INVE_HOUSE) as Desc) AS SumHouse \n"
                    //                    + "WHERE GENDER = 'F' \n"
                    + "GROUP BY GENDER,LINEHOUSE \n"
                    + "UNION All \n"
                    + "SELECT 'Z','Z','Total All',SUM(SumHouse.'Qty(Pcs)') AS 'Qty(Pcs)',SUM(GoodEgg) AS GoodEgg,SUM(DoubleEgg) AS DoubleEgg,SUM(SmallEgg) AS SmallEgg,SUM(CrackEgg) AS CrackEgg, \n"
                    + "SUM(SumHouse.'Double+Small+Crack') AS 'Double+Small+Crack' \n"
                    + "FROM \n"
                    + "(SELECT GENDER,LINEHOUSE,INVE_HOUSE,GoodEgg + Desc.'Double+Small+Crack' AS 'Qty(Pcs)',GoodEgg,DoubleEgg,SmallEgg,CrackEgg,Desc.'Double+Small+Crack' \n"
                    + "FROM \n"
                    + "(SELECT CASE WHEN SUBSTR(INVE_HOUSE,4,1) %2 = 0 THEN 'F' ELSE 'M' END AS GENDER,SUBSTR(INVE_HOUSE,4,1) AS LINEHOUSE,INVE_HOUSE, \n"
                    + "SUM(CASE WHEN INVE_ITEM = '" + fegg1 + "' OR INVE_ITEM = '" + megg1 + "' THEN INVE_BALANCE ELSE '0' END) AS GoodEgg, \n"
                    + "SUM(CASE WHEN INVE_ITEM = '" + fegg2 + "' OR INVE_ITEM = '" + megg2 + "' THEN INVE_BALANCE ELSE '0' END) AS DoubleEgg, \n"
                    + "SUM(CASE WHEN INVE_ITEM = '" + fegg3 + "' OR INVE_ITEM = '" + megg3 + "' THEN INVE_BALANCE ELSE '0' END) AS SmallEgg, \n"
                    + "SUM(CASE WHEN INVE_ITEM = '" + fegg4 + "' OR INVE_ITEM = '" + megg4 + "' THEN INVE_BALANCE ELSE '0' END) AS CrackEgg, \n"
                    + "SUM(CASE WHEN INVE_ITEM = '" + fegg2 + "' OR INVE_ITEM = '" + megg2 + "' THEN INVE_BALANCE ELSE '0' END) + \n"
                    + "SUM(CASE WHEN INVE_ITEM = '" + fegg3 + "' OR INVE_ITEM = '" + megg3 + "' THEN INVE_BALANCE ELSE '0' END) + \n"
                    + "SUM(CASE WHEN INVE_ITEM = '" + fegg4 + "' OR INVE_ITEM = '" + megg4 + "' THEN INVE_BALANCE ELSE '0' END) AS 'Double+Small+Crack' \n"
                    + "FROM FAR_INVENLOT \n"
                    + "WHERE INVE_FARM = '" + farm + "' \n"
                    + "AND INVE_BREED = '" + breed + "' \n"
                    + "AND INVE_ITEM LIKE '" + egg + "%' \n"
                    + "AND INVE_BALANCE > 0 \n"
                    + "AND (SUBSTR(INVE_DATE,7) || SUBSTR(INVE_DATE,4,2) || SUBSTR(INVE_DATE,1,2)) BETWEEN '" + startdate + "' AND '" + enddate + "' \n"
                    + "GROUP BY GENDER,LINEHOUSE,INVE_HOUSE) as Desc) AS SumHouse \n"
                    //                    + "WHERE GENDER = 'F' \n"
                    + "ORDER BY GENDER,LINEHOUSE";
            ResultSet rs = sta.executeQuery(Sql);

            while (rs.next()) {
                getListEggStockDesc.add(
                        rs.getString("INVE_HOUSE").trim() + " ; "
                        + df.format(rs.getFloat("QTY")) + " ; "
                        + df.format(rs.getFloat("GOODEGG")) + " ; "
                        + df.format(rs.getFloat("DOUBLEEGG")) + " ; "
                        + df.format(rs.getFloat("SMALLEGG")) + " ; "
                        + df.format(rs.getFloat("CRACKEGG")) + " ; "
                        + df.format(rs.getFloat("TOTAL")));
            }
            return getListEggStockDesc;

        } catch (Exception ex) {
            System.out.println(ex.toString());
        } finally {
            if (conn != null) {
                try {
                    conn.close();
                } catch (SQLException ex) {
                    System.out.println(ex.toString());
                }
            }
        }
        return null;
    }

    public List<String> GetResultOtherStockDesc(String farm, String house, String breed, String breedall, String panel) {

        List<String> getListOtherStockDesct = new ArrayList<String>();
        Connection conn = null;
        try {
            conn = ConnectSQLite.ConnectionSQLite();
            Statement sta = conn.createStatement();
            String Type = "";

            if ("Other".equals(panel)) {
                Type = BRLogin.vDuckBreed;
            }

            String Sql = "SELECT INVE_FARM,INVE_HOUSE,HOUS_NAME,INVE_DATE,INVE_ITEM,ITEM_NAME,INVE_BALANCE,ITEM_UNIT \n"
                    + "FROM \n"
                    + "(SELECT INVE_FARM,INVE_DATE,INVE_HOUSE,INVE_ITEM,INVE_BALANCE \n"
                    + "FROM FAR_INVENBAL \n"
                    + "WHERE INVE_FARM = '" + farm + "' \n"
                    + "AND INVE_BREED = '" + breedall + "' \n"
                    + "AND INVE_BALANCE > 0) AS a \n"
                    + "LEFT JOIN \n"
                    + "(SELECT HOUS_CODE,HOUS_NAME \n"
                    + "FROM FAR_MHOUSE \n"
                    + "WHERE HOUS_FARM = '" + farm + "' \n"
                    + "AND HOUS_BREED = '" + breedall + "') AS b \n"
                    + "ON a.INVE_HOUSE = b.HOUS_CODE \n"
                    + "LEFT JOIN \n"
                    + "(SELECT ITEM_CODE,ITEM_NAME,ITEM_UNIT \n"
                    + "FROM FAR_MITEM \n"
                    + "WHERE ITEM_FARM = '" + farm + "') AS c \n"
                    + "ON a.INVE_ITEM = c.ITEM_CODE \n"
                    + "WHERE SUBSTR(a.INVE_HOUSE,5,2) = '" + house + "'";
            ResultSet rs = sta.executeQuery(Sql);

            while (rs.next()) {
                getListOtherStockDesct.add(
                        rs.getString("INVE_HOUSE").trim() + " : " + rs.getString("HOUS_NAME").trim() + " ; "
                        + rs.getString("INVE_DATE").trim() + " ; "
                        + rs.getString("INVE_ITEM").trim() + " ; "
                        + rs.getString("ITEM_NAME").trim() + " ; "
                        + rs.getString("INVE_BALANCE").trim() + " ; "
                        + rs.getString("ITEM_UNIT").trim());
            }
            return getListOtherStockDesct;

        } catch (Exception ex) {
            System.out.println(ex.toString());
        } finally {
            if (conn != null) {
                try {
                    conn.close();
                } catch (SQLException ex) {
                    System.out.println(ex.toString());
                }
            }
        }
        return null;
    }

    //BF01D002 History Transection
    public List<String> GetResultTransectionAllDesc(String farm, String house, String breed, String startdate, String enddate) {

        List<String> getListTransectionAllDesc = new ArrayList<String>();
        Connection conn = null;
        try {
            conn = ConnectSQLite.ConnectionSQLite();
            Statement sta = conn.createStatement();
            String Sql = "SELECT TRAN_FARM,TRAN_HOUSE,TRAN_DATE,TRAN_ITEM,ITEM_NAME,TRAN_LOTNO,TRAN_TYPE,TRAN_DESC,TRAN_QTY\n"
                    + "FROM\n"
                    + "(SELECT TRAN_FARM,TRAN_HOUSE,TRAN_DATE,TRAN_ITEM,COALESCE(TRAN_LOTNO,'') AS TRAN_LOTNO,TRAN_TYPE,COALESCE(TRAN_DESC,'') AS TRAN_DESC,TRAN_QTY\n"
                    + "FROM FAR_MTRANSECTION \n"
                    + "WHERE TRAN_FARM = '" + farm + "'\n"
                    //                    + "AND TRAN_BREED = '" + breed + "'\n"
                    + "AND TRAN_HOUSE = '" + house + "'\n"
                    + "ORDER BY SUBSTR(TRAN_DATE,7) || SUBSTR(TRAN_DATE,4,2) || SUBSTR(TRAN_DATE,1,2)) AS a\n"
                    + "LEFT JOIN \n"
                    + "(SELECT ITEM_CODE,ITEM_NAME\n"
                    + "FROM FAR_MITEM\n"
                    + "WHERE ITEM_FARM = '" + farm + "') AS b\n"
                    + "ON a.TRAN_ITEM = b.ITEM_CODE\n"
                    + "WHERE (SUBSTR(a.TRAN_DATE,7) || SUBSTR(a.TRAN_DATE,4,2) || SUBSTR(a.TRAN_DATE,1,2) BETWEEN '" + startdate + "' AND '" + enddate + "')";
            ResultSet rs = sta.executeQuery(Sql);

            while (rs.next()) {
                getListTransectionAllDesc.add(
                        rs.getString("TRAN_HOUSE").trim() + " ; "
                        + rs.getString("TRAN_DATE").trim() + " ; "
                        + rs.getString("TRAN_ITEM").trim() + " ; "
                        + rs.getString("ITEM_NAME").trim() + " ; "
                        + rs.getString("TRAN_LOTNO").trim() + " ; "
                        + rs.getString("TRAN_TYPE").trim() + " ; "
                        + rs.getString("TRAN_DESC").trim() + " ; "
                        + rs.getString("TRAN_QTY").trim());
            }
            return getListTransectionAllDesc;

        } catch (Exception ex) {
            System.out.println(ex.toString());
        } finally {
            if (conn != null) {
                try {
                    conn.close();
                } catch (SQLException ex) {
                    System.out.println(ex.toString());
                }
            }
        }
        return null;
    }

    public List<String> GetResultTransectionByItemDesc(String farm, String house, String breed, String startdate, String enddate, String item) {

        List<String> getListTransectionByItemDesc = new ArrayList<String>();
        Connection conn = null;
        try {
            conn = ConnectSQLite.ConnectionSQLite();
            Statement sta = conn.createStatement();
            String Sql = "SELECT TRAN_FARM,TRAN_HOUSE,TRAN_DATE,TRAN_ITEM,ITEM_NAME,TRAN_LOTNO,TRAN_TYPE,TRAN_DESC,TRAN_QTY\n"
                    + "FROM\n"
                    + "(SELECT TRAN_FARM,TRAN_HOUSE,TRAN_DATE,TRAN_ITEM,COALESCE(TRAN_LOTNO,'') AS TRAN_LOTNO,TRAN_TYPE,COALESCE(TRAN_DESC,'') AS TRAN_DESC,TRAN_QTY\n"
                    + "FROM FAR_MTRANSECTION \n"
                    + "WHERE TRAN_FARM = '" + farm + "'\n"
                    //                    + "AND TRAN_BREED = '" + breed + "'\n"
                    + "AND TRAN_HOUSE = '" + house + "'\n"
                    + "AND TRAN_ITEM = '" + item + "'\n"
                    + "ORDER BY SUBSTR(TRAN_DATE,7) || SUBSTR(TRAN_DATE,4,2) || SUBSTR(TRAN_DATE,1,2)) AS a\n"
                    + "LEFT JOIN \n"
                    + "(SELECT ITEM_CODE,ITEM_NAME\n"
                    + "FROM FAR_MITEM\n"
                    + "WHERE ITEM_FARM = '" + farm + "') AS b\n"
                    + "ON a.TRAN_ITEM = b.ITEM_CODE\n"
                    + "WHERE (SUBSTR(a.TRAN_DATE,7) || SUBSTR(a.TRAN_DATE,4,2) || SUBSTR(a.TRAN_DATE,1,2) BETWEEN '" + startdate + "' AND '" + enddate + "')\n"
                    + "UNION ALL\n"
                    + "SELECT '','','',COALESCE(TRAN_ITEM,'') AS TRAN_ITEM,'','','','',COALESCE(SUM(TRAN_QTY),'') AS TRAN_ITEM\n"
                    + "FROM FAR_MTRANSECTION \n"
                    + "WHERE TRAN_FARM = '" + farm + "'\n"
                    + "AND TRAN_BREED = '" + breed + "'\n"
                    + "AND TRAN_HOUSE = '" + house + "'\n"
                    + "AND TRAN_ITEM = '" + item + "'\n"
                    + "AND (SUBSTR(TRAN_DATE,7) || SUBSTR(TRAN_DATE,4,2) || SUBSTR(TRAN_DATE,1,2) BETWEEN '" + startdate + "' AND '" + enddate + "')";
            ResultSet rs = sta.executeQuery(Sql);

            while (rs.next()) {
                getListTransectionByItemDesc.add(
                        rs.getString("TRAN_HOUSE").trim() + " ; "
                        + rs.getString("TRAN_DATE").trim() + " ; "
                        + rs.getString("TRAN_ITEM").trim() + " ; "
                        + rs.getString("ITEM_NAME").trim() + " ; "
                        + rs.getString("TRAN_LOTNO").trim() + " ; "
                        + rs.getString("TRAN_TYPE").trim() + " ; "
                        + rs.getString("TRAN_DESC").trim() + " ; "
                        + rs.getString("TRAN_QTY").trim());
            }
            return getListTransectionByItemDesc;

        } catch (Exception ex) {
            System.out.println(ex.toString());
        } finally {
            if (conn != null) {
                try {
                    conn.close();
                } catch (SQLException ex) {
                    System.out.println(ex.toString());
                }
            }
        }
        return null;
    }

    public List<String> GetResultEggTransection(String farm, String breed, String transferdate, String egg) {

        List<String> getListTransectionByItemDesc = new ArrayList<String>();
        Connection conn = null;
        try {
            conn = ConnectSQLite.ConnectionSQLite();
            Statement sta = conn.createStatement();
            String Sql = "SELECT TRAN_FARM,TRAN_HOUSE,TRAN_DATE,TRAN_ITEM,ITEM_NAME,TRAN_LOTNO,TRAN_TYPE,TRAN_DESC,TRAN_QTY\n"
                    + "FROM\n"
                    + "(SELECT TRAN_FARM,TRAN_HOUSE,TRAN_DATE,TRAN_ITEM,COALESCE(TRAN_LOTNO,'') AS TRAN_LOTNO,TRAN_TYPE,COALESCE(TRAN_DESC,'') AS TRAN_DESC,SUM(TRAN_QTY) AS TRAN_QTY\n"
                    + "FROM FAR_DTRANSECTION \n"
                    + "WHERE TRAN_FARM = '" + farm + "'\n"
                    + "AND TRAN_BREED = '" + breed + "'\n"
                    + "AND TRAN_TYPE = 'ISS'\n"
                    + "AND TRAN_ITEM LIKE '" + egg + "%" + "'\n"
                    + "GROUP BY TRAN_FARM,TRAN_HOUSE,TRAN_DATE,TRAN_LOTNO,TRAN_ITEM,TRAN_TYPE,TRAN_DESC\n"
                    + "ORDER BY SUBSTR(TRAN_DATE,7) || SUBSTR(TRAN_DATE,4,2) || SUBSTR(TRAN_DATE,1,2)) AS a\n"
                    + "LEFT JOIN \n"
                    + "(SELECT ITEM_CODE,ITEM_NAME\n"
                    + "FROM FAR_MITEM\n"
                    + "WHERE ITEM_FARM = '" + farm + "') AS b\n"
                    + "ON a.TRAN_ITEM = b.ITEM_CODE\n"
                    + "WHERE SUBSTR(a.TRAN_DATE,7) || SUBSTR(a.TRAN_DATE,4,2) || SUBSTR(a.TRAN_DATE,1,2) = '" + transferdate + "'\n"
                    + "AND TRAN_QTY > 0";
            ResultSet rs = sta.executeQuery(Sql);

            while (rs.next()) {
                getListTransectionByItemDesc.add(
                        rs.getString("TRAN_HOUSE").trim() + " ; "
                        + rs.getString("TRAN_DATE").trim() + " ; "
                        + rs.getString("TRAN_ITEM").trim() + " ; "
                        + rs.getString("ITEM_NAME").trim() + " ; "
                        + rs.getString("TRAN_LOTNO").trim() + " ; "
                        + rs.getString("TRAN_TYPE").trim() + " ; "
                        + rs.getString("TRAN_DESC").trim() + " ; "
                        + rs.getString("TRAN_QTY").trim());
            }
            return getListTransectionByItemDesc;

        } catch (Exception ex) {
            System.out.println(ex.toString());
        } finally {
            if (conn != null) {
                try {
                    conn.close();
                } catch (SQLException ex) {
                    System.out.println(ex.toString());
                }
            }
        }
        return null;
    }

    public List<String> GetResultEggTransectionLotDate(String farm, String breed, String transferdate, String egg, String lotdate) {

        List<String> getListTransectionByItemDesc = new ArrayList<String>();
        Connection conn = null;
        try {
            conn = ConnectSQLite.ConnectionSQLite();
            Statement sta = conn.createStatement();
            String Sql = "SELECT TRAN_FARM,TRAN_HOUSE,TRAN_DATE,TRAN_ITEM,ITEM_NAME,TRAN_LOTNO,TRAN_TYPE,TRAN_DESC,TRAN_QTY\n"
                    + "FROM\n"
                    + "(SELECT TRAN_FARM,TRAN_HOUSE,TRAN_DATE,TRAN_ITEM,COALESCE(TRAN_LOTNO,'') AS TRAN_LOTNO,TRAN_TYPE,COALESCE(TRAN_DESC,'') AS TRAN_DESC,SUM(TRAN_QTY) AS TRAN_QTY\n"
                    + "FROM FAR_DTRANSECTION \n"
                    + "WHERE TRAN_FARM = '" + farm + "'\n"
                    + "AND TRAN_BREED = '" + breed + "'\n"
                    + "AND TRAN_TYPE = 'ISS'\n"
                    + "AND TRAN_ITEM LIKE '" + egg + "%" + "'\n"
                    + "AND SUBSTR(TRAN_DATE,7) || SUBSTR(TRAN_DATE,4,2) || SUBSTR(TRAN_DATE,1,2) = '" + transferdate + "'\n"
                    + "AND SUBSTR(TRAN_LOTNO,14,16) = '" + lotdate + "' \n"
                    + "GROUP BY TRAN_FARM,TRAN_HOUSE,TRAN_DATE,TRAN_LOTNO,TRAN_ITEM,TRAN_TYPE,TRAN_DESC\n"
                    + "ORDER BY SUBSTR(TRAN_DATE,7) || SUBSTR(TRAN_DATE,4,2) || SUBSTR(TRAN_DATE,1,2)) AS a\n"
                    + "LEFT JOIN \n"
                    + "(SELECT ITEM_CODE,ITEM_NAME\n"
                    + "FROM FAR_MITEM\n"
                    + "WHERE ITEM_FARM = '" + farm + "') AS b\n"
                    + "ON a.TRAN_ITEM = b.ITEM_CODE\n"
                    + "WHERE SUBSTR(a.TRAN_DATE,7) || SUBSTR(a.TRAN_DATE,4,2) || SUBSTR(a.TRAN_DATE,1,2) = '" + transferdate + "'\n"
                    + "AND TRAN_QTY > 0";
            ResultSet rs = sta.executeQuery(Sql);

            while (rs.next()) {
                getListTransectionByItemDesc.add(
                        rs.getString("TRAN_HOUSE").trim() + " ; "
                        + rs.getString("TRAN_DATE").trim() + " ; "
                        + rs.getString("TRAN_ITEM").trim() + " ; "
                        + rs.getString("ITEM_NAME").trim() + " ; "
                        + rs.getString("TRAN_LOTNO").trim() + " ; "
                        + rs.getString("TRAN_TYPE").trim() + " ; "
                        + rs.getString("TRAN_DESC").trim() + " ; "
                        + rs.getString("TRAN_QTY").trim());
            }
            return getListTransectionByItemDesc;

        } catch (Exception ex) {
            System.out.println(ex.toString());
        } finally {
            if (conn != null) {
                try {
                    conn.close();
                } catch (SQLException ex) {
                    System.out.println(ex.toString());
                }
            }
        }
        return null;
    }

    public List<String> GetResultQtyInvenLot(String jTextFarm, String jTextHouse, String jTextFML, String jTextItemML, String jTextBreed, String jTextBreedAll) {

        List<String> getListQtyInvenLot = new ArrayList<String>();
        Connection conn = null;
        try {
            conn = ConnectSQLite.ConnectionSQLite();
            Statement sta = conn.createStatement();
            String Sql = "SELECT INVE_BALANCE,COALESCE(NULLIF(INVE_LOTNO,''), '0') AS INVE_LOTNO \n"
                    + "FROM FAR_INVENLOT \n"
                    + "WHERE INVE_FARM = '" + jTextFarm + "' \n"
                    + "AND INVE_HOUSE = '" + jTextHouse + "' \n"
                    + "AND INVE_ITEM IN ('" + jTextFML + "','" + jTextItemML + "') \n"
                    + "AND INVE_BREED IN ('" + jTextBreed + "','" + jTextBreedAll + "') \n"
                    + "AND INVE_BALANCE > 0 \n"
                    + "ORDER BY SUBSTR(INVE_DATE,7) || SUBSTR(INVE_DATE,4,2) || SUBSTR(INVE_DATE,1,2) ASC";
            ResultSet rs = sta.executeQuery(Sql);

            while (rs.next()) {
                getListQtyInvenLot.add(rs.getString("INVE_BALANCE").trim() + " ; " + rs.getString("INVE_LOTNO").trim());
            }
            return getListQtyInvenLot;

        } catch (Exception ex) {
            System.out.println(ex.toString());
        } finally {
            if (conn != null) {
                try {
                    conn.close();
                } catch (SQLException ex) {
                    System.out.println(ex.toString());
                }
            }
        }
        return null;
    }

    public List<String> GetResultQtyInvenLotByLot(String jTextFarm, String jTextHouse, String jTextLot, String jTextFML, String jTextItemML, String jTextBreed, String jTextBreedAll) {

        List<String> getListQtyInvenLot = new ArrayList<String>();
        Connection conn = null;
        try {
            conn = ConnectSQLite.ConnectionSQLite();
            Statement sta = conn.createStatement();
            String Sql = "SELECT INVE_BALANCE,COALESCE(NULLIF(INVE_LOTNO,''), '0') AS INVE_LOTNO \n"
                    + "FROM FAR_INVENLOT \n"
                    + "WHERE INVE_FARM = '" + jTextFarm + "' \n"
                    + "AND INVE_HOUSE = '" + jTextHouse + "' \n"
                    + "AND INVE_ITEM IN ('" + jTextFML + "','" + jTextItemML + "') \n"
                    + "AND INVE_BREED IN ('" + jTextBreed + "','" + jTextBreedAll + "') \n"
                    + "AND INVE_LOTNO = '" + jTextLot + "' \n"
                    + "AND INVE_BALANCE <> 0 \n"
                    + "ORDER BY SUBSTR(INVE_DATE,7) || SUBSTR(INVE_DATE,4,2) || SUBSTR(INVE_DATE,1,2) ASC";
            ResultSet rs = sta.executeQuery(Sql);

            while (rs.next()) {
                getListQtyInvenLot.add(rs.getString("INVE_BALANCE").trim() + " ; " + rs.getString("INVE_LOTNO").trim());
            }
            return getListQtyInvenLot;

        } catch (Exception ex) {
            System.out.println(ex.toString());
        } finally {
            if (conn != null) {
                try {
                    conn.close();
                } catch (SQLException ex) {
                    System.out.println(ex.toString());
                }
            }
        }
        return null;
    }

    //BF01D003 Balance Stock By Lot Number
    public List<String> GetResultLotNumberDetail(String farm, String house, String breed, String breedall) {

        List<String> getListLotNumberDetail = new ArrayList<String>();
        Connection conn = null;
        try {
            conn = ConnectSQLite.ConnectionSQLite();
            Statement sta = conn.createStatement();
            String Sql = "SELECT INVE_FARM,INVE_HOUSE,INVE_DATE,INVE_LOTNO,INVE_ITEM,ITEM_NAME,INVE_BALANCE,ITEM_UNIT\n"
                    + "FROM\n"
                    + "(SELECT INVE_FARM,INVE_HOUSE,INVE_DATE,INVE_LOTNO,INVE_ITEM,INVE_BALANCE\n"
                    + "FROM FAR_INVENLOT\n"
                    + "WHERE INVE_FARM = '" + farm + "'\n"
                    + "AND INVE_BREED IN ('" + breed + "','" + breedall + "')\n"
                    + "AND INVE_HOUSE = '" + house + "'\n"
                    + "AND INVE_BALANCE <> 0) AS a\n"
                    + "LEFT JOIN\n"
                    + "(SELECT ITEM_CODE,ITEM_NAME,ITEM_UNIT \n"
                    + "FROM FAR_MITEM\n"
                    + "WHERE ITEM_FARM = '" + farm + "') AS b\n"
                    + "ON a.INVE_ITEM = b.ITEM_CODE \n"
                    + "ORDER BY SUBSTR(INVE_DATE,7) || SUBSTR(INVE_DATE,4,2) || SUBSTR(INVE_DATE,1,2),INVE_ITEM,INVE_LOTNO";
            System.out.println("GetResultLotNumberDetail\n" + Sql);
            ResultSet rs = sta.executeQuery(Sql);

            while (rs.next()) {
                getListLotNumberDetail.add(
                        rs.getString("INVE_DATE").trim() + " ; "
                        + rs.getString("INVE_ITEM").trim() + " : " + rs.getString("ITEM_NAME").trim() + " ; "
                        + rs.getString("INVE_LOTNO").trim() + " ; "
                        + rs.getString("INVE_BALANCE").trim() + " ; "
                        + rs.getString("ITEM_UNIT").trim());
            }
            return getListLotNumberDetail;

        } catch (Exception ex) {
            System.out.println(ex.toString());
        } finally {
            if (conn != null) {
                try {
                    conn.close();
                } catch (SQLException ex) {
                    System.out.println(ex.toString());
                }
            }
        }
        return null;
    }

    public List<String> GetResultLotNumberDetailByItem(String farm, String house, String breed, String item, String breedall) {

        List<String> getListLotNumberDetail = new ArrayList<String>();
        Connection conn = null;
        try {
            conn = ConnectSQLite.ConnectionSQLite();
            Statement sta = conn.createStatement();
            String Sql = "SELECT INVE_FARM,INVE_HOUSE,INVE_DATE,INVE_LOTNO,INVE_ITEM,ITEM_NAME,INVE_BALANCE,ITEM_UNIT\n"
                    + "FROM\n"
                    + "(SELECT INVE_FARM,INVE_HOUSE,INVE_DATE,INVE_LOTNO,INVE_ITEM,INVE_BALANCE\n"
                    + "FROM FAR_INVENLOT\n"
                    + "WHERE INVE_FARM = '" + farm + "'\n"
                    + "AND INVE_BREED IN ('" + breed + "','" + breedall + "')\n"
                    + "AND INVE_HOUSE = '" + house + "'\n"
                    + "AND INVE_ITEM = '" + item + "'\n"
                    + "AND INVE_BALANCE <> 0) AS a\n"
                    + "LEFT JOIN\n"
                    + "(SELECT ITEM_CODE,ITEM_NAME,ITEM_UNIT \n"
                    + "FROM FAR_MITEM\n"
                    + "WHERE ITEM_FARM = '" + farm + "') AS b\n"
                    + "ON a.INVE_ITEM = b.ITEM_CODE \n"
                    + "ORDER BY SUBSTR(INVE_DATE,7) || SUBSTR(INVE_DATE,4,2) || SUBSTR(INVE_DATE,1,2),INVE_ITEM,INVE_LOTNO";
            ResultSet rs = sta.executeQuery(Sql);

            while (rs.next()) {
                getListLotNumberDetail.add(
                        rs.getString("INVE_DATE").trim() + " ; "
                        + rs.getString("INVE_ITEM").trim() + " : " + rs.getString("ITEM_NAME").trim() + " ; "
                        + rs.getString("INVE_LOTNO").trim() + " ; "
                        + rs.getString("INVE_BALANCE").trim() + " ; "
                        + rs.getString("ITEM_UNIT").trim());
            }
            return getListLotNumberDetail;

        } catch (Exception ex) {
            System.out.println(ex.toString());
        } finally {
            if (conn != null) {
                try {
                    conn.close();
                } catch (SQLException ex) {
                    System.out.println(ex.toString());
                }
            }
        }
        return null;
    }

    public List<String> GetResultLotNumberDetailCullDuck(String farm, String house, String item, String breed, String breedall) {

        List<String> getListLotNumberDetail = new ArrayList<String>();
        Connection conn = null;
        try {
            conn = ConnectSQLite.ConnectionSQLite();
            Statement sta = conn.createStatement();
            String Sql = "SELECT INVE_FARM,INVE_HOUSE,INVE_DATE,INVE_LOTNO,INVE_ITEM,ITEM_NAME,INVE_BALANCE,ITEM_UNIT\n"
                    + "FROM\n"
                    + "(SELECT INVE_FARM,INVE_HOUSE,INVE_DATE,INVE_LOTNO,INVE_ITEM,INVE_BALANCE\n"
                    + "FROM FAR_INVENLOT\n"
                    + "WHERE INVE_FARM = '" + farm + "'\n"
                    + "AND INVE_BREED IN ('" + breed + "','" + breedall + "')\n"
                    + "AND INVE_HOUSE = '" + house + "'\n"
                    + "AND SUBSTR(INVE_ITEM,0,4) = '" + item + "'\n"
                    + "AND INVE_BALANCE <> 0) AS a\n"
                    + "LEFT JOIN\n"
                    + "(SELECT ITEM_CODE,ITEM_NAME,ITEM_UNIT \n"
                    + "FROM FAR_MITEM\n"
                    + "WHERE ITEM_FARM = '" + farm + "') AS b\n"
                    + "ON a.INVE_ITEM = b.ITEM_CODE \n"
                    + "ORDER BY SUBSTR(INVE_DATE,7) || SUBSTR(INVE_DATE,4,2) || SUBSTR(INVE_DATE,1,2),INVE_ITEM,INVE_LOTNO";
            ResultSet rs = sta.executeQuery(Sql);

            while (rs.next()) {
                getListLotNumberDetail.add(
                        rs.getString("INVE_DATE").trim() + " ; "
                        + rs.getString("INVE_ITEM").trim() + " : " + rs.getString("ITEM_NAME").trim() + " ; "
                        + rs.getString("INVE_LOTNO").trim() + " ; "
                        + df.format(rs.getFloat("INVE_BALANCE")) + " ; "
                        + rs.getString("ITEM_UNIT").trim());
            }
            return getListLotNumberDetail;

        } catch (Exception ex) {
            System.out.println(ex.toString());
        } finally {
            if (conn != null) {
                try {
                    conn.close();
                } catch (SQLException ex) {
                    System.out.println(ex.toString());
                }
            }
        }
        return null;
    }

    //BF01E002 History Transection
    public List<String> GetResultDiseMInform(String farm, String house, String date, String item, String dise, String breed) {

        List<String> getListDiseMInform = new ArrayList<String>();
        Connection conn = null;
        try {
            conn = ConnectSQLite.ConnectionSQLite();
            Statement sta = conn.createStatement();
            String Sql = "SELECT INFO_ITEM,INFO_DISE,SUM(INFO_QTY) AS INFO_QTY\n"
                    + "FROM FAR_MINFORM\n"
                    + "WHERE INFO_FARM = '" + farm + "'\n"
                    + "AND INFO_DATE = '" + date + "'\n"
                    + "AND INFO_HOUSE = '" + house + "'\n"
                    + "AND INFO_ITEM = '" + item + "'\n"
                    + "AND INFO_DISE = '" + dise + "'\n"
                    + "AND INFO_BREED = '" + breed + "'";
            ResultSet rs = sta.executeQuery(Sql);

            while (rs.next()) {
                getListDiseMInform.add(
                        rs.getString("INFO_ITEM").trim() + " ; "
                        + rs.getString("INFO_DISE").trim() + " ; "
                        + rs.getString("INFO_QTY").trim());
            }
            return getListDiseMInform;

        } catch (Exception ex) {
            System.out.println(ex.toString());
        } finally {
            if (conn != null) {
                try {
                    conn.close();
                } catch (SQLException ex) {
                    System.out.println(ex.toString());
                }
            }
        }
        return null;
    }

    //BF01R009 History Egg Transfer
    public List<String> GetResultEggTransfer(String farm, String date, String lotdate, String starthouse, String endhouse, String hcg001, String hcd002, String hcs003, String hcc004, String breed, String db) {

        List<String> getListDiseMInform = new ArrayList<String>();
        Connection conn = null;
        try {
            conn = ConnectSQLite.ConnectionSQLite();
            Statement sta = conn.createStatement();
            String Sql = "SELECT FLOC_DESC,TRAN_HOUSE,FLOC_CODE,PSGR_DATE,WEEK,CASE WHEN WEEK >= 24 THEN WEEK - 23 ELSE 0 END AS INLAY,TRAN_LOTNO,PSGR_MO,HCG001 + HCD002 + HCS003 + HCC004 AS QTY,HCG001,HCD002,HCS003,HCC004,HCD002 + HCS003 + HCC004 AS CULLQTY\n"
                    + "FROM\n"
                    + "(SELECT DISTINCT FLOC_BREED,FLOC_DESC,TRAN_HOUSE,FLOC_CODE,PSGR_DATE,SUBSTR(TRAN_LOTNO,0,13) AS TRAN_LOTNO,PSGR_MO, \n"
                    + "FLOOR(((JULIANDAY(SUBSTR('" + date + "',0,5)||\"-\"||SUBSTR('" + date + "',5,2)||\"-\"||SUBSTR('" + date + "',7,2))- JULIANDAY(SUBSTR(PSGR_DATE,7)||\"-\"||SUBSTR(PSGR_DATE,4,2)||\"-\"||SUBSTR(PSGR_DATE,1,2))) / 7) +1) AS INLAY, \n"
                    + "CEIL(((JULIANDAY(SUBSTR('" + date + "',0,5)||\"-\"||SUBSTR('" + date + "',5,2)||\"-\"||SUBSTR('" + date + "',7,2)) - JULIANDAY(SUBSTR(FLOC_STWEEK,7)||\"-\"||SUBSTR(FLOC_STWEEK,4,2)||\"-\"||SUBSTR(FLOC_STWEEK,1,2))) / 7) +1) AS WEEK ,\n"
                    + "COALESCE(SUM(CASE WHEN TRAN_ITEM = '" + hcg001 + "' THEN TRAN_QTY END),0) AS HCG001,\n"
                    + "COALESCE(SUM(CASE WHEN TRAN_ITEM = '" + hcd002 + "' THEN TRAN_QTY END),0) AS HCD002,\n"
                    + "COALESCE(SUM(CASE WHEN TRAN_ITEM = '" + hcs003 + "' THEN TRAN_QTY END),0) AS HCS003,\n"
                    + "COALESCE(SUM(CASE WHEN TRAN_ITEM = '" + hcc004 + "' THEN TRAN_QTY END),0) AS HCC004\n"
                    + "FROM FAR_FLOCK," + db + ",FAR_DTRANSECTION,FAR_MITEM,FAR_MTYPE,FAR_MPENE\n"
                    + "WHERE TRAN_FARM = '" + farm + "'\n"
                    + "AND TRAN_BREED = '" + breed + "'\n"
                    + "AND SUBSTR(TRAN_LOTNO,14,16) = '" + lotdate + "'\n"
                    + "AND TRAN_FARM = FLOC_FARM\n"
                    + "AND TRAN_FARM = PSGR_FARM\n"
                    + "AND TRAN_FARM = ITEM_FARM\n"
                    + "AND TRAN_FARM = TYPE_FARM\n"
                    + "AND TRAN_FARM = PENE_FARM\n"
                    + "AND TRAN_BREED = FLOC_BREED\n"
                    + "AND TRAN_BREED = PSGR_BREED\n"
                    + "AND TRAN_HOUSE BETWEEN '" + starthouse + "' AND '" + endhouse + "'\n"
                    + "AND TRAN_TYPE = 'ISS'\n"
                    + "AND TYPE_CODE = TRAN_TYPE\n"
                    + "AND TRAN_DESC = 'HC'\n"
                    + "AND PENE_CODE =  TRAN_DESC\n"
                    + "AND TRAN_ITEM = ITEM_CODE\n"
                    + "AND TRAN_ITEM IN ('" + hcg001 + "','" + hcd002 + "','" + hcs003 + "','" + hcc004 + "')\n"
                    + "AND FLOC_STATUS = '1'\n"
                    + "AND FLOC_CODE = PSGR_FLOCK\n"
                    + "AND PSGR_HOUSE = SUBSTR(TRAN_LOTNO,7,6)\n"
                    + "AND SUBSTR(TRAN_DATE,7) || SUBSTR(TRAN_DATE,4,2) || SUBSTR(TRAN_DATE,1,2) = '" + date + "'\n"
                    + "GROUP BY TRAN_HOUSE,SUBSTR(TRAN_LOTNO,0,13))";
//            String Sql = "SELECT FLOC_DESC,TRAN_HOUSE,FLOC_CODE,PSGR_DATE,WEEK,CASE WHEN WEEK >= 24 THEN WEEK - 23 ELSE 0 END AS INLAY,TRAN_LOTNO,PSGR_MO,HCG001 + HCD002 + HCS003 + HCC004+BESUM AS QTY\n"
//                    + ",HCG001+BEHCG001 as HCG001,HCD002+BEHCD002 as HCD002,HCS003+BEHCS003 as HCS003,HCC004+BEHCC004 as HCC004,HCD002 + HCS003 + HCC004 + BEHCD002 + BEHCS003 + BEHCC004 AS CULLQTY\n"
//                    + "FROM\n"
//                    + "(SELECT DISTINCT FLOC_BREED,FLOC_DESC,TRAN_HOUSE,FLOC_CODE,PSGR_DATE,SUBSTR(TRAN_LOTNO,0,13) AS TRAN_LOTNO,PSGR_MO, \n"
//                    + "FLOOR(((JULIANDAY(SUBSTR('" + date + "',0,5)||\"-\"||SUBSTR('" + date + "',5,2)||\"-\"||SUBSTR('" + date + "',7,2))- JULIANDAY(SUBSTR(PSGR_DATE,7)||\"-\"||SUBSTR(PSGR_DATE,4,2)||\"-\"||SUBSTR(PSGR_DATE,1,2))) / 7) +1) AS INLAY, \n"
//                    + "CEIL(((JULIANDAY(SUBSTR('" + date + "',0,5)||\"-\"||SUBSTR('" + date + "',5,2)||\"-\"||SUBSTR('" + date + "',7,2)) - JULIANDAY(SUBSTR(FLOC_STWEEK,7)||\"-\"||SUBSTR(FLOC_STWEEK,4,2)||\"-\"||SUBSTR(FLOC_STWEEK,1,2))) / 7) +1) AS WEEK ,\n"
//                    + "COALESCE(SUM(CASE WHEN TRAN_ITEM = '" + hcg001 + "' THEN TRAN_QTY END),0) AS HCG001,\n"
//                    + "COALESCE(SUM(CASE WHEN TRAN_ITEM = '" + hcd002 + "' THEN TRAN_QTY END),0) AS HCD002,\n"
//                    + "COALESCE(SUM(CASE WHEN TRAN_ITEM = '" + hcs003 + "' THEN TRAN_QTY END),0) AS HCS003,\n"
//                    + "COALESCE(SUM(CASE WHEN TRAN_ITEM = '" + hcc004 + "' THEN TRAN_QTY END),0) AS HCC004\n"
//                    + "FROM FAR_FLOCK," + db + ",FAR_DTRANSECTION,FAR_MITEM,FAR_MTYPE,FAR_MPENE\n"
//                    + "WHERE TRAN_FARM = '" + farm + "'\n"
//                    + "AND TRAN_BREED = '" + breed + "'\n"
//                    + "AND SUBSTR(TRAN_LOTNO,14,16) = '" + lotdate + "'\n"
//                    + "AND TRAN_FARM = FLOC_FARM\n"
//                    + "AND TRAN_FARM = PSGR_FARM\n"
//                    + "AND TRAN_FARM = ITEM_FARM\n"
//                    + "AND TRAN_FARM = TYPE_FARM\n"
//                    + "AND TRAN_FARM = PENE_FARM\n"
//                    + "AND TRAN_BREED = FLOC_BREED\n"
//                    + "AND TRAN_BREED = PSGR_BREED\n"
//                    + "AND TRAN_HOUSE BETWEEN '" + starthouse + "' AND '" + endhouse + "'\n"
//                    + "AND TRAN_TYPE = 'ISS'\n"
//                    + "AND TYPE_CODE = TRAN_TYPE\n"
//                    + "AND TRAN_DESC = 'HC'\n"
//                    + "AND PENE_CODE =  TRAN_DESC\n"
//                    + "AND TRAN_ITEM = ITEM_CODE\n"
//                    + "AND TRAN_ITEM IN ('" + hcg001 + "','" + hcd002 + "','" + hcs003 + "','" + hcc004 + "')\n"
//                    + "AND FLOC_STATUS = '1'\n"
//                    + "AND FLOC_CODE = PSGR_FLOCK\n"
//                    + "AND PSGR_HOUSE = SUBSTR(TRAN_LOTNO,7,6)\n"
//                    + "AND SUBSTR(TRAN_DATE,7) || SUBSTR(TRAN_DATE,4,2) || SUBSTR(TRAN_DATE,1,2) = '" + date + "'\n"
//                    + "GROUP BY TRAN_HOUSE,SUBSTR(TRAN_LOTNO,0,13)) as a\n"
//                    + "LEFT JOIN \n"
//                    + "(SELECT COALESCE(SUM(TRAN_QTY*-1),0) as BESUM ,TRAN_LOTNO as Blot,COALESCE(SUM(CASE WHEN TRAN_ITEM = '" + hcg001 + "' THEN TRAN_QTY*-1 END),0) AS BEHCG001,\n"
//                    + "COALESCE(SUM(CASE WHEN TRAN_ITEM = '" + hcd002 + "' THEN TRAN_QTY*-1 END),0) AS BEHCD002,\n"
//                    + "COALESCE(SUM(CASE WHEN TRAN_ITEM = '" + hcs003 + "' THEN TRAN_QTY*-1 END),0) AS BEHCS003,\n"
//                    + "COALESCE(SUM(CASE WHEN TRAN_ITEM = '" + hcc004 + "' THEN TRAN_QTY*-1 END),0) AS BEHCC004\n"
//                    + "From FAR_MTRANSECTION where TRAN_TYPE = 'BE' GROUP BY TRAN_LOTNO) as b\n"
//                    + "ON b.Blot = a.TRAN_LOTNO";
            ResultSet rs = sta.executeQuery(Sql);

            while (rs.next()) {
                getListDiseMInform.add(
                        rs.getString("FLOC_DESC").trim() + " ; "
                        + rs.getString("TRAN_HOUSE").trim() + " ; "
                        + rs.getString("FLOC_CODE").trim() + " ; "
                        + rs.getString("PSGR_DATE").trim() + " ; "
                        + rs.getString("WEEK").trim() + " ; "
                        + rs.getString("INLAY").trim() + " ; "
                        + rs.getString("TRAN_LOTNO").trim() + " ; "
                        + rs.getString("QTY").trim() + " ; "
                        + rs.getString("HCG001").trim() + " ; "
                        + rs.getString("HCD002").trim() + " ; "
                        + rs.getString("HCS003").trim() + " ; "
                        + rs.getString("HCC004").trim() + " ; "
                        + rs.getString("CULLQTY").trim());
            }
            return getListDiseMInform;

        } catch (Exception ex) {
            System.out.println(ex.toString());
        } finally {
            if (conn != null) {
                try {
                    conn.close();
                } catch (SQLException ex) {
                    System.out.println(ex.toString());
                }
            }
        }
        return null;
    }

    public List<String> GetResultEggTransfer_bac080321(String farm, String date, String starthouse, String endhouse, String hcg001, String hcd002, String hcs003, String hcc004, String breed, String db) {

        List<String> getListDiseMInform = new ArrayList<String>();
        Connection conn = null;
        try {
            conn = ConnectSQLite.ConnectionSQLite();
            Statement sta = conn.createStatement();
            String Sql = "SELECT FLOC_DESC,TRAN_HOUSE,FLOC_CODE,PSGR_DATE,WEEK,CASE WHEN WEEK >= 24 THEN WEEK - 23 ELSE 0 END AS INLAY,TRAN_LOTNO,PSGR_MO,HCG001 + HCD002 + HCS003 + HCC004 AS QTY,HCG001,HCD002,HCS003,HCC004,HCD002 + HCS003 + HCC004 AS CULLQTY\n"
                    + "FROM\n"
                    + "(SELECT DISTINCT FLOC_BREED,FLOC_DESC,TRAN_HOUSE,FLOC_CODE,PSGR_DATE,SUBSTR(TRAN_LOTNO,0,13) AS TRAN_LOTNO,PSGR_MO,FLOOR(((JULIANDAY(SUBSTR('20191128',0,5)||\"-\"||SUBSTR('20191128',5,2)||\"-\"||SUBSTR('20191128',7,2)) \n"
                    + "- JULIANDAY(SUBSTR(PSGR_DATE,7)||\"-\"||SUBSTR(PSGR_DATE,4,2)||\"-\"||SUBSTR(PSGR_DATE,1,2))) / 7) +1) AS INLAY, \n"
                    + "CEIL(((JULIANDAY(SUBSTR(PSGR_DATE,7)||\"-\"||SUBSTR(PSGR_DATE,4,2)||\"-\"||SUBSTR(PSGR_DATE,1,2)) - JULIANDAY(SUBSTR(FLOC_STWEEK,7)||\"-\"||SUBSTR(FLOC_STWEEK,4,2)||\"-\"||SUBSTR(FLOC_STWEEK,1,2))) / 7) +1) AS WEEK,\n"
                    + "COALESCE(SUM(CASE WHEN TRAN_ITEM = '" + hcg001 + "' THEN TRAN_QTY END),0) AS HCG001,\n"
                    + "COALESCE(SUM(CASE WHEN TRAN_ITEM = '" + hcd002 + "' THEN TRAN_QTY END),0) AS HCD002,\n"
                    + "COALESCE(SUM(CASE WHEN TRAN_ITEM = '" + hcs003 + "' THEN TRAN_QTY END),0) AS HCS003,\n"
                    + "COALESCE(SUM(CASE WHEN TRAN_ITEM = '" + hcc004 + "' THEN TRAN_QTY END),0) AS HCC004\n"
                    + "FROM FAR_FLOCK," + db + ",FAR_DTRANSECTION,FAR_MITEM,FAR_MTYPE,FAR_MPENE\n"
                    + "WHERE TRAN_FARM = '" + farm + "'\n"
                    + "AND TRAN_BREED = '" + breed + "'\n"
                    + "AND TRAN_FARM = FLOC_FARM\n"
                    + "AND TRAN_FARM = PSGR_FARM\n"
                    + "AND TRAN_FARM = ITEM_FARM\n"
                    + "AND TRAN_FARM = TYPE_FARM\n"
                    + "AND TRAN_FARM = PENE_FARM\n"
                    + "AND TRAN_BREED = FLOC_BREED\n"
                    + "AND TRAN_BREED = PSGR_BREED\n"
                    + "AND TRAN_HOUSE BETWEEN '" + starthouse + "' AND '" + endhouse + "'\n"
                    + "AND TRAN_TYPE = 'ISS'\n"
                    + "AND TYPE_CODE = TRAN_TYPE\n"
                    + "AND TRAN_DESC = 'HC'\n"
                    + "AND PENE_CODE =  TRAN_DESC\n"
                    + "AND TRAN_ITEM = ITEM_CODE\n"
                    + "AND TRAN_ITEM IN ('" + hcg001 + "','" + hcd002 + "','" + hcs003 + "','" + hcc004 + "')\n"
                    + "AND FLOC_STATUS = '1'\n"
                    + "AND FLOC_CODE = PSGR_FLOCK\n"
                    + "AND PSGR_HOUSE = SUBSTR(TRAN_LOTNO,7,6)\n"
                    + "AND SUBSTR(TRAN_DATE,7) || SUBSTR(TRAN_DATE,4,2) || SUBSTR(TRAN_DATE,1,2) = '" + date + "'\n"
                    + "GROUP BY TRAN_HOUSE,SUBSTR(TRAN_LOTNO,0,13))";
            ResultSet rs = sta.executeQuery(Sql);

            while (rs.next()) {
                getListDiseMInform.add(
                        rs.getString("FLOC_DESC").trim() + " ; "
                        + rs.getString("TRAN_HOUSE").trim() + " ; "
                        + rs.getString("FLOC_CODE").trim() + " ; "
                        + rs.getString("PSGR_DATE").trim() + " ; "
                        + rs.getString("WEEK").trim() + " ; "
                        + rs.getString("INLAY").trim() + " ; "
                        + rs.getString("TRAN_LOTNO").trim() + " ; "
                        + rs.getString("QTY").trim() + " ; "
                        + rs.getString("HCG001").trim() + " ; "
                        + rs.getString("HCD002").trim() + " ; "
                        + rs.getString("HCS003").trim() + " ; "
                        + rs.getString("HCC004").trim() + " ; "
                        + rs.getString("CULLQTY").trim());
            }
            return getListDiseMInform;

        } catch (Exception ex) {
            System.out.println(ex.toString());
        } finally {
            if (conn != null) {
                try {
                    conn.close();
                } catch (SQLException ex) {
                    System.out.println(ex.toString());
                }
            }
        }
        return null;
    }

    //BF01R002 M3 TransectionReport
    public List<String> GetResultM3TransectionReport(String farm, String startdate, String enddate, String breed, String breedall) {

        List<String> getListM3TransectionReport = new ArrayList<String>();
        Connection conn = null;
        try {
            conn = ConnectSQLite.ConnectionSQLite();
            Statement sta = conn.createStatement();
            String Sql = "SELECT TRAN_FARM,TRAN_HOUSE,TRAN_DATE,HOUS_LASTMO,TRAN_ITEM,ITEM_UNIT,TRAN_TYPE,TRAN_LOTNO,TRAN_QTY,WEEK\n"
                    + "FROM \n"
                    + "(SELECT DISTINCT TRAN_FARM,TRAN_HOUSE,TRAN_DATE,HOUS_LASTMO,TRAN_ITEM,ITEM_UNIT,TRAN_TYPE,\n"
                    + "COALESCE(CASE WHEN TRAN_TYPE = 'WOM' THEN TRAN_LOTNO = NULL ELSE TRAN_LOTNO END,'') AS TRAN_LOTNO,\n"
                    + "SUM(CASE WHEN TYPE_PROPERTY = '0' THEN TRAN_QTY * -1 ELSE TRAN_QTY END) AS TRAN_QTY,\n"
                    + "CEIL(((JULIANDAY(SUBSTR(TRAN_DATE,7)||\"-\"||SUBSTR(TRAN_DATE,4,2)||\"-\"||SUBSTR(TRAN_DATE,1,2)) - JULIANDAY(SUBSTR(FLOC_STWEEK,7)||\"-\"||SUBSTR(FLOC_STWEEK,4,2)||\"-\"||SUBSTR(FLOC_STWEEK,1,2))) / 7) +1) AS WEEK\n"
                    + "FROM FAR_MTRANSECTION,FAR_MHOUSE,FAR_FLOCK,FAR_GROWER,FAR_MITEM,FAR_MTYPE\n"
                    + "WHERE TRAN_FARM = '" + farm + "'\n"
                    + "AND TRAN_BREED = '" + breed + "' \n"
                    + "AND HOUS_FARM = TRAN_FARM\n"
                    + "AND HOUS_BREED = TRAN_BREED\n"
                    + "AND HOUS_CODE = TRAN_HOUSE\n"
                    + "AND FLOC_FARM = TRAN_FARM\n"
                    + "AND FLOC_BREED = TRAN_BREED\n"
                    + "AND PSGR_FLOCK = FLOC_CODE\n"
                    + "AND PSGR_HOUSE = HOUS_CODE\n"
                    + "AND ITEM_FARM = TRAN_FARM\n"
                    + "AND ITEM_CODE = TRAN_ITEM\n"
                    + "AND HOUS_LASTMO = PSGR_MO\n"
                    + "AND TYPE_FARM = TRAN_FARM\n"
                    + "AND TYPE_CODE = TRAN_TYPE\n"
                    + "AND FLOC_STATUS = '1'\n"
                    + "AND SUBSTR(TRAN_DATE,7) || SUBSTR(TRAN_DATE,4,2) || SUBSTR(TRAN_DATE,1,2) BETWEEN '" + startdate + "' AND '" + enddate + "'\n"
                    + "GROUP BY TRAN_FARM,TRAN_HOUSE,TRAN_DATE,HOUS_LASTMO,TRAN_ITEM,ITEM_UNIT,TRAN_TYPE,TRAN_LOTNO,PSGR_FROM\n"
                    + "ORDER BY TRAN_FARM,SUBSTR(TRAN_DATE,7) || SUBSTR(TRAN_DATE,4,2) || SUBSTR(TRAN_DATE,1,2),TRAN_HOUSE,TRAN_TYPE,TRAN_ITEM,TRAN_LOTNO)\n"
                    + "WHERE TRAN_QTY > 0\n"
                    + "UNION ALL\n"
                    + "SELECT DISTINCT TRAN_FARM,TRAN_HOUSE,TRAN_DATE,HOUS_LASTMO,TRAN_ITEM,ITEM_UNIT,TRAN_TYPE,TRAN_LOTNO,TRAN_QTY,WEEK\n"
                    + "FROM \n"
                    + "(SELECT TRAN_FARM,TRAN_HOUSE,TRAN_DATE,HOUS_LASTMO,TRAN_ITEM,ITEM_UNIT,TRAN_TYPE,\n"
                    + "COALESCE(CASE WHEN TRAN_TYPE = 'WOM' THEN TRAN_LOTNO = NULL ELSE TRAN_LOTNO END,'') AS TRAN_LOTNO,\n"
                    + "SUM(CASE WHEN TRAN_TYPE = 'WOM' THEN TRAN_QTY * -1 ELSE TRAN_QTY END) AS TRAN_QTY,\n"
                    + "CEIL(((JULIANDAY(SUBSTR(TRAN_DATE,7)||\"-\"||SUBSTR(TRAN_DATE,4,2)||\"-\"||SUBSTR(TRAN_DATE,1,2)) - JULIANDAY(SUBSTR(FLOC_STWEEK,7)||\"-\"||SUBSTR(FLOC_STWEEK,4,2)||\"-\"||SUBSTR(FLOC_STWEEK,1,2))) / 7) +1) AS WEEK\n"
                    + "FROM FAR_MTRANSECTION,FAR_MHOUSE,FAR_FLOCK,FAR_GROWERMT,FAR_MITEM\n"
                    + "WHERE TRAN_FARM = '" + farm + "'\n"
                    + "AND TRAN_BREED = '" + breed + "' \n"
                    + "AND HOUS_FARM = TRAN_FARM\n"
                    + "AND HOUS_BREED = TRAN_BREED\n"
                    + "AND HOUS_CODE = TRAN_HOUSE\n"
                    + "AND FLOC_FARM = TRAN_FARM\n"
                    + "AND FLOC_BREED = TRAN_BREED\n"
                    + "AND PSGR_FLOCK = FLOC_CODE\n"
                    + "AND PSGR_HOUSE = HOUS_CODE\n"
                    + "AND ITEM_FARM = TRAN_FARM\n"
                    + "AND ITEM_CODE = TRAN_ITEM\n"
                    + "AND HOUS_LASTMO = PSGR_MO\n"
                    + "AND FLOC_STATUS = '1'\n"
                    + "AND SUBSTR(TRAN_DATE,7) || SUBSTR(TRAN_DATE,4,2) || SUBSTR(TRAN_DATE,1,2) BETWEEN '" + startdate + "' AND '" + enddate + "'\n"
                    + "GROUP BY TRAN_FARM,TRAN_HOUSE,TRAN_DATE,HOUS_LASTMO,TRAN_ITEM,ITEM_UNIT,TRAN_TYPE,TRAN_LOTNO,PSGR_FROM\n"
                    + "ORDER BY TRAN_FARM,SUBSTR(TRAN_DATE,7) || SUBSTR(TRAN_DATE,4,2) || SUBSTR(TRAN_DATE,1,2),TRAN_HOUSE,TRAN_TYPE,TRAN_ITEM,TRAN_LOTNO)\n"
                    + "WHERE TRAN_QTY > 0\n"
                    + "UNION ALL\n"
                    + "SELECT DISTINCT TRAN_FARM,TRAN_HOUSE,TRAN_DATE,HOUS_LASTMO,TRAN_ITEM,ITEM_UNIT,TRAN_TYPE,TRAN_LOTNO,TRAN_QTY,WEEK\n"
                    + "FROM \n"
                    + "(SELECT TRAN_FARM,TRAN_HOUSE,TRAN_DATE,HOUS_LASTMO,TRAN_ITEM,ITEM_UNIT,TRAN_TYPE,\n"
                    + "COALESCE(CASE WHEN TRAN_TYPE = 'WOM' THEN TRAN_LOTNO = NULL ELSE TRAN_LOTNO END,'') AS TRAN_LOTNO,\n"
                    + "SUM(CASE WHEN TRAN_TYPE = 'WOM' THEN TRAN_QTY * -1 ELSE TRAN_QTY END) AS TRAN_QTY,\n"
                    + "CEIL(((JULIANDAY(SUBSTR(TRAN_DATE,7)||\"-\"||SUBSTR(TRAN_DATE,4,2)||\"-\"||SUBSTR(TRAN_DATE,1,2)) - JULIANDAY(SUBSTR(FLOC_STWEEK,7)||\"-\"||SUBSTR(FLOC_STWEEK,4,2)||\"-\"||SUBSTR(FLOC_STWEEK,1,2))) / 7) +1) AS WEEK\n"
                    + "FROM FAR_MTRANSECTION,FAR_MHOUSE,FAR_FLOCK,FAR_LAYING,FAR_MITEM\n"
                    + "WHERE TRAN_FARM = '" + farm + "'\n"
                    + "AND TRAN_BREED = '" + breed + "' \n"
                    + "AND HOUS_FARM = TRAN_FARM\n"
                    + "AND HOUS_BREED = TRAN_BREED\n"
                    + "AND HOUS_CODE = TRAN_HOUSE\n"
                    + "AND FLOC_FARM = TRAN_FARM\n"
                    + "AND FLOC_BREED = TRAN_BREED\n"
                    + "AND PSGR_FLOCK = FLOC_CODE\n"
                    + "AND PSGR_HOUSE = HOUS_CODE\n"
                    + "AND ITEM_FARM = TRAN_FARM\n"
                    + "AND ITEM_CODE = TRAN_ITEM\n"
                    + "AND HOUS_LASTMO = PSGR_MO\n"
                    + "AND FLOC_STATUS = '1'\n"
                    + "AND SUBSTR(TRAN_DATE,7) || SUBSTR(TRAN_DATE,4,2) || SUBSTR(TRAN_DATE,1,2) BETWEEN '" + startdate + "' AND '" + enddate + "'\n"
                    + "GROUP BY TRAN_FARM,TRAN_HOUSE,TRAN_DATE,HOUS_LASTMO,TRAN_ITEM,ITEM_UNIT,TRAN_TYPE,TRAN_LOTNO,PSGR_FROM\n"
                    + "ORDER BY TRAN_FARM,SUBSTR(TRAN_DATE,7) || SUBSTR(TRAN_DATE,4,2) || SUBSTR(TRAN_DATE,1,2),TRAN_HOUSE,TRAN_TYPE,TRAN_ITEM,TRAN_LOTNO)\n"
                    + "WHERE TRAN_QTY > 0\n"
                    + "UNION ALL\n"
                    + "SELECT DISTINCT TRAN_FARM,TRAN_HOUSE,TRAN_DATE,HOUS_LASTMO,TRAN_ITEM,ITEM_UNIT,TRAN_TYPE,TRAN_LOTNO,TRAN_QTY,WEEK\n"
                    + "FROM \n"
                    + "(SELECT TRAN_FARM,TRAN_HOUSE,TRAN_DATE,HOUS_LASTMO,TRAN_ITEM,ITEM_UNIT,TRAN_TYPE,\n"
                    + "COALESCE(CASE WHEN TRAN_TYPE = 'WOM' THEN TRAN_LOTNO = NULL ELSE TRAN_LOTNO END,'') AS TRAN_LOTNO,\n"
                    + "SUM(CASE WHEN TRAN_TYPE = 'WOM' THEN TRAN_QTY * -1 ELSE TRAN_QTY END) AS TRAN_QTY,\n"
                    + "CEIL(((JULIANDAY(SUBSTR(TRAN_DATE,7)||\"-\"||SUBSTR(TRAN_DATE,4,2)||\"-\"||SUBSTR(TRAN_DATE,1,2)) - JULIANDAY(SUBSTR(FLOC_STWEEK,7)||\"-\"||SUBSTR(FLOC_STWEEK,4,2)||\"-\"||SUBSTR(FLOC_STWEEK,1,2))) / 7) +1) AS WEEK\n"
                    + "FROM FAR_MTRANSECTION,FAR_MHOUSE,FAR_FLOCK,FAR_LAYINGMT,FAR_MITEM\n"
                    + "WHERE TRAN_FARM = '" + farm + "'\n"
                    + "AND TRAN_BREED = '" + breed + "' \n"
                    + "AND HOUS_FARM = TRAN_FARM\n"
                    + "AND HOUS_BREED = TRAN_BREED\n"
                    + "AND HOUS_CODE = TRAN_HOUSE\n"
                    + "AND FLOC_FARM = TRAN_FARM\n"
                    + "AND FLOC_BREED = TRAN_BREED\n"
                    + "AND PSGR_FLOCK = FLOC_CODE\n"
                    + "AND PSGR_HOUSE = HOUS_CODE\n"
                    + "AND ITEM_FARM = TRAN_FARM\n"
                    + "AND ITEM_CODE = TRAN_ITEM\n"
                    + "AND HOUS_LASTMO = PSGR_MO\n"
                    + "AND FLOC_STATUS = '1'\n"
                    + "AND SUBSTR(TRAN_DATE,7) || SUBSTR(TRAN_DATE,4,2) || SUBSTR(TRAN_DATE,1,2) BETWEEN '" + startdate + "' AND '" + enddate + "'\n"
                    + "GROUP BY TRAN_FARM,TRAN_HOUSE,TRAN_DATE,HOUS_LASTMO,TRAN_ITEM,ITEM_UNIT,TRAN_TYPE,TRAN_LOTNO,PSGR_FROM\n"
                    + "ORDER BY TRAN_FARM,SUBSTR(TRAN_DATE,7) || SUBSTR(TRAN_DATE,4,2) || SUBSTR(TRAN_DATE,1,2),TRAN_HOUSE,TRAN_TYPE,TRAN_ITEM,TRAN_LOTNO)\n"
                    + "WHERE TRAN_QTY > 0";

            ResultSet rs = sta.executeQuery(Sql);

            while (rs.next()) {
                getListM3TransectionReport.add(
                        rs.getString("TRAN_FARM").trim() + " ; "
                        + rs.getString("TRAN_HOUSE").trim() + " ; "
                        + rs.getString("TRAN_DATE").trim() + " ; "
                        + rs.getString("HOUS_LASTMO").trim() + " ; "
                        + rs.getString("TRAN_ITEM").trim() + " ; "
                        + rs.getString("TRAN_LOTNO").trim() + " ; "
                        + rs.getString("TRAN_QTY").trim() + " ; "
                        + rs.getString("ITEM_UNIT").trim() + " ; "
                        + rs.getString("TRAN_TYPE").trim() + " ; "
                        + rs.getString("WEEK").trim());
            }
            return getListM3TransectionReport;

        } catch (Exception ex) {
            System.out.println(ex.toString());
        } finally {
            if (conn != null) {
                try {
                    conn.close();
                } catch (SQLException ex) {
                    System.out.println(ex.toString());
                }
            }
        }
        return null;
    }

    //BF01R018 Performance Report
    public List<String> GetResultPerformanceReport(String farm, String startdate, String enddate, String hcg2001, String hcg3001, String breed, String breedall) {

        List<String> getListM3TransectionReport = new ArrayList<String>();
        Connection conn = null;
        try {
            conn = ConnectSQLite.ConnectionSQLite();
            Statement sta = conn.createStatement();
            String Sql = "SELECT DISTINCT *\n"
                    + "FROM \n"
                    + "(SELECT a.TRAN_HOUSE,PSGR_FLOCK,FLOC_DESC,M_SEX,REC_DATE,WEEK,SM_PCF + SM_PCM AS SM_CUll,SM_PDF + SM_PDM AS SM_DEAD,SM_FM010 + SM_FM020 + SM_FM030 + SM_FM040 + SM_FM050 AS SM_FEED,COALESCE(BAL_PSF,0) AS BAL_PSF,COALESCE(BAL_PSM,0) AS BAL_PSM,\n"
                    + "COALESCE(ROUND(CASE WHEN M_SEX = '0' AND WEEK BETWEEN 1 AND 100 THEN (BAL_PSF / REC_DOD) * 100 END,2),'0') AS PC_LIVED,\n"
                    + "COALESCE(ROUND(CASE WHEN FARM_FAX = 'EH' AND WEEK BETWEEN 1 AND 100 THEN MSTD_LEH \n"
                    + "WHEN FARM_FAX = 'ON' AND WEEK BETWEEN 1 AND 100 THEN MSTD_LON\n"
                    + "WHEN FARM_FAX = 'OE' AND WEEK BETWEEN 1 AND 100 THEN MSTD_LOE END,2),0) AS STD_LIVED,\n"
                    + "COALESCE(ROUND((CASE WHEN M_SEX = '0' AND WEEK BETWEEN 1 AND 100 THEN (BAL_PSF / REC_DOD) * 100 END / \n"
                    + "CASE WHEN FARM_FAX = 'EH' AND WEEK BETWEEN 1 AND 100 THEN MSTD_LEH \n"
                    + "WHEN FARM_FAX = 'ON' AND WEEK BETWEEN 1 AND 100 THEN MSTD_LON\n"
                    + "WHEN FARM_FAX = 'OE' AND WEEK BETWEEN 1 AND 100 THEN MSTD_LOE END) * 100,2),0) AS PC_STDLIVED,\n"
                    + "SM_HCG + SM_HCS + SM_HCD + SM_HCC AS SM_HC,COALESCE((SM_HCG + SM_HCS + SM_HCD + SM_HCC) / BAL_PSF,0) AS PC_HC,\n"
                    + "COALESCE(ROUND(CASE WHEN FARM_FAX = 'EH' AND WEEK BETWEEN 1 AND 100 THEN MSTD_HEH \n"
                    + "WHEN FARM_FAX = 'ON' AND WEEK BETWEEN 1 AND 100 THEN MSTD_HON\n"
                    + "WHEN FARM_FAX = 'OE' AND WEEK BETWEEN 1 AND 100 THEN MSTD_HOE END,2),0) AS STD_HC,\n"
                    + "COALESCE(ROUND(((SM_HCG + SM_HCS + SM_HCD + SM_HCC) / BAL_PSF / \n"
                    + "CASE WHEN FARM_FAX = 'EH' AND WEEK BETWEEN 1 AND 100 THEN MSTD_HEH \n"
                    + "WHEN FARM_FAX = 'ON' AND WEEK BETWEEN 1 AND 100 THEN MSTD_HON\n"
                    + "WHEN FARM_FAX = 'OE' AND WEEK BETWEEN 1 AND 100 THEN MSTD_HOE END) * 100,2),0) AS PC_STDHC,\n"
                    + "COALESCE(ROUND((((SM_FM010 + SM_FM020 + SM_FM030 + SM_FM040 + SM_FM050) * 1000) / (BAL_PSF + BAL_PSM + SM_PCF + SM_PCM + SM_PDF + SM_PDM)) / SUM_DAY,2),0) AS GDD,\n"
                    + "SM_HCG + SM_HCS + SM_HCD + SM_HCC AS SM_HC,((SM_HCG + SM_HCS + SM_HCD + SM_HCC) * 100) AS PC_HC,\n"
                    + "COALESCE(SUM_W_HCG / SUM_DAY,0) AS W_HCG,\n"
                    + "COALESCE(ROUND(((SM_PCF + SM_PDF) * 100) / (BAL_PSF + SM_PCF+ SM_PDF),2),0) AS LOSS_PSF\n"
                    + "FROM\n"
                    + "(SELECT DISTINCT TRAN_HOUSE,PSGR_FLOCK,FLOC_DESC,SUBSTR(TRAN_HOUSE,3,1) AS M_SEX,FLOC_STDATE AS REC_DATE,\n"
                    + "CEIL(((JULIANDAY(SUBSTR('" + enddate + "',0,5)||\"-\"||SUBSTR('" + enddate + "',5,2)||\"-\"||SUBSTR('" + enddate + "',7,2)) - JULIANDAY(SUBSTR(FLOC_STWEEK,7)||\"-\"||SUBSTR(FLOC_STWEEK,4,2)||\"-\"||SUBSTR(FLOC_STWEEK,1,2))) / 7) +1) AS WEEK,\n"
                    + "ROUND((JULIANDAY(SUBSTR('" + enddate + "',0,5)||\"-\"||SUBSTR('" + enddate + "',5,2)||\"-\"||SUBSTR('" + enddate + "',7,2)) +1) - JULIANDAY(SUBSTR('" + startdate + "',0,5)||\"-\"||SUBSTR('" + startdate + "',5,2)||\"-\"||SUBSTR('" + startdate + "',7,2))) AS SUM_DAY\n"
                    + "FROM FAR_MTRANSECTION,FAR_GROWER,FAR_FLOCK,FAR_MHOUSE\n"
                    + "WHERE TRAN_FARM = '" + farm + "'\n"
                    + "AND TRAN_BREED = '" + breed + "'\n"
                    + "AND SUBSTR(TRAN_HOUSE,4) NOT IN ('201','301')\n"
                    + "AND TRAN_HOUSE = PSGR_HOUSE\n"
                    + "AND PSGR_MO <> ''\n"
                    + "AND PSGR_FLOCK = FLOC_CODE\n"
                    + "AND FLOC_STATUS = '1'\n"
                    + "AND HOUS_FARM = TRAN_FARM\n"
                    + "AND HOUS_BREED = TRAN_BREED\n"
                    + "AND HOUS_LASTMO = PSGR_MO\n"
                    + "AND SUBSTR(TRAN_DATE,7) || SUBSTR(TRAN_DATE,4,2) || SUBSTR(TRAN_DATE,1,2) BETWEEN '" + startdate + "' AND '" + enddate + "'\n"
                    + "ORDER BY TRAN_HOUSE) AS a\n"
                    + "LEFT JOIN\n"
                    + "(SELECT INVE_HOUSE,\n"
                    + "SUM(CASE WHEN ITEM_GROUP = 'PSF' THEN INVE_BALANCE ELSE 0 END ) AS BAL_PSF,\n"
                    + "SUM(CASE WHEN ITEM_GROUP = 'PSM' THEN INVE_BALANCE ELSE 0 END ) AS BAL_PSM\n"
                    + "FROM FAR_DINVENBAL,FAR_MITEM\n"
                    + "WHERE INVE_FARM = '" + farm + "' \n"
                    + "AND INVE_BREED IN ('" + breed + "','" + breedall + "')\n"
                    + "AND INVE_ITEM = ITEM_CODE\n"
                    + "AND SUBSTR(INVE_DATE,7) || SUBSTR(INVE_DATE,4,2) || SUBSTR(INVE_DATE,1,2) = '" + enddate + "'\n"
                    + "GROUP BY INVE_HOUSE) AS b\n"
                    + "ON a.TRAN_HOUSE = b.INVE_HOUSE\n"
                    + "LEFT JOIN\n"
                    + "(SELECT TRAN_HOUSE,\n"
                    + "SUM(CASE WHEN TRAN_TYPE = 'WOM' AND TRAN_ITEM = 'FM110010' THEN TRAN_QTY * -1 ELSE 0 END ) AS SM_FM010,\n"
                    + "SUM(CASE WHEN TRAN_TYPE = 'WOM' AND TRAN_ITEM = 'FM110020' THEN TRAN_QTY * -1 ELSE 0 END ) AS SM_FM020,\n"
                    + "SUM(CASE WHEN TRAN_TYPE = 'WOM' AND TRAN_ITEM = 'FM110030' THEN TRAN_QTY * -1 ELSE 0 END ) AS SM_FM030,\n"
                    + "SUM(CASE WHEN TRAN_TYPE = 'WOM' AND TRAN_ITEM = 'FM110040' THEN TRAN_QTY * -1 ELSE 0 END ) AS SM_FM040,\n"
                    + "SUM(CASE WHEN TRAN_TYPE = 'WOM' AND TRAN_ITEM = 'FM110050' THEN TRAN_QTY * -1 ELSE 0 END ) AS SM_FM050,\n"
                    + "SUM(CASE WHEN TRAN_TYPE = 'WOP' AND ITEM_GROUP = 'PCF' THEN TRAN_QTY ELSE 0 END ) AS SM_PCF,\n"
                    + "SUM(CASE WHEN TRAN_TYPE = 'WOP' AND ITEM_GROUP = 'PCM' THEN TRAN_QTY ELSE 0 END ) AS SM_PCM,\n"
                    + "SUM(CASE WHEN TRAN_TYPE = 'WOP' AND ITEM_GROUP = 'PDF' THEN TRAN_QTY ELSE 0 END ) AS SM_PDF,\n"
                    + "SUM(CASE WHEN TRAN_TYPE = 'WOP' AND ITEM_GROUP = 'PDM' THEN TRAN_QTY ELSE 0 END ) AS SM_PDM,\n"
                    + "SUM(CASE WHEN TRAN_TYPE = 'WOP' AND ITEM_GROUP = 'HCG' THEN TRAN_QTY ELSE 0 END ) AS SM_HCG,\n"
                    + "SUM(CASE WHEN TRAN_TYPE = 'WOP' AND ITEM_GROUP = 'HCS' THEN TRAN_QTY ELSE 0 END ) AS SM_HCS,\n"
                    + "SUM(CASE WHEN TRAN_TYPE = 'WOP' AND ITEM_GROUP = 'HCD' THEN TRAN_QTY ELSE 0 END ) AS SM_HCD,\n"
                    + "SUM(CASE WHEN TRAN_TYPE = 'WOP' AND ITEM_GROUP = 'HCC' THEN TRAN_QTY ELSE 0 END ) AS SM_HCC\n"
                    + "FROM FAR_MTRANSECTION,FAR_MITEM\n"
                    + "WHERE TRAN_FARM = '" + farm + "'\n"
                    + "AND TRAN_BREED = '" + breed + "'\n"
                    + "AND TRAN_FARM = ITEM_FARM\n"
                    + "AND TRAN_ITEM = ITEM_CODE\n"
                    + "AND SUBSTR(TRAN_DATE,7) || SUBSTR(TRAN_DATE,4,2) || SUBSTR(TRAN_DATE,1,2) BETWEEN '" + startdate + "' AND '" + enddate + "'\n"
                    + "GROUP BY TRAN_HOUSE) AS c\n"
                    + "ON a.TRAN_HOUSE = c.TRAN_HOUSE\n"
                    + "LEFT JOIN\n"
                    + "(SELECT PSGR_HOUSE,CASE WHEN SUBSTR(PSGR_HOUSE,3,1) %2 = 0 THEN PSGR_FEMALE ELSE PSGR_MALE END AS REC_DOD\n"
                    + "FROM FAR_FLOCK,FAR_GROWER\n"
                    + "WHERE FLOC_FARM = '" + farm + "'\n"
                    + "AND FLOC_BREED = '" + breed + "'\n"
                    + "AND FLOC_FARM = PSGR_FARM \n"
                    + "AND FLOC_BREED = PSGR_BREED\n"
                    + "AND PSGR_FLOCK = FLOC_CODE\n"
                    + "AND FLOC_STATUS = '1') AS d\n"
                    + "ON a.TRAN_HOUSE = d.PSGR_HOUSE\n"
                    + "LEFT JOIN\n"
                    + "(SELECT FARM_FAX,MSTD_AGE,MSTD_LEH,MSTD_LON,MSTD_LOE,MSTD_HEH,MSTD_HON,MSTD_HOE\n"
                    + "FROM FAR_MSTD,FAR_MFARM\n"
                    + "WHERE MSTD_FARM = '" + farm + "'\n"
                    + "AND MSTD_BREED = '" + breed + "'\n"
                    + "AND MSTD_FARM = FARM_CODE\n"
                    + "AND MSTD_SEX = 'F') AS e\n"
                    + "ON a.WEEK = e.MSTD_AGE\n"
                    + "LEFT JOIN\n"
                    + "(SELECT INFO_HOUSE,SUM(CASE WHEN INFO_ITEM IN ('" + hcg2001 + "','" + hcg3001 + "') AND INFO_DISE = 'W01' THEN INFO_QTY ELSE 0 END) AS SUM_W_HCG\n"
                    + "FROM FAR_MINFORM\n"
                    + "WHERE INFO_FARM = '" + farm + "'\n"
                    + "AND INFO_BREED = '" + breed + "'\n"
                    + "AND SUBSTR(INFO_DATE,7) || SUBSTR(INFO_DATE,4,2) || SUBSTR(INFO_DATE,1,2) BETWEEN '" + startdate + "' AND '" + enddate + "'\n"
                    + "GROUP BY INFO_HOUSE) AS f\n"
                    + "ON a.TRAN_HOUSE = f.INFO_HOUSE \n"
                    + "UNION ALL \n"
                    + "SELECT a.TRAN_HOUSE,PSGR_FLOCK,FLOC_DESC,M_SEX,REC_DATE,WEEK,SM_PCF + SM_PCM AS SM_CUll,SM_PDF + SM_PDM AS SM_DEAD,SM_FM010 + SM_FM020 + SM_FM030 + SM_FM040 + SM_FM050 AS SM_FEED,COALESCE(BAL_PSF,0) AS BAL_PSF,COALESCE(BAL_PSM,0) AS BAL_PSM,\n"
                    + "COALESCE(ROUND(CASE WHEN M_SEX = '0' AND WEEK BETWEEN 1 AND 100 THEN (BAL_PSF / REC_DOD) * 100 END,2),'0') AS PC_LIVED,\n"
                    + "COALESCE(ROUND(CASE WHEN FARM_FAX = 'EH' AND WEEK BETWEEN 1 AND 100 THEN MSTD_LEH \n"
                    + "WHEN FARM_FAX = 'ON' AND WEEK BETWEEN 1 AND 100 THEN MSTD_LON\n"
                    + "WHEN FARM_FAX = 'OE' AND WEEK BETWEEN 1 AND 100 THEN MSTD_LOE END,2),0) AS STD_LIVED,\n"
                    + "COALESCE(ROUND((CASE WHEN M_SEX = '0' AND WEEK BETWEEN 1 AND 100 THEN (BAL_PSF / REC_DOD) * 100 END / \n"
                    + "CASE WHEN FARM_FAX = 'EH' AND WEEK BETWEEN 1 AND 100 THEN MSTD_LEH \n"
                    + "WHEN FARM_FAX = 'ON' AND WEEK BETWEEN 1 AND 100 THEN MSTD_LON\n"
                    + "WHEN FARM_FAX = 'OE' AND WEEK BETWEEN 1 AND 100 THEN MSTD_LOE END) * 100,2),0) AS PC_STDLIVED,\n"
                    + "SM_HCG + SM_HCS + SM_HCD + SM_HCC AS SM_HC,COALESCE((SM_HCG + SM_HCS + SM_HCD + SM_HCC) / BAL_PSF,0) AS PC_HC,\n"
                    + "COALESCE(ROUND(CASE WHEN FARM_FAX = 'EH' AND WEEK BETWEEN 1 AND 100 THEN MSTD_HEH \n"
                    + "WHEN FARM_FAX = 'ON' AND WEEK BETWEEN 1 AND 100 THEN MSTD_HON\n"
                    + "WHEN FARM_FAX = 'OE' AND WEEK BETWEEN 1 AND 100 THEN MSTD_HOE END,2),0) AS STD_HC,\n"
                    + "COALESCE(ROUND(((SM_HCG + SM_HCS + SM_HCD + SM_HCC) / BAL_PSF / \n"
                    + "CASE WHEN FARM_FAX = 'EH' AND WEEK BETWEEN 1 AND 100 THEN MSTD_HEH \n"
                    + "WHEN FARM_FAX = 'ON' AND WEEK BETWEEN 1 AND 100 THEN MSTD_HON\n"
                    + "WHEN FARM_FAX = 'OE' AND WEEK BETWEEN 1 AND 100 THEN MSTD_HOE END) * 100,2),0) AS PC_STDHC,\n"
                    + "COALESCE(ROUND((((SM_FM010 + SM_FM020 + SM_FM030 + SM_FM040 + SM_FM050) * 1000) / (BAL_PSF + BAL_PSM + SM_PCF + SM_PCM + SM_PDF + SM_PDM)) / SUM_DAY,2),0) AS GDD,\n"
                    + "SM_HCG + SM_HCS + SM_HCD + SM_HCC AS SM_HC,((SM_HCG + SM_HCS + SM_HCD + SM_HCC) * 100) AS PC_HC,\n"
                    + "COALESCE(SUM_W_HCG / SUM_DAY,0) AS W_HCG,\n"
                    + "COALESCE(ROUND(((SM_PCF + SM_PDF) * 100) / (BAL_PSF + SM_PCF+ SM_PDF),2),0) AS LOSS_PSF\n"
                    + "FROM\n"
                    + "(SELECT DISTINCT TRAN_HOUSE,PSGR_FLOCK,FLOC_DESC,SUBSTR(TRAN_HOUSE,3,1) AS M_SEX,FLOC_STDATE AS REC_DATE,\n"
                    + "CEIL(((JULIANDAY(SUBSTR('" + enddate + "',0,5)||\"-\"||SUBSTR('" + enddate + "',5,2)||\"-\"||SUBSTR('" + enddate + "',7,2)) - JULIANDAY(SUBSTR(FLOC_STWEEK,7)||\"-\"||SUBSTR(FLOC_STWEEK,4,2)||\"-\"||SUBSTR(FLOC_STWEEK,1,2))) / 7) +1) AS WEEK,\n"
                    + "ROUND((JULIANDAY(SUBSTR('" + enddate + "',0,5)||\"-\"||SUBSTR('" + enddate + "',5,2)||\"-\"||SUBSTR('" + enddate + "',7,2)) +1) - JULIANDAY(SUBSTR('" + startdate + "',0,5)||\"-\"||SUBSTR('" + startdate + "',5,2)||\"-\"||SUBSTR('" + startdate + "',7,2))) AS SUM_DAY\n"
                    + "FROM FAR_MTRANSECTION,FAR_GROWERMT,FAR_FLOCK,FAR_MHOUSE\n"
                    + "WHERE TRAN_FARM = '" + farm + "'\n"
                    + "AND TRAN_BREED = '" + breed + "'\n"
                    + "AND SUBSTR(TRAN_HOUSE,4) NOT IN ('201','301')\n"
                    + "AND TRAN_HOUSE = PSGR_HOUSE\n"
                    + "AND PSGR_MO <> ''\n"
                    + "AND PSGR_FLOCK = FLOC_CODE\n"
                    + "AND FLOC_STATUS = '1'\n"
                    + "AND HOUS_FARM = TRAN_FARM\n"
                    + "AND HOUS_BREED = TRAN_BREED\n"
                    + "AND HOUS_LASTMO = PSGR_MO\n"
                    + "AND SUBSTR(TRAN_DATE,7) || SUBSTR(TRAN_DATE,4,2) || SUBSTR(TRAN_DATE,1,2) BETWEEN '" + startdate + "' AND '" + enddate + "'\n"
                    + "ORDER BY TRAN_HOUSE) AS a\n"
                    + "LEFT JOIN\n"
                    + "(SELECT INVE_HOUSE,\n"
                    + "SUM(CASE WHEN ITEM_GROUP = 'PSF' THEN INVE_BALANCE ELSE 0 END ) AS BAL_PSF,\n"
                    + "SUM(CASE WHEN ITEM_GROUP = 'PSM' THEN INVE_BALANCE ELSE 0 END ) AS BAL_PSM\n"
                    + "FROM FAR_DINVENBAL,FAR_MITEM\n"
                    + "WHERE INVE_FARM = '" + farm + "' \n"
                    + "AND INVE_BREED IN ('" + breed + "','" + breedall + "')\n"
                    + "AND INVE_ITEM = ITEM_CODE\n"
                    + "AND SUBSTR(INVE_DATE,7) || SUBSTR(INVE_DATE,4,2) || SUBSTR(INVE_DATE,1,2) = '" + enddate + "'\n"
                    + "GROUP BY INVE_HOUSE) AS b\n"
                    + "ON a.TRAN_HOUSE = b.INVE_HOUSE\n"
                    + "LEFT JOIN\n"
                    + "(SELECT TRAN_HOUSE,\n"
                    + "SUM(CASE WHEN TRAN_TYPE = 'WOM' AND TRAN_ITEM = 'FM110010' THEN TRAN_QTY * -1 ELSE 0 END ) AS SM_FM010,\n"
                    + "SUM(CASE WHEN TRAN_TYPE = 'WOM' AND TRAN_ITEM = 'FM110020' THEN TRAN_QTY * -1 ELSE 0 END ) AS SM_FM020,\n"
                    + "SUM(CASE WHEN TRAN_TYPE = 'WOM' AND TRAN_ITEM = 'FM110030' THEN TRAN_QTY * -1 ELSE 0 END ) AS SM_FM030,\n"
                    + "SUM(CASE WHEN TRAN_TYPE = 'WOM' AND TRAN_ITEM = 'FM110040' THEN TRAN_QTY * -1 ELSE 0 END ) AS SM_FM040,\n"
                    + "SUM(CASE WHEN TRAN_TYPE = 'WOM' AND TRAN_ITEM = 'FM110050' THEN TRAN_QTY * -1 ELSE 0 END ) AS SM_FM050,\n"
                    + "SUM(CASE WHEN TRAN_TYPE = 'WOP' AND ITEM_GROUP = 'PCF' THEN TRAN_QTY ELSE 0 END ) AS SM_PCF,\n"
                    + "SUM(CASE WHEN TRAN_TYPE = 'WOP' AND ITEM_GROUP = 'PCM' THEN TRAN_QTY ELSE 0 END ) AS SM_PCM,\n"
                    + "SUM(CASE WHEN TRAN_TYPE = 'WOP' AND ITEM_GROUP = 'PDF' THEN TRAN_QTY ELSE 0 END ) AS SM_PDF,\n"
                    + "SUM(CASE WHEN TRAN_TYPE = 'WOP' AND ITEM_GROUP = 'PDM' THEN TRAN_QTY ELSE 0 END ) AS SM_PDM,\n"
                    + "SUM(CASE WHEN TRAN_TYPE = 'WOP' AND ITEM_GROUP = 'HCG' THEN TRAN_QTY ELSE 0 END ) AS SM_HCG,\n"
                    + "SUM(CASE WHEN TRAN_TYPE = 'WOP' AND ITEM_GROUP = 'HCS' THEN TRAN_QTY ELSE 0 END ) AS SM_HCS,\n"
                    + "SUM(CASE WHEN TRAN_TYPE = 'WOP' AND ITEM_GROUP = 'HCD' THEN TRAN_QTY ELSE 0 END ) AS SM_HCD,\n"
                    + "SUM(CASE WHEN TRAN_TYPE = 'WOP' AND ITEM_GROUP = 'HCC' THEN TRAN_QTY ELSE 0 END ) AS SM_HCC\n"
                    + "FROM FAR_MTRANSECTION,FAR_MITEM\n"
                    + "WHERE TRAN_FARM = '" + farm + "'\n"
                    + "AND TRAN_BREED = '" + breed + "'\n"
                    + "AND TRAN_FARM = ITEM_FARM\n"
                    + "AND TRAN_ITEM = ITEM_CODE\n"
                    + "AND SUBSTR(TRAN_DATE,7) || SUBSTR(TRAN_DATE,4,2) || SUBSTR(TRAN_DATE,1,2) BETWEEN '" + startdate + "' AND '" + enddate + "'\n"
                    + "GROUP BY TRAN_HOUSE) AS c\n"
                    + "ON a.TRAN_HOUSE = c.TRAN_HOUSE\n"
                    + "LEFT JOIN\n"
                    + "(SELECT PSGR_HOUSE,CASE WHEN SUBSTR(PSGR_HOUSE,3,1) %2 = 0 THEN PSGR_FEMALE ELSE PSGR_MALE END AS REC_DOD\n"
                    + "FROM FAR_FLOCK,FAR_GROWERMT\n"
                    + "WHERE FLOC_FARM = '" + farm + "'\n"
                    + "AND FLOC_BREED = '" + breed + "'\n"
                    + "AND FLOC_FARM = PSGR_FARM \n"
                    + "AND FLOC_BREED = PSGR_BREED\n"
                    + "AND PSGR_FLOCK = FLOC_CODE\n"
                    + "AND FLOC_STATUS = '1') AS d\n"
                    + "ON a.TRAN_HOUSE = d.PSGR_HOUSE\n"
                    + "LEFT JOIN\n"
                    + "(SELECT FARM_FAX,MSTD_AGE,MSTD_LEH,MSTD_LON,MSTD_LOE,MSTD_HEH,MSTD_HON,MSTD_HOE\n"
                    + "FROM FAR_MSTD,FAR_MFARM\n"
                    + "WHERE MSTD_FARM = '" + farm + "'\n"
                    + "AND MSTD_BREED = '" + breed + "'\n"
                    + "AND MSTD_FARM = FARM_CODE\n"
                    + "AND MSTD_SEX = 'F') AS e\n"
                    + "ON a.WEEK = e.MSTD_AGE\n"
                    + "LEFT JOIN\n"
                    + "(SELECT INFO_HOUSE,SUM(CASE WHEN INFO_ITEM IN ('" + hcg2001 + "','" + hcg3001 + "') AND INFO_DISE = 'W01' THEN INFO_QTY ELSE 0 END) AS SUM_W_HCG\n"
                    + "FROM FAR_MINFORM\n"
                    + "WHERE INFO_FARM = '" + farm + "'\n"
                    + "AND INFO_BREED = '" + breed + "'\n"
                    + "AND SUBSTR(INFO_DATE,7) || SUBSTR(INFO_DATE,4,2) || SUBSTR(INFO_DATE,1,2) BETWEEN '" + startdate + "' AND '" + enddate + "'\n"
                    + "GROUP BY INFO_HOUSE) AS f\n"
                    + "ON a.TRAN_HOUSE = f.INFO_HOUSE\n"
                    + "UNION ALL \n"
                    + "SELECT a.TRAN_HOUSE,PSGR_FLOCK,FLOC_DESC,M_SEX,REC_DATE,WEEK,SM_PCF + SM_PCM AS SM_CUll,SM_PDF + SM_PDM AS SM_DEAD,SM_FM010 + SM_FM020 + SM_FM030 + SM_FM040 + SM_FM050 AS SM_FEED,COALESCE(BAL_PSF,0) AS BAL_PSF,COALESCE(BAL_PSM,0) AS BAL_PSM,\n"
                    + "COALESCE(ROUND(CASE WHEN M_SEX = '0' AND WEEK BETWEEN 1 AND 100 THEN (BAL_PSF / REC_DOD) * 100 END,2),'0') AS PC_LIVED,\n"
                    + "COALESCE(ROUND(CASE WHEN FARM_FAX = 'EH' AND WEEK BETWEEN 1 AND 100 THEN MSTD_LEH \n"
                    + "WHEN FARM_FAX = 'ON' AND WEEK BETWEEN 1 AND 100 THEN MSTD_LON\n"
                    + "WHEN FARM_FAX = 'OE' AND WEEK BETWEEN 1 AND 100 THEN MSTD_LOE END,2),0) AS STD_LIVED,\n"
                    + "COALESCE(ROUND((CASE WHEN M_SEX = '0' AND WEEK BETWEEN 1 AND 100 THEN (BAL_PSF / REC_DOD) * 100 END / \n"
                    + "CASE WHEN FARM_FAX = 'EH' AND WEEK BETWEEN 1 AND 100 THEN MSTD_LEH \n"
                    + "WHEN FARM_FAX = 'ON' AND WEEK BETWEEN 1 AND 100 THEN MSTD_LON\n"
                    + "WHEN FARM_FAX = 'OE' AND WEEK BETWEEN 1 AND 100 THEN MSTD_LOE END) * 100,2),0) AS PC_STDLIVED,\n"
                    + "SM_HCG + SM_HCS + SM_HCD + SM_HCC AS SM_HC,COALESCE((SM_HCG + SM_HCS + SM_HCD + SM_HCC) / BAL_PSF,0) AS PC_HC,\n"
                    + "COALESCE(ROUND(CASE WHEN FARM_FAX = 'EH' AND WEEK BETWEEN 1 AND 100 THEN MSTD_HEH \n"
                    + "WHEN FARM_FAX = 'ON' AND WEEK BETWEEN 1 AND 100 THEN MSTD_HON\n"
                    + "WHEN FARM_FAX = 'OE' AND WEEK BETWEEN 1 AND 100 THEN MSTD_HOE END,2),0) AS STD_HC,\n"
                    + "COALESCE(ROUND(((SM_HCG + SM_HCS + SM_HCD + SM_HCC) / BAL_PSF / \n"
                    + "CASE WHEN FARM_FAX = 'EH' AND WEEK BETWEEN 1 AND 100 THEN MSTD_HEH \n"
                    + "WHEN FARM_FAX = 'ON' AND WEEK BETWEEN 1 AND 100 THEN MSTD_HON\n"
                    + "WHEN FARM_FAX = 'OE' AND WEEK BETWEEN 1 AND 100 THEN MSTD_HOE END) * 100,2),0) AS PC_STDHC,\n"
                    + "COALESCE(ROUND((((SM_FM010 + SM_FM020 + SM_FM030 + SM_FM040 + SM_FM050) * 1000) / (BAL_PSF + BAL_PSM + SM_PCF + SM_PCM + SM_PDF + SM_PDM)) / SUM_DAY,2),0) AS GDD,\n"
                    + "SM_HCG + SM_HCS + SM_HCD + SM_HCC AS SM_HC,((SM_HCG + SM_HCS + SM_HCD + SM_HCC) * 100) AS PC_HC,\n"
                    + "COALESCE(SUM_W_HCG / SUM_DAY,0) AS W_HCG,\n"
                    + "COALESCE(ROUND(((SM_PCF + SM_PDF) * 100) / (BAL_PSF + SM_PCF+ SM_PDF),2),0) AS LOSS_PSF\n"
                    + "FROM\n"
                    + "(SELECT DISTINCT TRAN_HOUSE,PSGR_FLOCK,FLOC_DESC,SUBSTR(TRAN_HOUSE,3,1) AS M_SEX,FLOC_STDATE AS REC_DATE,\n"
                    + "CEIL(((JULIANDAY(SUBSTR('" + enddate + "',0,5)||\"-\"||SUBSTR('" + enddate + "',5,2)||\"-\"||SUBSTR('" + enddate + "',7,2)) - JULIANDAY(SUBSTR(FLOC_STWEEK,7)||\"-\"||SUBSTR(FLOC_STWEEK,4,2)||\"-\"||SUBSTR(FLOC_STWEEK,1,2))) / 7) +1) AS WEEK,\n"
                    + "ROUND((JULIANDAY(SUBSTR('" + enddate + "',0,5)||\"-\"||SUBSTR('" + enddate + "',5,2)||\"-\"||SUBSTR('" + enddate + "',7,2)) +1) - JULIANDAY(SUBSTR('" + startdate + "',0,5)||\"-\"||SUBSTR('" + startdate + "',5,2)||\"-\"||SUBSTR('" + startdate + "',7,2))) AS SUM_DAY\n"
                    + "FROM FAR_MTRANSECTION,FAR_LAYING,FAR_FLOCK,FAR_MHOUSE\n"
                    + "WHERE TRAN_FARM = '" + farm + "'\n"
                    + "AND TRAN_BREED = '" + breed + "'\n"
                    + "AND SUBSTR(TRAN_HOUSE,4) NOT IN ('201','301')\n"
                    + "AND TRAN_HOUSE = PSGR_HOUSE\n"
                    + "AND PSGR_MO <> ''\n"
                    + "AND PSGR_FLOCK = FLOC_CODE\n"
                    + "AND FLOC_STATUS = '1'\n"
                    + "AND HOUS_FARM = TRAN_FARM\n"
                    + "AND HOUS_BREED = TRAN_BREED\n"
                    + "AND HOUS_LASTMO = PSGR_MO\n"
                    + "AND SUBSTR(TRAN_DATE,7) || SUBSTR(TRAN_DATE,4,2) || SUBSTR(TRAN_DATE,1,2) BETWEEN '" + startdate + "' AND '" + enddate + "'\n"
                    + "ORDER BY TRAN_HOUSE) AS a\n"
                    + "LEFT JOIN\n"
                    + "(SELECT INVE_HOUSE,\n"
                    + "SUM(CASE WHEN ITEM_GROUP = 'PSF' THEN INVE_BALANCE ELSE 0 END ) AS BAL_PSF,\n"
                    + "SUM(CASE WHEN ITEM_GROUP = 'PSM' THEN INVE_BALANCE ELSE 0 END ) AS BAL_PSM\n"
                    + "FROM FAR_DINVENBAL,FAR_MITEM\n"
                    + "WHERE INVE_FARM = '" + farm + "' \n"
                    + "AND INVE_BREED IN ('" + breed + "','" + breedall + "')\n"
                    + "AND INVE_ITEM = ITEM_CODE\n"
                    + "AND SUBSTR(INVE_DATE,7) || SUBSTR(INVE_DATE,4,2) || SUBSTR(INVE_DATE,1,2) = '" + enddate + "'\n"
                    + "GROUP BY INVE_HOUSE) AS b\n"
                    + "ON a.TRAN_HOUSE = b.INVE_HOUSE\n"
                    + "LEFT JOIN\n"
                    + "(SELECT TRAN_HOUSE,\n"
                    + "SUM(CASE WHEN TRAN_TYPE = 'WOM' AND TRAN_ITEM = 'FM110010' THEN TRAN_QTY * -1 ELSE 0 END ) AS SM_FM010,\n"
                    + "SUM(CASE WHEN TRAN_TYPE = 'WOM' AND TRAN_ITEM = 'FM110020' THEN TRAN_QTY * -1 ELSE 0 END ) AS SM_FM020,\n"
                    + "SUM(CASE WHEN TRAN_TYPE = 'WOM' AND TRAN_ITEM = 'FM110030' THEN TRAN_QTY * -1 ELSE 0 END ) AS SM_FM030,\n"
                    + "SUM(CASE WHEN TRAN_TYPE = 'WOM' AND TRAN_ITEM = 'FM110040' THEN TRAN_QTY * -1 ELSE 0 END ) AS SM_FM040,\n"
                    + "SUM(CASE WHEN TRAN_TYPE = 'WOM' AND TRAN_ITEM = 'FM110050' THEN TRAN_QTY * -1 ELSE 0 END ) AS SM_FM050,\n"
                    + "SUM(CASE WHEN TRAN_TYPE = 'WOP' AND ITEM_GROUP = 'PCF' THEN TRAN_QTY ELSE 0 END ) AS SM_PCF,\n"
                    + "SUM(CASE WHEN TRAN_TYPE = 'WOP' AND ITEM_GROUP = 'PCM' THEN TRAN_QTY ELSE 0 END ) AS SM_PCM,\n"
                    + "SUM(CASE WHEN TRAN_TYPE = 'WOP' AND ITEM_GROUP = 'PDF' THEN TRAN_QTY ELSE 0 END ) AS SM_PDF,\n"
                    + "SUM(CASE WHEN TRAN_TYPE = 'WOP' AND ITEM_GROUP = 'PDM' THEN TRAN_QTY ELSE 0 END ) AS SM_PDM,\n"
                    + "SUM(CASE WHEN TRAN_TYPE = 'WOP' AND ITEM_GROUP = 'HCG' THEN TRAN_QTY ELSE 0 END ) AS SM_HCG,\n"
                    + "SUM(CASE WHEN TRAN_TYPE = 'WOP' AND ITEM_GROUP = 'HCS' THEN TRAN_QTY ELSE 0 END ) AS SM_HCS,\n"
                    + "SUM(CASE WHEN TRAN_TYPE = 'WOP' AND ITEM_GROUP = 'HCD' THEN TRAN_QTY ELSE 0 END ) AS SM_HCD,\n"
                    + "SUM(CASE WHEN TRAN_TYPE = 'WOP' AND ITEM_GROUP = 'HCC' THEN TRAN_QTY ELSE 0 END ) AS SM_HCC\n"
                    + "FROM FAR_MTRANSECTION,FAR_MITEM\n"
                    + "WHERE TRAN_FARM = '" + farm + "'\n"
                    + "AND TRAN_BREED = '" + breed + "'\n"
                    + "AND TRAN_FARM = ITEM_FARM\n"
                    + "AND TRAN_ITEM = ITEM_CODE\n"
                    + "AND SUBSTR(TRAN_DATE,7) || SUBSTR(TRAN_DATE,4,2) || SUBSTR(TRAN_DATE,1,2) BETWEEN '" + startdate + "' AND '" + enddate + "'\n"
                    + "GROUP BY TRAN_HOUSE) AS c\n"
                    + "ON a.TRAN_HOUSE = c.TRAN_HOUSE\n"
                    + "LEFT JOIN\n"
                    + "(SELECT PSGR_HOUSE,CASE WHEN SUBSTR(PSGR_HOUSE,3,1) %2 = 0 THEN PSGR_FEMALE ELSE PSGR_MALE END AS REC_DOD\n"
                    + "FROM FAR_FLOCK,FAR_LAYING\n"
                    + "WHERE FLOC_FARM = '" + farm + "'\n"
                    + "AND FLOC_BREED = '" + breed + "'\n"
                    + "AND FLOC_FARM = PSGR_FARM \n"
                    + "AND FLOC_BREED = PSGR_BREED\n"
                    + "AND PSGR_FLOCK = FLOC_CODE\n"
                    + "AND FLOC_STATUS = '1') AS d\n"
                    + "ON a.TRAN_HOUSE = d.PSGR_HOUSE\n"
                    + "LEFT JOIN\n"
                    + "(SELECT FARM_FAX,MSTD_AGE,MSTD_LEH,MSTD_LON,MSTD_LOE,MSTD_HEH,MSTD_HON,MSTD_HOE\n"
                    + "FROM FAR_MSTD,FAR_MFARM\n"
                    + "WHERE MSTD_FARM = '" + farm + "'\n"
                    + "AND MSTD_BREED = '" + breed + "'\n"
                    + "AND MSTD_FARM = FARM_CODE\n"
                    + "AND MSTD_SEX = 'F') AS e\n"
                    + "ON a.WEEK = e.MSTD_AGE\n"
                    + "LEFT JOIN\n"
                    + "(SELECT INFO_HOUSE,SUM(CASE WHEN INFO_ITEM IN ('" + hcg2001 + "','" + hcg3001 + "') AND INFO_DISE = 'W01' THEN INFO_QTY ELSE 0 END) AS SUM_W_HCG\n"
                    + "FROM FAR_MINFORM\n"
                    + "WHERE INFO_FARM = '" + farm + "'\n"
                    + "AND INFO_BREED = '" + breed + "'\n"
                    + "AND SUBSTR(INFO_DATE,7) || SUBSTR(INFO_DATE,4,2) || SUBSTR(INFO_DATE,1,2) BETWEEN '" + startdate + "' AND '" + enddate + "'\n"
                    + "GROUP BY INFO_HOUSE) AS f\n"
                    + "ON a.TRAN_HOUSE = f.INFO_HOUSE\n"
                    + "UNION ALL \n"
                    + "SELECT a.TRAN_HOUSE,PSGR_FLOCK,FLOC_DESC,M_SEX,REC_DATE,WEEK,SM_PCF + SM_PCM AS SM_CUll,SM_PDF + SM_PDM AS SM_DEAD,SM_FM010 + SM_FM020 + SM_FM030 + SM_FM040 + SM_FM050 AS SM_FEED,COALESCE(BAL_PSF,0) AS BAL_PSF,COALESCE(BAL_PSM,0) AS BAL_PSM,\n"
                    + "COALESCE(ROUND(CASE WHEN M_SEX = '0' AND WEEK BETWEEN 1 AND 100 THEN (BAL_PSF / REC_DOD) * 100 END,2),'0') AS PC_LIVED,\n"
                    + "COALESCE(ROUND(CASE WHEN FARM_FAX = 'EH' AND WEEK BETWEEN 1 AND 100 THEN MSTD_LEH \n"
                    + "WHEN FARM_FAX = 'ON' AND WEEK BETWEEN 1 AND 100 THEN MSTD_LON\n"
                    + "WHEN FARM_FAX = 'OE' AND WEEK BETWEEN 1 AND 100 THEN MSTD_LOE END,2),0) AS STD_LIVED,\n"
                    + "COALESCE(ROUND((CASE WHEN M_SEX = '0' AND WEEK BETWEEN 1 AND 100 THEN (BAL_PSF / REC_DOD) * 100 END / \n"
                    + "CASE WHEN FARM_FAX = 'EH' AND WEEK BETWEEN 1 AND 100 THEN MSTD_LEH \n"
                    + "WHEN FARM_FAX = 'ON' AND WEEK BETWEEN 1 AND 100 THEN MSTD_LON\n"
                    + "WHEN FARM_FAX = 'OE' AND WEEK BETWEEN 1 AND 100 THEN MSTD_LOE END) * 100,2),0) AS PC_STDLIVED,\n"
                    + "SM_HCG + SM_HCS + SM_HCD + SM_HCC AS SM_HC,COALESCE((SM_HCG + SM_HCS + SM_HCD + SM_HCC) / BAL_PSF,0) AS PC_HC,\n"
                    + "COALESCE(ROUND(CASE WHEN FARM_FAX = 'EH' AND WEEK BETWEEN 1 AND 100 THEN MSTD_HEH \n"
                    + "WHEN FARM_FAX = 'ON' AND WEEK BETWEEN 1 AND 100 THEN MSTD_HON\n"
                    + "WHEN FARM_FAX = 'OE' AND WEEK BETWEEN 1 AND 100 THEN MSTD_HOE END,2),0) AS STD_HC,\n"
                    + "COALESCE(ROUND(((SM_HCG + SM_HCS + SM_HCD + SM_HCC) / BAL_PSF / \n"
                    + "CASE WHEN FARM_FAX = 'EH' AND WEEK BETWEEN 1 AND 100 THEN MSTD_HEH \n"
                    + "WHEN FARM_FAX = 'ON' AND WEEK BETWEEN 1 AND 100 THEN MSTD_HON\n"
                    + "WHEN FARM_FAX = 'OE' AND WEEK BETWEEN 1 AND 100 THEN MSTD_HOE END) * 100,2),0) AS PC_STDHC,\n"
                    + "COALESCE(ROUND((((SM_FM010 + SM_FM020 + SM_FM030 + SM_FM040 + SM_FM050) * 1000) / (BAL_PSF + BAL_PSM + SM_PCF + SM_PCM + SM_PDF + SM_PDM)) / SUM_DAY,2),0) AS GDD,\n"
                    + "SM_HCG + SM_HCS + SM_HCD + SM_HCC AS SM_HC,((SM_HCG + SM_HCS + SM_HCD + SM_HCC) * 100) AS PC_HC,\n"
                    + "COALESCE(SUM_W_HCG / SUM_DAY,0) AS W_HCG,\n"
                    + "COALESCE(ROUND(((SM_PCF + SM_PDF) * 100) / (BAL_PSF + SM_PCF+ SM_PDF),2),0) AS LOSS_PSF\n"
                    + "FROM\n"
                    + "(SELECT DISTINCT TRAN_HOUSE,PSGR_FLOCK,FLOC_DESC,SUBSTR(TRAN_HOUSE,3,1) AS M_SEX,FLOC_STDATE AS REC_DATE,\n"
                    + "CEIL(((JULIANDAY(SUBSTR('" + enddate + "',0,5)||\"-\"||SUBSTR('" + enddate + "',5,2)||\"-\"||SUBSTR('" + enddate + "',7,2)) - JULIANDAY(SUBSTR(FLOC_STWEEK,7)||\"-\"||SUBSTR(FLOC_STWEEK,4,2)||\"-\"||SUBSTR(FLOC_STWEEK,1,2))) / 7) +1) AS WEEK,\n"
                    + "ROUND((JULIANDAY(SUBSTR('" + enddate + "',0,5)||\"-\"||SUBSTR('" + enddate + "',5,2)||\"-\"||SUBSTR('" + enddate + "',7,2)) +1) - JULIANDAY(SUBSTR('" + startdate + "',0,5)||\"-\"||SUBSTR('" + startdate + "',5,2)||\"-\"||SUBSTR('" + startdate + "',7,2))) AS SUM_DAY\n"
                    + "FROM FAR_MTRANSECTION,FAR_LAYINGMT,FAR_FLOCK,FAR_MHOUSE\n"
                    + "WHERE TRAN_FARM = '" + farm + "'\n"
                    + "AND TRAN_BREED = '" + breed + "'\n"
                    + "AND SUBSTR(TRAN_HOUSE,4) NOT IN ('201','301')\n"
                    + "AND TRAN_HOUSE = PSGR_HOUSE\n"
                    + "AND PSGR_MO <> ''\n"
                    + "AND PSGR_FLOCK = FLOC_CODE\n"
                    + "AND FLOC_STATUS = '1'\n"
                    + "AND HOUS_FARM = TRAN_FARM\n"
                    + "AND HOUS_BREED = TRAN_BREED\n"
                    + "AND HOUS_LASTMO = PSGR_MO\n"
                    + "AND SUBSTR(TRAN_DATE,7) || SUBSTR(TRAN_DATE,4,2) || SUBSTR(TRAN_DATE,1,2) BETWEEN '" + startdate + "' AND '" + enddate + "'\n"
                    + "ORDER BY TRAN_HOUSE) AS a\n"
                    + "LEFT JOIN\n"
                    + "(SELECT INVE_HOUSE,\n"
                    + "SUM(CASE WHEN ITEM_GROUP = 'PSF' THEN INVE_BALANCE ELSE 0 END ) AS BAL_PSF,\n"
                    + "SUM(CASE WHEN ITEM_GROUP = 'PSM' THEN INVE_BALANCE ELSE 0 END ) AS BAL_PSM\n"
                    + "FROM FAR_DINVENBAL,FAR_MITEM\n"
                    + "WHERE INVE_FARM = '" + farm + "' \n"
                    + "AND INVE_BREED IN ('" + breed + "','" + breedall + "')\n"
                    + "AND INVE_ITEM = ITEM_CODE\n"
                    + "AND SUBSTR(INVE_DATE,7) || SUBSTR(INVE_DATE,4,2) || SUBSTR(INVE_DATE,1,2) = '" + enddate + "'\n"
                    + "GROUP BY INVE_HOUSE) AS b\n"
                    + "ON a.TRAN_HOUSE = b.INVE_HOUSE\n"
                    + "LEFT JOIN\n"
                    + "(SELECT TRAN_HOUSE,\n"
                    + "SUM(CASE WHEN TRAN_TYPE = 'WOM' AND TRAN_ITEM = 'FM110010' THEN TRAN_QTY * -1 ELSE 0 END ) AS SM_FM010,\n"
                    + "SUM(CASE WHEN TRAN_TYPE = 'WOM' AND TRAN_ITEM = 'FM110020' THEN TRAN_QTY * -1 ELSE 0 END ) AS SM_FM020,\n"
                    + "SUM(CASE WHEN TRAN_TYPE = 'WOM' AND TRAN_ITEM = 'FM110030' THEN TRAN_QTY * -1 ELSE 0 END ) AS SM_FM030,\n"
                    + "SUM(CASE WHEN TRAN_TYPE = 'WOM' AND TRAN_ITEM = 'FM110040' THEN TRAN_QTY * -1 ELSE 0 END ) AS SM_FM040,\n"
                    + "SUM(CASE WHEN TRAN_TYPE = 'WOM' AND TRAN_ITEM = 'FM110050' THEN TRAN_QTY * -1 ELSE 0 END ) AS SM_FM050,\n"
                    + "SUM(CASE WHEN TRAN_TYPE = 'WOP' AND ITEM_GROUP = 'PCF' THEN TRAN_QTY ELSE 0 END ) AS SM_PCF,\n"
                    + "SUM(CASE WHEN TRAN_TYPE = 'WOP' AND ITEM_GROUP = 'PCM' THEN TRAN_QTY ELSE 0 END ) AS SM_PCM,\n"
                    + "SUM(CASE WHEN TRAN_TYPE = 'WOP' AND ITEM_GROUP = 'PDF' THEN TRAN_QTY ELSE 0 END ) AS SM_PDF,\n"
                    + "SUM(CASE WHEN TRAN_TYPE = 'WOP' AND ITEM_GROUP = 'PDM' THEN TRAN_QTY ELSE 0 END ) AS SM_PDM,\n"
                    + "SUM(CASE WHEN TRAN_TYPE = 'WOP' AND ITEM_GROUP = 'HCG' THEN TRAN_QTY ELSE 0 END ) AS SM_HCG,\n"
                    + "SUM(CASE WHEN TRAN_TYPE = 'WOP' AND ITEM_GROUP = 'HCS' THEN TRAN_QTY ELSE 0 END ) AS SM_HCS,\n"
                    + "SUM(CASE WHEN TRAN_TYPE = 'WOP' AND ITEM_GROUP = 'HCD' THEN TRAN_QTY ELSE 0 END ) AS SM_HCD,\n"
                    + "SUM(CASE WHEN TRAN_TYPE = 'WOP' AND ITEM_GROUP = 'HCC' THEN TRAN_QTY ELSE 0 END ) AS SM_HCC\n"
                    + "FROM FAR_MTRANSECTION,FAR_MITEM\n"
                    + "WHERE TRAN_FARM = '" + farm + "'\n"
                    + "AND TRAN_BREED = '" + breed + "'\n"
                    + "AND TRAN_FARM = ITEM_FARM\n"
                    + "AND TRAN_ITEM = ITEM_CODE\n"
                    + "AND SUBSTR(TRAN_DATE,7) || SUBSTR(TRAN_DATE,4,2) || SUBSTR(TRAN_DATE,1,2) BETWEEN '" + startdate + "' AND '" + enddate + "'\n"
                    + "GROUP BY TRAN_HOUSE) AS c\n"
                    + "ON a.TRAN_HOUSE = c.TRAN_HOUSE\n"
                    + "LEFT JOIN\n"
                    + "(SELECT PSGR_HOUSE,CASE WHEN SUBSTR(PSGR_HOUSE,3,1) %2 = 0 THEN PSGR_FEMALE ELSE PSGR_MALE END AS REC_DOD\n"
                    + "FROM FAR_FLOCK,FAR_LAYINGMT\n"
                    + "WHERE FLOC_FARM = '" + farm + "'\n"
                    + "AND FLOC_BREED = '" + breed + "'\n"
                    + "AND FLOC_FARM = PSGR_FARM \n"
                    + "AND FLOC_BREED = PSGR_BREED\n"
                    + "AND PSGR_FLOCK = FLOC_CODE\n"
                    + "AND FLOC_STATUS = '1') AS d\n"
                    + "ON a.TRAN_HOUSE = d.PSGR_HOUSE\n"
                    + "LEFT JOIN\n"
                    + "(SELECT FARM_FAX,MSTD_AGE,MSTD_LEH,MSTD_LON,MSTD_LOE,MSTD_HEH,MSTD_HON,MSTD_HOE\n"
                    + "FROM FAR_MSTD,FAR_MFARM\n"
                    + "WHERE MSTD_FARM = '" + farm + "'\n"
                    + "AND MSTD_BREED = '" + breed + "'\n"
                    + "AND MSTD_FARM = FARM_CODE\n"
                    + "AND MSTD_SEX = 'F') AS e\n"
                    + "ON a.WEEK = e.MSTD_AGE\n"
                    + "LEFT JOIN\n"
                    + "(SELECT INFO_HOUSE,SUM(CASE WHEN INFO_ITEM IN ('" + hcg2001 + "','" + hcg3001 + "') AND INFO_DISE = 'W01' THEN INFO_QTY ELSE 0 END) AS SUM_W_HCG\n"
                    + "FROM FAR_MINFORM\n"
                    + "WHERE INFO_FARM = '" + farm + "'\n"
                    + "AND INFO_BREED = '" + breed + "'\n"
                    + "AND SUBSTR(INFO_DATE,7) || SUBSTR(INFO_DATE,4,2) || SUBSTR(INFO_DATE,1,2) BETWEEN '" + startdate + "' AND '" + enddate + "'\n"
                    + "GROUP BY INFO_HOUSE) AS f\n"
                    + "ON a.TRAN_HOUSE = f.INFO_HOUSE)";

            ResultSet rs = sta.executeQuery(Sql);

            while (rs.next()) {
                getListM3TransectionReport.add(
                        rs.getString("TRAN_HOUSE").trim() + " ; "
                        + rs.getString("PSGR_FLOCK").trim() + " ; "
                        + rs.getString("FLOC_DESC").trim() + " ; "
                        + rs.getString("WEEK").trim() + " ; "
                        + rs.getString("SM_CUll").trim() + " ; "
                        + rs.getString("SM_DEAD").trim() + " ; "
                        + rs.getString("BAL_PSM").trim() + " ; "
                        + rs.getString("BAL_PSF").trim() + " ; "
                        + rs.getString("PC_LIVED").trim() + " ; "
                        + rs.getString("STD_LIVED").trim() + " ; "
                        + rs.getString("PC_STDLIVED").trim() + " ; "
                        + rs.getString("SM_HC").trim() + " ; "
                        + rs.getString("PC_HC").trim() + " ; "
                        + rs.getString("STD_HC").trim() + " ; "
                        + rs.getString("PC_STDHC").trim() + " ; "
                        + rs.getString("GDD").trim() + " ; "
                        + rs.getString("PC_HC").trim() + " ; "
                        + rs.getString("W_HCG").trim() + " ; "
                        + rs.getString("LOSS_PSF").trim());
            }
            return getListM3TransectionReport;

        } catch (Exception ex) {
            System.out.println(ex.toString());
        } finally {
            if (conn != null) {
                try {
                    conn.close();
                } catch (SQLException ex) {
                    System.out.println(ex.toString());
                }
            }
        }
        return null;
    }

    public List<String> GetResultEggDesc(String farm, String breed) {

        List<String> getListEggDesc = new ArrayList<String>();
        Connection conn = null;
        try {
            conn = ConnectSQLite.ConnectionSQLite();
            Statement sta = conn.createStatement();
            String Sql = "SELECT DESC_DATE, DESC_TIMEWDT, DESC_TRUCKNO, DESC_HCCBW, DESC_HCCAW, DESC_HCD, DESC_HCS, DESC_HCDT, DESC_HCTTL\n"
                    + "FROM FAR_MDESCRIPTION\n"
                    + "WHERE DESC_FARM = '" + farm + "'\n"
                    + "AND DESC_BREED = '" + breed + "'\n"
                    + "ORDER BY SUBSTR(DESC_DATE,7) || SUBSTR(DESC_DATE,4,2) || SUBSTR(DESC_DATE,1,2) DESC, DESC_TIMEWDT ASC";
            ResultSet rs = sta.executeQuery(Sql);

            while (rs.next()) {
                getListEggDesc.add(
                        rs.getString("DESC_DATE").trim() + " ; "
                        + rs.getString("DESC_TIMEWDT").trim() + " ; "
                        + rs.getString("DESC_TRUCKNO").trim() + " ; "
                        + df.format(rs.getFloat("DESC_HCCBW")) + " ; "
                        + df.format(rs.getFloat("DESC_HCCAW")) + " ; "
                        + df.format(rs.getFloat("DESC_HCD")) + " ; "
                        + df.format(rs.getFloat("DESC_HCS")) + " ; "
                        + df.format(rs.getFloat("DESC_HCDT")) + " ; "
                        + df.format(rs.getFloat("DESC_HCTTL")));
            }
            return getListEggDesc;

        } catch (Exception ex) {
            System.out.println(ex.toString());
        } finally {
            if (conn != null) {
                try {
                    conn.close();
                } catch (SQLException ex) {
                    System.out.println(ex.toString());
                }
            }
        }
        return null;
    }

}
