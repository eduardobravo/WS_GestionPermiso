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
@WebService(serviceName = "MENU_tapi")
public class MENU_tapi {

    /**
     * Lista completa
     * @return Json
     */
    @WebMethod(operationName = "sel")
    public String sel() throws Exception {
        List<PRM> lp = new ArrayList<>();
        return DAL_coneccion.retornaJSON("MENU_tapi.sel", lp);
    }
    /**
     * Selección por ID
     * @param id
     * @return Json
     */
    @WebMethod(operationName = "selId")
    public String selId(@WebParam(name = "id") String id) throws Exception {
        List<PRM> lp = new ArrayList<>();
        lp.add(new PRM(1,"Int",id));
        return DAL_coneccion.retornaJSON("MENU_tapi.selId", lp);
    }
    /**
     * Crear registro
     * @param p_GLOSA_TIPO_USUARIO
     * @param p_RUT_CREACION
     * @param p_ID_TIPO_USUARIO
     * @return número de filas afectadas
     */
    @WebMethod(operationName = "ins")
    public int ins(
            @WebParam(name = "p_RUT_CREACION") String p_RUT_CREACION,
            @WebParam(name = "p_ID_MENU") String p_ID_MENU,
            @WebParam(name = "p_GLOSA_MENU") String p_GLOSA_MENU,
            @WebParam(name = "p_PAGINA") String p_PAGINA) throws Exception {
        List<PRM> lp = new ArrayList<>();
        lp.add(new PRM(1,"String",p_RUT_CREACION));
        lp.add(new PRM(2,"Int",p_ID_MENU));
        lp.add(new PRM(3,"String",p_GLOSA_MENU));
        lp.add(new PRM(4,"String",p_PAGINA));
        return DAL_coneccion.ejecutaTAPI("MENU_tapi.ins", lp);
    }
    /**
     * Actualizar registro
     * @param p_RUT_ACTUALIZACION
     * @param p_GLOSA_TIPO_USUARIO
     * @param p_ID_TIPO_USUARIO
     * @return número de filas afectadas
     */
    @WebMethod(operationName = "upd")
    public int upd(
            @WebParam(name = "p_RUT_ACTUALIZACION") String p_RUT_ACTUALIZACION,
            @WebParam(name = "p_ID_MENU") String p_ID_MENU,
            @WebParam(name = "p_GLOSA_MENU") String p_GLOSA_MENU,
            @WebParam(name = "p_PAGINA") String p_PAGINA) throws Exception {
        List<PRM> lp = new ArrayList<>();
        lp.add(new PRM(1,"String",p_RUT_ACTUALIZACION));
        lp.add(new PRM(2,"Int",p_ID_MENU));
        lp.add(new PRM(3,"String",p_GLOSA_MENU));
        lp.add(new PRM(4,"String",p_PAGINA));
        return DAL_coneccion.ejecutaTAPI("MENU_tapi.upd", lp);
    }
    /**
     * Eliminar registro
     * @param id
     * @return número de filas afectadas
     */
    @WebMethod(operationName = "del")
    public int del(@WebParam(name = "id") String id) throws Exception {
        List<PRM> lp = new ArrayList<>();
        lp.add(new PRM(1,"Int",id));
        return DAL_coneccion.ejecutaTAPI("MENU_tapi.del", lp);
    }
}
