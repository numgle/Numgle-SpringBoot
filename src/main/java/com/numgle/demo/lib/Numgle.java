package com.numgle.demo.lib;

import java.io.File;
import java.net.URL;
import java.util.HashMap;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.numgle.demo.POJO.Dataset;

public class Numgle {
    /*public Numgle(String string) {
        System.out.println(convertStringToNumgle(string));
    }*/

    //해당 데이터셋을 json으로 관리하기 위해 jackson라이브러리 이용
    /*String[] cho = { "J", "ᖵ", "r", "n", "Д", "ru", "ㅁ", "ㄸ", "뚠", ">", "ᕒ", "ㅇ", "Ʞ", "ᕒ|", "Ʞ-", "ㅚ", "m", "ㅒ", "아" };
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
    String[] special = { "·-J", "·ㅡ", ".", ">", "ㅣ" };*/
    
    //json을 위한 Jackson라이브러리 사용
    ObjectMapper mapper;
    Dataset dataset;

    //생성자를 통하여 dataset.json을 불러와서, 자바에서 사용할 수 있도록 변환작업을 거치게 됩니다.
    public Numgle() {
        mapper = new ObjectMapper();
        try {
            dataset = mapper.readValue(new File("src/main/java/com/numgle/demo/dataset/data.json"), Dataset.class);
            //System.out.println(new File("../dataset/data.json").getCanonicalPath());
            //dataset = mapper.readValue(new URL("https://raw.githubusercontent.com/numgle/dataset/main/src/data.json"), Dataset.class);
        } catch (Exception exception) {
            //TODO: handle exception
            exception.getStackTrace();
            System.out.println("Json failed");
        }
    }
    

    public enum LetterType {
        EMPTY(1), COMPLETEHANGUL(2), NOTCOMPLETEHANGUL(3), ENGLISHUPPER(4), ENGLISHLOWER(5), NUMBER(6), SPECIALLETTER(7), UNKNOWN(8);

        private int value;
        private LetterType(int value) {
            this.value = value;
        }
        public int getValue() {
            return this.value;
        }
    }

    public String convertStringToNumgle(String input) {
        if (input.length() == 0) {
            return "";
        }
        //ArrayList<String> arr = new ArrayList<String>();

        String[] arr = new String[input.length()];

        //글자 순서가 반대로 나오는 경우가 있어서 주석처리
        /*for (int i = 0; i < input.length(); i++) {
            arr[input.length() - 1 - i] = convertCharToNumgle(input.split("")[i]);
        }*/
        for (int i = 0; i < input.length(); i++) {
            arr[i] = convertCharToNumgle(input.split("")[i]);
        }

        //웹에서는 \n 대신 <br>를 사용하여 줄 넘김을 하기 때문에 \n은 주석처리
        //String output = String.join("\n", arr);
        String output = String.join("<br>", arr);

        return output;
    }

    /*public String convertCharToNumgle(String input) {
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
    */
    //enum을 사용하여 재작성
    public String convertCharToNumgle(String input) {
        char i = input.charAt(0);
        
        LetterType letterType = getLetterType(i);
        String result = "";

        switch (letterType) {
            case EMPTY:
                result = "";
                break;
            case COMPLETEHANGUL:
                result = completeHangul(i);
                break;
            case NOTCOMPLETEHANGUL:
                //result = han[i - 0x3131];
                result = dataset.getHan()[i-0x3131];
                break;
            case ENGLISHUPPER:
                //result = englishUpper[i - 65];
                result = dataset.getEnglishUpper()[i-65];
                break;
            case ENGLISHLOWER:
                //result = englishLower[i - 97];
                result = dataset.getEnglishLower()[i-97];
                break;
            case NUMBER:
                //result = number[i - 48];
                result = dataset.getNumber()[i-48];
                break;
            case SPECIALLETTER:
                //result = special["?!.^-".indexOf(input)];
                result = dataset.getSpecial()["?!.^-".indexOf(input)];
                break;
            case UNKNOWN:
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
          //return jong[separateHan.get("jong")] + jung[separateHan.get("jung") - 8] + cho[separateHan.get("cho")];
          return dataset.getJong()[separateHan.get("jong")] + dataset.getJung()[separateHan.get("jung") - 8] + dataset.getCho()[separateHan.get("cho")];
      }

      //return jong[separateHan.get("jong")] + cj[Math.min(8, separateHan.get("jung"))][separateHan.get("cho")];
      return dataset.getJong()[separateHan.get("jong")] + dataset.getCj()[Math.min(8, separateHan.get("jung"))][separateHan.get("cho")];
  }

    public Boolean isInData(int cho_num, int jung_num, int jong_num) {
        if (jong_num != 0 && dataset.getJong()[jong_num] == "")
            return false;
        if (jung_num >= 8 && jung_num != 20)
            //return jung[jung_num - 8] != "";
            return dataset.getJung()[jung_num - 8] != "";
        else
            //return cj[Math.min(8, jung_num)][cho_num] != "";
            return dataset.getCj()[Math.min(8, jung_num)][cho_num] != "";
    }

  /*public String getLetterType(char letter) {
    String str = "?!.^-";
    //아스키코드 0은 NULL, 15는 CR(carriage return), 12는 NL(new line)
    if (letter == 0 || letter == 15 || letter == 12) return "empty";
    else if (letter >= 44032 && letter <= 55203) return "completeHangul";
    else if (letter >= 0x3131 && letter <= 0x3163) return "notCompleteHangul";
    else if (letter >= 65 && letter <= 90) return "englishUpper";
    else if (letter >= 97 && letter <= 122) return "englishLower";
    else if (letter >= 48 && letter <= 57) return "number";
    
    else if (str.contains(""+letter)) return "specialLetter";
    else return "unknown";
  }*/

  //enum을 사용하여 재작성
  public LetterType getLetterType(char letter) {
    String str = "?!.^-";
    //아스키코드 0은 NULL, 15는 CR(carriage return), 12는 NL(new line)
    if (letter == 0 || letter == 15 || letter == 12) return LetterType.EMPTY;
    else if (letter >= 44032 && letter <= 55203) return LetterType.COMPLETEHANGUL;
    else if (letter >= 0x3131 && letter <= 0x3163) return LetterType.NOTCOMPLETEHANGUL;
    else if (letter >= 65 && letter <= 90) return LetterType.ENGLISHUPPER;
    else if (letter >= 97 && letter <= 122) return LetterType.ENGLISHLOWER;
    else if (letter >= 48 && letter <= 57) return LetterType.NUMBER;
    else if (str.contains(""+letter)) return LetterType.SPECIALLETTER;
    else return LetterType.UNKNOWN;
  }
}
