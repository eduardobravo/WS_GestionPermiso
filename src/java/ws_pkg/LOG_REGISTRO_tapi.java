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
@WebService(serviceName = "LOG_REGISTRO_tapi")
public class LOG_REGISTRO_tapi {

    /**
     * Lista completa
     * @return Json
     */
    @WebMethod(operationName = "lr_sel")
    public String lr_sel() throws Exception {
        List<PRM> lp = new ArrayList<>();
        return DAL_coneccion.retornaJSON("LOG_REGISTRO_tapi.sel", lp);
    }
    /**
     * Selección por ID
     * @param p_RUT_CREACION
     * @return Json
     */
    @WebMethod(operationName = "lr_selId")
    public String lr_selId(
            @WebParam(name = "p_RUT_CREACION") String p_RUT_CREACION) throws Exception {
        List<PRM> lp = new ArrayList<>();
        lp.add(new PRM(1,"String",p_RUT_CREACION));
        return DAL_coneccion.retornaJSON("LOG_REGISTRO_tapi.selId", lp);
    }
    /**
     * Crear registro
     * @param p_RUT_CREACION
     * @param p_ID_TIPO_USUARIO
     * @param p_OBSERVACION
     * @param p_ACCION
     * @return número de filas afectadas
     */
    @WebMethod(operationName = "lr_ins")
    public int lr_ins(
            @WebParam(name = "p_RUT_CREACION") String p_RUT_CREACION,
            @WebParam(name = "p_ID_TIPO_USUARIO") String p_ID_TIPO_USUARIO,
            @WebParam(name = "p_OBSERVACION") String p_OBSERVACION,
            @WebParam(name = "p_ACCION") String p_ACCION) throws Exception {
        List<PRM> lp = new ArrayList<>();
        lp.add(new PRM(1,"String",p_RUT_CREACION));
        lp.add(new PRM(2,"Int",p_ID_TIPO_USUARIO));
        lp.add(new PRM(3,"String",p_OBSERVACION));
        lp.add(new PRM(4,"String",p_ACCION));
        return DAL_coneccion.ejecutaTAPI("LOG_REGISTRO_tapi.ins", lp);
    }
    /**
     * Actualizar registro
     * @param p_FECHA_CREACION
     * @param p_RUT_CREACION
     * @param p_ID_TIPO_USUARIO
     * @param p_OBSERVACION
     * @param p_ACCION
     * @return número de filas afectadas
     */
    @WebMethod(operationName = "lr_upd")
    public int lr_upd(
            @WebParam(name = "p_FECHA_CREACION") String p_FECHA_CREACION,
            @WebParam(name = "p_RUT_CREACION") String p_RUT_CREACION,
            @WebParam(name = "p_ID_TIPO_USUARIO") String p_ID_TIPO_USUARIO,
            @WebParam(name = "p_OBSERVACION") String p_OBSERVACION,
            @WebParam(name = "p_ACCION") String p_ACCION) throws Exception {
        List<PRM> lp = new ArrayList<>();
        lp.add(new PRM(1,"String",p_FECHA_CREACION));
        lp.add(new PRM(2,"String",p_RUT_CREACION));
        lp.add(new PRM(3,"Int",p_ID_TIPO_USUARIO));
        lp.add(new PRM(4,"String",p_OBSERVACION));
        lp.add(new PRM(5,"String",p_ACCION));
        return DAL_coneccion.ejecutaTAPI("LOG_REGISTRO_tapi.upd", lp);
    }
    /**
     * Eliminar registro
     * @param p_FECHA_CREACION
     * @param p_RUT_CREACION
     * @return número de filas afectadas
     */
    @WebMethod(operationName = "lr_del")
    public int lr_del(
            @WebParam(name = "p_FECHA_CREACION") String p_FECHA_CREACION,
            @WebParam(name = "p_RUT_CREACION") String p_RUT_CREACION) throws Exception {
        List<PRM> lp = new ArrayList<>();
        lp.add(new PRM(1,"String",p_FECHA_CREACION));
        lp.add(new PRM(2,"String",p_RUT_CREACION));
        return DAL_coneccion.ejecutaTAPI("LOG_REGISTRO_tapi.del", lp);
    }
}
