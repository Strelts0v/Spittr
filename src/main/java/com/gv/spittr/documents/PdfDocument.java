package com.gv.spittr.documents;

import com.gv.spittr.entities.Spittle;
import com.lowagie.text.Document;
import com.lowagie.text.Element;
import com.lowagie.text.Phrase;
import com.lowagie.text.pdf.PdfPCell;
import com.lowagie.text.pdf.PdfPTable;
import com.lowagie.text.pdf.PdfWriter;
import org.springframework.web.servlet.view.document.AbstractPdfView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;
import java.util.Map;

public class PdfDocument extends AbstractPdfView {

    @Override
    protected void buildPdfDocument(
            Map<String, Object> model,
            Document document,
            PdfWriter writer,
            HttpServletRequest request,
            HttpServletResponse response) throws Exception {

        PdfPTable table = new PdfPTable(4);
        PdfPCell header1 = new PdfPCell(new Phrase("Spittle id"));
        PdfPCell header2 = new PdfPCell(new Phrase("Content"));
        PdfPCell header3 = new PdfPCell(new Phrase("Authors id"));
        PdfPCell header4 = new PdfPCell(new Phrase("Date"));
        header1.setHorizontalAlignment(Element.ALIGN_LEFT);
        header2.setHorizontalAlignment(Element.ALIGN_LEFT);
        header3.setHorizontalAlignment(Element.ALIGN_LEFT);
        header4.setHorizontalAlignment(Element.ALIGN_LEFT);
        table.addCell(header1);
        table.addCell(header2);
        table.addCell(header3);
        table.addCell(header4);

        //Get data from model
        List<Spittle> spittles = (List<Spittle>) model.get("modelObject");
        for (Spittle spittle : spittles) {
            table.addCell(String.valueOf(spittle.getSpittleId()));
            table.addCell(spittle.getContent());
            table.addCell(String.valueOf(spittle.getAuthorsId()));
            table.addCell(spittle.getDate().toString());
        }
        document.add(table);
    }
}
