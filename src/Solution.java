class Solution {
    public int countSeniors(String[] details) {
        int sum = 0;

        for(int i =0; i < details.length; i++){
            StringBuffer sb = new StringBuffer();
            sb.append(details[i].charAt(11));
            sb.append(details[i].charAt(12));

            int age = Integer.parseInt(sb.toString());
            if(age > 60)
                sum++;
        }
        return sum;
    }
}
