package org.com.beans;

import java.sql.Statement;
import java.util.*;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.toMap;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        String[] input=new String[]{"88 99 200","88 99 200","99 33 200","12 12 15"};
        System.out.println(processLogs(input, 3));
    }

    private static List<String> processLogs(String[] logs, int threshold){
        Map<String, Integer> map=new HashMap<>();

        for(String s:logs){
            String senderId=s.split(" ")[0];
            String recipentId=s.split(" ")[1];

            if(map.containsKey(senderId)){
                Integer count=map.get(senderId);
                map.put(senderId,count+1);
            }else{
                map.put(senderId,1);
            }
            if(map.containsKey(recipentId)){
                Integer count=map.get(recipentId);
                map.put(recipentId,count+1);
            }else{
                map.put(recipentId,1);
            }

        }

        Map result=map.entrySet().stream()
                .sorted(Comparator.comparing(Map.Entry::getValue))
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue,
                        (e1, e2) -> e1, LinkedHashMap::new));



        List<String> results=new ArrayList<>();
        result.forEach((key, val)->{
                results.add(key+"->"+val);
        });
        return results;
    }

}