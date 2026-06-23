class Solution {
    public int numUniqueEmails(String[] emails) {
        Set<String> h = new HashSet<>();
        for(String s : emails){
            String[] e = s.split("@");
            String ln = e[0];
            String dn = e[1];
            int id = ln.indexOf('+');
            if(id != -1){
                ln = ln.substring(0,id);
            }
            ln = ln.replace(".","");
            h.add(ln+"@"+dn);
        }
        return h.size();
    }
}