package com.hsd.service.impl.Artificial;

import com.github.pagehelper.PageHelper;
import com.hsd.admin.statements.dto.PageBean;
import com.hsd.dao.wagecalculation.WageCalculationMapper;
import com.hsd.service.Artificial.WageCalculationService;
import com.hsd.vo.WageCalculationVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("wageCalculationService")
public class WageCalculationServiceImpl implements WageCalculationService {

    @Autowired
    WageCalculationMapper wageCalculationMapper;

    @Override
    public PageBean<WageCalculationVo> getWageCalculationListsByPage(String id, String fieldName, String userName, String rulesName, Integer page) {

        PageBean<WageCalculationVo> pageBean = new PageBean<WageCalculationVo>();
        if (null != id && !"".equals(id) && id.length() > 0) {
            List<WageCalculationVo> list = wageCalculationMapper.selectWageCalculationList(id, null,null,null);
            pageBean.setList(list);
            return pageBean;
        }
        if (null == page || "".equals(page)) {
            page = 1;
        }
        // 设置当前页数：
        if (page == 0) {
            page = 1;
        }
        pageBean.setPage(page);
        // 设置每页显示的记录数：
        Integer pageSize = 10;
        pageBean.setLimit(pageSize);
        // 设置总记录数
        int totalCount = 0;
        totalCount = wageCalculationMapper.selectWageCalculationCount(null,fieldName,userName,rulesName);
        pageBean.setTotalCount(totalCount);
        // 设置总页数：
        int totalPage = 0;
        if (totalCount % pageSize == 0) {
            totalPage = totalCount / pageSize;
        } else {
            totalPage = totalCount / pageSize + 1;
        }
        pageBean.setTotalPage(totalPage);

        // 从哪开始
        int begin = (page - 1) * pageSize;
        // 每页显示的数据集合：
        PageHelper.offsetPage(begin, pageSize);
        List<WageCalculationVo> list = wageCalculationMapper.selectWageCalculationList(null, fieldName,userName,rulesName);
        pageBean.setList(list);// 一定要记得设置到list里

        return pageBean;

    }
}
