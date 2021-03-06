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
@WebService(serviceName = "TIPO_USUARIO_tapi")
public class TIPO_USUARIO_tapi {

    /**
     * Lista completa
     * @return Json
     */
    @WebMethod(operationName = "tu_sel")
    public String tu_sel() throws Exception {
        List<PRM> lp = new ArrayList<>();
        return DAL_coneccion.retornaJSON("TIPO_USUARIO_tapi.sel", lp);
    }
    /**
     * Selección por ID
     * @param id
     * @return Json
     */
    @WebMethod(operationName = "tu_selId")
    public String tu_selId(@WebParam(name = "id") String id) throws Exception {
        List<PRM> lp = new ArrayList<>();
        lp.add(new PRM(1,"Int",id));
        return DAL_coneccion.retornaJSON("TIPO_USUARIO_tapi.selId", lp);
    }
    /**
     * Crear registro
     * @param p_GLOSA_TIPO_USUARIO
     * @param p_RUT_CREACION
     * @return número de filas afectadas
     */
    @WebMethod(operationName = "tu_ins")
    public String tu_ins(
            @WebParam(name = "p_GLOSA_TIPO_USUARIO") String p_GLOSA_TIPO_USUARIO,
            @WebParam(name = "p_RUT_CREACION") String p_RUT_CREACION) throws Exception {
        List<PRM> lp = new ArrayList<>();
        lp.add(new PRM(1,"String",p_GLOSA_TIPO_USUARIO));
        lp.add(new PRM(2,"String",p_RUT_CREACION));
        return DAL_coneccion.retornaJSON("TIPO_USUARIO_tapi.ins", lp);
    }
    /**
     * Actualizar registro
     * @param p_RUT_ACTUALIZACION
     * @param p_GLOSA_TIPO_USUARIO
     * @param p_ID_TIPO_USUARIO
     * @return número de filas afectadas
     */
    @WebMethod(operationName = "tu_upd")
    public int tu_upd(
            @WebParam(name = "p_RUT_ACTUALIZACION") String p_RUT_ACTUALIZACION,
            @WebParam(name = "p_GLOSA_TIPO_USUARIO") String p_GLOSA_TIPO_USUARIO,
            @WebParam(name = "p_ID_TIPO_USUARIO") String p_ID_TIPO_USUARIO) throws Exception {
        List<PRM> lp = new ArrayList<>();
        lp.add(new PRM(1,"String",p_RUT_ACTUALIZACION));
        lp.add(new PRM(2,"String",p_GLOSA_TIPO_USUARIO));
        lp.add(new PRM(3,"Int",p_ID_TIPO_USUARIO));
        return DAL_coneccion.ejecutaTAPI("TIPO_USUARIO_tapi.upd", lp);
    }
    /**
     * Eliminar registro
     * @param id
     * @return número de filas afectadas
     */
    @WebMethod(operationName = "tu_del")
    public int tu_del(@WebParam(name = "id") String id) throws Exception {
        List<PRM> lp = new ArrayList<>();
        lp.add(new PRM(1,"Int",id));
        return DAL_coneccion.ejecutaTAPI("TIPO_USUARIO_tapi.del", lp);
    }
}
