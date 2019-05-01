/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testLucene;

import model.Document;

/**
 *
 * @author Stefanus Kevin
 */
public class TestDocumentIndonesiaStemming {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Document doc = new Document(1, "Dia sedang pergi berbelanja di pusat perbelanjaan."
                + "Namun, ibunya melarangnya pergi kesana karena tempat itu sangat berbahaya.");

        doc.IndonesianStemming();
        System.out.println("Real Content: " + doc.getRealContent());
        System.out.println("Content Stemming: " + doc.getContent());
     

    }

}
