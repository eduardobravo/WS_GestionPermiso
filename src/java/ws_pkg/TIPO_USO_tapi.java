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
@WebService(serviceName = "TIPO_USO_tapi")
public class TIPO_USO_tapi {

    /**
     * Lista completa
     * @return Json
     */
    @WebMethod(operationName = "sel")
    public String tuso_sel() throws Exception {
        List<PRM> lp = new ArrayList<>();
        return DAL_coneccion.retornaJSON("TIPO_USO_tapi.sel", lp);
    }
    /**
     * Selección por ID
     * @param id
     * @return Json
     */
    @WebMethod(operationName = "selId")
    public String tuso_selId(@WebParam(name = "id") String id) throws Exception {
        List<PRM> lp = new ArrayList<>();
        lp.add(new PRM(1,"Int",id));
        return DAL_coneccion.retornaJSON("TIPO_USO_tapi.selId", lp);
    }
    /**
     * Crear registro
     * @param p_GLOSA_TIPO_USO
     * @param p_RUT_CREACION
     * @param p_ID_TIPO_USO
     * @return número de filas afectadas
     */
    @WebMethod(operationName = "ins")
    public int tuso_ins(
            @WebParam(name = "p_GLOSA_TIPO_USO") String p_GLOSA_TIPO_USO,
            @WebParam(name = "p_RUT_CREACION") String p_RUT_CREACION,
            @WebParam(name = "p_ID_TIPO_USO") String p_ID_TIPO_USO) throws Exception {
        List<PRM> lp = new ArrayList<>();
        lp.add(new PRM(1,"String",p_GLOSA_TIPO_USO));
        lp.add(new PRM(2,"String",p_RUT_CREACION));
        lp.add(new PRM(3,"Int",p_ID_TIPO_USO));
        return DAL_coneccion.ejecutaTAPI("TIPO_USO_tapi.ins", lp);
    }
    /**
     * Actualizar registro
     * @param p_GLOSA_TIPO_USO
     * @param p_RUT_ACTUALIZACION
     * @param p_ID_TIPO_USO
     * @return número de filas afectadas
     */
    @WebMethod(operationName = "upd")
    public int tuso_upd(
            @WebParam(name = "p_GLOSA_TIPO_USO") String p_GLOSA_TIPO_USO,
            @WebParam(name = "p_RUT_ACTUALIZACION") String p_RUT_ACTUALIZACION,
            @WebParam(name = "p_ID_TIPO_USO") String p_ID_TIPO_USO) throws Exception {
        List<PRM> lp = new ArrayList<>();
        lp.add(new PRM(1,"String",p_GLOSA_TIPO_USO));
        lp.add(new PRM(2,"String",p_RUT_ACTUALIZACION));
        lp.add(new PRM(3,"Int",p_ID_TIPO_USO));
        return DAL_coneccion.ejecutaTAPI("TIPO_USO_tapi.upd", lp);
    }
    /**
     * Eliminar registro
     * @param id
     * @return número de filas afectadas
     */
    @WebMethod(operationName = "del")
    public int tuso_del(@WebParam(name = "id") String id) throws Exception {
        List<PRM> lp = new ArrayList<>();
        lp.add(new PRM(1,"Int",id));
        return DAL_coneccion.ejecutaTAPI("TIPO_USO_tapi.del", lp);
    }
}
