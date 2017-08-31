package com.hsd.util;


import com.hsd.service.redline.RedLineService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.servlet.http.HttpServletRequest;
/**
 * 权限工具类
 * @author Administrator
 *
 */
@Component
public class JyPermissionUtil {

    @Autowired
    private  RedLineService redLineService;
    private static JyPermissionUtil jyPermission;

    public void setRedLineService(RedLineService redLineService) {
        this.redLineService = redLineService;
    }

    @PostConstruct
    public void init() {
        jyPermission = this;
        jyPermission.redLineService = this.redLineService;

    }


    public static void setPermissions(String userId, HttpServletRequest request){

        request.getSession().setAttribute("userId", userId);

        String permission=jyPermission.redLineService.getPermission(userId);

        request.getSession().setAttribute("permissionWeb", permission);
    }


    public static String  getPermissions(HttpServletRequest request){
        String permission= (String)request.getSession().getAttribute("permissionWeb");
        return permission;

    }

    public static String getFieldID(String userId) {
        String fieldId=jyPermission.redLineService.getFieldIDByUserId(userId);
        return  fieldId;
    }
}
