package com.numgle.demo.lib;

import java.util.HashMap;

public class Numgle {
    /*public Numgle(String string) {
        System.out.println(convertStringToNumgle(string));
    }*/

    String[] cho = { "J", "ᖵ", "r", "n", "Д", "ru", "ㅁ", "ㄸ", "뚠", ">", "ᕒ", "ㅇ", "Ʞ", "ᕒ|", "Ʞ-", "ㅚ", "m", "ㅒ", "아" };
    String[] jong = { "", "J", "ᖵ", "⋝'", "r", "5ı", "δ˫", "n", "ru", "「늬", "「님", "ꈉ'", "⪞", "ꉱ", "", "ꂚ˫", "ㅁ", "ㄸ",
            "⪚", ">", "ᕒ", "ㅇ", "Ʞ", "Ʞ-", "ㅚ", "m", "ㅒ", "아" };
    String[] jung = { "ㅏ", "ᅷ", "左", "上", "ㅑ", "ㅓ", "ᅺ", "곤", "ᅼ", "ㅕ", "l", "⊥" };
    String[][] cj = {
            { "ᆗ", "ᅾ", "F", "宁", "早", "「뉘", "무", "뚜", "투", "⪲", "寻", "우", "쉬", "퀴", "쉬-", "ᆗ┘", "쑤", "부", "위-" },
            { "≚", "", "도", "모", "圼", "ꄹ", "문", "뚠", "툰", "㒰", "쿤", "운", "쉰", "퀸", "쉰-", "ꁈ", "쑨", "분", "윈-" },
            { "", "", "斤", "「규", "l큐", "「뉴|", "뮤", "뜌", "튜", "슈", "", "유", "슈|", "큐|", "슈|-", "=뉴l", "쓔", "뷰", "유|-" },
            { "", "", "됴", "묘", "昱", "「뉸l", "뮨", "뜐", "튠", "슌", "", "윤", "슌|", "큔|", "슌|-", "=뉸l", "쓘", "뷴", "윤|-" },
            { "ᖵ", "ᅽ", "「工", "「고", "l코", "ꌰ", "모", "또", "토", "소", "", "오", "쇠", "쾨", "솨", "=뇌", "쏘", "보", "와" },
            { "≚", "", "뜨", "「곤", "l콘", "ꄹ", "몬", "똔", "톤", "손", "", "온", "쇤", "쾬", "솬", "ꁈ", "쏜", "본", "완" },
            { "", "", "「立", "「교", "l쿄", "「뇨|", "묘", "뚀", "툐", "쇼", "", "요", "쇼|", "쿄|", "쇼|-", "=뇨l", "쑈", "뵤", "요|-" },
            { "", "", "「프", "「굔", "l쿈", "「뇬|", "묜", "뚄", "툔", "숀", "", "욘", "숀|", "쿈|", "숀|-", "=뇬l", "쑌", "뵨", "욘|-" },
            { "⇲", "", "ㄷ", "「그", "日", "Ṉ", "므", "뜨", "트", "≥", "", "으", "≥|", "킈", "≥|-", "=늬", "쓰", "브", "의-" }
    };
    String[] han = { "J", "ᖵ", "⋝'", "r", "5ı", "δ˫", "n", "Д", "ru", "「늬", "「님", "ꈉ'", "⪞", "ꉱ", "", "ꂚ˫", "ㅁ", "ㄸ",
            "뚠", "⪚", ">", "ᕒ", "ㅇ", "ꓘ", "ᕒ|", "ꓘ-", "ㅚ", "m", "ㅒ", "아", "ㅜ", "工", "ㅠ", "ㅍ", "ㅗ", "〧", "ㅛ", "", "ㅏ",
            "ᅷ", "左", "上", "ㅑ", "ㅓ", "ᅺ", "", "ᅼ", "ㅕ", "l", "⊥", "ㅡ" };
    String[] englishUpper = { "ᗆ", "ϖ", "∩", "ᗜ", "m", "ㄲ", "ᘏ", "工", "ㅡ", "(__", "ㅈ", "┌-", "ᕒ", "Z", "O", "‾ᗜ", ",O",
            "7ᗜ", "∽", "-ㅓ", "⊂", "<", "ε", "X", "-<", "N" };
    String[] englishLower = { "ჹ", "ᓂ", "ᴒ", "ᓇ", "ര", "Ⴕ", "ڡ", "ፓ", "-·", "ㄴ.", "ㅈ", "ㅡ", "ᴟ", "ᴝ", "o", "ᓀ", "ᓄ",
            "ㄱ", "ᔥ", "-+", "ㄷ", "<", "ꗨ", "x", "ﻋ", "ᴺ" };
    String[] number = { "o", "ㅡ", "ru", "ω", "-F", "UT", "0‾‾", "__|", "∞", "__0" };
    String[] special = { "·-J", "·ㅡ", ".", ">", "ㅣ" };

    enum LetterType {
        EMPTY, COMPLETEHANGUL, NOTCOMPLETEHANGUL, ENGLISHUPPER, ENGLISHLOWER, NUMBER, SPECIALLETTER, UNKNOWN
    }

    public String convertStringToNumgle(String input) {
        if (input.length() == 0) {
            return "";
        }
        //ArrayList<String> arr = new ArrayList<String>();

        String[] arr = new String[input.length()];

        for (int i = 0; i < input.length(); i++) {
            arr[input.length() - 1 - i] = convertCharToNumgle(input.split("")[i]);
        }

        String output = String.join("\n", arr);

        return output;
    }

    public String convertCharToNumgle(String input) {
        char i = input.charAt(0);
        String letterType = getLetterType(i);
        String result = "";

        switch (letterType) {
            case "empty":
                result = "";
                break;
            case "completeHangul":
                result = completeHangul(i);
                break;
            case "notCompleteHangul":
                result = han[i - 0x3131];
                break;
            case "englishUpper":
                result = englishUpper[i - 65];
                break;
            case "englishLower":
                result = englishLower[i - 97];
                break;
            case "number":
                result = number[i - 48];
                break;
            case "specialLetter":
                result = special["?!.^-".indexOf(input)];
                break;

            case "unknown":
                break;
            default:
                System.out.println("There is a letter not converted");

        }

        return result;
    }

  public HashMap<String, Integer> separateHan(char han) {
      HashMap<String, Integer> map = new HashMap<String, Integer>();
      map.put("cho", (int) Math.floor((han - 44032) / 28 /21));
      map.put("jung", (int) Math.floor((han - 44032) / 28 % 21));
      map.put("jong", (int) Math.floor((han - 44032) % 28));

      return map;
  }

  public String completeHangul(char input) {
      HashMap<String, Integer> separateHan = separateHan(input);

      if(!isInData(separateHan.get("cho"), separateHan.get("jung"), separateHan.get("jong"))) {
          System.out.println("There is a letter not converted");
          return "";
      }

      if(separateHan.get("jung") >= 8 && separateHan.get("jung") != 20) {
          return jong[separateHan.get("jong")] + jung[separateHan.get("jung") - 8] + cho[separateHan.get("cho")];
      }

      return jong[separateHan.get("jong")] + cj[Math.min(8, separateHan.get("jung"))][separateHan.get("cho")];
  }

    public Boolean isInData(int cho_num, int jung_num, int jong_num) {
        if (jong_num != 0 && jong[jong_num] == "")
            return false;
        if (jung_num >= 8 && jung_num != 20)
            return jung[jung_num - 8] != "";
        else
            return cj[Math.min(8, jung_num)][cho_num] != "";
    }

  public String getLetterType(char letter) {
    String str = "?!.^-";
    if (letter == 0 || letter == 15 || letter == 12) return "empty";
    else if (letter >= 44032 && letter <= 55203) return "completeHangul";
    else if (letter >= 0x3131 && letter <= 0x3163) return "notCompleteHangul";
    else if (letter >= 65 && letter <= 90) return "englishUpper";
    else if (letter >= 97 && letter <= 122) return "englishLower";
    else if (letter >= 48 && letter <= 57) return "number";
    
    else if (str.contains(""+letter)) return "specialLetter";
    else return "unknown";
  }

}
