package com.hsd.action;

import com.hsd.admin.statements.dto.PageBean;
import com.hsd.service.Artificial.WageCalculationService;
import com.hsd.service.redline.RedLineService;
import com.hsd.vo.WageCalculationVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

/**
 * 工资
 */
@Controller
@RequestMapping("/artificial")
public class ArtificialController {

    @Autowired
    RedLineService redLineService;
    @Autowired
    WageCalculationService wageCalculationService;

    @RequestMapping(value = "/toArtificialPage",method = RequestMethod.GET)
    public String toArtificialPage(String userId, HttpServletRequest request){

        userId="1754";
        request.getSession().setAttribute("userId", userId);

        String permission=redLineService.getPermission(userId);

        request.getSession().setAttribute("permission", permission);

        return "/artificial/wageCalculation/wageCalculationPage";
    }


    @RequestMapping(value = "/getWageCalculationList",method = RequestMethod.POST)
    @ResponseBody
    public PageBean<WageCalculationVo> getWageCalculationList(HttpServletRequest request,String id,String fieldName,String userName,String rulesName,Integer page){

        String permission=(String) request.getSession().getAttribute("permission");
        String userId=(String) request.getSession().getAttribute("userId");
//		userId="1754";
//		permission="yes";
        String filenames=redLineService.getFieldNameByUserId(userId);

        if(null!=permission&&"yes".equals(permission)){
            return wageCalculationService.getWageCalculationListsByPage(id, fieldName,userName,rulesName, page);

        }else if(null!=permission&&"no".equals(permission)){

            return wageCalculationService.getWageCalculationListsByPage(id, filenames,userName,rulesName, page);
        }

        return null;
    }

}
