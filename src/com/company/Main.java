package com.company;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        String FindingProduct = sc.next();
        Document doc = Jsoup.connect("https://5ka.ru/").get();
        String title = doc.title();
        System.out.println(title+" ________________________");
        Elements doc2 = doc.getElementsByTag(FindingProduct);
        if (doc2 == null){
            System.out.println("False");
        }
        else if(doc2 != null){
            System.out.println("True");
        }
    }
}
