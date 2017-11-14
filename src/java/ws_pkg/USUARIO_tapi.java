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
@WebService(serviceName = "USUARIO_tapi")
public class USUARIO_tapi {

    /**
     * Lista completa
     * @param flag_activo
     * @return Json
     */
    @WebMethod(operationName = "u_sel")
    public String u_sel(@WebParam(name = "flag_activo") String flag_activo) throws Exception {
        List<PRM> lp = new ArrayList<>();
        lp.add(new PRM(1,"Int",flag_activo));
        return DAL_coneccion.retornaJSON("USUARIO_tapi.sel", lp);
    }
    /**
     * Selección por ID
     * @param rut
     * @return Json
     */
    @WebMethod(operationName = "u_selId")
    public String u_selId(@WebParam(name = "rut") String rut) throws Exception {
        List<PRM> lp = new ArrayList<>();
        lp.add(new PRM(1,"String",rut));
        return DAL_coneccion.retornaJSON("USUARIO_tapi.selId", lp);
    }
    /**
     * Crear registro
     * @param p_RUT
     * @param p_FECHA_CONTRATO
     * @param p_APELLIDOM
     * @param p_PASSWORD
     * @param p_FECHA_INGRESO
     * @param p_RUT_CREACION
     * @param p_NOMBRE
     * @param p_APELLIDOP
     * @return número de filas afectadas
     */
    @WebMethod(operationName = "u_ins")
    public int u_ins(
            @WebParam(name = "p_RUT") String p_RUT,
            @WebParam(name = "p_FECHA_CONTRATO") String p_FECHA_CONTRATO,
            @WebParam(name = "p_APELLIDOM") String p_APELLIDOM,
            @WebParam(name = "p_PASSWORD") String p_PASSWORD,
            @WebParam(name = "p_FECHA_INGRESO") String p_FECHA_INGRESO,
            @WebParam(name = "p_RUT_CREACION") String p_RUT_CREACION,
            @WebParam(name = "p_NOMBRE") String p_NOMBRE,
            @WebParam(name = "p_APELLIDOP") String p_APELLIDOP) throws Exception {
        List<PRM> lp = new ArrayList<>();
        lp.add(new PRM(1,"String",p_RUT));
        lp.add(new PRM(2,"String",p_FECHA_CONTRATO));
        lp.add(new PRM(3,"String",p_APELLIDOM));
        lp.add(new PRM(4,"String",p_PASSWORD));
        lp.add(new PRM(5,"String",p_FECHA_INGRESO));
        lp.add(new PRM(6,"String",p_RUT_CREACION));
        lp.add(new PRM(7,"String",p_NOMBRE));
        lp.add(new PRM(8,"String",p_APELLIDOP));
        
        return DAL_coneccion.ejecutaTAPI("USUARIO_tapi.ins", lp);
    }
    /**
     * Actualizar registro
     * @param p_RUT
     * @param p_FECHA_CONTRATO
     * @param p_APELLIDOM
     * @param p_PASSWORD
     * @param p_RUT_ACTUALIZACION
     * @param p_FECHA_INGRESO
     * @param p_NOMBRE
     * @param p_APELLIDOP
     * @return número de filas afectadas
     */
    @WebMethod(operationName = "u_upd")
    public int u_upd(
            @WebParam(name = "p_RUT") String p_RUT,
            @WebParam(name = "p_FECHA_CONTRATO") String p_FECHA_CONTRATO,
            @WebParam(name = "p_APELLIDOM") String p_APELLIDOM,
            @WebParam(name = "p_PASSWORD") String p_PASSWORD,
            @WebParam(name = "p_RUT_ACTUALIZACION") String p_RUT_ACTUALIZACION,
            @WebParam(name = "p_FECHA_INGRESO") String p_FECHA_INGRESO,
            @WebParam(name = "p_NOMBRE") String p_NOMBRE,
            @WebParam(name = "p_APELLIDOP") String p_APELLIDOP) throws Exception {
        List<PRM> lp = new ArrayList<>();
        lp.add(new PRM(1,"String",p_RUT));
        lp.add(new PRM(2,"String",p_FECHA_CONTRATO));
        lp.add(new PRM(3,"String",p_APELLIDOM));
        lp.add(new PRM(4,"String",p_PASSWORD));
        lp.add(new PRM(5,"String",p_RUT_ACTUALIZACION));
        lp.add(new PRM(6,"String",p_FECHA_INGRESO));
        lp.add(new PRM(7,"String",p_NOMBRE));
        lp.add(new PRM(8,"String",p_APELLIDOP));
        return DAL_coneccion.ejecutaTAPI("USUARIO_tapi.upd", lp);
    }
    /**
     * Eliminar registro
     * @param rut
     * @return número de filas afectadas
     */
    @WebMethod(operationName = "u_del")
    public int u_del(@WebParam(name = "rut") String rut) throws Exception {
        List<PRM> lp = new ArrayList<>();
        lp.add(new PRM(1,"String",rut));
        return DAL_coneccion.ejecutaTAPI("USUARIO_tapi.del", lp);
    }
    /**
     * Activar o desactivar un registro
     * @param rut
     * @param flag_activo
     * @return número de filas afectadas
     */
    @WebMethod(operationName = "u_active")
    public int u_active(@WebParam(name = "rut") String rut,
            @WebParam(name = "flag_activo") String flag_activo) throws Exception {
        List<PRM> lp = new ArrayList<>();
        lp.add(new PRM(1,"String",rut));
        lp.add(new PRM(2,"Int",flag_activo));
        return DAL_coneccion.ejecutaTAPI("USUARIO_tapi.active", lp);
    }
}
