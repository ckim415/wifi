package com.zerobase.wifi;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;
import java.io.BufferedReader;
import java.io.IOException;

@RestController
public class OpenAPI {
    @GetMapping("/API")
    public static void main(String[] args) throws IOException {

        /*URL*/
        StringBuilder urlBuilder = new StringBuilder("http://openapi.seoul.go.kr:8088");
        /*인증키*/
        urlBuilder.append("/" + URLEncoder.encode("66427a6d706b637935396d6b484758","UTF-8") );

        /*요청파일타입
            (xml,xmlf,xls,json) */
        urlBuilder.append("/" + URLEncoder.encode("json","UTF-8") );

        /*서비스명 (대소문자 구분 필수입니다.)*/
        urlBuilder.append("/" + URLEncoder.encode("TbPublicWifiInfo","UTF-8"));

        //(sample인증키 사용시 5이내 숫자)*/
        urlBuilder.append("/" + URLEncoder.encode("1","UTF-8")); /*요청시작위치
        /*요청종료위치(sample인증키 사용시 5이상 숫자 선택 안 됨)*/
        urlBuilder.append("/" + URLEncoder.encode("1000","UTF-8"));

// 서비스별 추가 요청 인자이며 자세한 내용은 각 서비스별 '요청인자'부분에자세히 나와 있습니다.
                //urlBuilder.append("/" + URLEncoder.encode("20220301","UTF-8"));
        // /* 서비스별추가 요청인자들*/
        URL url = new URL(urlBuilder.toString());
        HttpURLConnection conn = (HttpURLConnection) url.openConnection();
        conn.setRequestMethod("GET");
        conn.setRequestProperty("Content-type", "application/xml");
        System.out.println("Response code: " + conn.getResponseCode()); /* 연결
자체에 대한 확인이 필요하므로 추가합니다.*/
        BufferedReader rd;
// 서비스코드가 정상이면 200~300사이의 숫자가 나옵니다.
        if(conn.getResponseCode() >= 200 && conn.getResponseCode() <= 300) {
            rd = new BufferedReader(new InputStreamReader(conn.getInputStream()));
        } else {
            rd = new BufferedReader(new InputStreamReader(conn.getErrorStream()));
        }
        StringBuilder sb = new StringBuilder();
        String line;
        while ((line = rd.readLine()) != null) {
            sb.append(line);
        }
        rd.close();
        conn.disconnect();
        System.out.println(sb.toString());
    }
}

