/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BRFARM;

import com.lowagie.text.pdf.PdfWriter;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.export.JRPdfExporter;
import net.sf.jasperreports.engine.export.JRPdfExporterParameter;
import net.sf.jasperreports.export.Exporter;
import net.sf.jasperreports.view.JasperViewer;

/**
 *
 * @author Wattana
 */
public class ClassGetReport {

    public void rData(String form, String gender) {

        String PathFile = System.getProperty("user.dir").toString() + "\\report\\";
        String report = PathFile + form + ".jasper";
        Connection conn = null;
        try {
            conn = ConnectSQLite.ConnectionSQLite();
            try {
                // Parameters
                Map param = new HashMap();
                param.put("Farm", BRLogin.vFarm);
                param.put("Breed", BRLogin.vDuckBreed);
                param.put("Gender", gender.substring(0, 1));
                param.put("Gender", gender.substring(0, 1));
                param.put("GenderDesc", gender);

                JasperPrint print;
                print = JasperFillManager.fillReport(report, param, conn);
                JasperViewer view = new JasperViewer(print, false);
                view.setVisible(true);

            } catch (JRException ex) {
                System.out.println(ex.toString());
            }

        } catch (SQLException ex) {
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

    }

    public void rBR01R003(String form, String farm, String breed, String breedall, String house, String startdate, String enddate, String giver, String approver) {

        String PathFile = System.getProperty("user.dir").toString() + "\\report\\";
        String report = PathFile + form + ".jasper";
        String FGroup, MGroup, HCG2001, HCG3001, HCC2004, HCC3004;
        Connection conn = null;

        FGroup = BRLogin.vDuckBreed + "F";
        MGroup = BRLogin.vDuckBreed + "M";

        if ("GP".equals(breed)) {
            HCG2001 = BRLogin.vDuckHC + "302001";
            HCG3001 = BRLogin.vDuckHC + "303001";
            HCC2004 = BRLogin.vDuckHC + "302004";
            HCC3004 = BRLogin.vDuckHC + "303004";
        } else {
            HCG2001 = BRLogin.vDuckHC + "102001";
            HCG3001 = BRLogin.vDuckHC + "103001";
            HCC2004 = BRLogin.vDuckHC + "102004";
            HCC3004 = BRLogin.vDuckHC + "103004";
        }

        try {
            conn = ConnectSQLite.ConnectionSQLite();
            try {
                // Parameters
                Map param = new HashMap();
                param.put("Farm", farm);
                param.put("Breed", breed);
                param.put("BreedAll", breedall);
                param.put("House", house);
                param.put("StartDate", startdate);
                param.put("EndDate", enddate);
                param.put("FGroup", FGroup);
                param.put("MGroup", MGroup);
                param.put("HCG2001", HCG2001);
                param.put("HCG3001", HCG3001);
                param.put("HCC2004", HCC2004);
                param.put("HCC3004", HCC3004);
                param.put("Approver", approver);
                param.put("Giver", giver);

                JasperPrint print;
                print = JasperFillManager.fillReport(report, param, conn);
                JasperViewer view = new JasperViewer(print, false);
                view.setVisible(true);

            } catch (JRException ex) {
                System.out.println(ex.toString());
            }

        } catch (SQLException ex) {
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

    }

    public void rBR01R004(String form, String farm, String breed, String breedall, String startdate, String enddate, String Giver, String Approver) {

        String PathFile = System.getProperty("user.dir").toString() + "\\report\\";
        String report = PathFile + form + ".jasper";
        String FGroup, MGroup, HCG2001, HCG3001, HCC2004, HCC3004;
        Connection conn = null;

        FGroup = BRLogin.vDuckBreed + "F";
        MGroup = BRLogin.vDuckBreed + "M";

        if ("GP".equals(breed)) {
            HCG2001 = BRLogin.vDuckHC + "302001";
            HCG3001 = BRLogin.vDuckHC + "303001";
            HCC2004 = BRLogin.vDuckHC + "302004";
            HCC3004 = BRLogin.vDuckHC + "303004";
        } else {
            HCG2001 = BRLogin.vDuckHC + "102001";
            HCG3001 = BRLogin.vDuckHC + "103001";
            HCC2004 = BRLogin.vDuckHC + "102004";
            HCC3004 = BRLogin.vDuckHC + "103004";
        }

        try {
            conn = ConnectSQLite.ConnectionSQLite();
            try {
                // Parameters
                Map param = new HashMap();
                param.put("Farm", farm);
                param.put("Breed", breed);
                param.put("BreedAll", breedall);
                param.put("StartDate", startdate);
                param.put("EndDate", enddate);
                param.put("FGroup", FGroup);
                param.put("MGroup", MGroup);
                param.put("HCG2001", HCG2001);
                param.put("HCG3001", HCG3001);
                param.put("HCC2004", HCC2004);
                param.put("HCC3004", HCC3004);
                param.put("Approver", Approver);
                param.put("Giver", Giver);
                JasperPrint print;
                JRPdfExporter exporter = new JRPdfExporter();
                exporter.setParameter(JRPdfExporterParameter.IS_ENCRYPTED, Boolean.TRUE);
                exporter.setParameter(JRPdfExporterParameter.IS_128_BIT_KEY, Boolean.TRUE);
                exporter.setParameter(JRPdfExporterParameter.USER_PASSWORD, "YourUserPW");
                exporter.setParameter(JRPdfExporterParameter.OWNER_PASSWORD, "YourOwnerPW");
                exporter.setParameter(JRPdfExporterParameter.PERMISSIONS, new Integer(PdfWriter.AllowCopy | PdfWriter.AllowPrinting));
                print = JasperFillManager.fillReport(report, param, conn);
                JasperViewer view = new JasperViewer(print, false);

                view.setVisible(true);

            } catch (JRException ex) {
                System.out.println(ex.toString());
            }

        } catch (SQLException ex) {
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

    }

    public void rBR01R004Excel(String form, String farm, String breed, String breedall, String startdate, String enddate, String Giver, String Approver) {

        String PathFile = System.getProperty("user.dir").toString() + "\\report\\";
        String report = PathFile + form + ".jasper";
        String FGroup, MGroup, HCG2001, HCG3001, HCC2004, HCC3004;
        Connection conn = null;

        FGroup = BRLogin.vDuckBreed + "F";
        MGroup = BRLogin.vDuckBreed + "M";

        if ("GP".equals(breed)) {
            HCG2001 = BRLogin.vDuckHC + "302001";
            HCG3001 = BRLogin.vDuckHC + "303001";
            HCC2004 = BRLogin.vDuckHC + "302004";
            HCC3004 = BRLogin.vDuckHC + "303004";
        } else {
            HCG2001 = BRLogin.vDuckHC + "102001";
            HCG3001 = BRLogin.vDuckHC + "103001";
            HCC2004 = BRLogin.vDuckHC + "102004";
            HCC3004 = BRLogin.vDuckHC + "103004";
        }

        try {
            conn = ConnectSQLite.ConnectionSQLite();
            try {
                // Parameters
                Map param = new HashMap();
                param.put("Farm", farm);
                param.put("Breed", breed);
                param.put("BreedAll", breedall);
                param.put("StartDate", startdate);
                param.put("EndDate", enddate);
                param.put("FGroup", FGroup);
                param.put("MGroup", MGroup);
                param.put("HCG2001", HCG2001);
                param.put("HCG3001", HCG3001);
                param.put("HCC2004", HCC2004);
                param.put("HCC3004", HCC3004);
                param.put("Approver", Approver);
                param.put("Giver", Giver);

                JRPdfExporter exporter = new JRPdfExporter();
                exporter.setParameter(JRPdfExporterParameter.IS_ENCRYPTED, Boolean.TRUE);
                exporter.setParameter(JRPdfExporterParameter.IS_128_BIT_KEY, Boolean.TRUE);
                exporter.setParameter(JRPdfExporterParameter.USER_PASSWORD, "YourUserPW");
                exporter.setParameter(JRPdfExporterParameter.OWNER_PASSWORD, "YourOwnerPW");
                exporter.setParameter(JRPdfExporterParameter.PERMISSIONS, new Integer(PdfWriter.AllowCopy | PdfWriter.AllowPrinting));
                JasperPrint print3 = JasperFillManager.fillReport(report, param, conn);
                JasperViewer view3 = new JasperViewer(print3, false);
//               JasperPrint print3 = JasperFillManager.fillReport(name2, parameterss2, conn);
//                JasperViewer view = new JasperViewer(print, false);

                view3.setVisible(true);

            } catch (JRException ex) {
                System.out.println(ex.toString());
            }

        } catch (SQLException ex) {
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

    }

    public void rBR01R005(String form, String farm, String breed, String breedall, String startdate) {

        String PathFile = System.getProperty("user.dir").toString() + "\\report\\";
        String report = PathFile + form + ".jasper";
        Connection conn = null;
        try {
            conn = ConnectSQLite.ConnectionSQLite();
            try {
                // Parameters
                Map param = new HashMap();
                param.put("Farm", farm);
                param.put("Breed", breed);
                param.put("BreedAll", breedall);
                param.put("StartDate", startdate);

                JasperPrint print;
                print = JasperFillManager.fillReport(report, param, conn);
                JasperViewer view = new JasperViewer(print, false);
                view.setVisible(true);

            } catch (JRException ex) {
                System.out.println(ex.toString());
            }

        } catch (SQLException ex) {
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

    }

    public void rBR01R009(String form, String farm, String breed, String prdline, String startdate, String starthouse, String endhouse, String lotdate, String table) {

        String PathFile = System.getProperty("user.dir").toString() + "\\report\\";
        String report = PathFile + form + ".jasper";
        String HCG001, HCD002, HCS003, HCC004;
        Connection conn = null;

        if ("GWFL".equals(prdline) || "LYFL".equals(prdline) || "GMFL".equals(prdline) || "LMFL".equals(prdline)) {

            if ("GP".equals(breed)) {
                HCG001 = BRLogin.vDuckHC + "302001";
                HCD002 = BRLogin.vDuckHC + "302002";
                HCS003 = BRLogin.vDuckHC + "302003";
                HCC004 = BRLogin.vDuckHC + "302004";
            } else {
                HCG001 = BRLogin.vDuckHC + "102001";
                HCD002 = BRLogin.vDuckHC + "102002";
                HCS003 = BRLogin.vDuckHC + "102003";
                HCC004 = BRLogin.vDuckHC + "102004";
            }

        } else {

            if ("GP".equals(breed)) {
                HCG001 = BRLogin.vDuckHC + "303001";
                HCD002 = BRLogin.vDuckHC + "303002";
                HCS003 = BRLogin.vDuckHC + "303003";
                HCC004 = BRLogin.vDuckHC + "303004";
            } else {
                HCG001 = BRLogin.vDuckHC + "103001";
                HCD002 = BRLogin.vDuckHC + "103002";
                HCS003 = BRLogin.vDuckHC + "103003";
                HCC004 = BRLogin.vDuckHC + "103004";
            }
        }

        try {
            conn = ConnectSQLite.ConnectionSQLite();
            try {
                // Parameters
                Map param = new HashMap();
                param.put("Table", table);
                param.put("Farm", farm);
                param.put("Breed", breed);
                param.put("StartDate", startdate);
                param.put("StartHouse", starthouse);
                param.put("EndHouse", endhouse);
                param.put("HCG001", HCG001);
                param.put("HCD002", HCD002);
                param.put("HCS003", HCS003);
                param.put("HCC004", HCC004);
                param.put("Round", lotdate);

                JasperPrint print;
                print = JasperFillManager.fillReport(report, param, conn);
                JasperViewer view = new JasperViewer(print, false);
                view.setVisible(true);

            } catch (JRException ex) {
                System.out.println(ex.toString());
            }

        } catch (SQLException ex) {
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

    }

    public void rBR01R010(String form, String farm, String breed, String startdate, String lotdate) {

        String PathFile = System.getProperty("user.dir").toString() + "\\report\\";
        String report = PathFile + form + ".jasper";
        Connection conn = null;

        try {
            conn = ConnectSQLite.ConnectionSQLite();
            try {
                // Parameters
                Map param = new HashMap();
                param.put("Farm", farm);
                param.put("Breed", breed);
                param.put("StartDate", startdate);
                param.put("Round", lotdate);

                JasperPrint print;
                print = JasperFillManager.fillReport(report, param, conn);
                JasperViewer view = new JasperViewer(print, false);
                view.setVisible(true);

            } catch (JRException ex) {
                System.out.println(ex.toString());
            }

        } catch (SQLException ex) {
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

    }

    public void rBR01R012(String form, String farm, String breed, String prdline, String startdate, String enddate) {

        String PathFile = System.getProperty("user.dir").toString() + "\\report\\";
        String report = PathFile + form + ".jasper";
        String SUBHC, BREF, BREM, HCG001, HCD002, HCS003, HCC004;
        Connection conn = null;

        if ("GFL".equals(prdline)) {

            if ("GP".equals(breed)) {
                SUBHC = BRLogin.vDuckHC + "302";
                BREF = breed + "102001";
                BREM = breed + "102005";
                HCG001 = BRLogin.vDuckHC + "302001";
                HCD002 = BRLogin.vDuckHC + "302002";
                HCS003 = BRLogin.vDuckHC + "302003";
                HCC004 = BRLogin.vDuckHC + "302004";
            } else {
                SUBHC = BRLogin.vDuckHC + "102";
                BREF = breed + "102001";
                BREM = breed + "201002";
                HCG001 = BRLogin.vDuckHC + "102001";
                HCD002 = BRLogin.vDuckHC + "102002";
                HCS003 = BRLogin.vDuckHC + "102003";
                HCC004 = BRLogin.vDuckHC + "102004";
            }

        } else if ("GML".equals(prdline)) {

            if ("GP".equals(breed)) {
                SUBHC = BRLogin.vDuckHC + "303";
                BREF = breed + "102003";
                BREM = breed + "102007";
                HCG001 = BRLogin.vDuckHC + "303001";
                HCD002 = BRLogin.vDuckHC + "303002";
                HCS003 = BRLogin.vDuckHC + "303003";
                HCC004 = BRLogin.vDuckHC + "303004";
            } else {
                SUBHC = BRLogin.vDuckHC + "103";
                BREF = breed + "102002";
                BREM = breed + "201003";
                HCG001 = BRLogin.vDuckHC + "103001";
                HCD002 = BRLogin.vDuckHC + "103002";
                HCS003 = BRLogin.vDuckHC + "103003";
                HCC004 = BRLogin.vDuckHC + "103004";
            }

        } else if ("LFL".equals(prdline)) {

            if ("GP".equals(breed)) {
                SUBHC = BRLogin.vDuckHC + "302";
                BREF = breed + "201001";
                BREM = breed + "201005";
                HCG001 = BRLogin.vDuckHC + "302001";
                HCD002 = BRLogin.vDuckHC + "302002";
                HCS003 = BRLogin.vDuckHC + "302003";
                HCC004 = BRLogin.vDuckHC + "302004";
            } else {
                SUBHC = BRLogin.vDuckHC + "102";
//                BREF = breed + "201001";
//                BREM = breed + "201004";
                BREF = breed + "201001";
                BREM = breed + "201002";
                HCG001 = BRLogin.vDuckHC + "102001";
                HCD002 = BRLogin.vDuckHC + "102002";
                HCS003 = BRLogin.vDuckHC + "102003";
                HCC004 = BRLogin.vDuckHC + "102004";
            }

        } else if ("LML".equals(prdline)) {

            if ("GP".equals(breed)) {
                SUBHC = BRLogin.vDuckHC + "302";
//                BREF = breed + "202003";
//                BREM = breed + "202007";
                BREF = breed + "201002";
                BREM = breed + "201003";
                HCG001 = BRLogin.vDuckHC + "303001";
                HCD002 = BRLogin.vDuckHC + "303002";
                HCS003 = BRLogin.vDuckHC + "303003";
                HCC004 = BRLogin.vDuckHC + "303004";
            } else {
                SUBHC = BRLogin.vDuckHC + "102";
                BREF = breed + "201005";
                BREM = breed + "201006";
                HCG001 = BRLogin.vDuckHC + "103001";
                HCD002 = BRLogin.vDuckHC + "103002";
                HCS003 = BRLogin.vDuckHC + "103003";
                HCC004 = BRLogin.vDuckHC + "103004";
            }

        } else if ("PSG".equals(prdline)) {
            SUBHC = BRLogin.vDuckHC + "102";
            BREF = breed + "102001";
            BREM = breed + "201002";
            HCG001 = BRLogin.vDuckHC + "102001";
            HCD002 = BRLogin.vDuckHC + "102002";
            HCS003 = BRLogin.vDuckHC + "102003";
            HCC004 = BRLogin.vDuckHC + "102004";

        } else {
            SUBHC = BRLogin.vDuckHC + "102";
            BREF = breed + "201001";
            BREM = breed + "201004";
            HCG001 = BRLogin.vDuckHC + "102001";
            HCD002 = BRLogin.vDuckHC + "102002";
            HCS003 = BRLogin.vDuckHC + "102003";
            HCC004 = BRLogin.vDuckHC + "102004";

        }

        try {
            conn = ConnectSQLite.ConnectionSQLite();
            try {
                // Parameters
                Map param = new HashMap();
                param.put("Farm", farm);
                param.put("Breed", breed);
                param.put("StartDate", startdate);
                param.put("EndDate", enddate);
                param.put("SUBHC", SUBHC);
                param.put("BREF", BREF);
                param.put("BREM", BREM);
                param.put("HCG001", HCG001);
                param.put("HCD002", HCD002);
                param.put("HCS003", HCS003);
                param.put("HCC004", HCC004);

                JasperPrint print;
                print = JasperFillManager.fillReport(report, param, conn);
                JasperViewer view = new JasperViewer(print, false);
                view.setVisible(true);

            } catch (JRException ex) {
                System.out.println(ex.toString());
            }

        } catch (SQLException ex) {
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

    }

    public void rBR01R013(String form, String farm, String breed, String startdate, String enddate) {

        String PathFile = System.getProperty("user.dir").toString() + "\\report\\";
        String report = PathFile + form + ".jasper";
        Connection conn = null;
        try {
            conn = ConnectSQLite.ConnectionSQLite();
            try {
                // Parameters
                Map param = new HashMap();
                param.put("Farm", farm);
                param.put("Breed", breed);
                param.put("StartDate", startdate);
                param.put("EndDate", enddate);

                JasperPrint print;
                print = JasperFillManager.fillReport(report, param, conn);
                JasperViewer view = new JasperViewer(print, false);
                view.setVisible(true);

            } catch (JRException ex) {
                System.out.println(ex.toString());
            }

        } catch (SQLException ex) {
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

    }

    public void rBR01R029(String form, String farm, String breed, String startdate, String enddate, String starthouse, String endhouse) {

        String PathFile = System.getProperty("user.dir").toString() + "\\report\\";
        String report = PathFile + form + ".jasper";
        String item = breed + "4";
        Connection conn = null;
        try {
            conn = ConnectSQLite.ConnectionSQLite();
            try {
                // Parameters
                Map param = new HashMap();
                param.put("Farm", farm);
                param.put("Breed", breed);
                param.put("StartDate", startdate);
                param.put("EndDate", enddate);
                param.put("StartHouse", starthouse);
                param.put("EndHouse", endhouse);
                param.put("Item", item);

                JasperPrint print;
                print = JasperFillManager.fillReport(report, param, conn);
                JasperViewer view = new JasperViewer(print, false);
                view.setVisible(true);

            } catch (JRException ex) {
                System.out.println(ex.toString());
            }

        } catch (SQLException ex) {
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

    }

}
