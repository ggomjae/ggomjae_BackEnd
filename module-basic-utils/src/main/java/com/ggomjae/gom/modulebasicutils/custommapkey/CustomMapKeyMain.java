package com.ggomjae.gom.modulebasicutils.custommapkey;

import lombok.extern.slf4j.Slf4j;

import java.util.*;

@Slf4j
public class CustomMapKeyMain {

    public static void main(String[] args){

        CustomMapKey customMapKey1 = CustomMapKey.builder()
                .firstColumn("1")
                .secondColumn("2")
                .thirdColumn("3")
                .build();

        CustomMapKey customMapKey2 = CustomMapKey.builder()
                .firstColumn("1")
                .secondColumn("2")
                .thirdColumn("4")
                .build();

        CustomMapKey customMapKey3 = CustomMapKey.builder()
                .firstColumn("1")
                .secondColumn("2")
                .thirdColumn("3")
                .build();

        CustomMapKey customMapKey4 = CustomMapKey.builder()
                .firstColumn("2")
                .secondColumn("2")
                .thirdColumn("3")
                .build();

        CustomMapKey customMapKey5 = CustomMapKey.builder()
                .firstColumn("1")
                .secondColumn("2")
                .thirdColumn("3")
                .build();

        CustomMapKey customMapKey6 = CustomMapKey.builder()
                .firstColumn("2")
                .secondColumn("2")
                .thirdColumn("3")
                .build();

        CustomMapKey customMapKey7 = CustomMapKey.builder()
                .firstColumn("1")
                .secondColumn("2")
                .thirdColumn("4")
                .build();

        List<CustomMapKey> customList = Arrays.asList(customMapKey1,customMapKey2,customMapKey3,
                customMapKey4,customMapKey5,customMapKey6,customMapKey7);

        Map<CustomMapKey, Long> customMap = new HashMap<>();

        customList.forEach(data -> {
            if(customMap.containsKey(data)){
                customMap.put(data,customMap.get(data) + 1L);
            }else{
                customMap.put(data,1L);
            }
        });

        for(CustomMapKey key : customMap.keySet() ){
            log.info("Key : {}, Value : {}",key.toString(),customMap.get(key));
        }

    }
}
