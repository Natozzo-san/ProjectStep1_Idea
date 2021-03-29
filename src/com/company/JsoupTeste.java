package com.company;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;

class JsoupTester {
    public static void main(String[] args) throws IOException {
        String html = "<div><p>Sample Content</p>";
        Document document = Jsoup.parseBodyFragment(html);
        Element body = document.body();
        Elements paragraphs = body.getElementsByTag("p");

        Document doc = Jsoup.connect("http://example.com").userAgent("Mozilla").data("name", "jsoup").get();
        body = doc.body();
        paragraphs = body.getElementsByTag("aw");
        for (Element paragraph : paragraphs) {
            System.out.println(paragraph.text());
        }
    }
}