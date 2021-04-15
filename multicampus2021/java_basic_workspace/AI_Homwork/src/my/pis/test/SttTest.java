/*
//	MultiCampus 온오프 연계 AI활용 지능형 서비스 개발 
//
//	A반 박인수
*/
package my.pis.test;

import java.io.*;
import java.net.HttpURLConnection;
import java.net.URL;

public class SttTest {

    public static void main(String[] args) {
        String clientId = "qtjt23f1yd";             // Application Client ID";
        String clientSecret = "GWaTQHkkQmY4ibbiB2hiKvgZAJm39FadacZ1L7sI";     // Application Client Secret";

        try {
            String imgFile = "sample.wav";
            // 녹음 파일 텍스트 : 
            // 안녕하세요? 저는 AI Platform 기반의 지능형 서비스 개발 프로젝트 A반 박인수입니다.
            // 이것은 과정 실습평가 샘플 음성입니다. 이 음성 인식 결과가 텍스트로 출력될 것입니다.
            //
            // 음성 인식률이 떨어져 음성이 남성으로 출력됨.
            
            File voiceFile = new File(imgFile);

            String language = "Kor";        // 언어 코드 ( Kor, Jpn, Eng, Chn )
            String apiURL = "https://naveropenapi.apigw.ntruss.com/recog/v1/stt?lang=" + language;
            URL url = new URL(apiURL);

            HttpURLConnection conn = (HttpURLConnection)url.openConnection();
            conn.setUseCaches(false);
            conn.setDoOutput(true);
            conn.setDoInput(true);
            conn.setRequestProperty("Content-Type", "application/octet-stream");
            conn.setRequestProperty("X-NCP-APIGW-API-KEY-ID", clientId);
            conn.setRequestProperty("X-NCP-APIGW-API-KEY", clientSecret);

            OutputStream outputStream = conn.getOutputStream();
            FileInputStream inputStream = new FileInputStream(voiceFile);
            byte[] buffer = new byte[4096];
            int bytesRead = -1;
            while ((bytesRead = inputStream.read(buffer)) != -1) {
                outputStream.write(buffer, 0, bytesRead);
            }
            outputStream.flush();
            inputStream.close();
            BufferedReader br = null;
            int responseCode = conn.getResponseCode();
            if(responseCode == 200) { // 정상 호출
                br = new BufferedReader(new InputStreamReader(conn.getInputStream()));
            } else {  // 오류 발생
                System.out.println("error!!!!!!! responseCode= " + responseCode);
                br = new BufferedReader(new InputStreamReader(conn.getInputStream()));
            }
            String inputLine;

            if(br != null) {
                StringBuffer response = new StringBuffer();
                while ((inputLine = br.readLine()) != null) {
                    response.append(inputLine);
                }
                br.close();
                System.out.println(response.toString());
            } else {
                System.out.println("error !!!");
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
