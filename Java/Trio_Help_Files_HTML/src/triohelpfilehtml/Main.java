package triohelpfilehtml;

import org.apache.poi.hwpf.extractor.WordExtractor;
import org.apache.poi.xwpf.usermodel.IBodyElement;
import org.apache.poi.xwpf.usermodel.XWPFDocument;
import org.apache.poi.xwpf.usermodel.XWPFParagraph;

import java.io.File;
import java.io.FileInputStream;
import java.util.List;

public class Main {

    public void readDoc() {
        File file = null;
        WordExtractor extractor = null;
        try
        {
            file = new File("C:\\RPS_GTA.docx");
            FileInputStream fis = new FileInputStream(file);
            XWPFDocument document = new XWPFDocument(fis);

            List<IBodyElement> bodyElements = document.getBodyElements();
            for (IBodyElement bodyElement : bodyElements) {
                System.out.printf("Body part type: {}", bodyElement.getClass());
            }


            List<XWPFParagraph> paragraphList = document.getParagraphs();
            for(XWPFParagraph par : paragraphList) {
                System.out.println(par.getText());
            }

            //HWPFDocument document = new HWPFDocument(fis);
//            extractor = new WordExtractor(document);
//            String[] fileData = extractor.getParagraphText();
//            for (int i = 0; i < fileData.length; i++)
//            {
//                if (fileData[i] != null)
//                    System.out.println(fileData[i]);
//            }
        }
        catch (Exception exep)
        {
            exep.printStackTrace();
        }
    }

    public static void main(String[] args)
    {
        new Main().readDoc();
    }
}
