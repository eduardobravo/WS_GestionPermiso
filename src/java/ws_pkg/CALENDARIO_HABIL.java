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
@WebService(serviceName = "CALENDARIO_HABIL")
public class CALENDARIO_HABIL {

    /**
     * Lista completa
     * @return Json
     */
    @WebMethod(operationName = "sel")
    public String ch_sel() throws Exception {
        List<PRM> lp = new ArrayList<>();
        return DAL_coneccion.retornaJSON("CALENDARIO_HABIL_tapi.sel", lp);
    }
    /**
     * Selección por ID
     * @param id
     * @return Json
     */
    @WebMethod(operationName = "selId")
    public String ch_selId(@WebParam(name = "id") String id) throws Exception {
        List<PRM> lp = new ArrayList<>();
        lp.add(new PRM(1,"Int",id));
        return DAL_coneccion.retornaJSON("CALENDARIO_HABIL_tapi.selId", lp);
    }
    /**
     * Crear registro
     * @param p_HABIL
     * @param p_MES
     * @param p_ID_CALENDARIO
     * @param p_RUT_CREACION
     * @param p_ANIO
     * @param p_DIA
     * @return número de filas afectadas
     */
    @WebMethod(operationName = "ins")
    public int ch_ins(
            @WebParam(name = "p_HABIL") String p_HABIL,
            @WebParam(name = "p_MES") String p_MES,
            @WebParam(name = "p_ID_CALENDARIO") String p_ID_CALENDARIO,
            @WebParam(name = "p_RUT_CREACION") String p_RUT_CREACION,
            @WebParam(name = "p_ANIO") String p_ANIO,
            @WebParam(name = "p_DIA") String p_DIA) throws Exception {
        List<PRM> lp = new ArrayList<>();
        lp.add(new PRM(1,"Int",p_HABIL));
        lp.add(new PRM(2,"Int",p_MES));
        lp.add(new PRM(3,"Int",p_ID_CALENDARIO));
        lp.add(new PRM(4,"String",p_RUT_CREACION));
        lp.add(new PRM(5,"Int",p_ANIO));
        lp.add(new PRM(6,"Int",p_DIA));
        
        return DAL_coneccion.ejecutaTAPI("CALENDARIO_HABIL_tapi.ins", lp);
    }
    /**
     * Actualizar registro
     * @param p_RUT_ACTUALIZACION
     * @param p_HABIL
     * @param p_MES
     * @param p_ID_CALENDARIO
     * @param p_ANIO
     * @param p_DIA
     * @return número de filas afectadas
     */
    @WebMethod(operationName = "upd")
    public int ch_upd(
            @WebParam(name = "p_RUT_ACTUALIZACION") String p_RUT_ACTUALIZACION,
            @WebParam(name = "p_HABIL") String p_HABIL,
            @WebParam(name = "p_MES") String p_MES,
            @WebParam(name = "p_ID_CALENDARIO") String p_ID_CALENDARIO,
            @WebParam(name = "p_ANIO") String p_ANIO,
            @WebParam(name = "p_DIA") String p_DIA) throws Exception {
        List<PRM> lp = new ArrayList<>();
        lp.add(new PRM(1,"String",p_RUT_ACTUALIZACION));
        lp.add(new PRM(2,"Int",p_HABIL));
        lp.add(new PRM(3,"Int",p_MES));
        lp.add(new PRM(4,"Int",p_ID_CALENDARIO));
        lp.add(new PRM(5,"Int",p_ANIO));
        lp.add(new PRM(6,"Int",p_DIA));
        return DAL_coneccion.ejecutaTAPI("CALENDARIO_HABIL_tapi.upd", lp);
    }
    /**
     * Eliminar registro
     * @param id
     * @return número de filas afectadas
     */
    @WebMethod(operationName = "del")
    public int ch_del(@WebParam(name = "id") String id) throws Exception {
        List<PRM> lp = new ArrayList<>();
        lp.add(new PRM(1,"Int",id));
        return DAL_coneccion.ejecutaTAPI("CALENDARIO_HABIL_tapi.del", lp);
    }
}
