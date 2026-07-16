// Last updated: 2026. 7. 16. 오전 11:26:15
class Solution {
    public int numUniqueEmails(String[] emails) {
        Set<String> s = new HashSet<>();
        for (String email : emails) {
            String[] t = email.split("@");
            int i = t[0].indexOf('+');
            if (i != -1) {
                t[0] = t[0].substring(0, i);
            }
            t[0] = t[0].replaceAll("\\.", "");
            s.add(t[0] + "@" + t[1]);
        }
        return s.size();
    }
}