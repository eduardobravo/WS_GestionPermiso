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
@WebService(serviceName = "REL_TIPO_USUARIO_MENU_tapi")
public class REL_TIPO_USUARIO_MENU_tapi {

    /**
     * Lista completa
     * @return Json
     */
    @WebMethod(operationName = "rtum_sel")
    public String rtum_sel() throws Exception {
        List<PRM> lp = new ArrayList<>();
        return DAL_coneccion.retornaJSON("REL_TIPO_USUARIO_MENU_tapi.sel", lp);
    }
    /**
     * Selección por ID
     * @param p_ID_TIPO_USUARIO
     * @param p_ID_MENU
     * @return Json
     */
    @WebMethod(operationName = "rtum_selId")
    public String rtum_selId(
            @WebParam(name = "p_ID_TIPO_USUARIO") String p_ID_TIPO_USUARIO,
            @WebParam(name = "p_ID_MENU") String p_ID_MENU) throws Exception {
        List<PRM> lp = new ArrayList<>();
        lp.add(new PRM(1,"Int",p_ID_TIPO_USUARIO));
        lp.add(new PRM(2,"Int",p_ID_MENU));
        return DAL_coneccion.retornaJSON("REL_TIPO_USUARIO_MENU_tapi.selId", lp);
    }
    /**
     * Crear registro
     * @param p_ID_TIPO_USUARIO
     * @param p_RUT_CREACION
     * @param p_ID_MENU
     * @return número de filas afectadas
     */
    @WebMethod(operationName = "rtum_ins")
    public int rtum_ins(
            @WebParam(name = "p_ID_TIPO_USUARIO") String p_ID_TIPO_USUARIO,
            @WebParam(name = "p_RUT_CREACION") String p_RUT_CREACION,
            @WebParam(name = "p_ID_MENU") String p_ID_MENU) throws Exception {
        List<PRM> lp = new ArrayList<>();
        lp.add(new PRM(1,"Int",p_ID_TIPO_USUARIO));
        lp.add(new PRM(2,"String",p_RUT_CREACION));
        lp.add(new PRM(3,"Int",p_ID_MENU));
        return DAL_coneccion.ejecutaTAPI("REL_TIPO_USUARIO_MENU_tapi.ins", lp);
    }
    /**
     * Eliminar registro
     * @param p_ID_TIPO_USUARIO
     * @param p_ID_MENU
     * @return número de filas afectadas
     */
    @WebMethod(operationName = "rtum_del")
    public int rtum_del(
            @WebParam(name = "p_ID_TIPO_USUARIO") String p_ID_TIPO_USUARIO,
            @WebParam(name = "p_ID_MENU") String p_ID_MENU) throws Exception {
        List<PRM> lp = new ArrayList<>();
        lp.add(new PRM(1,"Int",p_ID_TIPO_USUARIO));
        lp.add(new PRM(2,"Int",p_ID_MENU)); 
        return DAL_coneccion.ejecutaTAPI("REL_TIPO_USUARIO_MENU_tapi.del", lp);
    }
}
