public class sumDigitsFromTheText {
    public int sumDigits(int number){
        int answer = 0;
        char[] arr = String.valueOf(number).replace("-","").toCharArray();
        for(int i = 0; i < arr.length; i++){
            answer += Character.getNumericValue(arr[i]);
        }
        return answer;
    }
}
