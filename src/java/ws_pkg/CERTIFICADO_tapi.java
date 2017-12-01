/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ws_pkg;

import java.util.ArrayList;
import java.util.List;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import pkgBLL.PRM;
import pkgDal.DAL_coneccion;

/**
 *
 * @author Edo
 */
@WebService(serviceName = "CERTIFICADO_tapi")
public class CERTIFICADO_tapi {

    /**
     * Lista completa
     * @return Json
     */
    @WebMethod(operationName = "c_sel")
    public String c_sel() throws Exception {
        List<PRM> lp = new ArrayList<>();
        return DAL_coneccion.retornaJSON("CERTIFICADO_tapi.sel", lp);
    }
    
    /**
     * Selección por ID
     * @param id
     * @return Json
     */
    @WebMethod(operationName = "c_selId")
    public String c_selId(@WebParam(name = "id") String id) throws Exception {
        List<PRM> lp = new ArrayList<>();
        lp.add(new PRM(1,"Int",id));
        return DAL_coneccion.retornaJSON("CERTIFICADO_tapi.selId", lp);
    }
    
    /**
     * Selección por ID
     * @param id
     * @return Json
     */
    @WebMethod(operationName = "c_selRut")
    public String c_selRut(@WebParam(name = "rut") String rut) throws Exception {
        List<PRM> lp = new ArrayList<>();
        lp.add(new PRM(1,"String",rut));
        return DAL_coneccion.retornaJSON("CERTIFICADO_tapi.selRut", lp);
    }
    
    /**
     *
     * @param p_ID_UNIDAD_INTERNA
     * @return
     * @throws Exception
     */
    @WebMethod(operationName = "c_selUnidadInterna")
    public String c_selUnidadInterna(@WebParam(name = "p_ID_UNIDAD_INTERNA") String p_ID_UNIDAD_INTERNA) throws Exception {
        List<PRM> lp = new ArrayList<>();
        lp.add(new PRM(1,"Int",p_ID_UNIDAD_INTERNA));
        return DAL_coneccion.retornaJSON("CERTIFICADO_tapi.selId", lp);
    }
    
    /**
     *
     * @param p_ID_SOLICITUD_DIA
     * @param p_RUT
     * @param p_ID_TIPO_DIA_LIBRE
     * @param p_ID_TIPO_APROBACION
     * @param p_CODIGO_REFERENCIA
     * @param p_RUT_CREACION
     * @return
     * @throws Exception
     */
    @WebMethod(operationName = "c_ins")
    public String c_ins(
            @WebParam(name = "p_ID_SOLICITUD_DIA") String p_ID_SOLICITUD_DIA,
            @WebParam(name = "p_RUT") String p_RUT,
            @WebParam(name = "p_ID_TIPO_DIA_LIBRE") String p_ID_TIPO_DIA_LIBRE,
            @WebParam(name = "p_ID_TIPO_APROBACION") String p_ID_TIPO_APROBACION,
            @WebParam(name = "p_CODIGO_REFERENCIA") String p_CODIGO_REFERENCIA,
            @WebParam(name = "p_RUT_CREACION") String p_RUT_CREACION) throws Exception {
        List<PRM> lp = new ArrayList<>();

        lp.add(new PRM(1,"Int",p_ID_SOLICITUD_DIA));
        lp.add(new PRM(2,"String",p_RUT));
        lp.add(new PRM(3,"Int",p_ID_TIPO_DIA_LIBRE));
        lp.add(new PRM(4,"Int",p_ID_TIPO_APROBACION));
        lp.add(new PRM(5,"Int",p_CODIGO_REFERENCIA));
        lp.add(new PRM(6,"String",p_RUT_CREACION));
        return DAL_coneccion.retornaJSON("CERTIFICADO_tapi.ins", lp);
    }
    
    /**
     *
     * @param p_ID_CERTIFICADO
     * @param p_ID_SOLICITUD_DIA
     * @param p_RUT
     * @param p_ID_TIPO_DIA_LIBRE
     * @param p_ID_TIPO_APROBACION
     * @param p_CODIGO_REFERENCIA
     * @param p_RUT_ACTUALIZACION
     * @return
     * @throws Exception
     */
    @WebMethod(operationName = "c_upd")
    public int c_upd(
            @WebParam(name = "p_ID_CERTIFICADO") String p_ID_CERTIFICADO,
            @WebParam(name = "p_ID_SOLICITUD_DIA") String p_ID_SOLICITUD_DIA,
            @WebParam(name = "p_RUT") String p_RUT,
            @WebParam(name = "p_ID_TIPO_DIA_LIBRE") String p_ID_TIPO_DIA_LIBRE,
            @WebParam(name = "p_ID_TIPO_APROBACION") String p_ID_TIPO_APROBACION,
            @WebParam(name = "p_CODIGO_REFERENCIA") String p_CODIGO_REFERENCIA,
            @WebParam(name = "p_RUT_ACTUALIZACION") String p_RUT_ACTUALIZACION) throws Exception {
        List<PRM> lp = new ArrayList<>();
        lp.add(new PRM(1,"Int",p_ID_CERTIFICADO));
        lp.add(new PRM(2,"Int",p_ID_SOLICITUD_DIA));
        lp.add(new PRM(3,"String",p_RUT));
        lp.add(new PRM(4,"Int",p_ID_TIPO_DIA_LIBRE));
        lp.add(new PRM(5,"Int",p_ID_TIPO_APROBACION));
        lp.add(new PRM(6,"Int",p_CODIGO_REFERENCIA));
        lp.add(new PRM(7,"String",p_RUT_ACTUALIZACION));
        return DAL_coneccion.ejecutaTAPI("CERTIFICADO_tapi.upd", lp);
    }
    
    /**
     *
     * @param id
     * @return
     * @throws Exception
     */
    @WebMethod(operationName = "c_del")
    public int c_del(@WebParam(name = "id") String id) throws Exception {
        List<PRM> lp = new ArrayList<>();
        lp.add(new PRM(1,"Int",id));
        return DAL_coneccion.ejecutaTAPI("CERTIFICADO_tapi.del", lp);
    }
}
