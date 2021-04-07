package com.ggomjae.gom.modulebasicutils.jsonParsing;

import org.json.JSONObject;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class JsonParsing {

    public static void main(String[] Args){
        String str = "{\"transactionId\":\"cc78a726-fca7-45f4-bee9-bf2e57523a8bGW01\",\"residentialAddress\":[{\"parcelAddress\":[{\"geographicInformation\":{\"utmkPoint\":{\"x\":1141490.47,\"y\":1684840.82},\"point\":{\"lng\":129.05330614791342,\"lat\":35.1488622560907},\"shape\":{\"type\":\"MultiPolygon\",\"coordinates\":[[[[129.05318981170666,35.14891279364784],[129.05317114573458,35.14893190136573],[129.0534609745984,35.14881206811369],[129.05345976308075,35.14880521832281],[129.05330498468155,35.14884187073315],[129.05322496130486,35.14887701279903],[129.05318981170666,35.14891279364784]]]]},\"area\":[[69.07113882817794]]},\"eupMyeonDong\":\"범천동\",\"haengJeongDong\":\"범천제2동\",\"badmId\":\"2623010400\",\"siDo\":\"부산광역시\",\"siGunGu1\":\"부산진구\",\"houseNumber\":\"1611-5\",\"isMountain\":false,\"isFromBName\":false,\"fullAddress\":\"부산광역시 부산진구 범천동(범천제2동) 1611-5\",\"pnucode\":\"2623010400116110005\",\"siGunGu\":\"부산진구\"}],\"roadAddress\":[]}]}";
        Pattern pattern = Pattern.compile("\"fullAddress\"\\s*:\\s*\"([\\w가-힣-, ()]+)\"");
        Matcher matcher = pattern.matcher(str);

        while (matcher.find()) {
            System.out.println(matcher.group(1));
        }

    }
}
