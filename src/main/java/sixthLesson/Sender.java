package main.java.sixthLesson;

import org.springframework.http.*;
import org.springframework.web.client.RestTemplate;

import java.net.Socket;
import java.nio.charset.StandardCharsets;

public class Sender {
    public static void main(String[] args) {
        send("http://localhost:8081/rest/api/v1/app", 8081, "GET");
//        sendRequest();
    }

    private static void send(String url, int port, String method) {
        try (Socket socket = new Socket("localhost", port)) {
            StringBuilder output = new StringBuilder();
            output.append(method +" /rest/api/v1/app HTTP/1.1").append("\r\n");
            output.append("Host: localhost:8081").append("\r\n");
            output.append("Accept: text/plain;charset=UTF-8").append("\r\n");
            output.append("Connection: close").append("\r\n");
            output.append("Content-Type: text/plain;charset=UTF-8").append("\r\n");
            socket.getOutputStream().write(output.toString().getBytes(StandardCharsets.UTF_8));
            socket.getOutputStream().flush();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static ResponseEntity<String> sendRequest() {
        HttpHeaders httpHeaders = new HttpHeaders();
        httpHeaders.setContentType(MediaType.APPLICATION_JSON);
        HttpEntity<String> httpRequest = new HttpEntity<>(null, httpHeaders);

        RestTemplate restTemplate = new RestTemplate();
        return restTemplate.exchange("http://localhost:8081/rest/api/v1/app", HttpMethod.GET, httpRequest, String.class);
    }
}
