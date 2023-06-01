package com.ak.tasks;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveReversed {

    private RemoveReversed () {

    }

    public static void removeReversed(List<String> listA, List<String> listB) {
        List<String> strRemoveA = new ArrayList<>();
        List<String> strRemoveB = new ArrayList<>();

        for (String str : listA) {
            String strRev = revert(str);
            if (listB.contains(strRev)) {
                strRemoveA.add(str);
                strRemoveB.add(strRev);
            }
        }

        listA.removeAll(strRemoveA);
        listB.removeAll(strRemoveB);
    }

    public static void removeReversedStream(List<String> listA, List<String> listB) {
        List<String> strRemoveA = listA.stream().filter(x -> listB.contains(revert(x))).collect(Collectors.toList());
        List<String> strRemoveB = listB.stream().filter(x -> listA.contains(revert(x))).collect(Collectors.toList());
        listA.removeAll(strRemoveA);
        listB.removeAll(strRemoveB);
    }

    private static String revert(String str) {
        StringBuilder strRev = new StringBuilder();
        for (int i = str.length() - 1; i >= 0; i--)
            strRev.append(str.charAt(i));
        return strRev.toString();
    }
}
