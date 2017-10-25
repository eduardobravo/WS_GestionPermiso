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
@WebService(serviceName = "SOLICITUD_DIA_tapi")
public class SOLICITUD_DIA_tapi {

    /**
     * Lista completa
     * @return Json
     */
    @WebMethod(operationName = "sd_sel")
    public String sd_sel() throws Exception {
        List<PRM> lp = new ArrayList<>();
        return DAL_coneccion.retornaJSON("SOLICITUD_DIA_tapi.sel", lp);
    }
    /**
     * Selección por ID
     * @param p_ID_SOLICITUD_DIA
     * @param p_RUT
     * @param p_ID_TIPO_DIA_LIBRE
     * @return Json
     */
    @WebMethod(operationName = "sd_selId")
    public String sd_selId(@WebParam(name = "p_ID_SOLICITUD_DIA") String p_ID_SOLICITUD_DIA,
            @WebParam(name = "p_RUT") String p_RUT,
            @WebParam(name = "p_ID_TIPO_DIA_LIBRE") String p_ID_TIPO_DIA_LIBRE) throws Exception {
        List<PRM> lp = new ArrayList<>();
        lp.add(new PRM(1,"Int",p_ID_SOLICITUD_DIA));
        lp.add(new PRM(2,"String",p_RUT));
        lp.add(new PRM(3,"Int",p_ID_TIPO_DIA_LIBRE));
        return DAL_coneccion.retornaJSON("SOLICITUD_DIA_tapi.selId", lp);
    }
    /**
     * Selección por Rut
     * @param p_RUT
     * @return Json
     */
    @WebMethod(operationName = "sd_selRut")
    public String sd_selRut(@WebParam(name = "p_RUT") String p_RUT) throws Exception {
        List<PRM> lp = new ArrayList<>();
        lp.add(new PRM(1,"String",p_RUT));
        return DAL_coneccion.retornaJSON("SOLICITUD_DIA_tapi.selId", lp);
    }
    /**
     * Crear registro
     * @param p_RUT_CREACION
     * @param p_OBSERVACION
     * @param p_FECHA_INICIO
     * @param p_CANTIDAD_DIAS
     * @param p_FECHA_FIN
     * @param p_RUT
     * @param p_ID_TIPO_DIA_LIBRE
     * @param p_ID_TIPO_APROBACION
     * @param p_ID_TIPO_USO
     * @return número de filas afectadas
     */
    @WebMethod(operationName = "sd_ins")
    public String sd_ins(
            @WebParam(name = "p_RUT_CREACION") String p_RUT_CREACION,
            @WebParam(name = "p_OBSERVACION") String p_OBSERVACION,
            @WebParam(name = "p_FECHA_INICIO") String p_FECHA_INICIO,
            @WebParam(name = "p_CANTIDAD_DIAS") String p_CANTIDAD_DIAS,
            @WebParam(name = "p_FECHA_FIN") String p_FECHA_FIN,
            @WebParam(name = "p_RUT") String p_RUT,
            @WebParam(name = "p_ID_TIPO_DIA_LIBRE") String p_ID_TIPO_DIA_LIBRE,
            @WebParam(name = "p_ID_TIPO_APROBACION") String p_ID_TIPO_APROBACION,
            @WebParam(name = "p_ID_TIPO_USO") String p_ID_TIPO_USO) throws Exception {
        List<PRM> lp = new ArrayList<>();
        lp.add(new PRM(1,"String",p_RUT_CREACION));
        lp.add(new PRM(2,"String",p_OBSERVACION));
        lp.add(new PRM(3,"String",p_FECHA_INICIO));
        lp.add(new PRM(4,"Int",p_CANTIDAD_DIAS));
        lp.add(new PRM(5,"String",p_FECHA_FIN));
        lp.add(new PRM(6,"String",p_RUT));
        lp.add(new PRM(7,"Int",p_ID_TIPO_DIA_LIBRE));
        lp.add(new PRM(8,"Int",p_ID_TIPO_APROBACION));
        lp.add(new PRM(9,"Int",p_ID_TIPO_USO));
        return DAL_coneccion.retornaJSON("SOLICITUD_DIA_tapi.ins", lp);
    }
    
    /**
     * Actualizar registro
     * @param p_RUT_CREACION
     * @param p_OBSERVACION
     * @param p_FECHA_INICIO
     * @param p_CANTIDAD_DIAS
     * @param p_ID_SOLICITUD_DIA
     * @param p_FECHA_FIN
     * @param p_RUT
     * @param p_ID_TIPO_DIA_LIBRE
     * @param p_ID_TIPO_APROBACION
     * @param p_ID_TIPO_USO
     * @return número de filas afectadas
     */
    @WebMethod(operationName = "sd_upd")
    public int sd_upd(
            @WebParam(name = "p_RUT_CREACION") String p_RUT_CREACION,
            @WebParam(name = "p_OBSERVACION") String p_OBSERVACION,
            @WebParam(name = "p_FECHA_INICIO") String p_FECHA_INICIO,
            @WebParam(name = "p_CANTIDAD_DIAS") String p_CANTIDAD_DIAS,
            @WebParam(name = "p_ID_SOLICITUD_DIA") String p_ID_SOLICITUD_DIA,
            @WebParam(name = "p_FECHA_FIN") String p_FECHA_FIN,
            @WebParam(name = "p_RUT") String p_RUT,
            @WebParam(name = "p_ID_TIPO_DIA_LIBRE") String p_ID_TIPO_DIA_LIBRE,
            @WebParam(name = "p_ID_TIPO_APROBACION") String p_ID_TIPO_APROBACION,
            @WebParam(name = "p_ID_TIPO_USO") String p_ID_TIPO_USO) throws Exception {
        List<PRM> lp = new ArrayList<>();
        lp.add(new PRM(1,"String",p_RUT_CREACION));
        lp.add(new PRM(2,"String",p_OBSERVACION));
        lp.add(new PRM(3,"String",p_FECHA_INICIO));
        lp.add(new PRM(4,"Int",p_CANTIDAD_DIAS));
        lp.add(new PRM(5,"Int",p_ID_SOLICITUD_DIA));
        lp.add(new PRM(6,"String",p_FECHA_FIN));
        lp.add(new PRM(7,"String",p_RUT));
        lp.add(new PRM(8,"Int",p_ID_TIPO_DIA_LIBRE));
        lp.add(new PRM(9,"Int",p_ID_TIPO_APROBACION));
        lp.add(new PRM(10,"Int",p_ID_TIPO_USO));
        return DAL_coneccion.ejecutaTAPI("SOLICITUD_DIA_tapi.upd", lp);
    }
    /**
     * Eliminar registro
     * @param p_ID_SOLICITUD_DIA
     * @param p_RUT
     * @param p_ID_TIPO_DIA_LIBRE
     * @return número de filas afectadas
     */
    @WebMethod(operationName = "sd_del")
    public int sd_del(@WebParam(name = "p_ID_SOLICITUD_DIA") String p_ID_SOLICITUD_DIA,
            @WebParam(name = "p_RUT") String p_RUT,
            @WebParam(name = "p_ID_TIPO_DIA_LIBRE") String p_ID_TIPO_DIA_LIBRE) throws Exception {
        List<PRM> lp = new ArrayList<>();
        lp.add(new PRM(1,"Int",p_ID_SOLICITUD_DIA));
        lp.add(new PRM(2,"String",p_RUT));
        lp.add(new PRM(3,"Int",p_ID_TIPO_DIA_LIBRE));
        return DAL_coneccion.ejecutaTAPI("SOLICITUD_DIA_tapi.del", lp);
    }
}
