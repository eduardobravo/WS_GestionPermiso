/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkgDal;

import java.io.StringWriter;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.util.Iterator;
import java.util.List;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import oracle.jdbc.OracleTypes;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import pkgBLL.PRM;
import pkgBLL.ResultSetConverter;

/**
 *
 * @author Ro
 */
public class DAL_coneccion {
    
    
//    private static String BaseDeDatos = "jdbc:oracle:thin:@localhost:1521:orcl";
//    private static String dbUser = "usr_panniol"; 
//    private static String dbPassr = "1234"; 
//
    private static String BaseDeDatos = "jdbc:oracle:thin:@yersoninstance.cyznjkra844p.us-east-2.rds.amazonaws.com:1521:orcl";
    private static String dbUser = "spa"; 
    private static String dbPassr = "pswd";     


    public static String retornaXML(String sp, List<PRM> listaParam) throws Exception
    {
        
        try{
            Connection conexion;
            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = factory.newDocumentBuilder();
            Document doc = builder.newDocument();
            Element results = doc.createElement("Set");
            doc.appendChild(results);
            Class.forName("oracle.jdbc.OracleDriver");
            conexion= DriverManager.getConnection(BaseDeDatos,dbUser,dbPassr);
        
        if(conexion!=null)
        {
            String cabParam = cabeceraParam(listaParam.size());
            
            
            CallableStatement cst = conexion.prepareCall("{call "+sp+ " " + cabParam + "}");
            
            Iterator itr = listaParam.iterator();
            while(itr.hasNext())
            {
                PRM par = (PRM)itr.next();
                if(par.getTipo().equals("String"))
                {
                    cst.setString(par.getIndex(), par.getValor());
                }
                if(par.getTipo().equals("Int"))
                {
                    cst.setInt(par.getIndex(), Integer.parseInt(par.getValor()));
                }
                
            }
            cst.registerOutParameter(listaParam.size() + 1, OracleTypes.CURSOR);
            cst.execute();
            ResultSet rs = (ResultSet)cst.getObject(listaParam.size() + 1);
            String salida = ""; 
            ResultSetMetaData rsmd = rs.getMetaData();
            int colCount = rsmd.getColumnCount();
            boolean vacio = true;
            while (rs.next()){
                vacio = false;
                Element row = doc.createElement("Tabla");
                results.appendChild(row);
                for (int i = 1; i <= colCount; i++) {
                    String columnName = rsmd.getColumnName(i).toLowerCase();
                    Object value = rs.getObject(i);
                    Element node = doc.createElement(columnName);
                    node.appendChild(doc.createTextNode(value.toString()));
                    row.appendChild(node);
                }
            } 	
            
            DOMSource domSource = new DOMSource(doc);
            TransformerFactory tf = TransformerFactory.newInstance();
            Transformer transformer = tf.newTransformer();
            transformer.setOutputProperty(OutputKeys.OMIT_XML_DECLARATION, "yes");
            transformer.setOutputProperty(OutputKeys.METHOD, "xml");
            transformer.setOutputProperty(OutputKeys.ENCODING, "ISO-8859-1");
            StringWriter sw = new StringWriter();
            StreamResult sr = new StreamResult(sw);
            transformer.transform(domSource, sr);
            cst.close();
            conexion.close();
            if(vacio)
            {
                return "";
            }
            return sw.toString();
        }
        else{return "";}
        }
        catch(Exception e)
        {throw e;}
    }
    
    private static String cabeceraParam(int numParam)
    {
        String retorno = "(?,"; 
        for (int i = 0; i < numParam; i++) {
            retorno += "?,";
        }
        retorno = retorno.substring(0, retorno.length()-1);
        retorno += ")";
        return retorno;
    
    }
    
    private static String cabeceraParamTAPI(int numParam)
    {
        String retorno = "("; 
        for (int i = 0; i < numParam; i++) {
            retorno += "?,";
        }
        retorno = retorno.substring(0, retorno.length()-1);
        retorno += ")";
        return retorno;
    
    }
    
    public static int ejecutaTAPI(String sp, List<PRM> listaParam) throws Exception
    {
        try{
            Connection conexion;
            Class.forName("oracle.jdbc.OracleDriver");
            conexion= DriverManager.getConnection(BaseDeDatos,dbUser,dbPassr);

            int salida = 0;
        if(conexion!=null)
        {
            conexion.setAutoCommit(true);
            String cabParam = cabeceraParamTAPI(listaParam.size());
            
            CallableStatement cst = conexion.prepareCall("{call "+sp+ " " + cabParam + "}");
            
            Iterator itr = listaParam.iterator();
            while(itr.hasNext())
            {
                PRM par = (PRM)itr.next();
                if(par.getTipo().equals("String"))
                {
                    cst.setString(par.getIndex(), par.getValor());
                }
                if(par.getTipo().equals("Int"))
                {
                    cst.setInt(par.getIndex(), Integer.parseInt(par.getValor()));
                }
            }
            salida = cst.executeUpdate();
            
            cst.close();
            conexion.close();
            return salida;
            
        }
        else{
        throw new Exception("Conexion Fallida.");
        }
        }
        catch(Exception e)
        {throw e;}
    }
    
    public static String retornaJSON(String sp, List<PRM> listaParam) throws Exception
    {
        try{
            Connection conexion;
            Class.forName("oracle.jdbc.OracleDriver");
            conexion= DriverManager.getConnection(BaseDeDatos,dbUser,dbPassr);

        if(conexion!=null)
        {
            String cabParam = cabeceraParam(listaParam.size());
            
            
            CallableStatement cst = conexion.prepareCall("{call "+sp+ " " + cabParam + "}");
            
            Iterator itr = listaParam.iterator();
            while(itr.hasNext())
            {
                PRM par = (PRM)itr.next();
                if(par.getTipo().equals("String"))
                {
                    cst.setString(par.getIndex(), par.getValor());
                }
                if(par.getTipo().equals("Int"))
                {
                    cst.setInt(par.getIndex(), Integer.parseInt(par.getValor()));
                }
                
            }
            cst.registerOutParameter(listaParam.size() + 1, OracleTypes.CURSOR);
            cst.execute();
            ResultSet rs = (ResultSet)cst.getObject(listaParam.size() + 1);
            
            String salida = ResultSetConverter.convert(rs).toString(); 
            cst.close();
            conexion.close();
            
            return salida;
        }
        else{return "";}
        }
        catch(Exception e)
        {throw e;}
    }
}
