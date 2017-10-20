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
@WebService(serviceName = "FERIADO_MANUAL_tapi")
public class FERIADO_MANUAL_tapi {

    /**
     * Lista completa
     * @return Json
     */
    @WebMethod(operationName = "sel")
    public String fm_sel() throws Exception {
        List<PRM> lp = new ArrayList<>();
        return DAL_coneccion.retornaJSON("FERIADO_MANUAL_tapi.sel", lp);
    }
    /**
     * Selección por ID
     * @param id
     * @return Json
     */
    @WebMethod(operationName = "selId")
    public String fm_selId(@WebParam(name = "id") String id) throws Exception {
        List<PRM> lp = new ArrayList<>();
        lp.add(new PRM(1,"Int",id));
        return DAL_coneccion.retornaJSON("FERIADO_MANUAL_tapi.selId", lp);
    }
    /**
     * Crear registro
     * @param p_MES
     * @param p_RUT_CREACION
     * @param p_ANIO
     * @param p_DIA
     * @param p_ID_FERIADO_MANUAL
     * @return número de filas afectadas
     */
    @WebMethod(operationName = "ins")
    public int fm_ins(
            @WebParam(name = "p_MES") String p_MES,
            @WebParam(name = "p_RUT_CREACION") String p_RUT_CREACION,
            @WebParam(name = "p_ANIO") String p_ANIO,
            @WebParam(name = "p_DIA") String p_DIA,
            @WebParam(name = "p_ID_FERIADO_MANUAL") String p_ID_FERIADO_MANUAL) throws Exception {
        List<PRM> lp = new ArrayList<>();
        lp.add(new PRM(1,"Int",p_MES));
        lp.add(new PRM(2,"String",p_RUT_CREACION));
        lp.add(new PRM(3,"Int",p_ANIO));
        lp.add(new PRM(4,"Int",p_DIA));
        lp.add(new PRM(5,"Int",p_ID_FERIADO_MANUAL));
        return DAL_coneccion.ejecutaTAPI("FERIADO_MANUAL_tapi.ins", lp);
    }
    /**
     * Actualizar registro
     * @param p_RUT_ACTUALIZACION
     * @param p_MES
     * @param p_ANIO
     * @param p_DIA
     * @param p_ID_FERIADO_MANUAL
     * @return número de filas afectadas
     */
    @WebMethod(operationName = "upd")
    public int fm_upd(
            @WebParam(name = "p_RUT_ACTUALIZACION") String p_RUT_ACTUALIZACION,
            @WebParam(name = "p_MES") String p_MES,
            @WebParam(name = "p_ANIO") String p_ANIO,
            @WebParam(name = "p_DIA") String p_DIA,
            @WebParam(name = "p_ID_FERIADO_MANUAL") String p_ID_FERIADO_MANUAL) throws Exception {
        List<PRM> lp = new ArrayList<>();
        lp.add(new PRM(1,"String",p_RUT_ACTUALIZACION));
        lp.add(new PRM(2,"Int",p_MES));
        lp.add(new PRM(3,"Int",p_ANIO));
        lp.add(new PRM(4,"Int",p_DIA));
        lp.add(new PRM(5,"Int",p_ID_FERIADO_MANUAL));
        return DAL_coneccion.ejecutaTAPI("FERIADO_MANUAL_tapi.upd", lp);
    }
    /**
     * Eliminar registro
     * @param id
     * @return número de filas afectadas
     */
    @WebMethod(operationName = "del")
    public int fm_del(@WebParam(name = "id") String id) throws Exception {
        List<PRM> lp = new ArrayList<>();
        lp.add(new PRM(1,"Int",id));
        return DAL_coneccion.ejecutaTAPI("FERIADO_MANUAL_tapi.del", lp);
    }
}
