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
@WebService(serviceName = "TIPO_APROBACION_tapi")
public class TIPO_APROBACION_tapi {

    /**
     * Lista completa
     * @return Json
     */
    @WebMethod(operationName = "sel")
    public String ta_sel() throws Exception {
        List<PRM> lp = new ArrayList<>();
        return DAL_coneccion.retornaJSON("TIPO_APROBACION_tapi.sel", lp);
    }
    /**
     * Selección por ID
     * @param id
     * @return Json
     */
    @WebMethod(operationName = "selId")
    public String ta_selId(@WebParam(name = "id") String id) throws Exception {
        List<PRM> lp = new ArrayList<>();
        lp.add(new PRM(1,"Int",id));
        return DAL_coneccion.retornaJSON("TIPO_APROBACION_tapi.selId", lp);
    }
    /**
     * Crear registro
     * @param p_ID_TIPO_APROBACION
     * @param p_GLOSA_TIPO_APROBACION
     * @param p_RUT_CREACION
     * @return número de filas afectadas
     */
    @WebMethod(operationName = "ins")
    public int ta_ins(
            @WebParam(name = "p_ID_TIPO_APROBACION") String p_ID_TIPO_APROBACION,
            @WebParam(name = "p_GLOSA_TIPO_APROBACION") String p_GLOSA_TIPO_APROBACION,
            @WebParam(name = "p_RUT_CREACION") String p_RUT_CREACION) throws Exception {
        List<PRM> lp = new ArrayList<>();
        lp.add(new PRM(1,"Int",p_ID_TIPO_APROBACION));
        lp.add(new PRM(2,"String",p_GLOSA_TIPO_APROBACION));
        lp.add(new PRM(3,"String",p_RUT_CREACION));
        return DAL_coneccion.ejecutaTAPI("TIPO_APROBACION_tapi.ins", lp);
    }
    /**
     * Actualizar registro
     * @param p_RUT_ACTUALIZACION
     * @param p_ID_TIPO_APROBACION
     * @param p_GLOSA_TIPO_APROBACION
     * @return número de filas afectadas
     */
    @WebMethod(operationName = "upd")
    public int ta_upd(
            @WebParam(name = "p_RUT_ACTUALIZACION") String p_RUT_ACTUALIZACION,
            @WebParam(name = "p_ID_TIPO_APROBACION") String p_ID_TIPO_APROBACION,
            @WebParam(name = "p_GLOSA_TIPO_APROBACION") String p_GLOSA_TIPO_APROBACION) throws Exception {
        List<PRM> lp = new ArrayList<>();
        lp.add(new PRM(1,"String",p_RUT_ACTUALIZACION));
        lp.add(new PRM(2,"Int",p_ID_TIPO_APROBACION));
        lp.add(new PRM(3,"String",p_GLOSA_TIPO_APROBACION));
        return DAL_coneccion.ejecutaTAPI("TIPO_APROBACION_tapi.upd", lp);
    }
    /**
     * Eliminar registro
     * @param id
     * @return número de filas afectadas
     */
    @WebMethod(operationName = "del")
    public int ta_del(@WebParam(name = "id") String id) throws Exception {
        List<PRM> lp = new ArrayList<>();
        lp.add(new PRM(1,"Int",id));
        return DAL_coneccion.ejecutaTAPI("TIPO_APROBACION_tapi.del", lp);
    }
}
