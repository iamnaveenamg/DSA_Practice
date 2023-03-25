package Collections;

import java.util.HashMap;
import java.util.UUID;

public class Codec {
    HashMap<String, String> map = new HashMap<>();

    // Encodes a URL to a shortened URL.
    public String encode(String longUrl) {
        String tinyURL = "http://naveenURL" + "/" + UUID.randomUUID().toString();
        map.put(tinyURL, longUrl);
        return tinyURL;
    }

    // Decodes a shortened URL to its original URL.
    public String decode(String shortUrl) {
        return map.get(shortUrl);
    }

    public static void main(String args[]) {
        Codec code = new Codec();
        String url = "https://leetcode.com/problems/design-tinyurl";
        String urlEncode = code.encode(url);
        System.out.println(urlEncode);
        System.out.println();
        String url1 = code.decode(url);
        System.out.println(url1);
        System.out.println();
        System.out.println(code.decode(code.encode(url)));
    }
}