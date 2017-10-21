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
@WebService(serviceName = "REL_USUA_UND_INTRN_tapi")
public class REL_USUA_UND_INTRN_tapi {

    /**
     * Lista completa
     * @return Json
     */
    @WebMethod(operationName = "ruui_sel")
    public String ruui_sel() throws Exception {
        List<PRM> lp = new ArrayList<>();
        return DAL_coneccion.retornaJSON("REL_USUA_UND_INTRN_tapi.sel", lp);
    }
    /**
     * Selección por ID
     * @param p_ID_UNIDAD_INTERNA
     * @param p_RUT
     * @return Json
     */
    @WebMethod(operationName = "ruui_selId")
    public String ruui_selId(
            @WebParam(name = "p_ID_UNIDAD_INTERNA") String p_ID_UNIDAD_INTERNA,
            @WebParam(name = "p_RUT") String p_RUT) throws Exception {
        List<PRM> lp = new ArrayList<>();
        lp.add(new PRM(1,"Int",p_ID_UNIDAD_INTERNA));
        lp.add(new PRM(2,"String",p_RUT));
        return DAL_coneccion.retornaJSON("REL_USUA_UND_INTRN_tapi.selId", lp);
    }
    /**
     * Crear registro
     * @param p_RUT
     * @param p_JEFE
     * @param p_RUT_CREACION
     * @param p_ID_UNIDAD_INTERNA
     * @param p_ID_UNIDAD_INTERNA_PADRE
     * @return número de filas afectadas
     */
    @WebMethod(operationName = "ruui_ins")
    public int ruui_ins(
            @WebParam(name = "p_RUT") String p_RUT,
            @WebParam(name = "p_JEFE") String p_JEFE,
            @WebParam(name = "p_RUT_CREACION") String p_RUT_CREACION,
            @WebParam(name = "p_ID_UNIDAD_INTERNA") String p_ID_UNIDAD_INTERNA,
            @WebParam(name = "p_ID_UNIDAD_INTERNA_PADRE") String p_ID_UNIDAD_INTERNA_PADRE) throws Exception {
        List<PRM> lp = new ArrayList<>();
        lp.add(new PRM(1,"String",p_RUT));
        lp.add(new PRM(2,"Int",p_JEFE));
        lp.add(new PRM(3,"String",p_RUT_CREACION));
        lp.add(new PRM(4,"Int",p_ID_UNIDAD_INTERNA));
        lp.add(new PRM(5,"Int",p_ID_UNIDAD_INTERNA_PADRE));
        return DAL_coneccion.ejecutaTAPI("REL_USUA_UND_INTRN_tapi.ins", lp);
    }
    /**
     * Actualizar registro
     * @param p_RUT
     * @param p_RUT_ACTUALIZACION
     * @param p_JEFE
     * @param p_ID_UNIDAD_INTERNA
     * @param p_ID_UNIDAD_INTERNA_PADRE
     * @return número de filas afectadas
     */
    @WebMethod(operationName = "ruui_upd")
    public int ruui_upd(
            @WebParam(name = "p_RUT") String p_RUT,
            @WebParam(name = "p_RUT_ACTUALIZACION") String p_RUT_ACTUALIZACION,
            @WebParam(name = "p_JEFE") String p_JEFE,
            @WebParam(name = "p_ID_UNIDAD_INTERNA") String p_ID_UNIDAD_INTERNA,
            @WebParam(name = "p_ID_UNIDAD_INTERNA_PADRE") String p_ID_UNIDAD_INTERNA_PADRE) throws Exception {
        List<PRM> lp = new ArrayList<>();
        lp.add(new PRM(1,"String",p_RUT));
        lp.add(new PRM(2,"String",p_RUT_ACTUALIZACION));
        lp.add(new PRM(3,"Int",p_JEFE));
        lp.add(new PRM(4,"Int",p_ID_UNIDAD_INTERNA));
        lp.add(new PRM(5,"Int",p_ID_UNIDAD_INTERNA_PADRE));
        return DAL_coneccion.ejecutaTAPI("REL_USUA_UND_INTRN_tapi.upd", lp);
    }
    /**
     * Eliminar registro
     * @param p_ID_UNIDAD_INTERNA
     * @param p_RUT
     * @return número de filas afectadas
     */
    @WebMethod(operationName = "ruui_del")
    public int ruui_del(
            @WebParam(name = "p_ID_UNIDAD_INTERNA") String p_ID_UNIDAD_INTERNA,
            @WebParam(name = "p_RUT") String p_RUT) throws Exception {
        List<PRM> lp = new ArrayList<>();
        lp.add(new PRM(1,"Int",p_ID_UNIDAD_INTERNA));
        lp.add(new PRM(2,"String",p_RUT));
        return DAL_coneccion.ejecutaTAPI("REL_USUA_UND_INTRN_tapi.del", lp);
    }
}
