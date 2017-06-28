package com.gv.spittr.documents;

import com.gv.spittr.entities.Spittle;
import org.apache.poi.hssf.usermodel.HSSFFont;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.hssf.util.HSSFColor;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.Font;
import org.springframework.web.servlet.view.document.AbstractExcelView;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;
import java.util.Map;

public class ExcelDocument extends AbstractExcelView {

    @Override
    protected void buildExcelDocument(
            Map<String, Object> model,
            HSSFWorkbook workbook,
            HttpServletRequest request,
            HttpServletResponse response) throws Exception {

        //New Excel sheet
        HSSFSheet excelSheet = workbook.createSheet("Simple excel example");
        //Excel file name change
        response.setHeader("Content-Disposition", "attachment; filename=excelDocument.xls");

        Font font = workbook.createFont();
        font.setFontName("Arial");
        font.setBoldweight(HSSFFont.BOLDWEIGHT_BOLD);
        font.setColor(HSSFColor.WHITE.index);

        //Create Style for header
        CellStyle styleHeader = workbook.createCellStyle();
        styleHeader.setFillForegroundColor(HSSFColor.BLUE.index);
        styleHeader.setFillPattern(CellStyle.SOLID_FOREGROUND);
        styleHeader.setFont(font);

        //Set excel header
        setExcelHeader(excelSheet, styleHeader);

        //Get data from model
        List<Spittle> spittles = (List<Spittle>) model.get("modelObject");
        int rowCount = 1;
        for (Spittle spittle : spittles) {
            HSSFRow row = excelSheet.createRow(rowCount++);
            row.createCell(0).setCellValue(spittle.getSpittleId());
            row.createCell(1).setCellValue(spittle.getContent());
            row.createCell(2).setCellValue(spittle.getAuthorsId());
            row.createCell(3).setCellValue(spittle.getDate().toString());
        }
    }

    public void setExcelHeader(HSSFSheet excelSheet, CellStyle styleHeader) {
        //set Excel Header names
        HSSFRow header = excelSheet.createRow(0);
        header.createCell(0).setCellValue("Spittle id");
        header.getCell(0).setCellStyle(styleHeader);
        header.createCell(1).setCellValue("Content");
        header.getCell(1).setCellStyle(styleHeader);
        header.createCell(2).setCellValue("Authors id");
        header.getCell(2).setCellStyle(styleHeader);
        header.createCell(3).setCellValue("Date");
        header.getCell(3).setCellStyle(styleHeader);
    }
}