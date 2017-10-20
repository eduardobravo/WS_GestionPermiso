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
@WebService(serviceName = "TIPO_DIA_LIBRE_tapi")
public class TIPO_DIA_LIBRE_tapi {

    /**
     * Lista completa
     * @return Json
     */
    @WebMethod(operationName = "sel")
    public String tdl_sel() throws Exception {
        List<PRM> lp = new ArrayList<>();
        return DAL_coneccion.retornaJSON("TIPO_DIA_LIBRE_tapi.sel", lp);
    }
    /**
     * Selección por ID
     * @param id
     * @return Json
     */
    @WebMethod(operationName = "selId")
    public String tdl_selId(@WebParam(name = "id") String id) throws Exception {
        List<PRM> lp = new ArrayList<>();
        lp.add(new PRM(1,"Int",id));
        return DAL_coneccion.retornaJSON("TIPO_DIA_LIBRE_tapi.selId", lp);
    }
    /**
     * Crear registro
     * @param p_ID_TIPO_DIA_LIBRE
     * @param p_GLOSA_TIPO_DIA_LIBRE
     * @param p_RUT_CREACION
     * @param p_CANTIDAD_DIAS
     * @return número de filas afectadas
     */
    @WebMethod(operationName = "ins")
    public int tdl_ins(
            @WebParam(name = "p_ID_TIPO_DIA_LIBRE") String p_ID_TIPO_DIA_LIBRE,
            @WebParam(name = "p_GLOSA_TIPO_DIA_LIBRE") String p_GLOSA_TIPO_DIA_LIBRE,
            @WebParam(name = "p_RUT_CREACION") String p_RUT_CREACION,
            @WebParam(name = "p_CANTIDAD_DIAS") String p_CANTIDAD_DIAS) throws Exception {
        List<PRM> lp = new ArrayList<>();
        lp.add(new PRM(1,"Int",p_ID_TIPO_DIA_LIBRE));
        lp.add(new PRM(2,"String",p_GLOSA_TIPO_DIA_LIBRE));
        lp.add(new PRM(3,"String",p_RUT_CREACION));
        lp.add(new PRM(4,"Int",p_CANTIDAD_DIAS));
        return DAL_coneccion.ejecutaTAPI("TIPO_DIA_LIBRE_tapi.ins", lp);
    }
    /**
     * Actualizar registro
     * @param p_ID_TIPO_DIA_LIBRE
     * @param p_GLOSA_TIPO_DIA_LIBRE
     * @param p_RUT_ACTUALIZACION
     * @param p_CANTIDAD_DIAS
     * @return número de filas afectadas
     */
    @WebMethod(operationName = "upd")
    public int tdl_upd(
            @WebParam(name = "p_ID_TIPO_DIA_LIBRE") String p_ID_TIPO_DIA_LIBRE,
            @WebParam(name = "p_GLOSA_TIPO_DIA_LIBRE") String p_GLOSA_TIPO_DIA_LIBRE,
            @WebParam(name = "p_RUT_ACTUALIZACION") String p_RUT_ACTUALIZACION,
            @WebParam(name = "p_CANTIDAD_DIAS") String p_CANTIDAD_DIAS) throws Exception {
        List<PRM> lp = new ArrayList<>();
        lp.add(new PRM(1,"Int",p_ID_TIPO_DIA_LIBRE));
        lp.add(new PRM(2,"String",p_GLOSA_TIPO_DIA_LIBRE));
        lp.add(new PRM(3,"String",p_RUT_ACTUALIZACION));
        lp.add(new PRM(4,"Int",p_CANTIDAD_DIAS));
        return DAL_coneccion.ejecutaTAPI("TIPO_DIA_LIBRE_tapi.upd", lp);
    }
    /**
     * Eliminar registro
     * @param id
     * @return número de filas afectadas
     */
    @WebMethod(operationName = "del")
    public int tdl_del(@WebParam(name = "id") String id) throws Exception {
        List<PRM> lp = new ArrayList<>();
        lp.add(new PRM(1,"Int",id));
        return DAL_coneccion.ejecutaTAPI("TIPO_DIA_LIBRE_tapi.del", lp);
    }
}
