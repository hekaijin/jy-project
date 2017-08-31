package com.hsd.util;

import java.io.IOException;  
import java.io.InputStream;  
import java.text.DecimalFormat;  
import java.text.SimpleDateFormat;  
import java.util.ArrayList;  
import java.util.List;  
  
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;  
import org.apache.poi.ss.usermodel.Row;  
import org.apache.poi.ss.usermodel.Sheet;  
import org.apache.poi.ss.usermodel.Workbook;  
import org.apache.poi.xssf.usermodel.XSSFWorkbook;



  
/**
 * Excel导入解析工具类  
 * @author Administrator
 *
 */
public class ImportExcelUtil {  
      
    private final static String excel2003L =".xls";    //2003- 版本的excel  
    private final static String excel2007U =".xlsx";   //2007+ 版本的excel  
      
    /** 
     * 描述：获取IO流中的数据，组装成List<List<Object>>对象 
     * @param in,fileName 
     * @return 
     * @throws IOException  
     */  
    public  List<List<Object>> getBankListByExcel(InputStream in,String fileName) throws Exception{  
        List<List<Object>> list = null;  
          
        //创建Excel工作薄  
        Workbook work = this.getWorkbook(in,fileName);  
        if(null == work){  
            throw new Exception("创建Excel工作薄为空！");  
        }  
        Sheet sheet = null;  
        Row row = null;  
        Cell cell = null;  
          
        list = new ArrayList<List<Object>>();  
        //遍历Excel中所有的sheet  
        for (int i = 0; i < work.getNumberOfSheets(); i++) {  
            sheet = work.getSheetAt(i);  
            if(sheet==null){continue;}  
              
            //遍历当前sheet中的所有行  
            for (int j = sheet.getFirstRowNum(); j<=sheet.getLastRowNum(); j++) {  
                row = sheet.getRow(j);  
                if(row==null||row.getFirstCellNum()==j){continue;}  
                  
                //遍历所有的列  
                List<Object> li = new ArrayList<Object>();  
                if(li!=null){
	                for (int y = row.getFirstCellNum(); y < row.getLastCellNum(); y++) {  
	                    cell = row.getCell(y);
	                    if(cell!=null){
	                    	
	                    	li.add(this.getCellValue(cell)); 
	                    }
	                }  
	                	
	                	list.add(li); 
                }
            }  
        }  
        return removeEmptyList(list);  
    }  
 
    
    
    
    /** 
     * 描述：获取IO流中的数据，组装成List<List<Object>>对象 
     * @param in,fileName 
     * @return 
     * @throws IOException  
     */  
    public  List<List<Object>> getBankListByExcel2(InputStream in,String fileName) throws Exception{  
        List<List<Object>> list = null;  
          
        //创建Excel工作薄  
        Workbook work = this.getWorkbook(in,fileName);  
        if(null == work){  
            throw new Exception("创建Excel工作薄为空！");  
        }  
        Sheet sheet = null;  
        Row row = null;  
        Cell cell = null;  
          
        list = new ArrayList<List<Object>>();  
        //遍历Excel中所有的sheet  
        for (int i = 0; i < work.getNumberOfSheets(); i++) {  
            sheet = work.getSheetAt(i);  
            if(sheet==null){continue;}  
              
            //遍历当前sheet中的所有行  
            for (int j = sheet.getFirstRowNum(); j<=sheet.getLastRowNum(); j++) {  
                row = sheet.getRow(j);  
                if(row==null||row.getFirstCellNum()==j){continue;}  
                  
                //遍历所有的列  
                List<Object> li = new ArrayList<Object>();  
                if(li!=null){
	                for (int y = row.getFirstCellNum(); y < row.getLastCellNum(); y++) {  
	                    cell = row.getCell(y);
	                    if(cell!=null){
	                    	
	                    	li.add(this.getCellValue2(cell)); 
	                    }
	                }  
	                	
	                	list.add(li); 
                }
            }  
        }  
        return removeEmptyList(list);  
    }  
    
    
    /** 删除list的空元素**
     * 删除list中所有为空的元素 
     * 删除为空的操作方式非常复杂，因为你每一次删除一个元素之后， 
     * 当前的list的大小就会变化，但是反过来想，如果只是获取它不为 
     * 空的元素则不需要考虑它的size大小的变化，而且比较简单。 
     * @param list 
     * @return 
     */  
    public static List removeEmptyList(List list) {  
        List list1 = new ArrayList();  
          
        if(list==null||list.size()<=0)  
            return null;  
        //循环第一层  
        for(int i=0;i<list.size();i++) {  
            //进入每一个list  
            List listi = (List) list.get(i);  
            if(listi!=null&&listi.size()>0 && listi.get(0) !="") { 
                list1.add(listi);  
            } 
        }
          
        return list1;  
    }  
    
    
    /**
     * 读取Excel表格表头的内容
     * @param InputStream
     * @return String 表头内容的数组
     */
    public String[] getHeads(InputStream in,String fileName)throws Exception {
    	
    	 Sheet sheet = null;  
    	 Row row = null;  
    	 XSSFWorkbook work=new XSSFWorkbook(in);
    	 sheet = work.getSheetAt(0);
    	 row = sheet.getRow(0);
        // 标题总列数
        int colNum = row.getPhysicalNumberOfCells();
//        System.out.println("colNum:" + colNum);
        String[] title = new String[colNum];
        for (int i = 0; i < colNum; i++) {
            //title[i] = getStringCellValue(row.getCell((short) i));
            title[i] = (String) getCellValue(row.getCell((short) i));
        }
        return title;
    }
      
    /** 
     * 描述：根据文件后缀，自适应上传文件的版本  
     * @param inStr,fileName 
     * @return 
     * @throws Exception 
     */  
    public  Workbook getWorkbook(InputStream inStr,String fileName) throws Exception{  
        Workbook wb = null;  
        String fileType = fileName.substring(fileName.lastIndexOf("."));  
        if(excel2003L.equals(fileType)){  
            wb = new HSSFWorkbook(inStr);  //2003-  
        }else if(excel2007U.equals(fileType)){  
            wb = new XSSFWorkbook(inStr);  //2007+  
        }else{  
            throw new Exception("解析的文件格式有误！");  
        }  
        return wb;  
    }  
  
    /** 
     * 描述：对表格中数值进行格式化 
     * @param cell 
     * @return 
     */  
    public  Object getCellValue(Cell cell){  
        Object value = null;  
        DecimalFormat df = new DecimalFormat("0");  //格式化number String字符  
        SimpleDateFormat sdf = new SimpleDateFormat("yyy-MM-dd");  //日期格式化  
        DecimalFormat df2 = new DecimalFormat("0.00");  //格式化数字  
      String   ce=cell.getCellStyle().getDataFormatString();
      System.out.println(ce);
        switch (cell.getCellType()) {  
        case Cell.CELL_TYPE_STRING:  
            value = cell.getRichStringCellValue().getString();  
            break;  
        case Cell.CELL_TYPE_NUMERIC:  
            if("General".equals(cell.getCellStyle().getDataFormatString()) && cell.toString().lastIndexOf(".0")>0){  
                value = df.format(cell.getNumericCellValue());  
            }else if("m/d/yy".equals(cell.getCellStyle().getDataFormatString())||"yyyy/m/d;@".equals(cell.getCellStyle().getDataFormatString())||"yyyy\\-m\\-d".equals(cell.getCellStyle().getDataFormatString())){  
                value = sdf.format(cell.getDateCellValue());  
            }else  if(cell.getCellStyle().getDataFormatString().indexOf("y")>=0&&cell.getCellStyle().getDataFormatString().indexOf("m")>=0&&cell.getCellStyle().getDataFormatString().indexOf("d")>=0){
            	 value = sdf.format(cell.getDateCellValue()); 
            }else{  
                value = df2.format(cell.getNumericCellValue());  
            }  
            break;  
        case Cell.CELL_TYPE_BOOLEAN:  
            value = cell.getBooleanCellValue();  
            break;  
        case Cell.CELL_TYPE_BLANK:  
            value = "";  
            break;  
        default:  
            break;  
        }  
        return value;  
    }  
    
    
    /** 
     * 描述：对表格中数值进行格式化 
     * @param cell 
     * @return 
     */  
    public  Object getCellValue2(Cell cell){  
    	Object value = null;  
    	DecimalFormat df = new DecimalFormat("0");  //格式化number String字符  
    	SimpleDateFormat sdf = new SimpleDateFormat("yyy-MM-dd");  //日期格式化  
    	DecimalFormat df2 = new DecimalFormat("0.00");  //格式化数字  
    	String   ce=cell.getCellStyle().getDataFormatString();
    	System.out.println(ce);
    	switch (cell.getCellType()) {  
    	case Cell.CELL_TYPE_STRING:  
    		value = cell.getRichStringCellValue().getString();  
    		break;  
    	case Cell.CELL_TYPE_NUMERIC:  
//    		if("General".equals(cell.getCellStyle().getDataFormatString())){  
    		if("General".equals(cell.getCellStyle().getDataFormatString()) && cell.toString().lastIndexOf(".0")>0){  
    			value = df.format(cell.getNumericCellValue());  
    		}else if("General".equals(cell.getCellStyle().getDataFormatString()) && cell.toString().lastIndexOf(".00")<0){  
    			value = df2.format(cell.getNumericCellValue());  
    		}else if("m/d/yy".equals(cell.getCellStyle().getDataFormatString())||"yyyy/m/d;@".equals(cell.getCellStyle().getDataFormatString())||"yyyy\\-m\\-d".equals(cell.getCellStyle().getDataFormatString())){  
    			value = sdf.format(cell.getDateCellValue());  
    		}else  if(cell.getCellStyle().getDataFormatString().indexOf("y")>=0&&cell.getCellStyle().getDataFormatString().indexOf("m")>=0&&cell.getCellStyle().getDataFormatString().indexOf("d")>=0){
    			value = sdf.format(cell.getDateCellValue()); 
    		}  
    		break;  
    	case Cell.CELL_TYPE_BOOLEAN:  
    		value = cell.getBooleanCellValue();  
    		break;  
    	case Cell.CELL_TYPE_BLANK:  
    		value = "";  
    		break;  
    	default:  
    		break;  
    	}  
    	return value;  
    }  
      
  
}  