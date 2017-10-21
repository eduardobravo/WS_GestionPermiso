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
@WebService(serviceName = "UNIDAD_INTERNA_tapi")
public class UNIDAD_INTERNA_tapi {

    /**
     * Lista completa
     * @return Json
     */
    @WebMethod(operationName = "ui_sel")
    public String ui_sel() throws Exception {
        List<PRM> lp = new ArrayList<>();
        return DAL_coneccion.retornaJSON("UNIDAD_INTERNA_tapi.sel", lp);
    }
    /**
     * Selección por ID
     * @param id
     * @return Json
     */
    @WebMethod(operationName = "ui_selId")
    public String ui_selId(@WebParam(name = "id") String id) throws Exception {
        List<PRM> lp = new ArrayList<>();
        lp.add(new PRM(1,"Int",id));
        return DAL_coneccion.retornaJSON("UNIDAD_INTERNA_tapi.selId", lp);
    }
    /**
     * Crear registro
     * @param p_RUT_CREACION
     * @param p_ID_UNIDAD_INTERNA
     * @param p_GLOSA_UNIDAD_INTERNA
     * @return número de filas afectadas
     */
    @WebMethod(operationName = "ui_ins")
    public int ui_ins(
            @WebParam(name = "p_RUT_CREACION") String p_RUT_CREACION,
            @WebParam(name = "p_ID_UNIDAD_INTERNA") String p_ID_UNIDAD_INTERNA,
            @WebParam(name = "p_GLOSA_UNIDAD_INTERNA") String p_GLOSA_UNIDAD_INTERNA) throws Exception {
        List<PRM> lp = new ArrayList<>();
        lp.add(new PRM(1,"String",p_RUT_CREACION));
        lp.add(new PRM(2,"Int",p_ID_UNIDAD_INTERNA));
        lp.add(new PRM(3,"String",p_GLOSA_UNIDAD_INTERNA));
        return DAL_coneccion.ejecutaTAPI("UNIDAD_INTERNA_tapi.ins", lp);
    }
    /**
     * Actualizar registro
     * @param p_RUT_ACTUALIZACION
     * @param p_ID_UNIDAD_INTERNA
     * @param p_GLOSA_UNIDAD_INTERNA
     * @return número de filas afectadas
     */
    @WebMethod(operationName = "ui_upd")
    public int ui_upd(
            @WebParam(name = "p_RUT_ACTUALIZACION") String p_RUT_ACTUALIZACION,
            @WebParam(name = "p_ID_UNIDAD_INTERNA") String p_ID_UNIDAD_INTERNA,
            @WebParam(name = "p_GLOSA_UNIDAD_INTERNA") String p_GLOSA_UNIDAD_INTERNA) throws Exception {
        List<PRM> lp = new ArrayList<>();
        lp.add(new PRM(1,"String",p_RUT_ACTUALIZACION));
        lp.add(new PRM(2,"Int",p_ID_UNIDAD_INTERNA));
        lp.add(new PRM(3,"String",p_GLOSA_UNIDAD_INTERNA));
        return DAL_coneccion.ejecutaTAPI("UNIDAD_INTERNA_tapi.upd", lp);
    }
    /**
     * Eliminar registro
     * @param id
     * @return número de filas afectadas
     */
    @WebMethod(operationName = "ui_del")
    public int ui_del(@WebParam(name = "id") String id) throws Exception {
        List<PRM> lp = new ArrayList<>();
        lp.add(new PRM(1,"Int",id));
        return DAL_coneccion.ejecutaTAPI("UNIDAD_INTERNA_tapi.del", lp);
    }
}
