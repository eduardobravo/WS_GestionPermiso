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
@WebService(serviceName = "REL_USUARIO_TIPO_USU_tapi")
public class REL_USUARIO_TIPO_USU_tapi {

    /**
     * Lista completa
     * @return Json
     */
    @WebMethod(operationName = "rutu_sel")
    public String rutu_sel() throws Exception {
        List<PRM> lp = new ArrayList<>();
        return DAL_coneccion.retornaJSON("REL_USUARIO_TIPO_USU_tapi.sel", lp);
    }
    /**
     * Selección por ID
     * @param p_RUT
     * @param p_ID_TIPO_USUARIO
     * @return Json
     */
    @WebMethod(operationName = "rutu_selId")
    public String rutu_selId(
            @WebParam(name = "p_RUT") String p_RUT,
            @WebParam(name = "p_ID_TIPO_USUARIO") String p_ID_TIPO_USUARIO) throws Exception {
        List<PRM> lp = new ArrayList<>();
        lp.add(new PRM(1,"String",p_RUT));
        lp.add(new PRM(2,"Int",p_ID_TIPO_USUARIO));
        return DAL_coneccion.retornaJSON("REL_USUARIO_TIPO_USU_tapi.selId", lp);
    }
    /**
     * Crear registro
     * @param p_RUT
     * @param p_ID_TIPO_USUARIO
     * @param p_RUT_CREACION
     * @return número de filas afectadas
     */
    @WebMethod(operationName = "rutu_ins")
    public int rutu_ins(
            @WebParam(name = "p_RUT") String p_RUT,
            @WebParam(name = "p_ID_TIPO_USUARIO") String p_ID_TIPO_USUARIO,
            @WebParam(name = "p_RUT_CREACION") String p_RUT_CREACION) throws Exception {
        List<PRM> lp = new ArrayList<>();
        lp.add(new PRM(1,"Int",p_RUT));
        lp.add(new PRM(2,"Int",p_ID_TIPO_USUARIO));
        lp.add(new PRM(3,"String",p_RUT_CREACION));
        return DAL_coneccion.ejecutaTAPI("REL_USUARIO_TIPO_USU_tapi.ins", lp);
    }
    /**
     * Eliminar registro
     * @param p_RUT
     * @param p_ID_TIPO_USUARIO
     * @return número de filas afectadas
     */
    @WebMethod(operationName = "rutu_del")
    public int rutu_del(
            @WebParam(name = "p_RUT") String p_RUT,
            @WebParam(name = "p_ID_TIPO_USUARIO") String p_ID_TIPO_USUARIO) throws Exception {
        List<PRM> lp = new ArrayList<>();
        lp.add(new PRM(1,"String",p_RUT));
        lp.add(new PRM(2,"Int",p_ID_TIPO_USUARIO));
        return DAL_coneccion.ejecutaTAPI("REL_USUARIO_TIPO_USU_tapi.del", lp);
    }
}
