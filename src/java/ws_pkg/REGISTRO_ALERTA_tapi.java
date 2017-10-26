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
@WebService(serviceName = "REGISTRO_ALERTA_tapi")
public class REGISTRO_ALERTA_tapi {

    /**
     * Lista completa
     * @return Json
     */
    @WebMethod(operationName = "ra_sel")
    public String ra_sel() throws Exception {
        List<PRM> lp = new ArrayList<>();
        return DAL_coneccion.retornaJSON("REGISTRO_ALERTA_tapi.sel", lp);
    }
    /**
     * Selección por ID
     * @param id
     * @return Json
     */
    @WebMethod(operationName = "ra_selId")
    public String ra_selId(@WebParam(name = "id") String id) throws Exception {
        List<PRM> lp = new ArrayList<>();
        lp.add(new PRM(1,"Int",id));
        return DAL_coneccion.retornaJSON("REGISTRO_ALERTA_tapi.selId", lp);
    }
    /**
     * Crear registro
     * @param p_RUT_ALUDIDO
     * @param p_RUT_CREACION
     * @param p_OBSERVACION
     * @return número de filas afectadas
     */
    @WebMethod(operationName = "ra_ins")
    public String ra_ins(
            @WebParam(name = "p_RUT_ALUDIDO") String p_RUT_ALUDIDO,
            @WebParam(name = "p_RUT_CREACION") String p_RUT_CREACION,
            @WebParam(name = "p_OBSERVACION") String p_OBSERVACION) throws Exception {
        List<PRM> lp = new ArrayList<>();
        lp.add(new PRM(1,"String",p_RUT_ALUDIDO));
        lp.add(new PRM(2,"String",p_RUT_CREACION));
        lp.add(new PRM(3,"String",p_OBSERVACION));
        return DAL_coneccion.retornaJSON("REGISTRO_ALERTA_tapi.ins", lp);
    }
    /**
     * Actualizar registro
     * @param p_RUT_ACTUALIZACION
     * @param p_ID_REGISTRO_ALERTA
     * @param p_RUT_ALUDIDO
     * @param p_OBSERVACION
     * @return número de filas afectadas
     */
    @WebMethod(operationName = "ra_upd")
    public int ra_upd(
            @WebParam(name = "p_RUT_ACTUALIZACION") String p_RUT_ACTUALIZACION,
            @WebParam(name = "p_ID_REGISTRO_ALERTA") String p_ID_REGISTRO_ALERTA,
            @WebParam(name = "p_RUT_ALUDIDO") String p_RUT_ALUDIDO,
            @WebParam(name = "p_OBSERVACION") String p_OBSERVACION) throws Exception {
        List<PRM> lp = new ArrayList<>();
        lp.add(new PRM(1,"String",p_RUT_ACTUALIZACION));
        lp.add(new PRM(2,"Int",p_ID_REGISTRO_ALERTA));
        lp.add(new PRM(3,"String",p_RUT_ALUDIDO));
        lp.add(new PRM(4,"String",p_OBSERVACION));
        return DAL_coneccion.ejecutaTAPI("REGISTRO_ALERTA_tapi.upd", lp);
    }
    /**
     * Eliminar registro
     * @param id
     * @return número de filas afectadas
     */
    @WebMethod(operationName = "ra_del")
    public int ra_del(@WebParam(name = "id") String id) throws Exception {
        List<PRM> lp = new ArrayList<>();
        lp.add(new PRM(1,"Int",id));
        return DAL_coneccion.ejecutaTAPI("REGISTRO_ALERTA_tapi.del", lp);
    }
}
