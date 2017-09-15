package com.eventbrite.utility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class PdfGenerateHelper {

   /*
    * Generate a PDF file by svg data content
    *
    * @argSgvContent The address the svg file
    * @argFileAddress The address of the generated pdf file
    *
    */
   public static boolean CreatePdfFile(String argSgvFileAddress, String argFileAddress) {
      try {
         new SVGExport().setInput(new FileInputStream(argSgvFileAddress))
               .setOutput(new FileOutputStream(argFileAddress))
               .setTranscoder(Format.PDF)
               .transcode();
         return true;
      } catch (FileNotFoundException e) {
         e.printStackTrace();
         return false;
      }
   }

   /*
    * Generate a PDF file by svg data content
    *
    * @argSgvContent The content of the svg file
    * @argFileAddress The address of the generated pdf file
    *
    */
   public static boolean CreatePdfFileByContent(String argSgvContent, String argFileAddress) {
      try {
         new SVGExport().setInputAsString(argSgvContent)
               .setOutput(new FileOutputStream(argFileAddress))
               .setTranscoder(Format.PDF)
               .transcode();
         return true;
      } catch (FileNotFoundException e) {
         e.printStackTrace();
         return false;
      }
   }

}