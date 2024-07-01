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

/**
 *
 * @author Wattana
 */
public class ClassReturnData {

    public String CheckLastMO(String farm, String breed, String house) {

        Connection conn = null;
        try {
            conn = ConnectSQLite.ConnectionSQLite();
            Statement sta = conn.createStatement();
            String Sql = "SELECT HOUS_LASTMO \n"
                    + "FROM FAR_MHOUSE\n"
                    + "WHERE HOUS_FARM = '" + farm + "' \n"
                    + "AND HOUS_BREED = '" + breed + "' \n"
                    + "AND HOUS_CODE = '" + house + "'";
            ResultSet rs = sta.executeQuery(Sql);

            String mo = "";
            while (rs.next()) {
                mo = rs.getString("HOUS_LASTMO").trim();
            }
            return mo;
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

    //M001FarmEdit
    public String CheckFarmDuplicate(String farm) {

        Connection conn = null;
        try {
            conn = ConnectSQLite.ConnectionSQLite();
            Statement sta = conn.createStatement();
            String Sql = "SELECT COUNT (*) AS COUNT \n"
                    + "FROM FAR_MFARM \n"
                    + "WHERE FARM_CODE = '" + farm + "'";
            ResultSet rs = sta.executeQuery(Sql);

            String count = "0";
            while (rs.next()) {
                count = rs.getString("COUNT").trim();
            }
            return count;
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

    //M001House
    public String CheckHouseDuplicate(String farm, String house) {

        Connection conn = null;
        try {
            conn = ConnectSQLite.ConnectionSQLite();
            Statement sta = conn.createStatement();
            String Sql = "SELECT COUNT (*) AS COUNT \n"
                    + "FROM FAR_MHOUSE \n"
                    + "WHERE HOUS_FARM = '" + farm + "' \n"
                    + "AND HOUS_CODE = '" + house + "'";
            ResultSet rs = sta.executeQuery(Sql);

            String count = "0";
            while (rs.next()) {
                count = rs.getString("COUNT").trim();
            }
            return count;
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

    public String CheckHouseMulti(String jTextFarm, String jTextHouse) {
        Connection conn = null;
        try {
            conn = ConnectSQLite.ConnectionSQLite();
            Statement sta = conn.createStatement();
            String Sql = "SELECT HOUS_MULTI FROM FAR_MHOUSE\n"
                    + "WHERE HOUS_FARM = '" + jTextFarm + "'\n"
                    + "AND HOUS_CODE = '" + jTextHouse + "'";
            ResultSet rs = sta.executeQuery(Sql);
            String house = "";
            while (rs.next()) {
                house = rs.getString("HOUS_MULTI").trim();
            }
            return house;
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

    //M001Pene
    public String CheckPeneDuplicate(String farm, String pene) {

        Connection conn = null;
        try {
            conn = ConnectSQLite.ConnectionSQLite();
            Statement sta = conn.createStatement();
            String Sql = "SELECT COUNT (*) AS COUNT \n"
                    + "FROM FAR_MPENE \n"
                    + "WHERE PENE_FARM = '" + farm + "' "
                    + "AND PENE_CODE = '" + pene + "'";
            ResultSet rs = sta.executeQuery(Sql);
            String count = "0";
            while (rs.next()) {
                count = rs.getString("COUNT").trim();
            }
            return count;
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

    //M001FLock
    public String CheckFlockDuplicate(String farm, String house) {

        Connection conn = null;
        try {
            conn = ConnectSQLite.ConnectionSQLite();
            Statement sta = conn.createStatement();
            String Sql = "SELECT COUNT (*) AS COUNT \n"
                    + "FROM FAR_MHOUSE \n"
                    + "WHERE HOUS_FARM = '" + farm + "' \n"
                    + "AND HOUS_CODE = '" + house + "'";
            ResultSet rs = sta.executeQuery(Sql);

            String count = "0";
            while (rs.next()) {
                count = rs.getString("COUNT").trim();
            }
            return count;
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

    //M001Item
    public String CheckItemDuplicate(String farm, String item) {

        Connection conn = null;
        try {
            conn = ConnectSQLite.ConnectionSQLite();
            Statement sta = conn.createStatement();
            String Sql = "SELECT COUNT (*) AS COUNT \n"
                    + "FROM FAR_MITEM \n"
                    + "WHERE ITEM_CODE = '" + item + "'";
            ResultSet rs = sta.executeQuery(Sql);

            String count = "0";
            while (rs.next()) {
                count = rs.getString("COUNT").trim();
            }
            return count;
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

    //M001Infor
    public String CheckInforDuplicate(String farm, String date, String house, String item, String dise, String breed,String desc) {

        Connection conn = null;
        try {
            conn = ConnectSQLite.ConnectionSQLite();
            Statement sta = conn.createStatement();
            String Sql = "SELECT COUNT (*) AS COUNT \n"
                    + "FROM FAR_MINFORM \n"
                    + "WHERE INFO_FARM = '" + farm + "' \n"
                    + "AND INFO_DATE = '" + date + "' \n"
                    + "AND INFO_HOUSE = '" + house + "' \n"
                    + "AND INFO_ITEM = '" + item + "' \n"
                    + "AND INFO_DISE = '" + dise + "' \n"
                    + "AND INFO_DESC = '" + desc + "'\n"
                    + "AND INFO_BREED = '" + breed + "'";
            ResultSet rs = sta.executeQuery(Sql);

            String count = "0";
            while (rs.next()) {
                count = rs.getString("COUNT").trim();
            }
            return count;
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

    //M001Type
    public String CheckTypeDuplicate(String jTextFarm, String jTextCode) {

        Connection conn = null;
        try {
            conn = ConnectSQLite.ConnectionSQLite();
            Statement sta = conn.createStatement();
            String Sql = "SELECT COUNT (*) AS COUNT \n"
                    + "FROM FAR_MTYPE \n"
                    + "WHERE TYPE_CODE = '" + jTextCode + "' \n"
                    + "AND TYPE_FARM = '" + jTextFarm + "'";
            ResultSet rs = sta.executeQuery(Sql);
            String count = "0";
            while (rs.next()) {
                count = rs.getString("COUNT").trim();
            }
            return count;
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

    //M001Unit
    public String CheckUnitDuplicate(String jTextFarm, String jTextCode) {

        Connection conn = null;
        try {
            conn = ConnectSQLite.ConnectionSQLite();
            Statement sta = conn.createStatement();
            String Sql = "SELECT COUNT (*) AS COUNT \n"
                    + "FROM FAR_ITEMUNIT \n"
                    + "WHERE ITUN_CODE = '" + jTextCode + "' \n"
                    + "AND ITUN_FARM = '" + jTextFarm + "'";
            ResultSet rs = sta.executeQuery(Sql);
            String count = "0";
            while (rs.next()) {
                count = rs.getString("COUNT").trim();
            }
            return count;
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

    //M001Group
    public String CheckGroupDuplicate(String jTextFarm, String jTextCode) {

        Connection conn = null;
        try {
            conn = ConnectSQLite.ConnectionSQLite();
            Statement sta = conn.createStatement();
            String Sql = "SELECT COUNT (*) AS COUNT \n"
                    + "FROM FAR_ITEMGROUP \n"
                    + "WHERE ITGR_CODE = '" + jTextCode + "' \n"
                    + "AND ITGR_FARM = '" + jTextFarm + "'";
            ResultSet rs = sta.executeQuery(Sql);
            String count = "0";
            while (rs.next()) {
                count = rs.getString("COUNT").trim();
            }
            return count;
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

    //M001Unit
    public String CheckCertDuplicate(String jTextFarm, String jTextCode) {

        Connection conn = null;
        try {
            conn = ConnectSQLite.ConnectionSQLite();
            Statement sta = conn.createStatement();
            String Sql = "SELECT COUNT (*) AS COUNT \n"
                    + "FROM FAR_CERTIFICATION \n"
                    + "WHERE CERT_FARM = '" + jTextFarm + "'";
            ResultSet rs = sta.executeQuery(Sql);
            String count = "0";
            while (rs.next()) {
                count = rs.getString("COUNT").trim();
            }
            return count;
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

    //BF01E001G Grower Setting
    public String CheckGrowerDuplicate(String jTextFarm, String jTextHouse, String jTextDate, String jTextBreed) {

        Connection conn = null;
        try {
            conn = ConnectSQLite.ConnectionSQLite();
            Statement sta = conn.createStatement();
            String Sql = "SELECT COUNT(*) AS COUNT \n"
                    + "FROM FAR_GROWER \n"
                    + "WHERE PSGR_DATE = '" + jTextDate + "' \n"
                    + "AND PSGR_FARM = '" + jTextFarm + "' \n"
                    + "AND PSGR_HOUSE = '" + jTextHouse + "' \n"
                    + "AND PSGR_BREED = '" + jTextBreed + "'";
            ResultSet rs = sta.executeQuery(Sql);

            String count = "0";
            while (rs.next()) {
                count = rs.getString("COUNT").trim();
            }
            return count;
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

    public String CheckInvenBalDuplicate(String jTextFarm, String jTextHouse, String jTextDate, String jTextFML, String jTextItemML, String jTextBreed) {

        Connection conn = null;
        try {
            conn = ConnectSQLite.ConnectionSQLite();
            Statement sta = conn.createStatement();
            String Sql = "SELECT COUNT(*) AS COUNT \n"
                    + "FROM FAR_INVENBAL \n"
                    + "WHERE INVE_DATE = '" + jTextDate + "' \n"
                    + "AND INVE_FARM = '" + jTextFarm + "' \n"
                    + "AND INVE_HOUSE = '" + jTextHouse + "' \n"
                    + "AND (INVE_ITEM = '" + jTextFML + "' OR INVE_ITEM = '" + jTextItemML + "') \n"
                    + "AND INVE_BREED = '" + jTextBreed + "'";
            ResultSet rs = sta.executeQuery(Sql);

            String count = "0";
            while (rs.next()) {
                count = rs.getString("COUNT").trim();
            }
            return count;
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

    public String CheckDInvenBalDuplicate(String jTextFarm, String jTextHouse, String jTextDate, String jTextFML, String jTextItemML, String jTextBreed, String jTextBreedAll) {

        Connection conn = null;
        try {
            conn = ConnectSQLite.ConnectionSQLite();
            Statement sta = conn.createStatement();
            String Sql = "SELECT COUNT(*) AS COUNT \n"
                    + "FROM FAR_DINVENBAL \n"
                    + "WHERE INVE_DATE = '" + jTextDate + "' \n"
                    + "AND INVE_FARM = '" + jTextFarm + "' \n"
                    + "AND INVE_HOUSE = '" + jTextHouse + "' \n"
                    + "AND INVE_ITEM IN ('" + jTextFML + "','" + jTextItemML + "') \n"
                    + "AND INVE_BREED IN ('" + jTextBreed + "','" + jTextBreedAll + "')";
            ResultSet rs = sta.executeQuery(Sql);

            String count = "0";
            while (rs.next()) {
                count = rs.getString("COUNT").trim();
            }
            return count;
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

    public String CheckInvenBalDuplicateNotDate(String jTextFarm, String jTextHouse, String jTextFML, String jTextItemML, String jTextBreed, String jTextBreedAll) {

        Connection conn = null;
        try {
            conn = ConnectSQLite.ConnectionSQLite();
            Statement sta = conn.createStatement();
            String Sql = "SELECT COUNT(*) AS COUNT \n"
                    + "FROM FAR_INVENBAL \n"
                    + "WHERE INVE_FARM = '" + jTextFarm + "' \n"
                    + "AND INVE_HOUSE = '" + jTextHouse + "' \n"
                    + "AND INVE_ITEM IN ('" + jTextFML + "','" + jTextItemML + "') \n"
                    + "AND INVE_BREED IN ('" + jTextBreed + "','" + jTextBreedAll + "')";
            ResultSet rs = sta.executeQuery(Sql);

            String count = "0";
            while (rs.next()) {
                count = rs.getString("COUNT").trim();
            }
            return count;
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

    public String CheckInvenLotDuplicate(String jTextFarm, String jTextHouse, String jTextFlock, String jTextDate, String jTextFML, String jTextItemML, String jTextBreed, String jTextBreedAll) {

        Connection conn = null;
        try {
            conn = ConnectSQLite.ConnectionSQLite();
            Statement sta = conn.createStatement();
            String Sql = "SELECT COUNT(*) AS COUNT \n"
                    + "FROM FAR_INVENLOT \n"
                    + "WHERE INVE_DATE = '" + jTextDate + "' \n"
                    + "AND INVE_FARM = '" + jTextFarm + "' \n"
                    + "AND INVE_HOUSE = '" + jTextHouse + "' \n"
                    + "AND INVE_LOTNO = '" + jTextFlock + "' \n"
                    + "AND INVE_ITEM IN ('" + jTextFML + "','" + jTextItemML + "') \n"
                    + "AND INVE_BREED IN ('" + jTextBreed + "','" + jTextBreedAll + "')";
            ResultSet rs = sta.executeQuery(Sql);
            String count = "0";
            while (rs.next()) {
                count = rs.getString("COUNT").trim();
            }
            return count;
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

    public String CheckDInvenLotDuplicate(String jTextFarm, String jTextHouse, String jTextFlock, String jTextDate, String jTextFML, String jTextItemML, String jTextBreed, String jTextBreedAll) {

        Connection conn = null;
        try {
            conn = ConnectSQLite.ConnectionSQLite();
            Statement sta = conn.createStatement();
            String Sql = "SELECT COUNT(*) AS COUNT \n"
                    + "FROM FAR_DINVENLOT \n"
                    + "WHERE INVE_DATE = '" + jTextDate + "' \n"
                    + "AND INVE_FARM = '" + jTextFarm + "' \n"
                    + "AND INVE_HOUSE = '" + jTextHouse + "' \n"
                    + "AND INVE_LOTNO = '" + jTextFlock + "' \n"
                    + "AND INVE_ITEM IN ('" + jTextFML + "','" + jTextItemML + "') \n"
                    + "AND INVE_BREED IN ('" + jTextBreed + "','" + jTextBreedAll + "')";
            ResultSet rs = sta.executeQuery(Sql);
            String count = "0";
            while (rs.next()) {
                count = rs.getString("COUNT").trim();
            }
            return count;
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

    public String CheckInvenLotDuplicateNotDate(String jTextFarm, String jTextHouse, String jTextFlock, String jTextFML, String jTextItemML, String jTextBreed, String jTextBreedAll) {

        Connection conn = null;
        try {
            conn = ConnectSQLite.ConnectionSQLite();
            Statement sta = conn.createStatement();
            String Sql = "SELECT COUNT(*) AS COUNT \n"
                    + "FROM FAR_INVENLOT \n"
                    + "WHERE INVE_FARM = '" + jTextFarm + "' \n"
                    + "AND INVE_HOUSE = '" + jTextHouse + "' \n"
                    + "AND INVE_LOTNO = '" + jTextFlock + "' \n"
                    + "AND (INVE_ITEM = '" + jTextFML + "' OR INVE_ITEM = '" + jTextItemML + "') \n"
                    + "AND INVE_BREED IN ('" + jTextBreed + "','" + jTextBreedAll + "')";
            ResultSet rs = sta.executeQuery(Sql);
            String count = "0";
            while (rs.next()) {
                count = rs.getString("COUNT").trim();
            }
            return count;
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

    public String CheckQtyInvenLot(String jTextFarm, String jTextHouse, String jTextDate, String jTextFML, String jTextItemML, String jTextBreed, String jTextBreedAll) {

        Connection conn = null;
        try {
            conn = ConnectSQLite.ConnectionSQLite();
            Statement sta = conn.createStatement();
            String Sql = "SELECT INVE_DATE,INVE_HOUSE,INVE_ITEM,INVE_BALANCE,COALESCE(NULLIF(INVE_LOTNO,''), '0') AS INVE_LOTNO \n"
                    + "FROM FAR_INVENLOT \n"
                    + "WHERE INVE_DATE = '" + jTextDate + "' \n"
                    + "AND INVE_FARM = '" + jTextFarm + "' \n"
                    + "AND INVE_HOUSE = '" + jTextHouse + "' \n"
                    + "AND (INVE_ITEM = '" + jTextFML + "' OR INVE_ITEM = '" + jTextItemML + "') \n"
                    + "AND INVE_BREED IN ('" + jTextBreed + "','" + jTextBreedAll + "') \n"
                    + "ORDER BY INVE_LOTNO ASC";
            ResultSet rs = sta.executeQuery(Sql);

            String qtylot = "";
            while (rs.next()) {
                qtylot = rs.getString("INVE_BALANCE").trim() + " : " + rs.getString("INVE_LOTNO").trim();
            }
            return qtylot;
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

    public String CheckQtyInvenLotNotDate(String jTextFarm, String jTextHouse, String jTextFML, String jTextItemML, String jTextBreed, String jTextBreedAll) {

        Connection conn = null;
        try {
            conn = ConnectSQLite.ConnectionSQLite();
            Statement sta = conn.createStatement();
            String Sql = "SELECT INVE_BALANCE,COALESCE(NULLIF(INVE_LOTNO,''), '0') AS INVE_LOTNO \n"
                    + "FROM FAR_INVENLOT \n"
                    + "WHERE INVE_FARM = '" + jTextFarm + "' \n"
                    + "AND INVE_HOUSE = '" + jTextHouse + "' \n"
                    + "AND (INVE_ITEM = '" + jTextFML + "' OR INVE_ITEM = '" + jTextItemML + "') \n"
                    + "AND INVE_BREED IN ('" + jTextBreed + "','" + jTextBreedAll + "') \n"
                    + "ORDER BY INVE_LOTNO ASC";
            ResultSet rs = sta.executeQuery(Sql);
            String qtylot = "";
            while (rs.next()) {
                qtylot = rs.getString("INVE_BALANCE").trim() + " : " + rs.getString("INVE_LOTNO").trim();
            }
            return qtylot;
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

    //BF01E003L Laying Setting
    public String CheckLayingDuplicate(String jTextFarm, String jTextHouse, String jTextDate, String jTextBreed) {

        Connection conn = null;
        try {
            conn = ConnectSQLite.ConnectionSQLite();
            Statement sta = conn.createStatement();
            String Sql = "SELECT COUNT(*) AS COUNT \n"
                    + "FROM FAR_LAYING \n"
                    + "WHERE PSGR_DATE = '" + jTextDate + "' \n"
                    + "AND PSGR_FARM = '" + jTextFarm + "' \n"
                    + "AND PSGR_HOUSE = '" + jTextHouse + "' \n"
                    + "AND PSGR_BREED = '" + jTextBreed + "'";
            ResultSet rs = sta.executeQuery(Sql);
            String count = "0";
            while (rs.next()) {
                count = rs.getString("COUNT").trim();
            }
            return count;
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

    //BF01E004GMT Grower Moulting Setting
    public String CheckGMoultingDuplicate(String jTextFarm, String jTextHouse, String jTextDate, String jTextBreed) {

        Connection conn = null;
        try {
            conn = ConnectSQLite.ConnectionSQLite();
            Statement sta = conn.createStatement();
            String Sql = "SELECT COUNT(*) AS COUNT \n"
                    + "FROM FAR_GROWERMT \n"
                    + "WHERE PSGR_DATE = '" + jTextDate + "' \n"
                    + "AND PSGR_FARM = '" + jTextFarm + "' \n"
                    + "AND PSGR_HOUSE = '" + jTextHouse + "' \n"
                    + "AND PSGR_BREED = '" + jTextBreed + "'";
            ResultSet rs = sta.executeQuery(Sql);

            String count = "0";
            while (rs.next()) {
                count = rs.getString("COUNT").trim();
            }
            return count;
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

    //BF01E005LMT Laying Moulting Setting
    public String CheckLayingMTDuplicate(String jTextFarm, String jTextHouse, String jTextDate, String jTextBreed) {

        Connection conn = null;
        try {
            conn = ConnectSQLite.ConnectionSQLite();
            Statement sta = conn.createStatement();
            String Sql = "SELECT COUNT(*) AS COUNT \n"
                    + "FROM FAR_LAYING \n"
                    + "WHERE PSGR_DATE = '" + jTextDate + "' \n"
                    + "AND PSGR_FARM = '" + jTextFarm + "' \n"
                    + "AND PSGR_HOUSE = '" + jTextHouse + "' \n"
                    + "AND PSGR_BREED = '" + jTextBreed + "'";
            ResultSet rs = sta.executeQuery(Sql);

            String count = "0";
            while (rs.next()) {
                count = rs.getString("COUNT").trim();
            }
            return count;
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
    public String CheckItemLoc(String farm, String item) {

        Connection conn = null;
        try {
            conn = ConnectSQLite.ConnectionSQLite();
            Statement sta = conn.createStatement();
            String Sql = "SELECT COALESCE(ITEM_FLOCATION,'') AS ITEM_FLOCATION \n"
                    + "FROM FAR_MITEM\n"
                    + "WHERE ITEM_FARM = '" + farm + "'\n"
                    + "AND ITEM_CODE = '" + item + "'";
            ResultSet rs = sta.executeQuery(Sql);
            String loc = "";
            while (rs.next()) {
                loc = rs.getString("ITEM_FLOCATION").trim();
            }
            return loc;
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

    public String CheckItemOnhand(String farm, String house, String item, String breed, String breedall) {

        Connection conn = null;
        try {
            conn = ConnectSQLite.ConnectionSQLite();
            Statement sta = conn.createStatement();
            String Sql = "SELECT INVE_ITEM,SUM(INVE_BALANCE) AS INVE_BALANCE \n"
                    + "FROM \n"
                    + "(SELECT INVE_FARM,INVE_DATE,INVE_HOUSE,INVE_ITEM,INVE_BALANCE \n"
                    + "FROM FAR_INVENBAL \n"
                    + "WHERE INVE_FARM = '" + farm + "' \n"
                    + "AND INVE_BREED IN ('" + breed + "','" + breedall + "')) AS a \n"
                    + "LEFT JOIN \n"
                    + "(SELECT HOUS_CODE,HOUS_NAME \n"
                    + "FROM FAR_MHOUSE \n"
                    + "WHERE HOUS_FARM = '" + farm + "' \n"
                    + "AND HOUS_BREED IN ('" + breed + "','" + breedall + "')) AS b \n"
                    + "ON a.INVE_HOUSE = b.HOUS_CODE \n"
                    + "LEFT JOIN \n"
                    + "(SELECT ITEM_CODE,ITEM_NAME,ITEM_UNIT \n"
                    + "FROM FAR_MITEM \n"
                    + "WHERE ITEM_FARM = '" + farm + "') AS c \n"
                    + "ON a.INVE_ITEM = c.ITEM_CODE \n"
                    + "WHERE a.INVE_HOUSE = '" + house + "'\n"
                    + "AND a.INVE_ITEM = '" + item + "'\n"
                    + "GROUP BY INVE_ITEM";
            ResultSet rs = sta.executeQuery(Sql);

            String onhand = "0";
            while (rs.next()) {
                onhand = rs.getString("INVE_BALANCE").trim();
            }
            return onhand;
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

    public String CheckItemOnhandByLot(String farm, String house, String item, String lot, String breed, String breedall) {

        Connection conn = null;
        try {
            conn = ConnectSQLite.ConnectionSQLite();
            Statement sta = conn.createStatement();
            String Sql = "SELECT INVE_ITEM,SUM(INVE_BALANCE) AS INVE_BALANCE \n"
                    + "FROM \n"
                    + "(SELECT INVE_FARM,INVE_DATE,INVE_HOUSE,INVE_ITEM,INVE_BALANCE \n"
                    + "FROM FAR_INVENLOT \n"
                    + "WHERE INVE_FARM = '" + farm + "' \n"
                    + "AND INVE_LOTNO = '" + lot + "'"
                    + "AND INVE_BREED IN ('" + breed + "','" + breedall + "')) AS a \n"
                    + "LEFT JOIN \n"
                    + "(SELECT HOUS_CODE,HOUS_NAME \n"
                    + "FROM FAR_MHOUSE \n"
                    + "WHERE HOUS_FARM = '" + farm + "' \n"
                    + "AND HOUS_BREED IN ('" + breed + "','" + breedall + "')) AS b \n"
                    + "ON a.INVE_HOUSE = b.HOUS_CODE \n"
                    + "LEFT JOIN \n"
                    + "(SELECT ITEM_CODE,ITEM_NAME,ITEM_UNIT \n"
                    + "FROM FAR_MITEM \n"
                    + "WHERE ITEM_FARM = '" + farm + "') AS c \n"
                    + "ON a.INVE_ITEM = c.ITEM_CODE \n"
                    + "WHERE a.INVE_HOUSE = '" + house + "'\n"
                    + "AND a.INVE_ITEM = '" + item + "'\n"
                    + "GROUP BY INVE_ITEM";
            ResultSet rs = sta.executeQuery(Sql);

            String onhand = "0";
            while (rs.next()) {
                onhand = rs.getString("INVE_BALANCE").trim();
            }
            return onhand;
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

    public String CheckDInforDuplicate(String farm, String date, String house, String item, String dise, String refer) {

        Connection conn = null;
        try {
            conn = ConnectSQLite.ConnectionSQLite();
            Statement sta = conn.createStatement();
            String Sql = "SELECT COUNT (*) AS COUNT \n"
                    + "FROM FAR_DINFORM \n"
                    + "WHERE INFO_FARM = '" + farm + "' \n"
                    + "AND INFO_DATE = '" + date + "' \n"
                    + "AND INFO_HOUSE = '" + house + "' \n"
                    + "AND INFO_ITEM = '" + item + "' \n"
                    + "AND INFO_DISE = '" + dise + "' \n"
                    + "AND INFO_REFER = '" + refer + "'";
            ResultSet rs = sta.executeQuery(Sql);

            String count = "0";
            while (rs.next()) {
                count = rs.getString("COUNT").trim();
            }
            return count;
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

    public String CheckTypePro(String jTextFarm, String jTextCode) {

        Connection conn = null;
        try {
            conn = ConnectSQLite.ConnectionSQLite();
            Statement sta = conn.createStatement();
            String Sql = "SELECT TYPE_PROPERTY \n"
                    + "FROM FAR_MTYPE \n"
                    + "WHERE TYPE_CODE = '" + jTextCode + "' \n"
                    + "AND TYPE_FARM = '" + jTextFarm + "'";
            ResultSet rs = sta.executeQuery(Sql);
            String pro = "0";
            while (rs.next()) {
                pro = rs.getString("TYPE_PROPERTY").trim();
            }
            return pro;
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

    public String CheckItemStockCtrlEff(String farm, String item) {

        Connection conn = null;
        try {
            conn = ConnectSQLite.ConnectionSQLite();
            Statement sta = conn.createStatement();
            String Sql = "SELECT ITEM_STOCK,ITEM_STKCTL,COALESCE(NULLIF(ITEM_EFFITEM,''), '0') AS ITEM_EFFITEM \n"
                    + "FROM FAR_MITEM\n"
                    + "WHERE ITEM_FARM = '" + farm + "'\n"
                    + "AND ITEM_CODE = '" + item + "'";
            ResultSet rs = sta.executeQuery(Sql);
            String stockctrl = "";
            while (rs.next()) {
                stockctrl = rs.getString("ITEM_STOCK").trim() + " : " + rs.getString("ITEM_STKCTL").trim() + " : " + rs.getString("ITEM_EFFITEM").trim();
            }
            return stockctrl;
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

    //BF01E002 Transection
    public String CheckItemGroup(String jTextFarm, String item) {

        Connection conn = null;
        try {
            conn = ConnectSQLite.ConnectionSQLite();
            Statement sta = conn.createStatement();
            String Sql = "SELECT ITEM_GROUP \n"
                    + "FROM FAR_MITEM \n"
                    + "WHERE ITEM_CODE = '" + item + "'";
            ResultSet rs = sta.executeQuery(Sql);
            String group = "";
            while (rs.next()) {
                group = rs.getString("ITEM_GROUP").trim();
            }
            return group;
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

    public String CheckPenePAL(String farm) {

        Connection conn = null;
        try {
            conn = ConnectSQLite.ConnectionSQLite();
            Statement sta = conn.createStatement();
            String Sql = "SELECT PENE_CODE,PENE_NAME \n"
                    + "FROM FAR_MPENE \n"
                    + "WHERE PENE_FARM = '" + farm + "' "
                    + "AND PENE_CODE = 'PAL'";
            ResultSet rs = sta.executeQuery(Sql);
            String pene = "";
            while (rs.next()) {
                pene = rs.getString("PENE_CODE").trim() + " : " + rs.getString("PENE_NAME").trim();
            }
            return pene;
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

    public String CheckTypeWOM(String jTextFarm) {

        Connection conn = null;
        try {
            conn = ConnectSQLite.ConnectionSQLite();
            Statement sta = conn.createStatement();
            String Sql = "SELECT TYPE_CODE,TYPE_NAME \n"
                    + "FROM FAR_MTYPE \n"
                    + "WHERE TYPE_FARM = '" + jTextFarm + "' \n"
                    + "AND TYPE_CODE = 'WOM'";
            ResultSet rs = sta.executeQuery(Sql);
            String type = "";
            while (rs.next()) {
                type = rs.getString("TYPE_CODE").trim() + " : " + rs.getString("TYPE_NAME").trim();
            }
            return type;
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

    public String CheckTypeWOP(String jTextFarm) {

        Connection conn = null;
        try {
            conn = ConnectSQLite.ConnectionSQLite();
            Statement sta = conn.createStatement();
            String Sql = "SELECT TYPE_CODE,TYPE_NAME \n"
                    + "FROM FAR_MTYPE \n"
                    + "WHERE TYPE_FARM = '" + jTextFarm + "' \n"
                    + "AND TYPE_CODE = 'WOP'";
            ResultSet rs = sta.executeQuery(Sql);
            String type = "";
            while (rs.next()) {
                type = rs.getString("TYPE_CODE").trim() + " : " + rs.getString("TYPE_NAME").trim();
            }
            return type;
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

    public String CheckMInforDuplicate(String farm, String house, String date, String item, String dise, String breed) {

        Connection conn = null;
        try {
            conn = ConnectSQLite.ConnectionSQLite();
            Statement sta = conn.createStatement();
            String Sql = "SELECT COUNT (*) AS COUNT \n"
                    + "FROM FAR_MINFORM \n"
                    + "WHERE INFO_FARM = '" + farm + "' \n"
                    + "AND INFO_DATE = '" + date + "' \n"
                    + "AND INFO_HOUSE = '" + house + "' \n"
                    + "AND INFO_ITEM = '" + item + "' \n"
                    + "AND INFO_BREED = '" + breed + "' \n"
                    + "AND INFO_DISE = '" + dise + "'";
            ResultSet rs = sta.executeQuery(Sql);

            String count = "0";
            while (rs.next()) {
                count = rs.getString("COUNT").trim();
            }
            return count;
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

    //BF01E008 Description Egg Transfer
    public String CheckCert(String jTextFarm) {

        Connection conn = null;
        try {
            conn = ConnectSQLite.ConnectionSQLite();
            Statement sta = conn.createStatement();
            String Sql = "SELECT CERT_CODE,CERT_NAME \n"
                    + "FROM FAR_CERTIFICATION \n"
                    + "WHERE CERT_FARM ='" + jTextFarm + "'";
            ResultSet rs = sta.executeQuery(Sql);
            String cert = "";
            while (rs.next()) {
                cert = rs.getString("CERT_CODE").trim();
            }
            return cert;
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

    //BF01E008
    public String CheckMDescDuplicate(String farm, String date, String round, String breed) {

        Connection conn = null;
        try {
            conn = ConnectSQLite.ConnectionSQLite();
            Statement sta = conn.createStatement();
            String Sql = "SELECT COUNT (*) AS COUNT \n"
                    + "FROM FAR_MDESCRIPTION \n"
                    + "WHERE DESC_FARM = '" + farm + "' \n"
                    + "AND DESC_BREED = '" + breed + "' \n"
                    + "AND DESC_DATE = '" + date + "' \n"
                    + "AND DESC_TIMEWDT = '" + round + "'";
            ResultSet rs = sta.executeQuery(Sql);

            String count = "0";
            while (rs.next()) {
                count = rs.getString("COUNT").trim();
            }
            return count;
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
    public String CheckUserDuplicate(String jTextFarm, String jTextUser) {

        Connection conn = null;
        try {
            conn = ConnectSQLite.ConnectionSQLite();
            Statement sta = conn.createStatement();
            String Sql = "SELECT COUNT (*) AS COUNT \n"
                    + "FROM FAR_USER \n"
                    + "WHERE USE_FARM = '" + jTextFarm + "' \n"
                    + "AND USE_USER = '" + jTextUser + "'";
            ResultSet rs = sta.executeQuery(Sql);

            String count = "0";
            while (rs.next()) {
                count = rs.getString("COUNT").trim();
            }
            return count;
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

    public String CheckUserPassword(String jTextFarm, String jTextUser) {

        Connection conn = null;
        try {
            conn = ConnectSQLite.ConnectionSQLite();
            Statement sta = conn.createStatement();
            String Sql = "SELECT USE_PASSWORD \n"
                    + "FROM FAR_USER \n"
                    + "WHERE USE_FARM = '" + jTextFarm + "' \n"
                    + "AND USE_USER = '" + jTextUser + "'";
            ResultSet rs = sta.executeQuery(Sql);
            String user = "";
            while (rs.next()) {
                user = rs.getString("USE_PASSWORD").trim();
            }
            return user;
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

    //BF01U001 Item House
    public String CheckItemHouseDuplicate(String jTextFarm, String jTextHouse, String jTextCode, String jTextBreed) {

        Connection conn = null;
        try {
            conn = ConnectSQLite.ConnectionSQLite();
            Statement sta = conn.createStatement();
            String Sql = "SELECT COUNT (*) AS COUNT\n"
                    + "FROM FAR_ITEMHOUSE\n"
                    + "WHERE ITEMH_FARM = '" + jTextFarm + "'\n"
                    + "AND ITEMH_BREED = '" + jTextBreed + "'\n"
                    + "AND ITEMH_HOUSE = '" + jTextHouse + "'\n"
                    + "AND ITEMH_CODE = '" + jTextCode + "'";
            ResultSet rs = sta.executeQuery(Sql);

            String count = "0";
            while (rs.next()) {
                count = rs.getString("COUNT").trim();
            }
            return count;
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

    //Get Max Tranfer Number
    public String CheckMaxTranferNumber(String jTextFarm, String jTextDate, String jTextBreed) {

        Connection conn = null;
        try {
            conn = ConnectSQLite.ConnectionSQLite();
            Statement sta = conn.createStatement();
            String Sql = "SELECT COALESCE(MAX(SUBSTR(TRAN_LOTNO,14,16)),0) + 1 AS TRAN_LOTNO\n"
                    + "FROM FAR_DTRANSECTION\n"
                    + "WHERE TRAN_FARM = '" + jTextFarm + "'\n"
                    + "AND TRAN_BREED = '" + jTextBreed + "'\n"
                    + "AND TRAN_TYPE = 'ISS' \n"
                    + "AND SUBSTR(TRAN_DATE,7) || SUBSTR(TRAN_DATE,4,2) || SUBSTR(TRAN_DATE,1,2) = '" + jTextDate + "'";
            ResultSet rs = sta.executeQuery(Sql);

            String lotno = "";
            while (rs.next()) {
                lotno = rs.getString("TRAN_LOTNO").trim();
            }
            return lotno;
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
