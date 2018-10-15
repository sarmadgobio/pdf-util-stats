package com.testautomationguru.utility;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.pdfbox.text.PDFTextStripper;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.reporters.Files;

import com.testautomationguru.utility.PDFUtil;

public class PDFUtilTest {

    PDFUtil pdfutil = new PDFUtil();


    @Test(priority = 1)
    public void Profile1checkForPDFPageCount() throws IOException {
        int actual = pdfutil.getPageCount(getFilePath("image-extract/sample.pdf"));
        Assert.assertEquals(actual, 6);
    }

    @Test(priority = 2)
    public void Profile1checkForPAC() throws IOException {
        String actual = pdfutil.getText(getFilePath("text-extract/sample.pdf"));
        String expected = Files.readFile(new File(getFilePath("text-extract/expected.txt")));
        Assert.assertFalse(actual == expected);
    }

    @Test(priority = 2)
    public void Profile1checkForPACcount() throws IOException {
        String actual = pdfutil.getText(getFilePath("text-extract/sample.pdf"));
        String expected = Files.readFile(new File(getFilePath("text-extract/expected.txt")));
        Assert.assertFalse(actual == expected);
    }
//
//    @Test(priority = 3)
//    public void Profile1checkForFileContentUsingDiff() throws IOException {
//        String actual = pdfutil.getText(getFilePath("text-extract-position/sample.pdf"));
//        String expected = Files.readFile(new File(getFilePath("text-extract-position/expected.txt")));
//        Assert.assertNotEquals(actual.trim(), expected.trim());
//
//        //should match with stripper
//        PDFTextStripper stripper = new PDFTextStripper();
//        stripper.setSortByPosition(true);
//        pdfutil.useStripper(stripper);
//        actual = pdfutil.getText(getFilePath("text-extract-position/sample.pdf"));
//        expected = Files.readFile(new File(getFilePath("text-extract-position/expected.txt")));
//        Assert.assertEquals(actual.trim(), expected.trim());
//        pdfutil.useStripper(null);
//    }
//
//    @Test(priority = 4)
//    public void Profile1extractImages() throws IOException {
//        List<String> actualExtractedImages = pdfutil.extractImages(getFilePath("image-extract/sample.pdf"));
//        Assert.assertNotEquals(actualExtractedImages.size(), 7);
//    }
//
//    @Test(priority = 5)
//    public void Profile1saveAsImages() throws IOException {
//        List<String> actualExtractedImages = pdfutil.savePdfAsImage(getFilePath("image-extract/sample.pdf"));
//        Assert.assertEquals(actualExtractedImages.size(), 6);
//    }
//
//    //    @Test(priority = 6)
////    public void comparePDFTextModeDiff() throws IOException {
////        String file1 = getFilePath("text-compare/sample1.pdf");
////        String file2 = getFilePath("text-compare/sample2.pdf");
////        pdfutil.setCompareMode(CompareMode.TEXT_MODE);
////
////        boolean result = pdfutil.compare(file1, file2);
////        Assert.assertFalse(result);
////    }
////
//    @Test(priority = 7)
//    public void Profile1comparePDFTextModeSameAfterExcludePattern() throws IOException {
//        String file1 = getFilePath("text-compare/sample1.pdf");
//        String file2 = getFilePath("text-compare/sample2.pdf");
//        pdfutil.setCompareMode(CompareMode.TEXT_MODE);
//        pdfutil.excludeText("\\d+");
//        // pdfutil.excludeText("1999","1998");
//        boolean result = pdfutil.compare(file1, file2);
//        Assert.assertTrue(result);
//    }
//
//    @Test(priority = 8)
//    public void Profile1comparePDFImageModeDiff() throws IOException {
//        String file1 = getFilePath("image-compare-same/sample1.pdf");
//        String file2 = getFilePath("image-compare-same/sample2.pdf");
//        pdfutil.setCompareMode(CompareMode.VISUAL_MODE);
//
//        boolean result = pdfutil.compare(file1, file2);
//        Assert.assertTrue(result);
//    }
//
//    @Test(priority = 9)
//    public void Profile1comparePDFImageModeSame() throws IOException {
//        pdfutil.highlightPdfDifference(true);
//        String file1 = getFilePath("image-compare-diff/sample1.pdf");
//        String file2 = getFilePath("image-compare-diff/sample2.pdf");
//        boolean result = pdfutil.compare(file1, file2);
//        Assert.assertFalse(result);
//    }
//
//    @Test(priority = 10)
//    public void Profile1comparePDFImageModeDiffSpecificPage() throws IOException {
//        pdfutil.highlightPdfDifference(true);
//        String file1 = getFilePath("image-compare-diff/sample1.pdf");
//        String file2 = getFilePath("image-compare-diff/sample2.pdf");
//        boolean result = pdfutil.compare(file1, file2, 3);
//        Assert.assertTrue(result);
//    }
//
//    @Test(priority = 10)
//    public void Profile1comparePDFImageModeSameSpecificPage() throws IOException {
//        pdfutil.highlightPdfDifference(true);
//        String file1 = getFilePath("image-compare-diff/sample1.pdf");
//        String file2 = getFilePath("image-compare-diff/sample2.pdf");
//        boolean result = pdfutil.compare(file1, file2, 1);
//        Assert.assertFalse(result);
//    }
//
//
//
//    @Test(priority = 1)
//    public void Profile2checkForPDFPageCount() throws IOException {
//        int actual = pdfutil.getPageCount(getFilePath("image-extract/sample.pdf"));
//        Assert.assertEquals(actual, 6);
//    }
//
//    @Test(priority = 2)
//    public void Profile2checkForFileContent() throws IOException {
//        String actual = pdfutil.getText(getFilePath("text-extract/sample.pdf"));
//        String expected = Files.readFile(new File(getFilePath("text-extract/expected.txt")));
//        Assert.assertFalse(actual == expected);
//    }
//
//    @Test(priority = 3)
//    public void Profile2checkForFileContentUsingDiff() throws IOException {
//        String actual = pdfutil.getText(getFilePath("text-extract-position/sample.pdf"));
//        String expected = Files.readFile(new File(getFilePath("text-extract-position/expected.txt")));
//        Assert.assertNotEquals(actual.trim(), expected.trim());
//
//        //should match with stripper
//        PDFTextStripper stripper = new PDFTextStripper();
//        stripper.setSortByPosition(true);
//        pdfutil.useStripper(stripper);
//        actual = pdfutil.getText(getFilePath("text-extract-position/sample.pdf"));
//        expected = Files.readFile(new File(getFilePath("text-extract-position/expected.txt")));
//        Assert.assertEquals(actual.trim(), expected.trim());
//        pdfutil.useStripper(null);
//    }
//
//    @Test(priority = 4)
//    public void Profile2extractImages() throws IOException {
//        List<String> actualExtractedImages = pdfutil.extractImages(getFilePath("image-extract/sample.pdf"));
//        Assert.assertNotEquals(actualExtractedImages.size(), 7);
//    }
//
//    @Test(priority = 5)
//    public void Profile2saveAsImages() throws IOException {
//        List<String> actualExtractedImages = pdfutil.savePdfAsImage(getFilePath("image-extract/sample.pdf"));
//        Assert.assertEquals(actualExtractedImages.size(), 6);
//    }
//
//    //    @Test(priority = 6)
////    public void comparePDFTextModeDiff() throws IOException {
////        String file1 = getFilePath("text-compare/sample1.pdf");
////        String file2 = getFilePath("text-compare/sample2.pdf");
////        pdfutil.setCompareMode(CompareMode.TEXT_MODE);
////
////        boolean result = pdfutil.compare(file1, file2);
////        Assert.assertFalse(result);
////    }
////
//    @Test(priority = 7)
//    public void Profile2comparePDFTextModeSameAfterExcludePattern() throws IOException {
//        String file1 = getFilePath("text-compare/sample1.pdf");
//        String file2 = getFilePath("text-compare/sample2.pdf");
//        pdfutil.setCompareMode(CompareMode.TEXT_MODE);
//        pdfutil.excludeText("\\d+");
//        // pdfutil.excludeText("1999","1998");
//        boolean result = pdfutil.compare(file1, file2);
//        Assert.assertTrue(result);
//    }
//
//    @Test(priority = 8)
//    public void Profile2comparePDFImageModeDiff() throws IOException {
//        String file1 = getFilePath("image-compare-same/sample1.pdf");
//        String file2 = getFilePath("image-compare-same/sample2.pdf");
//        pdfutil.setCompareMode(CompareMode.VISUAL_MODE);
//
//        boolean result = pdfutil.compare(file1, file2);
//        Assert.assertTrue(result);
//    }
//
//    @Test(priority = 9)
//    public void Profile2comparePDFImageModeSame() throws IOException {
//        pdfutil.highlightPdfDifference(true);
//        String file1 = getFilePath("image-compare-diff/sample1.pdf");
//        String file2 = getFilePath("image-compare-diff/sample2.pdf");
//        boolean result = pdfutil.compare(file1, file2);
//        Assert.assertFalse(result);
//    }
//
//    @Test(priority = 10)
//    public void Profile2comparePDFImageModeDiffSpecificPage() throws IOException {
//        pdfutil.highlightPdfDifference(true);
//        String file1 = getFilePath("image-compare-diff/sample1.pdf");
//        String file2 = getFilePath("image-compare-diff/sample2.pdf");
//        boolean result = pdfutil.compare(file1, file2, 3);
//        Assert.assertTrue(result);
//    }
//
//    @Test(priority = 10)
//    public void Profile2comparePDFImageModeSameSpecificPage() throws IOException {
//        pdfutil.highlightPdfDifference(true);
//        String file1 = getFilePath("image-compare-diff/sample1.pdf");
//        String file2 = getFilePath("image-compare-diff/sample2.pdf");
//        boolean result = pdfutil.compare(file1, file2, 1);
//        Assert.assertFalse(result);
//    }


    private String getFilePath(String filename) {
        return new File(getClass().getClassLoader().getResource(filename).getFile()).getAbsolutePath();
    }
}