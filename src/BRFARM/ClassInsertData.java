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
import javax.swing.JOptionPane;

/**
 *
 * @author Wattana
 */
public class ClassInsertData {

    //M001FarmEdit
    public void InsertFarm(String jTextCode, String jTextName, String jTextCostc, String jTextAdd1, String jTextAdd2, String jTextTel, String jTextFax) {

        Connection conn = null;
        try {
            conn = ConnectSQLite.ConnectionSQLite();
            Statement sta = conn.createStatement();
            String Sql = "INSERT INTO FAR_MFARM \n"
                    + "(FARM_CODE,FARM_NAME,FARM_COSTC,FARM_ADDR1,FARM_ADDR2,FARM_TEL,FARM_FAX) \n"
                    + "VALUES ('" + jTextCode + "', \n"
                    + "'" + jTextName + "', \n"
                    + "'" + jTextCostc + "', \n"
                    + "'" + jTextAdd1 + "', \n"
                    + "'" + jTextAdd2 + "', \n"
                    + "'" + jTextTel + "', \n"
                    + "'" + jTextFax + "')";
            sta.execute(Sql);

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex);
        } finally {
            if (conn != null) {
                try {
                    conn.close();
                } catch (SQLException ex) {
                    System.out.println(ex.toString());
                }
            }
        }

    }

    public void UpdateFarm(String jTextCode, String jTextName, String jTextCostc, String jTextAdd1, String jTextAdd2, String jTextTel, String jTextFax) {

        Connection conn = null;
        try {
            conn = ConnectSQLite.ConnectionSQLite();
            Statement sta = conn.createStatement();
            String Sql = "UPDATE FAR_MFARM \n"
                    + "SET FARM_NAME = '" + jTextName + "', \n"
                    + "FARM_COSTC = '" + jTextCostc + "', \n"
                    + "FARM_ADDR1 = '" + jTextAdd1 + "', \n"
                    + "FARM_ADDR2 = '" + jTextAdd2 + "', \n"
                    + "FARM_TEL = '" + jTextTel + "', \n"
                    + "FARM_FAX = '" + jTextFax + "' \n"
                    + "WHERE FARM_CODE = '" + jTextCode + "'";

            sta.execute(Sql);

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex);
        } finally {
            if (conn != null) {
                try {
                    conn.close();
                } catch (SQLException ex) {
                    System.out.println(ex.toString());
                }
            }
        }

    }

    public void DeleteFarm(String jTextCode) {

        Connection conn = null;
        try {
            conn = ConnectSQLite.ConnectionSQLite();
            Statement sta = conn.createStatement();
            String Sql = "DELETE FROM FAR_MFARM \n"
                    + "WHERE FARM_CODE = '" + jTextCode + "'";
            sta.execute(Sql);

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex);
        } finally {
            if (conn != null) {
                try {
                    conn.close();
                } catch (SQLException ex) {
                    System.out.println(ex.toString());
                }
            }
        }

    }

    //M001HouseEdit
    public void InsertHouse(String jTextCode, String jTextHouse, String jTextName, String jTextLastMo, String jTextMulti, String jTextBreed) {

        Connection conn = null;
        try {
            conn = ConnectSQLite.ConnectionSQLite();
            Statement sta = conn.createStatement();
            String Sql = "INSERT INTO FAR_MHOUSE \n"
                    + "(HOUS_FARM,HOUS_CODE,HOUS_NAME,HOUS_LASTMO,HOUS_MULTI,HOUS_BREED) \n"
                    + "VALUES ('" + jTextCode + "','" + jTextHouse + "','" + jTextName + "','" + jTextLastMo + "','" + jTextMulti + "','" + jTextBreed + "')";
            sta.execute(Sql);

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex);
        } finally {
            if (conn != null) {
                try {
                    conn.close();
                } catch (SQLException ex) {
                    System.out.println(ex.toString());
                }
            }
        }

    }

    public void UpdateHouse(String jTextCode, String jTextHouse, String jTextName, String jTextLastMo, String jTextMulti, String jTextBreed) {

        Connection conn = null;
        try {
            conn = ConnectSQLite.ConnectionSQLite();
            Statement sta = conn.createStatement();
            String Sql = "UPDATE FAR_MHOUSE \n"
                    + "SET HOUS_NAME = '" + jTextName + "', \n"
                    + "HOUS_LASTMO = '" + jTextLastMo + "', \n"
                    + "HOUS_MULTI = '" + jTextMulti + "', \n"
                    + "HOUS_BREED = '" + jTextBreed + "' \n"
                    + "WHERE HOUS_FARM = '" + jTextCode + "' \n"
                    + "AND HOUS_CODE = '" + jTextHouse + "'";

            sta.execute(Sql);

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex);
        } finally {
            if (conn != null) {
                try {
                    conn.close();
                } catch (SQLException ex) {
                    System.out.println(ex.toString());
                }
            }
        }

    }

    public void DeleteHouse(String jTextCode, String jTextHouse, String jTextBreed) {

        Connection conn = null;
        try {
            conn = ConnectSQLite.ConnectionSQLite();
            Statement sta = conn.createStatement();
            String Sql = "DELETE FROM FAR_MHOUSE \n"
                    + "WHERE HOUS_FARM = '" + jTextCode + "' \n"
                    + "AND HOUS_CODE = '" + jTextHouse + "' \n"
                    + "AND HOUS_BREED = '" + jTextBreed + "'";
            sta.execute(Sql);

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex);
        }

    }

    //M001PeneEdit
    public void InsertPene(String jTextFarm, String jTextPene, String jTextName) {

        Connection conn = null;
        try {
            conn = ConnectSQLite.ConnectionSQLite();
            Statement sta = conn.createStatement();
            String Sql = "INSERT INTO FAR_MPENE \n"
                    + "(PENE_FARM,PENE_CODE,PENE_NAME) \n"
                    + "VALUES ('" + jTextFarm + "',"
                    + "'" + jTextPene + "',"
                    + "'" + jTextName + "') ";
            sta.execute(Sql);

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex);
        } finally {
            if (conn != null) {
                try {
                    conn.close();
                } catch (SQLException ex) {
                    System.out.println(ex.toString());
                }
            }
        }

    }

    public void UpdatePene(String jTextFarm, String jTextCode, String jTextPene) {

        Connection conn = null;
        try {
            conn = ConnectSQLite.ConnectionSQLite();
            Statement sta = conn.createStatement();
            String Sql = "UPDATE FAR_MPENE \n"
                    + "SET PENE_NAME = '" + jTextPene + "' \n"
                    + "WHERE PENE_FARM = '" + jTextFarm + "'\n"
                    + "AND PENE_CODE = '" + jTextCode + "'";

            sta.execute(Sql);

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex);
        } finally {
            if (conn != null) {
                try {
                    conn.close();
                } catch (SQLException ex) {
                    System.out.println(ex.toString());
                }
            }
        }

    }

    public void DeletePene(String jTextFarm, String jTextCode) {

        Connection conn = null;
        try {
            conn = ConnectSQLite.ConnectionSQLite();
            Statement sta = conn.createStatement();
            String Sql = "DELETE FROM FAR_MPENE \n"
                    + "WHERE PENE_FARM = '" + jTextFarm + "'\n"
                    + "AND PENE_CODE = '" + jTextCode + "'";
            sta.execute(Sql);

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex);
        }

    }

    //M001FlockEdit
    public void InsertFlock(String jTextCode, String jTextFarm, String jXDateStart, String jXDateEnd, String jTextDesc, String jTextStatus, String jXDateWeek, String jTextBreed) {

        Connection conn = null;
        try {
            conn = ConnectSQLite.ConnectionSQLite();
            Statement sta = conn.createStatement();
            String Sql = "INSERT INTO FAR_FLOCK \n"
                    + "(FLOC_FARM,FLOC_CODE,FLOC_STDATE,FLOC_ENDATE,FLOC_DESC,FLOC_STATUS,FLOC_STWEEK,FLOC_BREED) \n"
                    + "VALUES ('" + jTextFarm + "', \n"
                    + "'" + jTextCode + "', \n"
                    + "'" + jXDateStart + "', \n"
                    + "'" + jXDateEnd + "', \n"
                    + "'" + jTextDesc + "', \n"
                    + "'" + jTextStatus + "', \n"
                    + "'" + jXDateWeek + "', \n"
                    + "'" + jTextBreed + "')";
            sta.execute(Sql);

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex);
        } finally {
            if (conn != null) {
                try {
                    conn.close();
                } catch (SQLException ex) {
                    System.out.println(ex.toString());
                }
            }
        }

    }

    public void UpdateFlock(String jTextCode, String jTextFarm, String jXDateStart, String jXDateEnd, String jTextDesc, String jTextStatus, String jXDateWeek, String jTextBreed) {

        Connection conn = null;
        try {
            conn = ConnectSQLite.ConnectionSQLite();
            Statement sta = conn.createStatement();
            String Sql = "UPDATE FAR_FLOCK \n"
                    + "SET FLOC_STDATE = '" + jXDateStart + "', \n"
                    + "FLOC_ENDATE = '" + jXDateEnd + "', \n"
                    + "FLOC_DESC = '" + jTextDesc + "', \n"
                    + "FLOC_STATUS = '" + jTextStatus + "', \n"
                    + "FLOC_STWEEK = '" + jXDateWeek + "' \n"
                    + "WHERE FLOC_FARM = '" + jTextFarm + "' \n"
                    + "AND FLOC_CODE = '" + jTextCode + "' \n"
                    + "AND FLOC_BREED = '" + jTextBreed + "'";
            sta.execute(Sql);

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex);
        } finally {
            if (conn != null) {
                try {
                    conn.close();
                } catch (SQLException ex) {
                    System.out.println(ex.toString());
                }
            }
        }

    }

    public void DeleteFlock(String jTextFarm, String jTextCode, String jTextBreed) {

        Connection conn = null;
        try {
            conn = ConnectSQLite.ConnectionSQLite();
            Statement sta = conn.createStatement();
            String Sql = "DELETE FROM FAR_FLOCK \n"
                    + "WHERE FLOC_FARM = '" + jTextFarm + "' \n"
                    + "AND FLOC_BREED = '" + jTextBreed + "' \n"
                    + "AND FLOC_CODE = '" + jTextCode + "'";
            sta.execute(Sql);

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex);
        } finally {
            if (conn != null) {
                try {
                    conn.close();
                } catch (SQLException ex) {
                    System.out.println(ex.toString());
                }
            }
        }

    }

    //M001ItemEdit
    public void InsertItem(String jTextFarm, String jTextCode, String jTextName, String jItemUnit, String jItemGroup, String jTextHouse, String jTextStkctl, String jTextStock, String jTextEffItem, String jTextMulti, String jTextBreed) {

        Connection conn = null;
        try {
            conn = ConnectSQLite.ConnectionSQLite();
            Statement sta = conn.createStatement();
            String Sql = "INSERT INTO FAR_MITEM \n"
                    + "(ITEM_FARM,ITEM_CODE,ITEM_NAME,ITEM_UNIT,ITEM_GROUP,ITEM_FLOCATION,ITEM_STKCTL,ITEM_STOCK,ITEM_EFFITEM,ITEM_MULTI,ITEM_BREED) \n"
                    + "VALUES ('" + jTextFarm + "', \n"
                    + "'" + jTextCode + "', \n"
                    + "'" + jTextName + "', \n"
                    + "'" + jItemUnit + "', \n"
                    + "'" + jItemGroup + "', \n"
                    + "'" + jTextHouse + "', \n"
                    + "'" + jTextStkctl + "', \n"
                    + "'" + jTextStock + "', \n"
                    + "'" + jTextEffItem + "', \n"
                    + "'" + jTextMulti + "', \n"
                    + "'" + jTextBreed + "')";
            sta.execute(Sql);

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex);
        } finally {
            if (conn != null) {
                try {
                    conn.close();
                } catch (SQLException ex) {
                    System.out.println(ex.toString());
                }
            }
        }

    }

    public void UpdateItem(String jTextFarm, String jTextCode, String jTextName, String jTextItemUnit, String jTextItemGroup, String jTextTextHouse, String jTextStkctl, String jTextStock, String jTextEffItem, String jTextMulti, String jTextBreed) {

        Connection conn = null;
        try {
            conn = ConnectSQLite.ConnectionSQLite();
            Statement sta = conn.createStatement();
            String Sql = "UPDATE FAR_MITEM \n"
                    + "SET ITEM_NAME = '" + jTextName + "', \n"
                    + "ITEM_UNIT = '" + jTextItemUnit + "', \n"
                    + "ITEM_GROUP = '" + jTextItemGroup + "', \n"
                    + "ITEM_FLOCATION = '" + jTextTextHouse + "', \n"
                    + "ITEM_STKCTL = '" + jTextStkctl + "', \n"
                    + "ITEM_STOCK = '" + jTextStock + "', \n"
                    + "ITEM_EFFITEM = '" + jTextEffItem + "', \n"
                    + "ITEM_MULTI = '" + jTextMulti + "', \n"
                    + "ITEM_BREED = '" + jTextBreed + "' \n"
                    + "WHERE ITEM_FARM = '" + jTextFarm + "'"
                    + "AND ITEM_CODE = '" + jTextCode + "'";
            sta.execute(Sql);

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex);
        } finally {
            if (conn != null) {
                try {
                    conn.close();
                } catch (SQLException ex) {
                    System.out.println(ex.toString());
                }
            }
        }

    }

    public void DeleteItem(String jTextFarm, String jTextCode, String jTextBreed) {

        Connection conn = null;
        try {
            conn = ConnectSQLite.ConnectionSQLite();
            Statement sta = conn.createStatement();
            String Sql = "DELETE FROM FAR_MITEM \n"
                    + "WHERE ITEM_FARM = '" + jTextFarm + "' \n"
                    + "AND ITEM_BREED = '" + jTextBreed + "' \n"
                    + "AND ITEM_CODE = '" + jTextCode + "'";
            sta.execute(Sql);

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex);
        } finally {
            if (conn != null) {
                try {
                    conn.close();
                } catch (SQLException ex) {
                    System.out.println(ex.toString());
                }
            }
        }

    }

    //M001InforEdit
    public void InsertMInfor(String jTextFarm, String jTextDate, String jTextHouse, String jTextCode, String jTextDesc, String jTextDise, String jTextQty, String jTextRefQty, String jTextBreed) {

        Connection conn = null;
        try {
            conn = ConnectSQLite.ConnectionSQLite();
            Statement sta = conn.createStatement();
            String Sql = "INSERT INTO FAR_MINFORM "
                    + "(INFO_FARM,INFO_DATE,INFO_HOUSE,INFO_ITEM,INFO_DESC,INFO_DISE,INFO_QTY,INFO_REFER,INFO_BREED) "
                    + "VALUES ('" + jTextFarm + "', \n"
                    + "'" + jTextDate + "', \n"
                    + "'" + jTextHouse + "', \n"
                    + "'" + jTextCode + "', \n"
                    + "'" + jTextDesc + "', \n"
                    + "'" + jTextDise + "', \n"
                    + "'" + jTextQty + "', \n"
                    + "'" + jTextRefQty + "', \n"
                    + "'" + jTextBreed + "')";
            sta.execute(Sql);

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex);
        } finally {
            if (conn != null) {
                try {
                    conn.close();
                } catch (SQLException ex) {
                    System.out.println(ex.toString());
                }
            }
        }

    }

    public void UpdateMInfor(String jTextFarm, String jTextDate, String jTextHouse, String jTextCode, String jTextDesc, String jTextDise, String jTextQty, String jTextRefQty, String jTextBreed) {

        Connection conn = null;
        try {
            conn = ConnectSQLite.ConnectionSQLite();
            Statement sta = conn.createStatement();
            String Sql = "UPDATE FAR_MINFORM \n"
                    + "SET INFO_DESC = '" + jTextDesc + "', \n"
                    //                    + "INFO_DISE = '" + jTextDise + "', \n"
                    + "INFO_QTY = '" + jTextQty + "', \n"
                    + "INFO_REFER = '" + jTextRefQty + "' \n"
                    + "WHERE INFO_FARM = '" + jTextFarm + "' \n"
                    + "AND INFO_DATE = '" + jTextDate + "'\n"
                    + "AND INFO_HOUSE = '" + jTextHouse + "' \n"
                    + "AND INFO_ITEM = '" + jTextCode + "' \n"
                    + "AND INFO_DISE = '" + jTextDise + "' \n"
                    + "AND INFO_BREED = '" + jTextBreed + "'";
            sta.execute(Sql);

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex);
        } finally {
            if (conn != null) {
                try {
                    conn.close();
                } catch (SQLException ex) {
                    System.out.println(ex.toString());
                }
            }
        }

    }

    public void DeleteMInfor(String jTextFarm, String jTextDate, String jTextHouse, String jTextCode, String jTextDesc, String jTextDise, String jTextQty, String jTextBreed) {

        Connection conn = null;
        try {
            conn = ConnectSQLite.ConnectionSQLite();
            Statement sta = conn.createStatement();
            String Sql = "DELETE FROM FAR_MINFORM \n"
                    + "WHERE INFO_FARM = '" + jTextFarm + "' \n"
                    + "AND INFO_DATE = '" + jTextDate + "' \n"
                    + "AND INFO_HOUSE = '" + jTextHouse + "' \n"
                    + "AND INFO_ITEM = '" + jTextCode + "' \n"
                    + "AND INFO_DESC = '" + jTextDesc + "' \n"
                    + "AND INFO_DISE = '" + jTextDise + "' \n"
                    + "AND INFO_QTY = '" + jTextQty + "' \n"
                    + "AND INFO_BREED = '" + jTextBreed + "'";
            sta.execute(Sql);

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex);
        } finally {
            if (conn != null) {
                try {
                    conn.close();
                } catch (SQLException ex) {
                    System.out.println(ex.toString());
                }
            }
        }

    }

    //M001TypeEdit
    public void InsertType(String jTextFarm, String jTextCode, String jTextName, String jTextProperty) {

        Connection conn = null;
        try {
            conn = ConnectSQLite.ConnectionSQLite();
            Statement sta = conn.createStatement();
            String Sql = "INSERT INTO FAR_MTYPE "
                    + "(TYPE_FARM,TYPE_CODE,TYPE_NAME,TYPE_PROPERTY) \n"
                    + "VALUES ('" + jTextFarm + "', \n"
                    + "'" + jTextCode + "', \n"
                    + "'" + jTextName + "', \n"
                    + "'" + jTextProperty + "')";
            sta.execute(Sql);

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex);
        } finally {
            if (conn != null) {
                try {
                    conn.close();
                } catch (SQLException ex) {
                    System.out.println(ex.toString());
                }
            }
        }

    }

    public void UpdateType(String jTextFarm, String jTextCode, String jTextName, String jTextProperty) {

        Connection conn = null;
        try {
            conn = ConnectSQLite.ConnectionSQLite();
            Statement sta = conn.createStatement();
            String Sql = "UPDATE FAR_MTYPE \n"
                    + "SET TYPE_NAME = '" + jTextName + "', \n"
                    + "TYPE_PROPERTY = '" + jTextProperty + "' \n"
                    + "WHERE TYPE_CODE = '" + jTextCode + "' \n"
                    + "AND TYPE_FARM = '" + jTextFarm + "'";
            sta.execute(Sql);

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex);
        }

    }

    public void DeleteType(String jTextFarm, String jTextCode) {

        Connection conn = null;
        try {
            conn = ConnectSQLite.ConnectionSQLite();
            Statement sta = conn.createStatement();
            String Sql = "DELETE FROM FAR_MTYPE \n"
                    + "WHERE TYPE_FARM = '" + jTextFarm + "' \n"
                    + "AND TYPE_CODE = '" + jTextCode + "'";
            sta.execute(Sql);

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex);
        } finally {
            if (conn != null) {
                try {
                    conn.close();
                } catch (SQLException ex) {
                    System.out.println(ex.toString());
                }
            }
        }

    }

    //M001UnitEdit
    public void InsertUnit(String jTextFarm, String jTextCode, String jTextName, String jTextStatus) {

        Connection conn = null;
        try {
            conn = ConnectSQLite.ConnectionSQLite();
            Statement sta = conn.createStatement();
            String Sql = "INSERT INTO FAR_ITEMUNIT\n"
                    + "(ITUN_FARM, ITUN_CODE, ITUN_NAME, ITUN_STATUS)\n"
                    + "VALUES('" + jTextFarm + "', \n"
                    + "'" + jTextCode + "', \n"
                    + "'" + jTextName + "', \n"
                    + "'" + jTextStatus + "')";
            sta.execute(Sql);

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex);
        } finally {
            if (conn != null) {
                try {
                    conn.close();
                } catch (SQLException ex) {
                    System.out.println(ex.toString());
                }
            }
        }

    }

    public void UpdateUnit(String jTextFarm, String jTextCode, String jTextName, String jTextStatus) {

        Connection conn = null;
        try {
            conn = ConnectSQLite.ConnectionSQLite();
            Statement sta = conn.createStatement();
            String Sql = "UPDATE FAR_ITEMUNIT\n"
                    + "SET ITUN_NAME = '" + jTextName + "', \n"
                    + "ITUN_STATUS = '" + jTextStatus + "' \n"
                    + "WHERE ITUN_CODE = '" + jTextCode + "' \n"
                    + "AND ITUN_FARM = '" + jTextFarm + "'";
            sta.execute(Sql);

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex);
        }

    }

    public void DeleteUnit(String jTextFarm, String jTextCode) {

        Connection conn = null;
        try {
            conn = ConnectSQLite.ConnectionSQLite();
            Statement sta = conn.createStatement();
            String Sql = "DELETE FROM FAR_ITEMUNIT \n"
                    + "WHERE ITUN_CODE = '" + jTextCode + "' \n"
                    + "AND ITUN_FARM = '" + jTextFarm + "'";
            sta.execute(Sql);

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex);
        } finally {
            if (conn != null) {
                try {
                    conn.close();
                } catch (SQLException ex) {
                    System.out.println(ex.toString());
                }
            }
        }

    }

    //M001GroupEdit
    public void InsertGroup(String jTextFarm, String jTextCode, String jTextName, String jTextStatus) {

        Connection conn = null;
        try {
            conn = ConnectSQLite.ConnectionSQLite();
            Statement sta = conn.createStatement();
            String Sql = "INSERT INTO FAR_ITEMGROUP\n"
                    + "(ITGR_FARM, ITGR_CODE, ITGR_NAME, ITGR_STATUS)\n"
                    + "VALUES('" + jTextFarm + "', \n"
                    + "'" + jTextCode + "', \n"
                    + "'" + jTextName + "', \n"
                    + "'" + jTextStatus + "')";
            sta.execute(Sql);

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex);
        } finally {
            if (conn != null) {
                try {
                    conn.close();
                } catch (SQLException ex) {
                    System.out.println(ex.toString());
                }
            }
        }

    }

    public void UpdateGroup(String jTextFarm, String jTextCode, String jTextName, String jTextStatus) {

        Connection conn = null;
        try {
            conn = ConnectSQLite.ConnectionSQLite();
            Statement sta = conn.createStatement();
            String Sql = "UPDATE FAR_ITEMGROUP\n"
                    + "SET ITGR_NAME = '" + jTextName + "', \n"
                    + "ITGR_STATUS = '" + jTextStatus + "' \n"
                    + "WHERE ITGR_CODE = '" + jTextCode + "' \n"
                    + "AND ITGR_FARM = '" + jTextFarm + "'";
            sta.execute(Sql);

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex);
        }

    }

    public void DeleteGroup(String jTextFarm, String jTextCode) {

        Connection conn = null;
        try {
            conn = ConnectSQLite.ConnectionSQLite();
            Statement sta = conn.createStatement();
            String Sql = "DELETE FROM FAR_ITEMGROUP \n"
                    + "WHERE ITGR_CODE = '" + jTextCode + "' \n"
                    + "AND ITGR_FARM = '" + jTextFarm + "'";
            sta.execute(Sql);

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex);
        } finally {
            if (conn != null) {
                try {
                    conn.close();
                } catch (SQLException ex) {
                    System.out.println(ex.toString());
                }
            }
        }

    }

    //M001CertEdit
    public void InsertCert(String jTextFarm, String jTextCode, String jTextName) {

        Connection conn = null;
        try {
            conn = ConnectSQLite.ConnectionSQLite();
            Statement sta = conn.createStatement();
            String Sql = "INSERT INTO FAR_CERTIFICATION\n"
                    + "(CERT_FARM, CERT_CODE, CERT_NAME)\n"
                    + "VALUES('" + jTextFarm + "', \n"
                    + "'" + jTextCode + "', \n"
                    + "'" + jTextName + "')";
            sta.execute(Sql);

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex);
        } finally {
            if (conn != null) {
                try {
                    conn.close();
                } catch (SQLException ex) {
                    System.out.println(ex.toString());
                }
            }
        }

    }

    public void UpdateCert(String jTextFarm, String jTextCode, String jTextName) {

        Connection conn = null;
        try {
            conn = ConnectSQLite.ConnectionSQLite();
            Statement sta = conn.createStatement();
            String Sql = "UPDATE FAR_CERTIFICATION \n"
                    + "SET CERT_NAME = '" + jTextName + "' \n"
                    + "WHERE CERT_CODE = '" + jTextCode + "' \n"
                    + "AND CERT_FARM = '" + jTextFarm + "'";
            sta.execute(Sql);

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex);
        }

    }

    public void DeleteCert(String jTextFarm, String jTextCode) {

        Connection conn = null;
        try {
            conn = ConnectSQLite.ConnectionSQLite();
            Statement sta = conn.createStatement();
            String Sql = "DELETE FROM FAR_CERTIFICATION \n"
                    + "WHERE CERT_CODE = '" + jTextCode + "' \n"
                    + "AND CERT_FARM = '" + jTextFarm + "'";
            sta.execute(Sql);

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex);
        } finally {
            if (conn != null) {
                try {
                    conn.close();
                } catch (SQLException ex) {
                    System.out.println(ex.toString());
                }
            }
        }

    }

    //BF01U001
    public void InsertUser(String jTextFarm, String jTextUser, String jTextPassword, String jTextName, String jTextApprove, String jTextAuthorize) {

        Connection conn = null;
        try {
            conn = ConnectSQLite.ConnectionSQLite();
            Statement sta = conn.createStatement();
            String Sql = "INSERT INTO FAR_USER\n"
                    + "(USE_FARM,USE_USER,USE_PASSWORD,USE_NAME,USE_APPR,USE_AUTH)\n"
                    + "VALUES('" + jTextFarm + "', \n"
                    + "'" + jTextUser + "', \n"
                    + "'" + jTextPassword + "', \n"
                    + "'" + jTextName + "', \n"
                    + "'" + jTextApprove + "', \n"
                    + "'" + jTextAuthorize + "')";
            sta.execute(Sql);

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex);
        } finally {
            if (conn != null) {
                try {
                    conn.close();
                } catch (SQLException ex) {
                    System.out.println(ex.toString());
                }
            }
        }

    }

    public void UpdateUser(String jTextFarm, String jTextUser, String jTextPassword, String jTextName, String jTextApprove) {

        Connection conn = null;
        try {
            conn = ConnectSQLite.ConnectionSQLite();
            Statement sta = conn.createStatement();
            String Sql = "UPDATE FAR_USER \n"
                    + "SET USE_PASSWORD = '" + jTextPassword + "', \n"
                    + "USE_NAME = '" + jTextName + "', \n"
                    + "USE_APPR = '" + jTextApprove + "' \n"
                    + "WHERE USE_USER = '" + jTextUser + "' \n"
                    + "AND USE_FARM = '" + jTextFarm + "'";
            sta.execute(Sql);

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex);
        }

    }

    public void DeleteUser(String jTextFarm, String jTextUser) {

        Connection conn = null;
        try {
            conn = ConnectSQLite.ConnectionSQLite();
            Statement sta = conn.createStatement();
            String Sql = "DELETE FROM FAR_USER \n"
                    + "WHERE USE_FARM = '" + jTextFarm + "' \n"
                    + "AND USE_USER = '" + jTextUser + "'";
            sta.execute(Sql);

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex);
        } finally {
            if (conn != null) {
                try {
                    conn.close();
                } catch (SQLException ex) {
                    System.out.println(ex.toString());
                }
            }
        }

    }

    //GP01E001G Grower Setting
    public void InsertMOGrower(String jTextFarm, String jTextHouse, String jTextFlock, String jTextDate, String jTextFlight, String jTextFrom, String jTextCar1, String jTextST1,
            String jTextAR1, String jTextTem1, String jTextCar2, String jTextST2, String jTextAR2, String jTextTem2, String jTextFTotal, String jTextMTotal,
            String jTextFDeadAP, String jTextMDeadAP, String jTextFCullAP, String jTextMCullAP, String jTextFDeadT, String jTextMDeadT, String jTextFCullT,
            String jTextMCullT, String jTextFDeadVac, String jTextMDeadVac, String jTextFInsert, String jTextMInsert, String jTextMO, String jTextBreed) {

        Connection conn = null;
        try {
            conn = ConnectSQLite.ConnectionSQLite();
            Statement sta = conn.createStatement();
            String Sql = "INSERT INTO FAR_GROWER(PSGR_FARM,PSGR_DATE,PSGR_FLIGHT,PSGR_FROM,PSGR_HOUSE,PSGR_FLOCK,PSGR_CAR1,PSGR_ST1, \n"
                    + "PSGR_ARF1,PSGR_TEMP1,PSGR_CAR2,PSGR_ST2,PSGR_ARF2,PSGR_TEMP2,PSGR_DODF,PSGR_DODM,PSGR_DEADAPF,PSGR_DEADAPM, \n"
                    + "PSGR_CULLAPF,PSGR_CULLAPM,PSGR_DEADTF,PSGR_DEADTM,PSGR_CULLTF,PSGR_CULLTM,PSGR_DEADVACF,PSGR_DEADVACM,PSGR_FEMALE,PSGR_MALE,PSGR_MO,PSGR_Breed) \n"
                    + "VALUES ('" + jTextFarm + "', \n"
                    + "'" + jTextDate + "', \n"
                    + "'" + jTextFlight + "', \n"
                    + "'" + jTextFrom + "', \n"
                    + "'" + jTextHouse + "', \n"
                    + "'" + jTextFlock + "', \n"
                    + "'" + jTextCar1 + "', \n"
                    + "'" + jTextST1 + "', \n"
                    + "'" + jTextAR1 + "', \n"
                    + "'" + jTextTem1 + "', \n"
                    + "'" + jTextCar2 + "', \n"
                    + "'" + jTextST2 + "', \n"
                    + "'" + jTextAR2 + "', \n"
                    + "'" + jTextTem2 + "', \n"
                    + "'" + jTextFTotal + "', \n"
                    + "'" + jTextMTotal + "', \n"
                    + "'" + jTextFDeadAP + "', \n"
                    + "'" + jTextMDeadAP + "', \n"
                    + "'" + jTextFCullAP + "', \n"
                    + "'" + jTextMCullAP + "', \n"
                    + "'" + jTextFDeadT + "', \n"
                    + "'" + jTextMDeadT + "', \n"
                    + "'" + jTextFCullT + "', \n"
                    + "'" + jTextMCullT + "', \n"
                    + "'" + jTextFDeadVac + "', \n"
                    + "'" + jTextMDeadVac + "', \n"
                    + "'" + jTextFInsert + "', \n"
                    + "'" + jTextMInsert + "', \n"
                    + "'" + jTextMO + "', \n"
                    + "'" + jTextBreed + "')";
            sta.execute(Sql);

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex);
        } finally {
            if (conn != null) {
                try {
                    conn.close();
                } catch (SQLException ex) {
                    System.out.println(ex.toString());
                }
            }
        }

    }

    public void UpdateMOGrower(String jTextFarm, String jTextHose, String jTextMO) {

        Connection conn = null;
        try {
            conn = ConnectSQLite.ConnectionSQLite();
            Statement sta = conn.createStatement();
            String Sql = "UPDATE FAR_MHOUSE \n"
                    + "SET HOUS_LASTMO = '" + jTextMO + "' \n"
                    + "WHERE HOUS_FARM = '" + jTextFarm + "' \n"
                    + "AND HOUS_CODE = '" + jTextHose + "'";
            sta.execute(Sql);

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex);
        } finally {
            if (conn != null) {
                try {
                    conn.close();
                } catch (SQLException ex) {
                    System.out.println(ex.toString());
                }
            }
        }

    }

    public void InsertInvenBal(String jTextFarm, String jTextHouse, String jTextDate, String jTextItem, String jTextSumTotal, String jTextBreed) {

        Connection conn = null;
        try {
            conn = ConnectSQLite.ConnectionSQLite();
            Statement sta = conn.createStatement();
            String Sql = "INSERT INTO FAR_INVENBAL (INVE_FARM,INVE_DATE,INVE_HOUSE,INVE_ITEM,INVE_BALANCE,INVE_BREED) \n"
                    + "VALUES ('" + jTextFarm + "', \n"
                    + "'" + jTextDate + "', \n"
                    + "'" + jTextHouse + "', \n"
                    + "'" + jTextItem + "', \n"
                    + "'" + jTextSumTotal + "', \n"
                    + "'" + jTextBreed + "')";
            sta.execute(Sql);

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex);
        } finally {
            if (conn != null) {
                try {
                    conn.close();
                } catch (SQLException ex) {
                    System.out.println(ex.toString());
                }
            }
        }

    }

    public void InsertDInvenBal(String jTextFarm, String jTextHouse, String jTextDate, String jTextItem, String jTextSumTotal, String jTextBreed) {

        Connection conn = null;
        try {
            conn = ConnectSQLite.ConnectionSQLite();
            Statement sta = conn.createStatement();
            String Sql = "INSERT INTO FAR_DINVENBAL (INVE_FARM,INVE_DATE,INVE_HOUSE,INVE_ITEM,INVE_BALANCE,INVE_BREED) \n"
                    + "VALUES ('" + jTextFarm + "', \n"
                    + "'" + jTextDate + "', \n"
                    + "'" + jTextHouse + "', \n"
                    + "'" + jTextItem + "', \n"
                    + "'" + jTextSumTotal + "', \n"
                    + "'" + jTextBreed + "')";
            sta.execute(Sql);

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex);
        } finally {
            if (conn != null) {
                try {
                    conn.close();
                } catch (SQLException ex) {
                    System.out.println(ex.toString());
                }
            }
        }

    }

    public void InsertMTranDInvenBal(String jTextFarm, String jXDateSet, String jXDateEnd, String jTextBreed, String jTextBreedAll) {

        Connection conn = null;
        try {
            conn = ConnectSQLite.ConnectionSQLite();
            Statement sta = conn.createStatement();
            String Sql = "INSERT INTO FAR_DINVENBAL\n"
                    + "SELECT TRAN_FARM,'" + jXDateSet + "',TRAN_HOUSE,TRAN_ITEM,TRAN_QTY,CASE WHEN SUBSTR(TRAN_ITEM,0,3) IN ('FM','RM') THEN '" + jTextBreedAll + "' ELSE TRAN_BREED END AS TRAN_BREED\n"
                    + "FROM\n"
                    + "(SELECT TRAN_FARM,CASE WHEN SUBSTR(TRAN_ITEM,0,3) IN ('FM','RM') THEN '" + jTextFarm + "301" + "' ELSE TRAN_HOUSE END AS TRAN_HOUSE,TRAN_ITEM,ROUND(SUM(TRAN_QTY),2) AS TRAN_QTY,TRAN_BREED \n"
                    + "FROM FAR_MTRANSECTION\n"
                    + "WHERE TRAN_FARM = '" + jTextFarm + "'\n"
                    //                    + "AND TRAN_BREED IN ('" + jTextBreed + "','" + jTextBreedAll + "')\n"
                    + "AND SUBSTR(TRAN_DATE,7) || SUBSTR(TRAN_DATE,4,2) || SUBSTR(TRAN_DATE,1,2) BETWEEN '' AND '" + jXDateEnd + "'\n"
                    + "AND SUBSTR(TRAN_ITEM,0,3) IN ('FM','RM')\n"
                    + "GROUP BY TRAN_ITEM\n"
                    + "UNION ALL\n"
                    + "SELECT TRAN_FARM,TRAN_HOUSE,TRAN_ITEM,ROUND(SUM(TRAN_QTY),2) AS TRAN_QTY,TRAN_BREED \n"
                    + "FROM FAR_MTRANSECTION\n"
                    + "WHERE TRAN_FARM = '" + jTextFarm + "'\n"
                    + "AND TRAN_BREED IN ('" + jTextBreed + "','" + jTextBreedAll + "')\n"
                    + "AND SUBSTR(TRAN_DATE,7) || SUBSTR(TRAN_DATE,4,2) || SUBSTR(TRAN_DATE,1,2) BETWEEN '' AND '" + jXDateEnd + "'\n"
                    + "AND SUBSTR(TRAN_ITEM,0,3) NOT IN ('FM','RM')\n"
                    + "AND SUBSTR(TRAN_ITEM,0,4) NOT IN ('" + jTextBreed + "5" + "')\n"
                    + "AND SUBSTR(TRAN_ITEM,0,6) NOT IN ('" + jTextBreed + "403" + "','" + jTextBreed + "404" + "')\n"
//                    + "AND TRAN_TYPE != 'BE'\n"
                    + "GROUP BY TRAN_HOUSE,TRAN_ITEM)\n"
                    + "WHERE TRAN_QTY > 0";
            sta.execute(Sql);

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex);
        } finally {
            if (conn != null) {
                try {
                    conn.close();
                } catch (SQLException ex) {
                    System.out.println(ex.toString());
                }
            }
        }

    }

    public void DeleteDInvenBal(String jTextFarm, String jTextDate, String jTextBreed, String jTextBreedAll) {

        Connection conn = null;
        try {
            conn = ConnectSQLite.ConnectionSQLite();
            Statement sta = conn.createStatement();
            String Sql = "DELETE FROM FAR_DINVENBAL \n"
                    + "WHERE INVE_DATE = '" + jTextDate + "' \n"
                    + "AND INVE_FARM = '" + jTextFarm + "' \n"
                    + "AND INVE_BREED IN ('" + jTextBreed + "','" + jTextBreedAll + "')";
            sta.execute(Sql);

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex);
        } finally {
            if (conn != null) {
                try {
                    conn.close();
                } catch (SQLException ex) {
                    System.out.println(ex.toString());
                }
            }
        }

    }

    public void UpdateInvenBal(String jTextFarm, String jTextHouse, String jTextDate, String jTextItem, String jTextSumTotal, String jTextBreed, String jTextBreedAll) {

        Connection conn = null;
        try {
            conn = ConnectSQLite.ConnectionSQLite();
            Statement sta = conn.createStatement();
            String Sql = "UPDATE FAR_INVENBAL \n"
                    + "SET INVE_BALANCE = ROUND(INVE_BALANCE+'" + jTextSumTotal + "',2) \n"
                    + "WHERE INVE_DATE = '" + jTextDate + "' \n"
                    + "AND INVE_FARM = '" + jTextFarm + "' \n"
                    + "AND INVE_HOUSE = '" + jTextHouse + "' \n"
                    + "AND INVE_ITEM = '" + jTextItem + "' \n"
                    + "AND INVE_BREED IN ('" + jTextBreed + "','" + jTextBreedAll + "')";
            sta.execute(Sql);

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex);
        } finally {
            if (conn != null) {
                try {
                    conn.close();
                } catch (SQLException ex) {
                    System.out.println(ex.toString());
                }
            }
        }

    }

    public void UpdateDInvenBal(String jTextFarm, String jTextHouse, String jTextDate, String jTextItem, String jTextSumTotal, String jTextBreed, String jTextBreedAll) {

        Connection conn = null;
        try {
            conn = ConnectSQLite.ConnectionSQLite();
            Statement sta = conn.createStatement();
            String Sql = "UPDATE FAR_DINVENBAL \n"
                    + "SET INVE_BALANCE = ROUND(INVE_BALANCE+'" + jTextSumTotal + "',2) \n"
                    + "WHERE INVE_DATE = '" + jTextDate + "' \n"
                    + "AND INVE_FARM = '" + jTextFarm + "' \n"
                    + "AND INVE_HOUSE = '" + jTextHouse + "' \n"
                    + "AND INVE_ITEM = '" + jTextItem + "' \n"
                    + "AND INVE_BREED IN ('" + jTextBreed + "','" + jTextBreedAll + "')";
            sta.execute(Sql);

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex);
        } finally {
            if (conn != null) {
                try {
                    conn.close();
                } catch (SQLException ex) {
                    System.out.println(ex.toString());
                }
            }
        }

    }

    public void UpdateInvenBalChangeDate(String jTextFarm, String jTextHouse, String jTextDate, String jTextItem, String jTextSumTotal, String jTextBreed, String jTextBreedAll) {

        Connection conn = null;
        try {
            conn = ConnectSQLite.ConnectionSQLite();
            Statement sta = conn.createStatement();
            String Sql = "UPDATE FAR_INVENBAL \n"
                    + "SET INVE_BALANCE = ROUND(INVE_BALANCE+'" + jTextSumTotal + "',2), \n"
                    + "INVE_DATE = '" + jTextDate + "' \n"
                    + "WHERE INVE_FARM = '" + jTextFarm + "' \n"
                    + "AND INVE_HOUSE = '" + jTextHouse + "' \n"
                    + "AND INVE_ITEM = '" + jTextItem + "' \n"
                    + "AND INVE_BREED IN ('" + jTextBreed + "','" + jTextBreedAll + "')";
            sta.execute(Sql);

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex);
        } finally {
            if (conn != null) {
                try {
                    conn.close();
                } catch (SQLException ex) {
                    System.out.println(ex.toString());
                }
            }
        }

    }

    public void InsertInvenLot(String jTextFarm, String jTextHouse, String jTextFlock, String jTextDate, String jTextItem, String jTextSumTotal, String jTextBreed) {

        Connection conn = null;
        try {
            conn = ConnectSQLite.ConnectionSQLite();
            Statement sta = conn.createStatement();
            String Sql = "INSERT INTO FAR_INVENLOT (INVE_FARM,INVE_DATE,INVE_HOUSE,INVE_LOTNO,INVE_ITEM,INVE_BALANCE,INVE_BREED) \n"
                    + "VALUES ('" + jTextFarm + "', \n"
                    + "'" + jTextDate + "', \n"
                    + "'" + jTextHouse + "', \n"
                    + "'" + jTextFlock + "', \n"
                    + "'" + jTextItem + "', \n"
                    + "'" + jTextSumTotal + "', \n"
                    + "'" + jTextBreed + "')";
            sta.execute(Sql);

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex);
        } finally {
            if (conn != null) {
                try {
                    conn.close();
                } catch (SQLException ex) {
                    System.out.println(ex.toString());
                }
            }
        }

    }

    public void InsertDInvenLot(String jTextFarm, String jTextHouse, String jTextFlock, String jTextDate, String jTextItem, String jTextSumTotal, String jTextBreed) {

        Connection conn = null;
        try {
            conn = ConnectSQLite.ConnectionSQLite();
            Statement sta = conn.createStatement();
            String Sql = "INSERT INTO FAR_DINVENLOT (INVE_FARM,INVE_DATE,INVE_HOUSE,INVE_LOTNO,INVE_ITEM,INVE_BALANCE,INVE_BREED) \n"
                    + "VALUES ('" + jTextFarm + "', \n"
                    + "'" + jTextDate + "', \n"
                    + "'" + jTextHouse + "', \n"
                    + "'" + jTextFlock + "', \n"
                    + "'" + jTextItem + "', \n"
                    + "'" + jTextSumTotal + "', \n"
                    + "'" + jTextBreed + "')";
            sta.execute(Sql);

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex);
        } finally {
            if (conn != null) {
                try {
                    conn.close();
                } catch (SQLException ex) {
                    System.out.println(ex.toString());
                }
            }
        }

    }

    public void UpdateInvenLot(String jTextFarm, String jTextHouse, String jTextFlock, String jTextDate, String jTextItem, String jTextSumTotal, String jTextBreed, String jTextBreedAll) {

        Connection conn = null;
        try {
            conn = ConnectSQLite.ConnectionSQLite();
            Statement sta = conn.createStatement();
            String Sql = "UPDATE FAR_INVENLOT \n"
                    + "SET INVE_BALANCE = ROUND(INVE_BALANCE+'" + jTextSumTotal + "',2), \n"
                    + "INVE_DATE = '" + jTextDate + "' \n"
                    + "WHERE INVE_FARM = '" + jTextFarm + "' \n"
                    + "AND INVE_HOUSE = '" + jTextHouse + "' \n"
                    + "AND INVE_LOTNO = '" + jTextFlock + "' \n"
                    + "AND INVE_ITEM = '" + jTextItem + "' \n"
                    + "AND INVE_BREED IN ('" + jTextBreed + "','" + jTextBreedAll + "')";
            sta.execute(Sql);

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex);
        } finally {
            if (conn != null) {
                try {
                    conn.close();
                } catch (SQLException ex) {
                    System.out.println(ex.toString());
                }
            }
        }

    }

    public void UpdateDInvenLot(String jTextFarm, String jTextHouse, String jTextFlock, String jTextDate, String jTextItem, String jTextSumTotal, String jTextBreed, String jTextBreedAll) {

        Connection conn = null;
        try {
            conn = ConnectSQLite.ConnectionSQLite();
            Statement sta = conn.createStatement();
            String Sql = "UPDATE FAR_DINVENLOT \n"
                    + "SET INVE_BALANCE = ROUND(INVE_BALANCE+'" + jTextSumTotal + "',2) \n"
                    + "WHERE INVE_DATE = '" + jTextDate + "' \n"
                    + "AND INVE_FARM = '" + jTextFarm + "' \n"
                    + "AND INVE_HOUSE = '" + jTextHouse + "' \n"
                    + "AND INVE_LOTNO = '" + jTextFlock + "' \n"
                    + "AND INVE_ITEM = '" + jTextItem + "' \n"
                    + "AND INVE_BREED IN ('" + jTextBreed + "','" + jTextBreedAll + "')";
            sta.execute(Sql);

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex);
        } finally {
            if (conn != null) {
                try {
                    conn.close();
                } catch (SQLException ex) {
                    System.out.println(ex.toString());
                }
            }
        }

    }

    public void UpdateInvenLotWithOutDate(String jTextFarm, String jTextHouse, String jTextFlock, String jTextItem, String jTextSumTotal, String jTextBreed, String jTextBreedAll) {

        Connection conn = null;
        try {
            conn = ConnectSQLite.ConnectionSQLite();
            Statement sta = conn.createStatement();
            String Sql = "UPDATE FAR_INVENLOT \n"
                    + "SET INVE_BALANCE = ROUND(INVE_BALANCE+'" + jTextSumTotal + "',2) \n"
                    + "WHERE INVE_FARM = '" + jTextFarm + "' \n"
                    + "AND INVE_HOUSE = '" + jTextHouse + "' \n"
                    + "AND INVE_LOTNO = '" + jTextFlock + "' \n"
                    + "AND INVE_ITEM = '" + jTextItem + "' \n"
                    + "AND INVE_BREED IN ('" + jTextBreed + "','" + jTextBreedAll + "')";
            sta.execute(Sql);

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex);
        } finally {
            if (conn != null) {
                try {
                    conn.close();
                } catch (SQLException ex) {
                    System.out.println(ex.toString());
                }
            }
        }

    }

    //GP01E003L Laying Setting
    public void InsertMOLaying(String jTextFarm, String jTextHouse, String jTextFlock, String jTextDate, String jTextFlight, String jTextFrom, String jTextCar1, String jTextST1,
            String jTextAR1, String jTextTem1, String jTextCar2, String jTextST2, String jTextAR2, String jTextTem2, String jTextFTotal, String jTextMTotal,
            String jTextFDeadAP, String jTextMDeadAP, String jTextFCullAP, String jTextMCullAP, String jTextFDeadT, String jTextMDeadT, String jTextFCullT,
            String jTextMCullT, String jTextFDeadVac, String jTextMDeadVac, String jTextFInsert, String jTextMInsert, String jTextMO, String jTextBreed) {

        Connection conn = null;
        try {
            conn = ConnectSQLite.ConnectionSQLite();
            Statement sta = conn.createStatement();
            String Sql = "INSERT INTO FAR_LAYING(PSGR_FARM,PSGR_DATE,PSGR_FLIGHT,PSGR_FROM,PSGR_HOUSE,PSGR_FLOCK,PSGR_CAR1,PSGR_ST1, \n"
                    + "PSGR_ARF1,PSGR_TEMP1,PSGR_CAR2,PSGR_ST2,PSGR_ARF2,PSGR_TEMP2,PSGR_DODF,PSGR_DODM,PSGR_DEADAPF,PSGR_DEADAPM, \n"
                    + "PSGR_CULLAPF,PSGR_CULLAPM,PSGR_DEADTF,PSGR_DEADTM,PSGR_CULLTF,PSGR_CULLTM,PSGR_DEADVACF,PSGR_DEADVACM,PSGR_FEMALE,PSGR_MALE,PSGR_MO,PSGR_Breed) \n"
                    + "VALUES ('" + jTextFarm + "', \n"
                    + "'" + jTextDate + "', \n"
                    + "'" + jTextFlight + "', \n"
                    + "'" + jTextFrom + "', \n"
                    + "'" + jTextHouse + "', \n"
                    + "'" + jTextFlock + "', \n"
                    + "'" + jTextCar1 + "', \n"
                    + "'" + jTextST1 + "', \n"
                    + "'" + jTextAR1 + "', \n"
                    + "'" + jTextTem1 + "', \n"
                    + "'" + jTextCar2 + "', \n"
                    + "'" + jTextST2 + "', \n"
                    + "'" + jTextAR2 + "', \n"
                    + "'" + jTextTem2 + "', \n"
                    + "'" + jTextFTotal + "', \n"
                    + "'" + jTextMTotal + "', \n"
                    + "'" + jTextFDeadAP + "', \n"
                    + "'" + jTextMDeadAP + "', \n"
                    + "'" + jTextFCullAP + "', \n"
                    + "'" + jTextMCullAP + "', \n"
                    + "'" + jTextFDeadT + "', \n"
                    + "'" + jTextMDeadT + "', \n"
                    + "'" + jTextFCullT + "', \n"
                    + "'" + jTextMCullT + "', \n"
                    + "'" + jTextFDeadVac + "', \n"
                    + "'" + jTextMDeadVac + "', \n"
                    + "'" + jTextFInsert + "', \n"
                    + "'" + jTextMInsert + "', \n"
                    + "'" + jTextMO + "', \n"
                    + "'" + jTextBreed + "')";
            sta.execute(Sql);

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex);
        } finally {
            if (conn != null) {
                try {
                    conn.close();
                } catch (SQLException ex) {
                    System.out.println(ex.toString());
                }
            }
        }

    }

    public void InsertPSMOLaying(String jTextFarm, String jTextHouse, String jTextFlock, String jTextDate,
            String jTextFTotal, String jTextMTotal, String jTextFDeadAP, String jTextMDeadAP, String jTextFCullAP, String jTextMCullAP, String jTextFDeadT, String jTextMDeadT,
            String jTextFCullT, String jTextMCullT, String jTextFDeadVac, String jTextMDeadVac, String jTextFInsert, String jTextMInsert, String jTextMO, String jTextBreed) {

        Connection conn = null;
        try {
            conn = ConnectSQLite.ConnectionSQLite();
            Statement sta = conn.createStatement();
            String Sql = "INSERT INTO FAR_LAYING(PSLA_FARM, PSLA_DATE, PSLA_HOUSE, PSLA_FLOCK, PSLA_MO, PSLA_FEMALE, PSLA_MALE, PSLA_BREED) \n"
                    + "VALUES ('" + jTextFarm + "', \n"
                    + "'" + jTextDate + "', \n"
                    + "'" + jTextHouse + "', \n"
                    + "'" + jTextFlock + "', \n"
                    + "'" + jTextMO + "', \n"
                    + "'" + jTextFInsert + "', \n"
                    + "'" + jTextMInsert + "', \n"
                    + "'" + jTextBreed + "')";
            sta.execute(Sql);

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex);
        } finally {
            if (conn != null) {
                try {
                    conn.close();
                } catch (SQLException ex) {
                    System.out.println(ex.toString());
                }
            }
        }

    }

    //GP01E004GMT Grower Moulting Setting
    public void InsertMOGrowerMT(String jTextFarm, String jTextHouse, String jTextFlock, String jTextDate, String jTextFlight, String jTextFrom, String jTextCar1, String jTextST1,
            String jTextAR1, String jTextTem1, String jTextCar2, String jTextST2, String jTextAR2, String jTextTem2, String jTextFTotal, String jTextMTotal,
            String jTextFDeadAP, String jTextMDeadAP, String jTextFCullAP, String jTextMCullAP, String jTextFDeadT, String jTextMDeadT, String jTextFCullT,
            String jTextMCullT, String jTextFDeadVac, String jTextMDeadVac, String jTextFInsert, String jTextMInsert, String jTextMO, String jTextBreed) {

        Connection conn = null;
        try {
            conn = ConnectSQLite.ConnectionSQLite();
            Statement sta = conn.createStatement();
            String Sql = "INSERT INTO FAR_GROWERMT(PSGR_FARM,PSGR_DATE,PSGR_FLIGHT,PSGR_FROM,PSGR_HOUSE,PSGR_FLOCK,PSGR_CAR1,PSGR_ST1, \n"
                    + "PSGR_ARF1,PSGR_TEMP1,PSGR_CAR2,PSGR_ST2,PSGR_ARF2,PSGR_TEMP2,PSGR_DODF,PSGR_DODM,PSGR_DEADAPF,PSGR_DEADAPM, \n"
                    + "PSGR_CULLAPF,PSGR_CULLAPM,PSGR_DEADTF,PSGR_DEADTM,PSGR_CULLTF,PSGR_CULLTM,PSGR_DEADVACF,PSGR_DEADVACM,PSGR_FEMALE,PSGR_MALE,PSGR_MO,PSGR_Breed) \n"
                    + "VALUES ('" + jTextFarm + "', \n"
                    + "'" + jTextDate + "', \n"
                    + "'" + jTextFlight + "', \n"
                    + "'" + jTextFrom + "', \n"
                    + "'" + jTextHouse + "', \n"
                    + "'" + jTextFlock + "', \n"
                    + "'" + jTextCar1 + "', \n"
                    + "'" + jTextST1 + "', \n"
                    + "'" + jTextAR1 + "', \n"
                    + "'" + jTextTem1 + "', \n"
                    + "'" + jTextCar2 + "', \n"
                    + "'" + jTextST2 + "', \n"
                    + "'" + jTextAR2 + "', \n"
                    + "'" + jTextTem2 + "', \n"
                    + "'" + jTextFTotal + "', \n"
                    + "'" + jTextMTotal + "', \n"
                    + "'" + jTextFDeadAP + "', \n"
                    + "'" + jTextMDeadAP + "', \n"
                    + "'" + jTextFCullAP + "', \n"
                    + "'" + jTextMCullAP + "', \n"
                    + "'" + jTextFDeadT + "', \n"
                    + "'" + jTextMDeadT + "', \n"
                    + "'" + jTextFCullT + "', \n"
                    + "'" + jTextMCullT + "', \n"
                    + "'" + jTextFDeadVac + "', \n"
                    + "'" + jTextMDeadVac + "', \n"
                    + "'" + jTextFInsert + "', \n"
                    + "'" + jTextMInsert + "', \n"
                    + "'" + jTextMO + "', \n"
                    + "'" + jTextBreed + "')";
            sta.execute(Sql);

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex);
        } finally {
            if (conn != null) {
                try {
                    conn.close();
                } catch (SQLException ex) {
                    System.out.println(ex.toString());
                }
            }
        }

    }

    public void InsertMOGMoulting(String jTextFarm, String jTextHouse, String jTextFlock, String jTextDate,
            String jTextFTotal, String jTextMTotal, String jTextFDeadAP, String jTextMDeadAP, String jTextFCullAP, String jTextMCullAP, String jTextFDeadT, String jTextMDeadT,
            String jTextFCullT, String jTextMCullT, String jTextFDeadVac, String jTextMDeadVac, String jTextFInsert, String jTextMInsert, String jTextMO, String jTextBreed) {

        Connection conn = null;
        try {
            conn = ConnectSQLite.ConnectionSQLite();
            Statement sta = conn.createStatement();
            String Sql = "INSERT INTO FAR_GMOULTING(PSGM_FARM, PSGM_DATE,  PSGM_HOUSE, PSGM_FLOCK, PSGM_MO, PSGM_FEMALE, PSGM_MALE, PSGM_BREED) \n"
                    + "VALUES ('" + jTextFarm + "', \n"
                    + "'" + jTextDate + "', \n"
                    + "'" + jTextHouse + "', \n"
                    + "'" + jTextFlock + "', \n"
                    + "'" + jTextMO + "', \n"
                    + "'" + jTextFInsert + "', \n"
                    + "'" + jTextMInsert + "', \n"
                    + "'" + jTextBreed + "')";
            sta.execute(Sql);

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex);
        } finally {
            if (conn != null) {
                try {
                    conn.close();
                } catch (SQLException ex) {
                    System.out.println(ex.toString());
                }
            }
        }

    }

    //GP01E005LMT Laying Moulting Setting
    public void InsertMOLayingMT(String jTextFarm, String jTextHouse, String jTextFlock, String jTextDate, String jTextFlight, String jTextFrom, String jTextCar1, String jTextST1,
            String jTextAR1, String jTextTem1, String jTextCar2, String jTextST2, String jTextAR2, String jTextTem2, String jTextFTotal, String jTextMTotal,
            String jTextFDeadAP, String jTextMDeadAP, String jTextFCullAP, String jTextMCullAP, String jTextFDeadT, String jTextMDeadT, String jTextFCullT,
            String jTextMCullT, String jTextFDeadVac, String jTextMDeadVac, String jTextFInsert, String jTextMInsert, String jTextMO, String jTextBreed) {

        Connection conn = null;
        try {
            conn = ConnectSQLite.ConnectionSQLite();
            Statement sta = conn.createStatement();
            String Sql = "INSERT INTO FAR_LAYINGMT(PSGR_FARM,PSGR_DATE,PSGR_FLIGHT,PSGR_FROM,PSGR_HOUSE,PSGR_FLOCK,PSGR_CAR1,PSGR_ST1, \n"
                    + "PSGR_ARF1,PSGR_TEMP1,PSGR_CAR2,PSGR_ST2,PSGR_ARF2,PSGR_TEMP2,PSGR_DODF,PSGR_DODM,PSGR_DEADAPF,PSGR_DEADAPM, \n"
                    + "PSGR_CULLAPF,PSGR_CULLAPM,PSGR_DEADTF,PSGR_DEADTM,PSGR_CULLTF,PSGR_CULLTM,PSGR_DEADVACF,PSGR_DEADVACM,PSGR_FEMALE,PSGR_MALE,PSGR_MO,PSGR_Breed) \n"
                    + "VALUES ('" + jTextFarm + "', \n"
                    + "'" + jTextDate + "', \n"
                    + "'" + jTextFlight + "', \n"
                    + "'" + jTextFrom + "', \n"
                    + "'" + jTextHouse + "', \n"
                    + "'" + jTextFlock + "', \n"
                    + "'" + jTextCar1 + "', \n"
                    + "'" + jTextST1 + "', \n"
                    + "'" + jTextAR1 + "', \n"
                    + "'" + jTextTem1 + "', \n"
                    + "'" + jTextCar2 + "', \n"
                    + "'" + jTextST2 + "', \n"
                    + "'" + jTextAR2 + "', \n"
                    + "'" + jTextTem2 + "', \n"
                    + "'" + jTextFTotal + "', \n"
                    + "'" + jTextMTotal + "', \n"
                    + "'" + jTextFDeadAP + "', \n"
                    + "'" + jTextMDeadAP + "', \n"
                    + "'" + jTextFCullAP + "', \n"
                    + "'" + jTextMCullAP + "', \n"
                    + "'" + jTextFDeadT + "', \n"
                    + "'" + jTextMDeadT + "', \n"
                    + "'" + jTextFCullT + "', \n"
                    + "'" + jTextMCullT + "', \n"
                    + "'" + jTextFDeadVac + "', \n"
                    + "'" + jTextMDeadVac + "', \n"
                    + "'" + jTextFInsert + "', \n"
                    + "'" + jTextMInsert + "', \n"
                    + "'" + jTextMO + "', \n"
                    + "'" + jTextBreed + "')";
            sta.execute(Sql);

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex);
        } finally {
            if (conn != null) {
                try {
                    conn.close();
                } catch (SQLException ex) {
                    System.out.println(ex.toString());
                }
            }
        }

    }

    //BF01E002 Transection
    public void InsertDTransection(String jTextFarm, String jTextDate, String jTextHouse, String jTextItem, String jTextLot, String jTextType, String jTextDesc, String jTextQty, String jTextBreed) {

        Connection conn = null;
        try {
            conn = ConnectSQLite.ConnectionSQLite();
            Statement sta = conn.createStatement();
            String Sql = "INSERT INTO FAR_DTRANSECTION\n"
                    + "(TRAN_FARM, TRAN_DATE, TRAN_HOUSE, TRAN_ITEM, TRAN_LOTNO, TRAN_TYPE, TRAN_DESC, TRAN_QTY, TRAN_BREED)\n"
                    + "VALUES('" + jTextFarm + "', \n"
                    + "'" + jTextDate + "', \n"
                    + "'" + jTextHouse + "', \n"
                    + "'" + jTextItem + "', \n"
                    + "'" + jTextLot + "', \n"
                    + "'" + jTextType + "', \n"
                    + "'" + jTextDesc + "', \n"
                    + "'" + jTextQty + "', \n"
                    + "'" + jTextBreed + "');";
            sta.execute(Sql);

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex);
        } finally {
            if (conn != null) {
                try {
                    conn.close();
                } catch (SQLException ex) {
                    System.out.println(ex.toString());
                }
            }
        }

    }

    public void InsertMTransection(String jTextFarm, String jTextDate, String jTextHouse, String jTextItem, String jTextLot, String jTextType, String jTextDesc, String jTextQty, String jTextBreed) {

        Connection conn = null;
        try {
            conn = ConnectSQLite.ConnectionSQLite();
            Statement sta = conn.createStatement();
            String Sql = "INSERT INTO FAR_MTRANSECTION\n"
                    + "(TRAN_FARM, TRAN_DATE, TRAN_HOUSE, TRAN_ITEM, TRAN_LOTNO, TRAN_TYPE, TRAN_DESC, TRAN_QTY, TRAN_BREED)\n"
                    + "VALUES('" + jTextFarm + "', \n"
                    + "'" + jTextDate + "', \n"
                    + "'" + jTextHouse + "', \n"
                    + "'" + jTextItem + "', \n"
                    + "'" + jTextLot + "', \n"
                    + "'" + jTextType + "', \n"
                    + "'" + jTextDesc + "', \n"
                    + "'" + jTextQty + "', \n"
                    + "'" + jTextBreed + "');";
            sta.execute(Sql);

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex);
        } finally {
            if (conn != null) {
                try {
                    conn.close();
                } catch (SQLException ex) {
                    System.out.println(ex.toString());
                }
            }
        }

    }

    public void InsertDInfor(String jTextFarm, String jTextDate, String jTextHouse, String jTextCode, String jTextDesc, String jTextDise, String jTextQty, String jTextRefer, String jTextRespon, String jTextBreed) {

        Connection conn = null;
        try {
            conn = ConnectSQLite.ConnectionSQLite();
            Statement sta = conn.createStatement();
            String Sql = "INSERT INTO FAR_DINFORM \n"
                    + "(INFO_FARM,INFO_DATE,INFO_HOUSE,INFO_ITEM,INFO_DESC,INFO_DISE,INFO_QTY,INFO_REFER,INFO_RESP,INFO_BREED) \n"
                    + "VALUES ('" + jTextFarm + "', \n"
                    + "'" + jTextDate + "', \n"
                    + "'" + jTextHouse + "', \n"
                    + "'" + jTextCode + "', \n"
                    + "'" + jTextDesc + "', \n"
                    + "'" + jTextDise + "', \n"
                    + "'" + jTextQty + "', \n"
                    + "'" + jTextRefer + "', \n"
                    + "'" + jTextRespon + "', \n"
                    + "'" + jTextBreed + "')";
            sta.execute(Sql);

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex);
        } finally {
            if (conn != null) {
                try {
                    conn.close();
                } catch (SQLException ex) {
                    System.out.println(ex.toString());
                }
            }
        }

    }

    public void InsertMInforByItem(String jTextFarm, String jTextBreed, String jTextHouse, String jTextItem, String jTextDate) {

        Connection conn = null;
        try {
            conn = ConnectSQLite.ConnectionSQLite();
            Statement sta = conn.createStatement();
            String Sql = "INSERT INTO FAR_MINFORM \n"
                    + "SELECT INFO_FARM,INFO_DATE,INFO_HOUSE,INFO_ITEM,INFO_DESC,INFO_DISE,INFO_QTY,INFO_REFER,INFO_BREED \n"
                    + "FROM FAR_DINFORM \n"
                    + "WHERE INFO_FARM = '" + jTextFarm + "'\n"
                    + "AND INFO_BREED = '" + jTextBreed + "'\n"
                    + "AND INFO_HOUSE = '" + jTextHouse + "' \n"
                    + "AND INFO_ITEM = '" + jTextItem + "' \n"
                    + "AND INFO_DATE = '" + jTextDate + "'";
            sta.execute(Sql);

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex);
        } finally {
            if (conn != null) {
                try {
                    conn.close();
                } catch (SQLException ex) {
                    System.out.println(ex.toString());
                }
            }
        }

    }

    public void UpdateDInfor(String jTextFarm, String jTextDate, String jTextHouse, String jTextCode, String jTextDise, String jTextQty, String jTextRefer, String jTextRespon) {

        Connection conn = null;
        try {
            conn = ConnectSQLite.ConnectionSQLite();
            Statement sta = conn.createStatement();
            String Sql = "UPDATE FAR_DINFORM \n"
                    + "SET INFO_QTY = '" + jTextQty + "' \n"
                    + "WHERE INFO_FARM = '" + jTextFarm + "' \n"
                    + "AND INFO_HOUSE = '" + jTextHouse + "' \n"
                    + "AND INFO_ITEM = '" + jTextCode + "' \n"
                    + "AND INFO_DISE = '" + jTextDise + "' \n"
                    + "AND INFO_REFER = '" + jTextRefer + "' \n"
                    + "AND INFO_RESP = '" + jTextRespon + "'";
            sta.execute(Sql);

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex);
        }

    }

    public void DeleteDInfor(String jTextFarm, String jTextBreed, String jTextRespon) {

        Connection conn = null;
        try {
            conn = ConnectSQLite.ConnectionSQLite();
            Statement sta = conn.createStatement();
            String Sql = "DELETE FROM FAR_DINFORM \n"
                    + "WHERE INFO_FARM = '" + jTextFarm + "'\n"
                    + "AND INFO_BREED = '" + jTextBreed + "'\n"
                    + "AND INFO_RESP = '" + jTextRespon + "'";
            sta.execute(Sql);

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex);
        } finally {
            if (conn != null) {
                try {
                    conn.close();
                } catch (SQLException ex) {
                    System.out.println(ex.toString());
                }
            }
        }

    }

    public void DeleteDInforByDise(String jTextFarm, String jTextDate, String jTextHouse, String jTextCode, String jTextDise) {

        Connection conn = null;
        try {
            conn = ConnectSQLite.ConnectionSQLite();
            Statement sta = conn.createStatement();
            String Sql = "DELETE FROM FAR_DINFORM \n"
                    + "WHERE INFO_FARM = '" + jTextFarm + "' \n"
                    + "AND INFO_HOUSE = '" + jTextHouse + "' \n"
                    + "AND INFO_ITEM = '" + jTextCode + "' \n"
                    + "AND INFO_DISE = '" + jTextDise + "'";
            sta.execute(Sql);

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex);
        } finally {
            if (conn != null) {
                try {
                    conn.close();
                } catch (SQLException ex) {
                    System.out.println(ex.toString());
                }
            }
        }

    }

    public void DeleteDInforByItem(String jTextFarm, String jTextBreed, String jTextHouse, String jTextItem, String jTextDate) {

        Connection conn = null;
        try {
            conn = ConnectSQLite.ConnectionSQLite();
            Statement sta = conn.createStatement();
            String Sql = "DELETE FROM FAR_DINFORM \n"
                    + "WHERE INFO_FARM = '" + jTextFarm + "'\n"
                    + "AND INFO_BREED = '" + jTextBreed + "'\n"
                    + "AND INFO_HOUSE = '" + jTextHouse + "' \n"
                    + "AND INFO_ITEM = '" + jTextItem + "' \n"
                    + "AND INFO_DATE = '" + jTextDate + "'";
            sta.execute(Sql);

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex);
        } finally {
            if (conn != null) {
                try {
                    conn.close();
                } catch (SQLException ex) {
                    System.out.println(ex.toString());
                }
            }
        }

    }

    public void DeleteMInforByItem(String jTextFarm, String jTextBreed, String jTextHouse, String jTextItem, String jTextDate) {

        Connection conn = null;
        try {
            conn = ConnectSQLite.ConnectionSQLite();
            Statement sta = conn.createStatement();
            String Sql = "DELETE FROM FAR_MINFORM \n"
                    + "WHERE INFO_FARM = '" + jTextFarm + "'\n"
                    + "AND INFO_BREED = '" + jTextBreed + "'\n"
                    + "AND INFO_HOUSE = '" + jTextHouse + "' \n"
                    + "AND INFO_ITEM = '" + jTextItem + "' \n"
                    + "AND INFO_DATE = '" + jTextDate + "'";
            sta.execute(Sql);

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex);
        } finally {
            if (conn != null) {
                try {
                    conn.close();
                } catch (SQLException ex) {
                    System.out.println(ex.toString());
                }
            }
        }

    }

    //BF01P007 Egg Transfer
    public void InsertEggMTransection(String jTextFarm, String jTextDate, String jTextStartDate, String jTextEndDate, String jTextItem, String jTextBreed) {

        Connection conn = null;
        try {
            conn = ConnectSQLite.ConnectionSQLite();
            Statement sta = conn.createStatement();
            String Sql = "INSERT INTO FAR_MTRANSECTION(TRAN_FARM,TRAN_DATE,TRAN_HOUSE,TRAN_ITEM,TRAN_LOTNO,TRAN_TYPE,TRAN_DESC,TRAN_QTY,TRAN_BREED)\n"
                    + "SELECT INVE_FARM,'" + jTextDate + "',INVE_HOUSE,INVE_ITEM,INVE_LOTNO,'ISS','HC',INVE_BALANCE * -1,'" + jTextBreed + "'\n"
                    + "FROM FAR_INVENLOT\n"
                    + "WHERE INVE_FARM = '" + jTextFarm + "' \n"
                    + "AND INVE_BREED = '" + jTextBreed + "'\n"
                    + "AND (SUBSTR(INVE_DATE,7) || SUBSTR(INVE_DATE,4,2) || SUBSTR(INVE_DATE,1,2)) BETWEEN '" + jTextStartDate + "' AND '" + jTextEndDate + "' \n"
                    + "AND INVE_ITEM LIKE '" + jTextItem + "%' \n"
                    + "AND INVE_BALANCE > 0";
            sta.execute(Sql);

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex);
        } finally {
            if (conn != null) {
                try {
                    conn.close();
                } catch (SQLException ex) {
                    System.out.println(ex.toString());
                }
            }
        }

    }

    public void InsertEggDTransection(String jTextFarm, String jTextDate, String jTextStartDate, String jTextEndDate, String jTextItem, String jTextMaxLotNo, String jTextBreed) {

        Connection conn = null;
        try {
            conn = ConnectSQLite.ConnectionSQLite();
            Statement sta = conn.createStatement();
            String Sql = "INSERT INTO FAR_DTRANSECTION(TRAN_FARM,TRAN_DATE,TRAN_HOUSE,TRAN_ITEM,TRAN_LOTNO,TRAN_TYPE,TRAN_DESC,TRAN_QTY,TRAN_BREED)\n"
                    + "SELECT INVE_FARM,'" + jTextDate + "',INVE_HOUSE,INVE_ITEM,INVE_LOTNO" + " || - " + jTextMaxLotNo + ",'ISS','HC',INVE_BALANCE * 1,'" + jTextBreed + "'\n"
                    + "FROM FAR_INVENLOT\n"
                    + "WHERE INVE_FARM = '" + jTextFarm + "'\n"
                    + "AND INVE_BREED = '" + jTextBreed + "'\n"
                    + "AND (SUBSTR(INVE_DATE,7) || SUBSTR(INVE_DATE,4,2) || SUBSTR(INVE_DATE,1,2)) BETWEEN '" + jTextStartDate + "' AND '" + jTextEndDate + "'\n"
                    + "AND INVE_ITEM LIKE '" + jTextItem + "%'\n"
                    + "AND INVE_BALANCE > 0";
            sta.execute(Sql);

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex);
        } finally {
            if (conn != null) {
                try {
                    conn.close();
                } catch (SQLException ex) {
                    System.out.println(ex.toString());
                }
            }
        }

    }

    public void InsertEggMTransectionCancel(String jTextFarm, String jTextDate, String jTextBreed) {

        Connection conn = null;
        try {
            conn = ConnectSQLite.ConnectionSQLite();
            Statement sta = conn.createStatement();
            String Sql = "INSERT INTO FAR_MTRANSECTION(TRAN_FARM,TRAN_DATE,TRAN_HOUSE,TRAN_ITEM,TRAN_LOTNO,TRAN_TYPE,TRAN_DESC,TRAN_QTY,TRAN_BREED)\n"
                    + "SELECT TRAN_FARM,TRAN_DATE,TRAN_HOUSE,TRAN_ITEM,TRAN_LOTNO,'ISS','HC',TRAN_QTY,TRAN_BREED \n"
                    + "FROM FAR_DTRANSECTION \n"
                    + "WHERE TRAN_FARM = '" + jTextFarm + "'\n"
                    + "AND TRAN_DATE = '" + jTextDate + "'\n"
                    + "AND TRAN_BREED = '" + jTextBreed + "'\n"
                    + "AND TRAN_ITEM LIKE '" + jTextBreed + "3%" + "'";
            sta.execute(Sql);

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex);
        } finally {
            if (conn != null) {
                try {
                    conn.close();
                } catch (SQLException ex) {
                    System.out.println(ex.toString());
                }
            }
        }

    }

    public void UpdateEggInvenBalUpDate(String jTextFarm, String jTextDate, String jTextStartDate, String jTextEndDate, String jTextItem, String jTextBreed) {

        Connection conn = null;
        try {
            conn = ConnectSQLite.ConnectionSQLite();
            Statement sta = conn.createStatement();

            String Sql = "SELECT INVE_HOUSE, INVE_ITEM, INVE_BALANCE\n"
                    + "FROM FAR_INVENBAL\n"
                    + "WHERE INVE_FARM = '" + jTextFarm + "'\n"
                    + "AND (SUBSTR(INVE_DATE,7) || SUBSTR(INVE_DATE,4,2) || SUBSTR(INVE_DATE,1,2)) BETWEEN '" + jTextStartDate + "' AND '" + jTextEndDate + "'\n"
                    + "AND INVE_ITEM LIKE '" + jTextItem + "%' \n"
                    + "AND INVE_BREED = '" + jTextBreed + "'";
            ResultSet rs = sta.executeQuery(Sql);

            while (rs.next()) {
                Statement sta1 = conn.createStatement();
                String Sql1 = "UPDATE FAR_INVENBAL\n"
                        + "SET INVE_BALANCE = ROUND(INVE_BALANCE+'" + rs.getInt("INVE_BALANCE") * -1 + "',2)\n"
                        + "WHERE INVE_FARM = '" + jTextFarm + "'\n"
                        + "AND INVE_HOUSE = '" + rs.getString("INVE_HOUSE").trim() + "'\n"
                        + "AND INVE_ITEM = '" + rs.getString("INVE_ITEM").trim() + "'\n"
                        + "AND INVE_BREED = '" + jTextBreed + "'";
                sta1.execute(Sql1);
            }

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex);
        } finally {
            if (conn != null) {
                try {
                    conn.close();
                } catch (SQLException ex) {
                    System.out.println(ex.toString());
                }
            }
        }

    }

    public void UpdateEggInvenLot(String jTextFarm, String jTextDate, String jTextStartDate, String jTextEndDate, String jTextItem, String jTextBreed) {

        Connection conn = null;
        try {
            conn = ConnectSQLite.ConnectionSQLite();
            Statement sta = conn.createStatement();
            String Sql = "UPDATE FAR_INVENLOT \n"
                    + "SET INVE_BALANCE = '0' \n"
                    + "WHERE INVE_FARM = '" + jTextFarm + "' \n"
                    + "AND (SUBSTR(INVE_DATE,7) || SUBSTR(INVE_DATE,4,2) || SUBSTR(INVE_DATE,1,2)) BETWEEN '" + jTextStartDate + "' AND '" + jTextEndDate + "' \n"
                    + "AND INVE_ITEM LIKE '" + jTextItem + "%' \n"
                    + "AND INVE_BREED = '" + jTextBreed + "'";
            sta.execute(Sql);

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex);
        } finally {
            if (conn != null) {
                try {
                    conn.close();
                } catch (SQLException ex) {
                    System.out.println(ex.toString());
                }
            }
        }

    }

    public void UpdateDEggInvenLot(String jTextFarm, String jTextDate, String jTextBreed) {

        Connection conn = null;
        try {
            conn = ConnectSQLite.ConnectionSQLite();
            Statement sta = conn.createStatement();
            String Sql = "UPDATE FAR_DINVENLOT \n"
                    + "SET INVE_BALANCE = '0', \n"
                    + "INVE_DATE = '" + jTextDate + "' \n"
                    + "WHERE INVE_FARM = '" + jTextFarm + "' \n"
                    + "AND INVE_ITEM LIKE '" + jTextBreed + "3%' \n"
                    + "AND INVE_BREED = '" + jTextBreed + "'";
            sta.execute(Sql);

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex);
        } finally {
            if (conn != null) {
                try {
                    conn.close();
                } catch (SQLException ex) {
                    System.out.println(ex.toString());
                }
            }
        }

    }

    //BF01E008 Description Egg Transfer
    public void InsertEggDescription(String jTextFarm, String jTextDate, String jTextHCCBW, String jTextHCCAW, String jTextHCD, String jTextHCS, String jTextHCDT, String jTextHCTTL,
            String jTextHCDTPLACE, String jTextTEMPR, String jTextTEMPWT, String jTextTIMEW, String jTextTIMEWDT, String jTextPHWT, String jTextCONC, String jTextTEMPCS, String jTextTTRUCKB,
            String jTextTTRUCKBHC, String jTextWEATHER, String jTextGIVEN, String jTextRECEIVE, String jTextAPPROVE, String jTextTIMIN, String jTextTRUCKNO, String jTextTIMOUT,
            String jTextREMARK1, String jTextREMARK2, String jTextDESC_CERT, String jTextBreed) {

        Connection conn = null;
        try {
            conn = ConnectSQLite.ConnectionSQLite();
            Statement sta = conn.createStatement();
            String Sql = "INSERT INTO FAR_MDESCRIPTION\n"
                    + "(DESC_FARM, DESC_DATE, DESC_HCCBW, DESC_HCCAW, DESC_HCD, DESC_HCS, DESC_HCDT, DESC_HCTTL, DESC_HCDTPLACE, DESC_TEMPR, DESC_TEMPWT, \n"
                    + "DESC_TIMEW, DESC_TIMEWDT, DESC_PHWT, DESC_CONC, DESC_TEMPCS, DESC_TTRUCKB, DESC_TTRUCKBHC, DESC_WEATHER, DESC_GIVEN, DESC_RECEIVE, \n"
                    + "DESC_APPROVE, DESC_TIMIN, DESC_TRUCKNO, DESC_TIMOUT, DESC_REMARK1, DESC_REMARK2, DESC_CERT, DESC_BREED)\n"
                    + "VALUES('" + jTextFarm + "', \n"
                    + "'" + jTextDate + "', \n"
                    + "'" + jTextHCCBW + "', \n"
                    + "'" + jTextHCCAW + "', \n"
                    + "'" + jTextHCD + "', \n"
                    + "'" + jTextHCS + "', \n"
                    + "'" + jTextHCDT + "', \n"
                    + "'" + jTextHCTTL + "', \n"
                    + "'" + jTextHCDTPLACE + "', \n"
                    + "'" + jTextTEMPR + "', \n"
                    + "'" + jTextTEMPWT + "', \n"
                    + "'" + jTextTIMEW + "', \n"
                    + "'" + jTextTIMEWDT + "', \n"
                    + "'" + jTextPHWT + "', \n"
                    + "'" + jTextCONC + "', \n"
                    + "'" + jTextTEMPCS + "', \n"
                    + "'" + jTextTTRUCKB + "', \n"
                    + "'" + jTextTTRUCKBHC + "', \n"
                    + "'" + jTextWEATHER + "', \n"
                    + "'" + jTextGIVEN + "', \n"
                    + "'" + jTextRECEIVE + "', \n"
                    + "'" + jTextAPPROVE + "', \n"
                    + "'" + jTextTIMIN + "', \n"
                    + "'" + jTextTRUCKNO + "', \n"
                    + "'" + jTextTIMOUT + "', \n"
                    + "'" + jTextREMARK1 + "', \n"
                    + "'" + jTextREMARK2 + "', \n"
                    + "'" + jTextDESC_CERT + "', \n"
                    + "'" + jTextBreed + "')";
            sta.execute(Sql);

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex);
        } finally {
            if (conn != null) {
                try {
                    conn.close();
                } catch (SQLException ex) {
                    System.out.println(ex.toString());
                }
            }
        }

    }

    public void UpdateGrowerFemale(String jTextFarm, String jTextHouse, String jTextFlock, String jTextDate, String jTextQty, String jTextBreed) {

        Connection conn = null;
        try {
            conn = ConnectSQLite.ConnectionSQLite();
            Statement sta = conn.createStatement();
            String Sql = "UPDATE FAR_GROWER\n"
                    + "SET PSGR_FEMALE = ROUND(PSGR_FEMALE + " + jTextQty + ",2)\n"
                    + "WHERE PSGR_FARM = '" + jTextFarm + "'\n"
                    + "AND PSGR_BREED = '" + jTextBreed + "'\n"
                    + "AND PSGR_DATE = '" + jTextDate + "'\n"
                    + "AND PSGR_HOUSE = '" + jTextHouse + "'\n"
                    + "AND PSGR_FLOCK = '" + jTextFlock + "'";
            sta.execute(Sql);

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex);
        } finally {
            if (conn != null) {
                try {
                    conn.close();
                } catch (SQLException ex) {
                    System.out.println(ex.toString());
                }
            }
        }

    }

    public void UpdateGrowerMale(String jTextFarm, String jTextHouse, String jTextFlock, String jTextDate, String jTextQty, String jTextBreed) {

        Connection conn = null;
        try {
            conn = ConnectSQLite.ConnectionSQLite();
            Statement sta = conn.createStatement();
            String Sql = "UPDATE FAR_GROWER\n"
                    + "SET PSGR_MALE = ROUND(PSGR_MALE + " + jTextQty + ",2)\n"
                    + "WHERE PSGR_FARM = '" + jTextFarm + "'\n"
                    + "AND PSGR_BREED = '" + jTextBreed + "'\n"
                    + "AND PSGR_DATE = '" + jTextDate + "'\n"
                    + "AND PSGR_HOUSE = '" + jTextHouse + "'\n"
                    + "AND PSGR_FLOCK = '" + jTextFlock + "'";
            sta.execute(Sql);

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex);
        } finally {
            if (conn != null) {
                try {
                    conn.close();
                } catch (SQLException ex) {
                    System.out.println(ex.toString());
                }
            }
        }

    }

    public void UpdateGrowerMTFemale(String jTextFarm, String jTextHouse, String jTextFlock, String jTextDate, String jTextQty, String jTextBreed) {

        Connection conn = null;
        try {
            conn = ConnectSQLite.ConnectionSQLite();
            Statement sta = conn.createStatement();
            String Sql = "UPDATE FAR_GROWERMT\n"
                    + "SET PSGR_FEMALE = ROUND(PSGR_FEMALE + " + jTextQty + ",2)\n"
                    + "WHERE PSGR_FARM = '" + jTextFarm + "'\n"
                    + "AND PSGR_BREED = '" + jTextBreed + "'\n"
                    + "AND PSGR_DATE = '" + jTextDate + "'\n"
                    + "AND PSGR_HOUSE = '" + jTextHouse + "'\n"
                    + "AND PSGR_FLOCK = '" + jTextFlock + "'";
            sta.execute(Sql);

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex);
        } finally {
            if (conn != null) {
                try {
                    conn.close();
                } catch (SQLException ex) {
                    System.out.println(ex.toString());
                }
            }
        }

    }

    public void UpdateGrowerMTMale(String jTextFarm, String jTextHouse, String jTextFlock, String jTextDate, String jTextQty, String jTextBreed) {

        Connection conn = null;
        try {
            conn = ConnectSQLite.ConnectionSQLite();
            Statement sta = conn.createStatement();
            String Sql = "UPDATE FAR_GROWERMT\n"
                    + "SET PSGR_MALE = ROUND(PSGR_MALE + " + jTextQty + ",2)\n"
                    + "WHERE PSGR_FARM = '" + jTextFarm + "'\n"
                    + "AND PSGR_BREED = '" + jTextBreed + "'\n"
                    + "AND PSGR_DATE = '" + jTextDate + "'\n"
                    + "AND PSGR_HOUSE = '" + jTextHouse + "'\n"
                    + "AND PSGR_FLOCK = '" + jTextFlock + "'";
            sta.execute(Sql);

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex);
        } finally {
            if (conn != null) {
                try {
                    conn.close();
                } catch (SQLException ex) {
                    System.out.println(ex.toString());
                }
            }
        }

    }

    public void UpdateLayingFemale(String jTextFarm, String jTextHouse, String jTextFlock, String jTextDate, String jTextQty, String jTextBreed) {

        Connection conn = null;
        try {
            conn = ConnectSQLite.ConnectionSQLite();
            Statement sta = conn.createStatement();
            String Sql = "UPDATE FAR_LAYING\n"
                    + "SET PSGR_FEMALE = ROUND(PSGR_FEMALE + " + jTextQty + ",2)\n"
                    + "WHERE PSGR_FARM = '" + jTextFarm + "'\n"
                    + "AND PSGR_BREED = '" + jTextBreed + "'\n"
                    + "AND PSGR_DATE = '" + jTextDate + "'\n"
                    + "AND PSGR_HOUSE = '" + jTextHouse + "'\n"
                    + "AND PSGR_FLOCK = '" + jTextFlock + "'";
            sta.execute(Sql);

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex);
        } finally {
            if (conn != null) {
                try {
                    conn.close();
                } catch (SQLException ex) {
                    System.out.println(ex.toString());
                }
            }
        }

    }

    public void UpdateLayingMale(String jTextFarm, String jTextHouse, String jTextFlock, String jTextDate, String jTextQty, String jTextBreed) {

        Connection conn = null;
        try {
            conn = ConnectSQLite.ConnectionSQLite();
            Statement sta = conn.createStatement();
            String Sql = "UPDATE FAR_LAYING\n"
                    + "SET PSGR_MALE = ROUND(PSGR_MALE + " + jTextQty + ",2)\n"
                    + "WHERE PSGR_FARM = '" + jTextFarm + "'\n"
                    + "AND PSGR_BREED = '" + jTextBreed + "'\n"
                    + "AND PSGR_DATE = '" + jTextDate + "'\n"
                    + "AND PSGR_HOUSE = '" + jTextHouse + "'\n"
                    + "AND PSGR_FLOCK = '" + jTextFlock + "'";
            sta.execute(Sql);

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex);
        } finally {
            if (conn != null) {
                try {
                    conn.close();
                } catch (SQLException ex) {
                    System.out.println(ex.toString());
                }
            }
        }

    }

    public void UpdateLayingMTFemale(String jTextFarm, String jTextHouse, String jTextFlock, String jTextDate, String jTextQty, String jTextBreed) {

        Connection conn = null;
        try {
            conn = ConnectSQLite.ConnectionSQLite();
            Statement sta = conn.createStatement();
            String Sql = "UPDATE FAR_LAYINGMT\n"
                    + "SET PSGR_FEMALE = ROUND(PSGR_FEMALE + " + jTextQty + ",2)\n"
                    + "WHERE PSGR_FARM = '" + jTextFarm + "'\n"
                    + "AND PSGR_BREED = '" + jTextBreed + "'\n"
                    + "AND PSGR_DATE = '" + jTextDate + "'\n"
                    + "AND PSGR_HOUSE = '" + jTextHouse + "'\n"
                    + "AND PSGR_FLOCK = '" + jTextFlock + "'";
            sta.execute(Sql);

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex);
        } finally {
            if (conn != null) {
                try {
                    conn.close();
                } catch (SQLException ex) {
                    System.out.println(ex.toString());
                }
            }
        }

    }

    public void UpdateLayingMTMale(String jTextFarm, String jTextHouse, String jTextFlock, String jTextDate, String jTextQty, String jTextBreed) {

        Connection conn = null;
        try {
            conn = ConnectSQLite.ConnectionSQLite();
            Statement sta = conn.createStatement();
            String Sql = "UPDATE FAR_LAYINGMT\n"
                    + "SET PSGR_MALE = ROUND(PSGR_MALE + " + jTextQty + ",2)\n"
                    + "WHERE PSGR_FARM = '" + jTextFarm + "'\n"
                    + "AND PSGR_BREED = '" + jTextBreed + "'\n"
                    + "AND PSGR_DATE = '" + jTextDate + "'\n"
                    + "AND PSGR_HOUSE = '" + jTextHouse + "'\n"
                    + "AND PSGR_FLOCK = '" + jTextFlock + "'";
            sta.execute(Sql);

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex);
        } finally {
            if (conn != null) {
                try {
                    conn.close();
                } catch (SQLException ex) {
                    System.out.println(ex.toString());
                }
            }
        }

    }

    //M001ItemHouseEdit
    public void InsertItemHouse(String jTextFarm, String jTextHouse, String jTextCode, String jTextBreed) {

        Connection conn = null;
        try {
            conn = ConnectSQLite.ConnectionSQLite();
            Statement sta = conn.createStatement();
            String Sql = "INSERT INTO FAR_ITEMHOUSE \n"
                    + "(ITEMH_FARM, ITEMH_HOUSE, ITEMH_CODE, ITEMH_BREED) \n"
                    + "VALUES ('" + jTextFarm + "', \n"
                    + "'" + jTextHouse + "', \n"
                    + "'" + jTextCode + "', \n"
                    + "'" + jTextBreed + "')";
            sta.execute(Sql);

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex);
        } finally {
            if (conn != null) {
                try {
                    conn.close();
                } catch (SQLException ex) {
                    System.out.println(ex.toString());
                }
            }
        }

    }

    public void UpdateItemHouse(String jTextFarm, String jTextHouse, String jTextCode, String jTextCodeSelection, String jTextBreed) {

        Connection conn = null;
        try {
            conn = ConnectSQLite.ConnectionSQLite();
            Statement sta = conn.createStatement();
            String Sql = "UPDATE FAR_ITEMHOUSE\n"
                    + "SET ITEMH_CODE = '" + jTextCodeSelection + "'\n"
                    + "WHERE ITEMH_FARM = '" + jTextFarm + "'\n"
                    + "AND ITEMH_BREED = '" + jTextBreed + "'\n"
                    + "AND ITEMH_HOUSE = '" + jTextHouse + "'\n"
                    + "AND ITEMH_CODE = '" + jTextCode + "'";
            sta.execute(Sql);

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex);
        } finally {
            if (conn != null) {
                try {
                    conn.close();
                } catch (SQLException ex) {
                    System.out.println(ex.toString());
                }
            }
        }

    }

    public void DeleteItemHouse(String jTextFarm, String jTextHouse, String jTextCode, String jTextBreed) {

        Connection conn = null;
        try {
            conn = ConnectSQLite.ConnectionSQLite();
            Statement sta = conn.createStatement();
            String Sql = "DELETE FROM FAR_ITEMHOUSE \n"
                    + "WHERE ITEMH_FARM = '" + jTextFarm + "'\n"
                    + "AND ITEMH_BREED = '" + jTextBreed + "'\n"
                    + "AND ITEMH_HOUSE = '" + jTextHouse + "'\n"
                    + "AND ITEMH_CODE = '" + jTextCode + "'";
            sta.execute(Sql);

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex);
        }

    }

    public void UpdateEggDesc(String jTextFarm, String jTextDate, String jTextTruckNo, String jTextHCCBW, String jTextHCCAW, String jTextHCD, String jTextHCS, String jTextHCDT, String jTextHCTTL, String jTextBreed) {

        Connection conn = null;
        try {
            conn = ConnectSQLite.ConnectionSQLite();
            Statement sta = conn.createStatement();
            String Sql = "UPDATE FAR_MDESCRIPTION\n"
                    + "SET DESC_HCCBW = '" + jTextHCCBW + "',\n"
                    + "DESC_HCCAW = '" + jTextHCCAW + "',\n"
                    + "DESC_HCD = '" + jTextHCD + "',\n"
                    + "DESC_HCS = '" + jTextHCS + "',\n"
                    + "DESC_HCDT = '" + jTextHCDT + "',\n"
                    + "DESC_HCTTL = '" + jTextHCTTL + "'\n"
                    + "WHERE DESC_FARM = '" + jTextFarm + "'\n"
                    + "AND DESC_BREED = '" + jTextBreed + "'\n"
                    + "AND DESC_DATE = '" + jTextDate + "'\n"
                    + "AND DESC_TRUCKNO = '" + jTextTruckNo + "'";
            sta.execute(Sql);

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex);
        } finally {
            if (conn != null) {
                try {
                    conn.close();
                } catch (SQLException ex) {
                    System.out.println(ex.toString());
                }
            }
        }

    }

    public void DeleteEggDesc(String jTextFarm, String jTextDate, String jTextTruckNo, String jTextBreed) {

        Connection conn = null;
        try {
            conn = ConnectSQLite.ConnectionSQLite();
            Statement sta = conn.createStatement();
            String Sql = "DELETE FROM FAR_MDESCRIPTION \n"
                    + "WHERE DESC_FARM = '" + jTextFarm + "'\n"
                    + "AND DESC_BREED = '" + jTextBreed + "'\n"
                    + "AND DESC_DATE = '" + jTextDate + "'\n"
                    + "AND DESC_TRUCKNO = '" + jTextTruckNo + "'";
            sta.execute(Sql);

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex);
        }

    }

}
