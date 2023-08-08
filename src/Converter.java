public class Converter {

    public String convertFromNumberToRoman (int zahl)
    {
        String answer = "";

        while (zahl > 0)
        {
             if (zahl >= 1000)
            {
                answer = answer + "M";
                zahl = zahl - 1000;
            }
             /*else if(zahl >=900)
             {
                 answer = answer + "CM";
                 zahl = zahl - 900;
             }*/
            else if (zahl >= 500)
            {
                answer = answer + "D";
                zahl = zahl - 500;
            }
             /*else if(zahl >=400)
             {
                 answer = answer + "CD";
                 zahl = zahl - 400;
             }*/
            else if(zahl >= 100)
            {
                answer = answer + "C";
                zahl = zahl - 100;
            }
            /*
             else if(zahl >=90)
             {
                 answer = answer + "XC";
                 zahl = zahl - 90;
             }*/
            else if(zahl >= 50)
            {
                answer = answer + "L";
                zahl = zahl - 50;
            }
            /*
             else if(zahl >=40)
             {
                 answer = answer + "XL";
                 zahl = zahl - 40;
             }*/
            else if(zahl >= 10)
            {
                answer = answer + "X";
                zahl = zahl - 10;
            }
            /*
             else if(zahl >=9)
             {
                 answer = answer + "IX";
                 zahl = zahl - 9;
             }
             */
            else if(zahl >= 5)
            {
                answer = answer + "V";
                zahl = zahl - 5;
            }
            /*
             else if(zahl >=4)
             {
                 answer = answer + "IV";
                 zahl = zahl - 4;
             }*/
            else
            {
                answer = answer + "I";
                zahl = zahl - 1;
            }
        }

       return answer;
    }

    public int convertFromRomanToNumber(String roman) {
        int numberOfLetters = roman.length();
        int result = 0;

        for (int i = 0; i < numberOfLetters; i++)
        {
            char currentLetter = roman.charAt(i);

            switch (currentLetter) {
                case 'I':
                    result = result + 1;
                    break;
                case 'V':
                    result = result + 5;
                    break;
                case 'X':
                    result = result + 10;
                    break;
                case 'L':
                    result = result + 50;
                    break;
                case 'C':
                    result = result + 100;
                    break;
                case 'D':
                    result = result + 500;
                    break;
                case 'M':
                    result =result + 1000;
                    break;
            }
        }

        return result;
    }
}